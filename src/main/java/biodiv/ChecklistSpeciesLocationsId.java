package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ChecklistSpeciesLocationsId generated by hbm2java
 */
@Embeddable
public class ChecklistSpeciesLocationsId implements java.io.Serializable {

	private Long id;
	private String source;
	private String title;
	private String speciesName;
	private Serializable topology;

	public ChecklistSpeciesLocationsId() {
	}

	public ChecklistSpeciesLocationsId(Long id, String source, String title, String speciesName,
			Serializable topology) {
		this.id = id;
		this.source = source;
		this.title = title;
		this.speciesName = speciesName;
		this.topology = topology;
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

	@Column(name = "title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ChecklistSpeciesLocationsId))
			return false;
		ChecklistSpeciesLocationsId castOther = (ChecklistSpeciesLocationsId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getSource() == castOther.getSource()) || (this.getSource() != null
						&& castOther.getSource() != null && this.getSource().equals(castOther.getSource())))
				&& ((this.getTitle() == castOther.getTitle()) || (this.getTitle() != null
						&& castOther.getTitle() != null && this.getTitle().equals(castOther.getTitle())))
				&& ((this.getSpeciesName() == castOther.getSpeciesName())
						|| (this.getSpeciesName() != null && castOther.getSpeciesName() != null
								&& this.getSpeciesName().equals(castOther.getSpeciesName())))
				&& ((this.getTopology() == castOther.getTopology()) || (this.getTopology() != null
						&& castOther.getTopology() != null && this.getTopology().equals(castOther.getTopology())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getSource() == null ? 0 : this.getSource().hashCode());
		result = 37 * result + (getTitle() == null ? 0 : this.getTitle().hashCode());
		result = 37 * result + (getSpeciesName() == null ? 0 : this.getSpeciesName().hashCode());
		result = 37 * result + (getTopology() == null ? 0 : this.getTopology().hashCode());
		return result;
	}

}