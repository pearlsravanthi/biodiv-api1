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
 * CoverageHabitat generated by hbm2java
 */
@Entity
@Table(name = "coverage_habitat", schema = "public")
public class CoverageHabitat implements java.io.Serializable {

	private CoverageHabitatId id;
	private Coverage coverage;
	private Habitat habitat;

	public CoverageHabitat() {
	}

	public CoverageHabitat(CoverageHabitatId id) {
		this.id = id;
	}

	public CoverageHabitat(CoverageHabitatId id, Coverage coverage, Habitat habitat) {
		this.id = id;
		this.coverage = coverage;
		this.habitat = habitat;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "coverageHabitatsId", column = @Column(name = "coverage_habitats_id")),
			@AttributeOverride(name = "habitatId", column = @Column(name = "habitat_id")) })
	public CoverageHabitatId getId() {
		return this.id;
	}

	public void setId(CoverageHabitatId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coverage_habitats_id", insertable = false, updatable = false)
	public Coverage getCoverage() {
		return this.coverage;
	}

	public void setCoverage(Coverage coverage) {
		this.coverage = coverage;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "habitat_id", insertable = false, updatable = false)
	public Habitat getHabitat() {
		return this.habitat;
	}

	public void setHabitat(Habitat habitat) {
		this.habitat = habitat;
	}

}
