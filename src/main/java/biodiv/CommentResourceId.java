package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CommentResourceId generated by hbm2java
 */
@Embeddable
public class CommentResourceId implements java.io.Serializable {

	private Long commentAttachmentsId;
	private Long resourceId;

	public CommentResourceId() {
	}

	public CommentResourceId(Long commentAttachmentsId, Long resourceId) {
		this.commentAttachmentsId = commentAttachmentsId;
		this.resourceId = resourceId;
	}

	@Column(name = "comment_attachments_id")
	public Long getCommentAttachmentsId() {
		return this.commentAttachmentsId;
	}

	public void setCommentAttachmentsId(Long commentAttachmentsId) {
		this.commentAttachmentsId = commentAttachmentsId;
	}

	@Column(name = "resource_id")
	public Long getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CommentResourceId))
			return false;
		CommentResourceId castOther = (CommentResourceId) other;

		return ((this.getCommentAttachmentsId() == castOther.getCommentAttachmentsId())
				|| (this.getCommentAttachmentsId() != null && castOther.getCommentAttachmentsId() != null
						&& this.getCommentAttachmentsId().equals(castOther.getCommentAttachmentsId())))
				&& ((this.getResourceId() == castOther.getResourceId())
						|| (this.getResourceId() != null && castOther.getResourceId() != null
								&& this.getResourceId().equals(castOther.getResourceId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCommentAttachmentsId() == null ? 0 : this.getCommentAttachmentsId().hashCode());
		result = 37 * result + (getResourceId() == null ? 0 : this.getResourceId().hashCode());
		return result;
	}

}
