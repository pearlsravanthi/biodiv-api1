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
import javax.persistence.Version;

/**
 * ActivityFeed generated by hbm2java
 */
@Entity
@Table(name = "activity_feed", schema = "public")
public class ActivityFeed implements java.io.Serializable {

	private long id;
	private long version;
	private Suser suser;
	private String activityDescrption;
	private Long activityHolderId;
	private String activityHolderType;
	private String activityRootType;
	private String activityType;
	private Date dateCreated;
	private Date lastUpdated;
	private Long rootHolderId;
	private String rootHolderType;
	private Long subRootHolderId;
	private String subRootHolderType;
	private Boolean isShowable;

	public ActivityFeed() {
	}

	public ActivityFeed(long id, Suser suser, Date dateCreated, Date lastUpdated) {
		this.id = id;
		this.suser = suser;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
	}

	public ActivityFeed(long id, Suser suser, String activityDescrption, Long activityHolderId,
			String activityHolderType, String activityRootType, String activityType, Date dateCreated, Date lastUpdated,
			Long rootHolderId, String rootHolderType, Long subRootHolderId, String subRootHolderType,
			Boolean isShowable) {
		this.id = id;
		this.suser = suser;
		this.activityDescrption = activityDescrption;
		this.activityHolderId = activityHolderId;
		this.activityHolderType = activityHolderType;
		this.activityRootType = activityRootType;
		this.activityType = activityType;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
		this.rootHolderId = rootHolderId;
		this.rootHolderType = rootHolderType;
		this.subRootHolderId = subRootHolderId;
		this.subRootHolderType = subRootHolderType;
		this.isShowable = isShowable;
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
	@JoinColumn(name = "author_id", nullable = false)
	public Suser getSuser() {
		return this.suser;
	}

	public void setSuser(Suser suser) {
		this.suser = suser;
	}

	@Column(name = "activity_descrption", length = 2000)
	public String getActivityDescrption() {
		return this.activityDescrption;
	}

	public void setActivityDescrption(String activityDescrption) {
		this.activityDescrption = activityDescrption;
	}

	@Column(name = "activity_holder_id")
	public Long getActivityHolderId() {
		return this.activityHolderId;
	}

	public void setActivityHolderId(Long activityHolderId) {
		this.activityHolderId = activityHolderId;
	}

	@Column(name = "activity_holder_type")
	public String getActivityHolderType() {
		return this.activityHolderType;
	}

	public void setActivityHolderType(String activityHolderType) {
		this.activityHolderType = activityHolderType;
	}

	@Column(name = "activity_root_type")
	public String getActivityRootType() {
		return this.activityRootType;
	}

	public void setActivityRootType(String activityRootType) {
		this.activityRootType = activityRootType;
	}

	@Column(name = "activity_type")
	public String getActivityType() {
		return this.activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_created", nullable = false, length = 29)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated", nullable = false, length = 29)
	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Column(name = "root_holder_id")
	public Long getRootHolderId() {
		return this.rootHolderId;
	}

	public void setRootHolderId(Long rootHolderId) {
		this.rootHolderId = rootHolderId;
	}

	@Column(name = "root_holder_type")
	public String getRootHolderType() {
		return this.rootHolderType;
	}

	public void setRootHolderType(String rootHolderType) {
		this.rootHolderType = rootHolderType;
	}

	@Column(name = "sub_root_holder_id")
	public Long getSubRootHolderId() {
		return this.subRootHolderId;
	}

	public void setSubRootHolderId(Long subRootHolderId) {
		this.subRootHolderId = subRootHolderId;
	}

	@Column(name = "sub_root_holder_type")
	public String getSubRootHolderType() {
		return this.subRootHolderType;
	}

	public void setSubRootHolderType(String subRootHolderType) {
		this.subRootHolderType = subRootHolderType;
	}

	@Column(name = "is_showable")
	public Boolean getIsShowable() {
		return this.isShowable;
	}

	public void setIsShowable(Boolean isShowable) {
		this.isShowable = isShowable;
	}

}