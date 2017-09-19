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
 * ResourceLicense generated by hbm2java
 */
@Entity
@Table(name = "resource_license", schema = "public")
public class ResourceLicense implements java.io.Serializable {

	private ResourceLicenseId id;
	private License license;
	private Resource resource;

	public ResourceLicense() {
	}

	public ResourceLicense(ResourceLicenseId id) {
		this.id = id;
	}

	public ResourceLicense(ResourceLicenseId id, License license, Resource resource) {
		this.id = id;
		this.license = license;
		this.resource = resource;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "resourceLicensesId", column = @Column(name = "resource_licenses_id")),
			@AttributeOverride(name = "licenseId", column = @Column(name = "license_id")) })
	public ResourceLicenseId getId() {
		return this.id;
	}

	public void setId(ResourceLicenseId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "license_id", insertable = false, updatable = false)
	public License getLicense() {
		return this.license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "resource_licenses_id", insertable = false, updatable = false)
	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

}
