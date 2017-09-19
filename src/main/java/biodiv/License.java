package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * License generated by hbm2java
 */
@Entity
@Table(name = "license", schema = "public")
public class License implements java.io.Serializable {

	private long id;
	private String name;
	private String url;
	private Set documents = new HashSet(0);
	private Set facts = new HashSet(0);
	private Set speciesFieldLicenses = new HashSet(0);
	private Set observations = new HashSet(0);
	private Set datasets = new HashSet(0);
	private Set resources = new HashSet(0);
	private Set resourceLicenses = new HashSet(0);

	public License() {
	}

	public License(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public License(long id, String name, String url, Set documents, Set facts, Set speciesFieldLicenses,
			Set observations, Set datasets, Set resources, Set resourceLicenses) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.documents = documents;
		this.facts = facts;
		this.speciesFieldLicenses = speciesFieldLicenses;
		this.observations = observations;
		this.datasets = datasets;
		this.resources = resources;
		this.resourceLicenses = resourceLicenses;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "license")
	public Set getDocuments() {
		return this.documents;
	}

	public void setDocuments(Set documents) {
		this.documents = documents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "license")
	public Set getFacts() {
		return this.facts;
	}

	public void setFacts(Set facts) {
		this.facts = facts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "license")
	public Set getSpeciesFieldLicenses() {
		return this.speciesFieldLicenses;
	}

	public void setSpeciesFieldLicenses(Set speciesFieldLicenses) {
		this.speciesFieldLicenses = speciesFieldLicenses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "license")
	public Set getObservations() {
		return this.observations;
	}

	public void setObservations(Set observations) {
		this.observations = observations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "license")
	public Set getDatasets() {
		return this.datasets;
	}

	public void setDatasets(Set datasets) {
		this.datasets = datasets;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "license")
	public Set getResources() {
		return this.resources;
	}

	public void setResources(Set resources) {
		this.resources = resources;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "license")
	public Set getResourceLicenses() {
		return this.resourceLicenses;
	}

	public void setResourceLicenses(Set resourceLicenses) {
		this.resourceLicenses = resourceLicenses;
	}

}
