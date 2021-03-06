package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SpeciesFieldSuserId generated by hbm2java
 */
@Embeddable
public class SpeciesFieldSuserId implements java.io.Serializable {

	private Long speciesFieldContributorsId;
	private Long suserId;
	private Integer contributorsIdx;

	public SpeciesFieldSuserId() {
	}

	public SpeciesFieldSuserId(Long speciesFieldContributorsId, Long suserId, Integer contributorsIdx) {
		this.speciesFieldContributorsId = speciesFieldContributorsId;
		this.suserId = suserId;
		this.contributorsIdx = contributorsIdx;
	}

	@Column(name = "species_field_contributors_id")
	public Long getSpeciesFieldContributorsId() {
		return this.speciesFieldContributorsId;
	}

	public void setSpeciesFieldContributorsId(Long speciesFieldContributorsId) {
		this.speciesFieldContributorsId = speciesFieldContributorsId;
	}

	@Column(name = "suser_id")
	public Long getSuserId() {
		return this.suserId;
	}

	public void setSuserId(Long suserId) {
		this.suserId = suserId;
	}

	@Column(name = "contributors_idx")
	public Integer getContributorsIdx() {
		return this.contributorsIdx;
	}

	public void setContributorsIdx(Integer contributorsIdx) {
		this.contributorsIdx = contributorsIdx;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SpeciesFieldSuserId))
			return false;
		SpeciesFieldSuserId castOther = (SpeciesFieldSuserId) other;

		return ((this.getSpeciesFieldContributorsId() == castOther.getSpeciesFieldContributorsId())
				|| (this.getSpeciesFieldContributorsId() != null && castOther.getSpeciesFieldContributorsId() != null
						&& this.getSpeciesFieldContributorsId().equals(castOther.getSpeciesFieldContributorsId())))
				&& ((this.getSuserId() == castOther.getSuserId()) || (this.getSuserId() != null
						&& castOther.getSuserId() != null && this.getSuserId().equals(castOther.getSuserId())))
				&& ((this.getContributorsIdx() == castOther.getContributorsIdx())
						|| (this.getContributorsIdx() != null && castOther.getContributorsIdx() != null
								&& this.getContributorsIdx().equals(castOther.getContributorsIdx())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSpeciesFieldContributorsId() == null ? 0 : this.getSpeciesFieldContributorsId().hashCode());
		result = 37 * result + (getSuserId() == null ? 0 : this.getSuserId().hashCode());
		result = 37 * result + (getContributorsIdx() == null ? 0 : this.getContributorsIdx().hashCode());
		return result;
	}

}
