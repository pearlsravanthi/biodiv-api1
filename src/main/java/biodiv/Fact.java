package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * Fact generated by hbm2java
 */
@Entity
@Table(name = "fact", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = { "object_id",
		"page_taxon_id", "trait_id", "trait_value_id" }))
public class Fact implements java.io.Serializable {

	private long id;
	private long version;
	private License license;
	private TaxonomyDefinition taxonomyDefinition;
	private Trait trait;
	private TraitValue traitValue;
	private Suser suser;
	private String attribution;
	private boolean isDeleted;
	private long objectId;
	private String value;
	private String objectType;
	private String toValue;
	private Date fromDate;
	private Date toDate;

	public Fact() {
	}

	public Fact(long id, License license, Trait trait, Suser suser, String attribution, boolean isDeleted,
			long objectId, String objectType) {
		this.id = id;
		this.license = license;
		this.trait = trait;
		this.suser = suser;
		this.attribution = attribution;
		this.isDeleted = isDeleted;
		this.objectId = objectId;
		this.objectType = objectType;
	}

	public Fact(long id, License license, TaxonomyDefinition taxonomyDefinition, Trait trait, TraitValue traitValue,
			Suser suser, String attribution, boolean isDeleted, long objectId, String value, String objectType,
			String toValue, Date fromDate, Date toDate) {
		this.id = id;
		this.license = license;
		this.taxonomyDefinition = taxonomyDefinition;
		this.trait = trait;
		this.traitValue = traitValue;
		this.suser = suser;
		this.attribution = attribution;
		this.isDeleted = isDeleted;
		this.objectId = objectId;
		this.value = value;
		this.objectType = objectType;
		this.toValue = toValue;
		this.fromDate = fromDate;
		this.toDate = toDate;
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
	@JoinColumn(name = "license_id", nullable = false)
	public License getLicense() {
		return this.license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "page_taxon_id")
	public TaxonomyDefinition getTaxonomyDefinition() {
		return this.taxonomyDefinition;
	}

	public void setTaxonomyDefinition(TaxonomyDefinition taxonomyDefinition) {
		this.taxonomyDefinition = taxonomyDefinition;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trait_id", nullable = false)
	public Trait getTrait() {
		return this.trait;
	}

	public void setTrait(Trait trait) {
		this.trait = trait;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trait_value_id")
	public TraitValue getTraitValue() {
		return this.traitValue;
	}

	public void setTraitValue(TraitValue traitValue) {
		this.traitValue = traitValue;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contributor_id", nullable = false)
	public Suser getSuser() {
		return this.suser;
	}

	public void setSuser(Suser suser) {
		this.suser = suser;
	}

	@Column(name = "attribution", nullable = false)
	public String getAttribution() {
		return this.attribution;
	}

	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}

	@Column(name = "is_deleted", nullable = false)
	public boolean isIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column(name = "object_id", nullable = false)
	public long getObjectId() {
		return this.objectId;
	}

	public void setObjectId(long objectId) {
		this.objectId = objectId;
	}

	@Column(name = "value")
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "object_type", nullable = false)
	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	@Column(name = "to_value")
	public String getToValue() {
		return this.toValue;
	}

	public void setToValue(String toValue) {
		this.toValue = toValue;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "from_date", length = 29)
	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "to_date", length = 29)
	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}