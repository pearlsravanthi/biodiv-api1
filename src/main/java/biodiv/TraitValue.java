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
 * TraitValue generated by hbm2java
 */
@Entity
@Table(name = "trait_value", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = { "value",
		"trait_id" }))
public class TraitValue implements java.io.Serializable {

	private long id;
	private long version;
	private Trait trait;
	private String description;
	private String icon;
	private String source;
	private String value;
	private boolean isDeleted;
	private Set facts = new HashSet(0);

	public TraitValue() {
	}

	public TraitValue(long id, Trait trait, String source, String value, boolean isDeleted) {
		this.id = id;
		this.trait = trait;
		this.source = source;
		this.value = value;
		this.isDeleted = isDeleted;
	}

	public TraitValue(long id, Trait trait, String description, String icon, String source, String value,
			boolean isDeleted, Set facts) {
		this.id = id;
		this.trait = trait;
		this.description = description;
		this.icon = icon;
		this.source = source;
		this.value = value;
		this.isDeleted = isDeleted;
		this.facts = facts;
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
	@JoinColumn(name = "trait_id", nullable = false)
	public Trait getTrait() {
		return this.trait;
	}

	public void setTrait(Trait trait) {
		this.trait = trait;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "icon")
	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Column(name = "source", nullable = false)
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Column(name = "value", nullable = false)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "is_deleted", nullable = false)
	public boolean isIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "traitValue")
	public Set getFacts() {
		return this.facts;
	}

	public void setFacts(Set facts) {
		this.facts = facts;
	}

}
