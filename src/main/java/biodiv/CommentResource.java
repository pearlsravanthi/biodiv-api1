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
 * CommentResource generated by hbm2java
 */
@Entity
@Table(name = "comment_resource", schema = "public")
public class CommentResource implements java.io.Serializable {

	private CommentResourceId id;
	private Comment comment;
	private Resource resource;

	public CommentResource() {
	}

	public CommentResource(CommentResourceId id) {
		this.id = id;
	}

	public CommentResource(CommentResourceId id, Comment comment, Resource resource) {
		this.id = id;
		this.comment = comment;
		this.resource = resource;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "commentAttachmentsId", column = @Column(name = "comment_attachments_id")),
			@AttributeOverride(name = "resourceId", column = @Column(name = "resource_id")) })
	public CommentResourceId getId() {
		return this.id;
	}

	public void setId(CommentResourceId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "comment_attachments_id", insertable = false, updatable = false)
	public Comment getComment() {
		return this.comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "resource_id", insertable = false, updatable = false)
	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

}
