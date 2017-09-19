package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProjectDocumentId generated by hbm2java
 */
@Embeddable
public class ProjectDocumentId implements java.io.Serializable {

	private Long projectMiscFilesId;
	private Long documentId;
	private Long projectProposalFilesId;
	private Long projectReportFilesId;

	public ProjectDocumentId() {
	}

	public ProjectDocumentId(Long projectMiscFilesId, Long documentId, Long projectProposalFilesId,
			Long projectReportFilesId) {
		this.projectMiscFilesId = projectMiscFilesId;
		this.documentId = documentId;
		this.projectProposalFilesId = projectProposalFilesId;
		this.projectReportFilesId = projectReportFilesId;
	}

	@Column(name = "project_misc_files_id")
	public Long getProjectMiscFilesId() {
		return this.projectMiscFilesId;
	}

	public void setProjectMiscFilesId(Long projectMiscFilesId) {
		this.projectMiscFilesId = projectMiscFilesId;
	}

	@Column(name = "document_id")
	public Long getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	@Column(name = "project_proposal_files_id")
	public Long getProjectProposalFilesId() {
		return this.projectProposalFilesId;
	}

	public void setProjectProposalFilesId(Long projectProposalFilesId) {
		this.projectProposalFilesId = projectProposalFilesId;
	}

	@Column(name = "project_report_files_id")
	public Long getProjectReportFilesId() {
		return this.projectReportFilesId;
	}

	public void setProjectReportFilesId(Long projectReportFilesId) {
		this.projectReportFilesId = projectReportFilesId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProjectDocumentId))
			return false;
		ProjectDocumentId castOther = (ProjectDocumentId) other;

		return ((this.getProjectMiscFilesId() == castOther.getProjectMiscFilesId())
				|| (this.getProjectMiscFilesId() != null && castOther.getProjectMiscFilesId() != null
						&& this.getProjectMiscFilesId().equals(castOther.getProjectMiscFilesId())))
				&& ((this.getDocumentId() == castOther.getDocumentId()) || (this.getDocumentId() != null
						&& castOther.getDocumentId() != null && this.getDocumentId().equals(castOther.getDocumentId())))
				&& ((this.getProjectProposalFilesId() == castOther.getProjectProposalFilesId())
						|| (this.getProjectProposalFilesId() != null && castOther.getProjectProposalFilesId() != null
								&& this.getProjectProposalFilesId().equals(castOther.getProjectProposalFilesId())))
				&& ((this.getProjectReportFilesId() == castOther.getProjectReportFilesId())
						|| (this.getProjectReportFilesId() != null && castOther.getProjectReportFilesId() != null
								&& this.getProjectReportFilesId().equals(castOther.getProjectReportFilesId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getProjectMiscFilesId() == null ? 0 : this.getProjectMiscFilesId().hashCode());
		result = 37 * result + (getDocumentId() == null ? 0 : this.getDocumentId().hashCode());
		result = 37 * result + (getProjectProposalFilesId() == null ? 0 : this.getProjectProposalFilesId().hashCode());
		result = 37 * result + (getProjectReportFilesId() == null ? 0 : this.getProjectReportFilesId().hashCode());
		return result;
	}

}
