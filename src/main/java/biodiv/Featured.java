package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * Featured generated by hbm2java
 */
@Entity
@Table(name = "featured", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = { "user_group_id",
		"object_type", "object_id", "author_id" }))
public class Featured implements java.io.Serializable {

	private long id;
	private long version;
	private Language language;
	private UserGroup userGroup;
	private Suser suser;
	private Date createdOn;
	private String notes;
	private long objectId;
	private String objectType;
	private Date expireTime;

	public Featured() {
	}

	public Featured(long id, Language language, Suser suser, Date createdOn, String notes, long objectId,
			String objectType) {
		this.id = id;
		this.language = language;
		this.suser = suser;
		this.createdOn = createdOn;
		this.notes = notes;
		this.objectId = objectId;
		this.objectType = objectType;
	}

	public Featured(long id, Language language, UserGroup userGroup, Suser suser, Date createdOn, String notes,
			long objectId, String objectType, Date expireTime) {
		this.id = id;
		this.language = language;
		this.userGroup = userGroup;
		this.suser = suser;
		this.createdOn = createdOn;
		this.notes = notes;
		this.objectId = objectId;
		this.objectType = objectType;
		this.expireTime = expireTime;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Version
	@Column(name = "version", nullable = false)
	public long getVersion() {
		return this.version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "language_id", nullable = false)
	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_group_id")
	public UserGroup getUserGroup() {
		return this.userGroup;
	}

	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id", nullable = false)
	public Suser getSuser() {
		return this.suser;
	}

	public void setSuser(Suser suser) {
		this.suser = suser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on", nullable = false, length = 29)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "notes", nullable = false, length = 400)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "object_id", nullable = false)
	public long getObjectId() {
		return this.objectId;
	}

	public void setObjectId(long objectId) {
		this.objectId = objectId;
	}

	@Column(name = "object_type", nullable = false)
	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expire_time", length = 29)
	public Date getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

}