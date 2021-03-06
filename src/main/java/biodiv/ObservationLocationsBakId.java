package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ObservationLocationsBakId generated by hbm2java
 */
@Embeddable
public class ObservationLocationsBakId implements java.io.Serializable {

	private Long id;
	private String source;
	private String speciesName;
	private Serializable topology;
	private Date lastRevised;

	public ObservationLocationsBakId() {
	}

	public ObservationLocationsBakId(Long id, String source, String speciesName, Serializable topology,
			Date lastRevised) {
		this.id = id;
		this.source = source;
		this.speciesName = speciesName;
		this.topology = topology;
		this.lastRevised = lastRevised;
	}

	@Column(name = "id")
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "source")
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Column(name = "species_name")
	public String getSpeciesName() {
		return this.speciesName;
	}

	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}

	@Column(name = "topology")
	public Serializable getTopology() {
		return this.topology;
	}

	public void setTopology(Serializable topology) {
		this.topology = topology;
	}

	@Column(name = "last_revised", length = 29)
	public Date getLastRevised() {
		return this.lastRevised;
	}

	public void setLastRevised(Date lastRevised) {
		this.lastRevised = lastRevised;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ObservationLocationsBakId))
			return false;
		ObservationLocationsBakId castOther = (ObservationLocationsBakId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getSource() == castOther.getSource()) || (this.getSource() != null
						&& castOther.getSource() != null && this.getSource().equals(castOther.getSource())))
				&& ((this.getSpeciesName() == castOther.getSpeciesName())
						|| (this.getSpeciesName() != null && castOther.getSpeciesName() != null
								&& this.getSpeciesName().equals(castOther.getSpeciesName())))
				&& ((this.getTopology() == castOther.getTopology()) || (this.getTopology() != null
						&& castOther.getTopology() != null && this.getTopology().equals(castOther.getTopology())))
				&& ((this.getLastRevised() == castOther.getLastRevised())
						|| (this.getLastRevised() != null && castOther.getLastRevised() != null
								&& this.getLastRevised().equals(castOther.getLastRevised())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getSource() == null ? 0 : this.getSource().hashCode());
		result = 37 * result + (getSpeciesName() == null ? 0 : this.getSpeciesName().hashCode());
		result = 37 * result + (getTopology() == null ? 0 : this.getTopology().hashCode());
		result = 37 * result + (getLastRevised() == null ? 0 : this.getLastRevised().hashCode());
		return result;
	}

}
