package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SuserObservationsId generated by hbm2java
 */
@Embeddable
public class SuserObservationsId implements java.io.Serializable {

	private Long checklistsId;
	private Long observationsId;

	public SuserObservationsId() {
	}

	public SuserObservationsId(Long checklistsId, Long observationsId) {
		this.checklistsId = checklistsId;
		this.observationsId = observationsId;
	}

	@Column(name = "checklists_id")
	public Long getChecklistsId() {
		return this.checklistsId;
	}

	public void setChecklistsId(Long checklistsId) {
		this.checklistsId = checklistsId;
	}

	@Column(name = "observations_id")
	public Long getObservationsId() {
		return this.observationsId;
	}

	public void setObservationsId(Long observationsId) {
		this.observationsId = observationsId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SuserObservationsId))
			return false;
		SuserObservationsId castOther = (SuserObservationsId) other;

		return ((this.getChecklistsId() == castOther.getChecklistsId()) || (this.getChecklistsId() != null
				&& castOther.getChecklistsId() != null && this.getChecklistsId().equals(castOther.getChecklistsId())))
				&& ((this.getObservationsId() == castOther.getObservationsId())
						|| (this.getObservationsId() != null && castOther.getObservationsId() != null
								&& this.getObservationsId().equals(castOther.getObservationsId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getChecklistsId() == null ? 0 : this.getChecklistsId().hashCode());
		result = 37 * result + (getObservationsId() == null ? 0 : this.getObservationsId().hashCode());
		return result;
	}

}
