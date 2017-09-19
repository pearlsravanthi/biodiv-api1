package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * TaxonomyRegistry generated by hbm2java
 */
@Entity
@Table(name = "taxonomy_registry", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = { "path",
		"classification_id", "taxon_definition_id" }))
public class TaxonomyRegistry implements java.io.Serializable {

	private long id;
	private long version;
	private Classification classification;
	private TaxonomyDefinition taxonomyDefinitionByParentTaxonDefinitionId;
	private Suser suser;
	private TaxonomyRegistry taxonomyRegistry;
	private TaxonomyDefinition taxonomyDefinitionByTaxonDefinitionId;
	private String path;
	private Date uploadTime;
	private Set taxonomyRegistrySusers = new HashSet(0);
	private Set taxonomyRegistries = new HashSet(0);

	public TaxonomyRegistry() {
	}

	public TaxonomyRegistry(long id, Classification classification,
			TaxonomyDefinition taxonomyDefinitionByTaxonDefinitionId, String path) {
		this.id = id;
		this.classification = classification;
		this.taxonomyDefinitionByTaxonDefinitionId = taxonomyDefinitionByTaxonDefinitionId;
		this.path = path;
	}

	public TaxonomyRegistry(long id, Classification classification,
			TaxonomyDefinition taxonomyDefinitionByParentTaxonDefinitionId, Suser suser,
			TaxonomyRegistry taxonomyRegistry, TaxonomyDefinition taxonomyDefinitionByTaxonDefinitionId, String path,
			Date uploadTime, Set taxonomyRegistrySusers, Set taxonomyRegistries) {
		this.id = id;
		this.classification = classification;
		this.taxonomyDefinitionByParentTaxonDefinitionId = taxonomyDefinitionByParentTaxonDefinitionId;
		this.suser = suser;
		this.taxonomyRegistry = taxonomyRegistry;
		this.taxonomyDefinitionByTaxonDefinitionId = taxonomyDefinitionByTaxonDefinitionId;
		this.path = path;
		this.uploadTime = uploadTime;
		this.taxonomyRegistrySusers = taxonomyRegistrySusers;
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
	@JoinColumn(name = "classification_id", nullable = false)
	public Classification getClassification() {
		return this.classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_taxon_definition_id")
	public TaxonomyDefinition getTaxonomyDefinitionByParentTaxonDefinitionId() {
		return this.taxonomyDefinitionByParentTaxonDefinitionId;
	}

	public void setTaxonomyDefinitionByParentTaxonDefinitionId(
			TaxonomyDefinition taxonomyDefinitionByParentTaxonDefinitionId) {
		this.taxonomyDefinitionByParentTaxonDefinitionId = taxonomyDefinitionByParentTaxonDefinitionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uploader_id")
	public Suser getSuser() {
		return this.suser;
	}

	public void setSuser(Suser suser) {
		this.suser = suser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_taxon_id")
	public TaxonomyRegistry getTaxonomyRegistry() {
		return this.taxonomyRegistry;
	}

	public void setTaxonomyRegistry(TaxonomyRegistry taxonomyRegistry) {
		this.taxonomyRegistry = taxonomyRegistry;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "taxon_definition_id", nullable = false)
	public TaxonomyDefinition getTaxonomyDefinitionByTaxonDefinitionId() {
		return this.taxonomyDefinitionByTaxonDefinitionId;
	}

	public void setTaxonomyDefinitionByTaxonDefinitionId(TaxonomyDefinition taxonomyDefinitionByTaxonDefinitionId) {
		this.taxonomyDefinitionByTaxonDefinitionId = taxonomyDefinitionByTaxonDefinitionId;
	}

	@Column(name = "path", nullable = false)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "upload_time", length = 29)
	public Date getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taxonomyRegistry")
	public Set getTaxonomyRegistrySusers() {
		return this.taxonomyRegistrySusers;
	}

	public void setTaxonomyRegistrySusers(Set taxonomyRegistrySusers) {
		this.taxonomyRegistrySusers = taxonomyRegistrySusers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taxonomyRegistry")
	public Set getTaxonomyRegistries() {
		return this.taxonomyRegistries;
	}

	public void setTaxonomyRegistries(Set taxonomyRegistries) {
		this.taxonomyRegistries = taxonomyRegistries;
	}

}
