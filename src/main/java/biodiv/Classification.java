package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * Classification generated by hbm2java
 */
@Entity
@Table(name = "classification", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Classification implements java.io.Serializable {

	private long id;
	private long version;
	private Language language;
	private String name;
	private String citation;
	private Set taxonomyRegistries = new HashSet(0);

	public Classification() {
	}

	public Classification(long id, Language language, String name) {
		this.id = id;
		this.language = language;
		this.name = name;
	}

	public Classification(long id, Language language, String name, String citation, Set taxonomyRegistries) {
		this.id = id;
		this.language = language;
		this.name = name;
		this.citation = citation;
		this.taxonomyRegistries = taxonomyRegistries;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Version
	@Column(name = "version", nullable = false)
	public long getVersion() {
		return this.version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "language_id", nullable = false)
	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@Column(name = "name", unique = true, nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "citation")
	public String getCitation() {
		return this.citation;
	}

	public void setCitation(String citation) {
		this.citation = citation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "classification")
	public Set getTaxonomyRegistries() {
		return this.taxonomyRegistries;
	}

	public void setTaxonomyRegistries(Set taxonomyRegistries) {
		this.taxonomyRegistries = taxonomyRegistries;
	}

}