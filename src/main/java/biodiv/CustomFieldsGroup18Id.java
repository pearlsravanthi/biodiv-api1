package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CustomFieldsGroup18Id generated by hbm2java
 */
@Embeddable
public class CustomFieldsGroup18Id implements java.io.Serializable {

	private long observationId;
	private String cf5;
	private String cf6;

	public CustomFieldsGroup18Id() {
	}

	public CustomFieldsGroup18Id(long observationId) {
		this.observationId = observationId;
	}

	public CustomFieldsGroup18Id(long observationId, String cf5, String cf6) {
		this.observationId = observationId;
		this.cf5 = cf5;
		this.cf6 = cf6;
	}

	@Column(name = "observation_id", nullable = false)
	public long getObservationId() {
		return this.observationId;
	}

	public void setObservationId(long observationId) {
		this.observationId = observationId;
	}

	@Column(name = "cf_5")
	public String getCf5() {
		return this.cf5;
	}

	public void setCf5(String cf5) {
		this.cf5 = cf5;
	}

	@Column(name = "cf_6")
	public String getCf6() {
		return this.cf6;
	}

	public void setCf6(String cf6) {
		this.cf6 = cf6;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CustomFieldsGroup18Id))
			return false;
		CustomFieldsGroup18Id castOther = (CustomFieldsGroup18Id) other;

		return (this.getObservationId() == castOther.getObservationId()) && ((this.getCf5() == castOther.getCf5())
				|| (this.getCf5() != null && castOther.getCf5() != null && this.getCf5().equals(castOther.getCf5())))
				&& ((this.getCf6() == castOther.getCf6()) || (this.getCf6() != null && castOther.getCf6() != null
						&& this.getCf6().equals(castOther.getCf6())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getObservationId();
		result = 37 * result + (getCf5() == null ? 0 : this.getCf5().hashCode());
		result = 37 * result + (getCf6() == null ? 0 : this.getCf6().hashCode());
		return result;
	}

}
