package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SuserHabitatId generated by hbm2java
 */
@Embeddable
public class SuserHabitatId implements java.io.Serializable {

	private Long suserHabitatsId;
	private Long habitatId;

	public SuserHabitatId() {
	}

	public SuserHabitatId(Long suserHabitatsId, Long habitatId) {
		this.suserHabitatsId = suserHabitatsId;
		this.habitatId = habitatId;
	}

	@Column(name = "suser_habitats_id")
	public Long getSuserHabitatsId() {
		return this.suserHabitatsId;
	}

	public void setSuserHabitatsId(Long suserHabitatsId) {
		this.suserHabitatsId = suserHabitatsId;
	}

	@Column(name = "habitat_id")
	public Long getHabitatId() {
		return this.habitatId;
	}

	public void setHabitatId(Long habitatId) {
		this.habitatId = habitatId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SuserHabitatId))
			return false;
		SuserHabitatId castOther = (SuserHabitatId) other;

		return ((this.getSuserHabitatsId() == castOther.getSuserHabitatsId())
				|| (this.getSuserHabitatsId() != null && castOther.getSuserHabitatsId() != null
						&& this.getSuserHabitatsId().equals(castOther.getSuserHabitatsId())))
				&& ((this.getHabitatId() == castOther.getHabitatId()) || (this.getHabitatId() != null
						&& castOther.getHabitatId() != null && this.getHabitatId().equals(castOther.getHabitatId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSuserHabitatsId() == null ? 0 : this.getSuserHabitatsId().hashCode());
		result = 37 * result + (getHabitatId() == null ? 0 : this.getHabitatId().hashCode());
		return result;
	}

}
