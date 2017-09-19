package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProjectDataLinkId generated by hbm2java
 */
@Embeddable
public class ProjectDataLinkId implements java.io.Serializable {

	private Long projectDataLinksId;
	private Long dataLinkId;
	private Integer dataLinksIdx;

	public ProjectDataLinkId() {
	}

	public ProjectDataLinkId(Long projectDataLinksId, Long dataLinkId, Integer dataLinksIdx) {
		this.projectDataLinksId = projectDataLinksId;
		this.dataLinkId = dataLinkId;
		this.dataLinksIdx = dataLinksIdx;
	}

	@Column(name = "project_data_links_id")
	public Long getProjectDataLinksId() {
		return this.projectDataLinksId;
	}

	public void setProjectDataLinksId(Long projectDataLinksId) {
		this.projectDataLinksId = projectDataLinksId;
	}

	@Column(name = "data_link_id")
	public Long getDataLinkId() {
		return this.dataLinkId;
	}

	public void setDataLinkId(Long dataLinkId) {
		this.dataLinkId = dataLinkId;
	}

	@Column(name = "data_links_idx")
	public Integer getDataLinksIdx() {
		return this.dataLinksIdx;
	}

	public void setDataLinksIdx(Integer dataLinksIdx) {
		this.dataLinksIdx = dataLinksIdx;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProjectDataLinkId))
			return false;
		ProjectDataLinkId castOther = (ProjectDataLinkId) other;

		return ((this.getProjectDataLinksId() == castOther.getProjectDataLinksId())
				|| (this.getProjectDataLinksId() != null && castOther.getProjectDataLinksId() != null
						&& this.getProjectDataLinksId().equals(castOther.getProjectDataLinksId())))
				&& ((this.getDataLinkId() == castOther.getDataLinkId()) || (this.getDataLinkId() != null
						&& castOther.getDataLinkId() != null && this.getDataLinkId().equals(castOther.getDataLinkId())))
				&& ((this.getDataLinksIdx() == castOther.getDataLinksIdx())
						|| (this.getDataLinksIdx() != null && castOther.getDataLinksIdx() != null
								&& this.getDataLinksIdx().equals(castOther.getDataLinksIdx())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getProjectDataLinksId() == null ? 0 : this.getProjectDataLinksId().hashCode());
		result = 37 * result + (getDataLinkId() == null ? 0 : this.getDataLinkId().hashCode());
		result = 37 * result + (getDataLinksIdx() == null ? 0 : this.getDataLinksIdx().hashCode());
		return result;
	}

}