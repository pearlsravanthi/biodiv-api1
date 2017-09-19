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
 * CoverageSpeciesGroup generated by hbm2java
 */
@Entity
@Table(name = "coverage_species_group", schema = "public")
public class CoverageSpeciesGroup implements java.io.Serializable {

	private CoverageSpeciesGroupId id;
	private Coverage coverage;
	private SpeciesGroup speciesGroup;

	public CoverageSpeciesGroup() {
	}

	public CoverageSpeciesGroup(CoverageSpeciesGroupId id) {
		this.id = id;
	}

	public CoverageSpeciesGroup(CoverageSpeciesGroupId id, Coverage coverage, SpeciesGroup speciesGroup) {
		this.id = id;
		this.coverage = coverage;
		this.speciesGroup = speciesGroup;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "coverageSpeciesGroupsId", column = @Column(name = "coverage_species_groups_id")),
			@AttributeOverride(name = "speciesGroupId", column = @Column(name = "species_group_id")) })
	public CoverageSpeciesGroupId getId() {
		return this.id;
	}

	public void setId(CoverageSpeciesGroupId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coverage_species_groups_id", insertable = false, updatable = false)
	public Coverage getCoverage() {
		return this.coverage;
	}

	public void setCoverage(Coverage coverage) {
		this.coverage = coverage;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "species_group_id", insertable = false, updatable = false)
	public SpeciesGroup getSpeciesGroup() {
		return this.speciesGroup;
	}

	public void setSpeciesGroup(SpeciesGroup speciesGroup) {
		this.speciesGroup = speciesGroup;
	}

}