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
 * SpeciesFieldSuser generated by hbm2java
 */
@Entity
@Table(name = "species_field_suser", schema = "public")
public class SpeciesFieldSuser implements java.io.Serializable {

	private SpeciesFieldSuserId id;
	private Suser suser;

	public SpeciesFieldSuser() {
	}

	public SpeciesFieldSuser(SpeciesFieldSuserId id) {
		this.id = id;
	}

	public SpeciesFieldSuser(SpeciesFieldSuserId id, Suser suser) {
		this.id = id;
		this.suser = suser;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "speciesFieldContributorsId", column = @Column(name = "species_field_contributors_id")),
			@AttributeOverride(name = "suserId", column = @Column(name = "suser_id")),
			@AttributeOverride(name = "contributorsIdx", column = @Column(name = "contributors_idx")) })
	public SpeciesFieldSuserId getId() {
		return this.id;
	}

	public void setId(SpeciesFieldSuserId id) {
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

}
