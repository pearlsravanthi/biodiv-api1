package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SynonymsSuser generated by hbm2java
 */
@Entity
@Table(name = "synonyms_suser", schema = "public")
public class SynonymsSuser implements java.io.Serializable {

	private SynonymsSuserId id;
	private Suser suser;
	private Synonyms synonyms;

	public SynonymsSuser() {
	}

	public SynonymsSuser(SynonymsSuserId id) {
		this.id = id;
	}

	public SynonymsSuser(SynonymsSuserId id, Suser suser, Synonyms synonyms) {
		this.id = id;
		this.suser = suser;
		this.synonyms = synonyms;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "synonymsContributorsId", column = @Column(name = "synonyms_contributors_id")),
			@AttributeOverride(name = "suserId", column = @Column(name = "suser_id")),
			@AttributeOverride(name = "contributorsIdx", column = @Column(name = "contributors_idx")),
			@AttributeOverride(name = "synonymsCuratorsId", column = @Column(name = "synonyms_curators_id")),
			@AttributeOverride(name = "curatorsIdx", column = @Column(name = "curators_idx")) })
	public SynonymsSuserId getId() {
		return this.id;
	}

	public void setId(SynonymsSuserId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "suser_id", insertable = false, updatable = false)
	public Suser getSuser() {
		return this.suser;
	}

	public void setSuser(Suser suser) {
		this.suser = suser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "synonyms_contributors_id", insertable = false, updatable = false)
	public Synonyms getSynonyms() {
		return this.synonyms;
	}

	public void setSynonyms(Synonyms synonyms) {
		this.synonyms = synonyms;
	}

}
