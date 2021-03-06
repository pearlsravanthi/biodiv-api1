package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * UserGroup generated by hbm2java
 */
@Entity
@Table(name = "user_group", schema = "public", uniqueConstraints = { @UniqueConstraint(columnNames = "name"),
		@UniqueConstraint(columnNames = "webaddress") })
public class UserGroup implements java.io.Serializable {

	private long id;
	private Language language;
	private boolean allowMembersToMakeSpeciesCall;
	private boolean allowNonMembersToComment;
	private boolean allowObvCrossPosting;
	private boolean allowUsersToJoin;
	private String description;
	private String domainName;
	private Date foundedOn;
	private String homePage;
	private String icon;
	private boolean isDeleted;
	private String name;
	private float neLatitude;
	private float neLongitude;
	private float swLatitude;
	private float swLongitude;
	private String theme;
	private long visitCount;
	private String webaddress;
	private boolean sendDigestMail;
	private Date statStartDate;
	private String filterRule;
	private Set documents = new HashSet(0);
	private Set projects = new HashSet(0);
	private Set specieses = new HashSet(0);
	private Set observations = new HashSet(0);
	private Set userGroupHabitats = new HashSet(0);
	private Set digests = new HashSet(0);
	private Set userGroupObservations = new HashSet(0);
	private Set featureds = new HashSet(0);
	private Set customFields = new HashSet(0);
	private Set userGroupNewsletters = new HashSet(0);
	private Set userGroupSpeciesGroups = new HashSet(0);
	private Set suserUserGroups = new HashSet(0);
	private Set userGroupMemberRoles = new HashSet(0);
	private Set newsletters = new HashSet(0);
	private Set discussions = new HashSet(0);

	public UserGroup() {
	}

	public UserGroup(long id, Language language, boolean allowMembersToMakeSpeciesCall,
			boolean allowNonMembersToComment, boolean allowObvCrossPosting, boolean allowUsersToJoin,
			String description, Date foundedOn, boolean isDeleted, String name, float neLatitude, float neLongitude,
			float swLatitude, float swLongitude, long visitCount, String webaddress, boolean sendDigestMail,
			Date statStartDate) {
		this.id = id;
		this.language = language;
		this.allowMembersToMakeSpeciesCall = allowMembersToMakeSpeciesCall;
		this.allowNonMembersToComment = allowNonMembersToComment;
		this.allowObvCrossPosting = allowObvCrossPosting;
		this.allowUsersToJoin = allowUsersToJoin;
		this.description = description;
		this.foundedOn = foundedOn;
		this.isDeleted = isDeleted;
		this.name = name;
		this.neLatitude = neLatitude;
		this.neLongitude = neLongitude;
		this.swLatitude = swLatitude;
		this.swLongitude = swLongitude;
		this.visitCount = visitCount;
		this.webaddress = webaddress;
		this.sendDigestMail = sendDigestMail;
		this.statStartDate = statStartDate;
	}

	public UserGroup(long id, Language language, boolean allowMembersToMakeSpeciesCall,
			boolean allowNonMembersToComment, boolean allowObvCrossPosting, boolean allowUsersToJoin,
			String description, String domainName, Date foundedOn, String homePage, String icon, boolean isDeleted,
			String name, float neLatitude, float neLongitude, float swLatitude, float swLongitude, String theme,
			long visitCount, String webaddress, boolean sendDigestMail, Date statStartDate, String filterRule,
			Set documents, Set projects, Set specieses, Set observations, Set userGroupHabitats, Set digests,
			Set userGroupObservations, Set featureds, Set customFields, Set userGroupNewsletters,
			Set userGroupSpeciesGroups, Set suserUserGroups, Set userGroupMemberRoles, Set newsletters,
			Set discussions) {
		this.id = id;
		this.language = language;
		this.allowMembersToMakeSpeciesCall = allowMembersToMakeSpeciesCall;
		this.allowNonMembersToComment = allowNonMembersToComment;
		this.allowObvCrossPosting = allowObvCrossPosting;
		this.allowUsersToJoin = allowUsersToJoin;
		this.description = description;
		this.domainName = domainName;
		this.foundedOn = foundedOn;
		this.homePage = homePage;
		this.icon = icon;
		this.isDeleted = isDeleted;
		this.name = name;
		this.neLatitude = neLatitude;
		this.neLongitude = neLongitude;
		this.swLatitude = swLatitude;
		this.swLongitude = swLongitude;
		this.theme = theme;
		this.visitCount = visitCount;
		this.webaddress = webaddress;
		this.sendDigestMail = sendDigestMail;
		this.statStartDate = statStartDate;
		this.filterRule = filterRule;
		this.documents = documents;
		this.projects = projects;
		this.specieses = specieses;
		this.observations = observations;
		this.userGroupHabitats = userGroupHabitats;
		this.digests = digests;
		this.userGroupObservations = userGroupObservations;
		this.featureds = featureds;
		this.customFields = customFields;
		this.userGroupNewsletters = userGroupNewsletters;
		this.userGroupSpeciesGroups = userGroupSpeciesGroups;
		this.suserUserGroups = suserUserGroups;
		this.userGroupMemberRoles = userGroupMemberRoles;
		this.newsletters = newsletters;
		this.discussions = discussions;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "language_id", nullable = false)
	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@Column(name = "allow_members_to_make_species_call", nullable = false)
	public boolean isAllowMembersToMakeSpeciesCall() {
		return this.allowMembersToMakeSpeciesCall;
	}

	public void setAllowMembersToMakeSpeciesCall(boolean allowMembersToMakeSpeciesCall) {
		this.allowMembersToMakeSpeciesCall = allowMembersToMakeSpeciesCall;
	}

	@Column(name = "allow_non_members_to_comment", nullable = false)
	public boolean isAllowNonMembersToComment() {
		return this.allowNonMembersToComment;
	}

	public void setAllowNonMembersToComment(boolean allowNonMembersToComment) {
		this.allowNonMembersToComment = allowNonMembersToComment;
	}

	@Column(name = "allow_obv_cross_posting", nullable = false)
	public boolean isAllowObvCrossPosting() {
		return this.allowObvCrossPosting;
	}

	public void setAllowObvCrossPosting(boolean allowObvCrossPosting) {
		this.allowObvCrossPosting = allowObvCrossPosting;
	}

	@Column(name = "allow_users_to_join", nullable = false)
	public boolean isAllowUsersToJoin() {
		return this.allowUsersToJoin;
	}

	public void setAllowUsersToJoin(boolean allowUsersToJoin) {
		this.allowUsersToJoin = allowUsersToJoin;
	}

	@Column(name = "description", nullable = false)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "domain_name")
	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "founded_on", nullable = false, length = 29)
	public Date getFoundedOn() {
		return this.foundedOn;
	}

	public void setFoundedOn(Date foundedOn) {
		this.foundedOn = foundedOn;
	}

	@Column(name = "home_page")
	public String getHomePage() {
		return this.homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	@Column(name = "icon")
	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Column(name = "is_deleted", nullable = false)
	public boolean isIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column(name = "name", unique = true, nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "ne_latitude", nullable = false, precision = 8, scale = 8)
	public float getNeLatitude() {
		return this.neLatitude;
	}

	public void setNeLatitude(float neLatitude) {
		this.neLatitude = neLatitude;
	}

	@Column(name = "ne_longitude", nullable = false, precision = 8, scale = 8)
	public float getNeLongitude() {
		return this.neLongitude;
	}

	public void setNeLongitude(float neLongitude) {
		this.neLongitude = neLongitude;
	}

	@Column(name = "sw_latitude", nullable = false, precision = 8, scale = 8)
	public float getSwLatitude() {
		return this.swLatitude;
	}

	public void setSwLatitude(float swLatitude) {
		this.swLatitude = swLatitude;
	}

	@Column(name = "sw_longitude", nullable = false, precision = 8, scale = 8)
	public float getSwLongitude() {
		return this.swLongitude;
	}

	public void setSwLongitude(float swLongitude) {
		this.swLongitude = swLongitude;
	}

	@Column(name = "theme")
	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	@Column(name = "visit_count", nullable = false)
	public long getVisitCount() {
		return this.visitCount;
	}

	public void setVisitCount(long visitCount) {
		this.visitCount = visitCount;
	}

	@Column(name = "webaddress", unique = true, nullable = false)
	public String getWebaddress() {
		return this.webaddress;
	}

	public void setWebaddress(String webaddress) {
		this.webaddress = webaddress;
	}

	@Column(name = "send_digest_mail", nullable = false)
	public boolean isSendDigestMail() {
		return this.sendDigestMail;
	}

	public void setSendDigestMail(boolean sendDigestMail) {
		this.sendDigestMail = sendDigestMail;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "stat_start_date", nullable = false, length = 29)
	public Date getStatStartDate() {
		return this.statStartDate;
	}

	public void setStatStartDate(Date statStartDate) {
		this.statStartDate = statStartDate;
	}

	@Column(name = "filter_rule")
	public String getFilterRule() {
		return this.filterRule;
	}

	public void setFilterRule(String filterRule) {
		this.filterRule = filterRule;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_group_documents", schema = "public", joinColumns = {
			@JoinColumn(name = "user_group_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "document_id", nullable = false, updatable = false) })
	public Set getDocuments() {
		return this.documents;
	}

	public void setDocuments(Set documents) {
		this.documents = documents;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_group_projects", schema = "public", joinColumns = {
			@JoinColumn(name = "user_group_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "project_id", nullable = false, updatable = false) })
	public Set getProjects() {
		return this.projects;
	}

	public void setProjects(Set projects) {
		this.projects = projects;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_group_species", schema = "public", joinColumns = {
			@JoinColumn(name = "user_group_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "species_id", nullable = false, updatable = false) })
	public Set getSpecieses() {
		return this.specieses;
	}

	public void setSpecieses(Set specieses) {
		this.specieses = specieses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_group_observations", schema = "public", joinColumns = {
			@JoinColumn(name = "user_group_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "observation_id", nullable = false, updatable = false) })
	public Set getObservations() {
		return this.observations;
	}

	public void setObservations(Set observations) {
		this.observations = observations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userGroup")
	public Set getUserGroupHabitats() {
		return this.userGroupHabitats;
	}

	public void setUserGroupHabitats(Set userGroupHabitats) {
		this.userGroupHabitats = userGroupHabitats;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userGroup")
	public Set getDigests() {
		return this.digests;
	}

	public void setDigests(Set digests) {
		this.digests = digests;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userGroup")
	public Set getUserGroupObservations() {
		return this.userGroupObservations;
	}

	public void setUserGroupObservations(Set userGroupObservations) {
		this.userGroupObservations = userGroupObservations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userGroup")
	public Set getFeatureds() {
		return this.featureds;
	}

	public void setFeatureds(Set featureds) {
		this.featureds = featureds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userGroup")
	public Set getCustomFields() {
		return this.customFields;
	}

	public void setCustomFields(Set customFields) {
		this.customFields = customFields;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userGroup")
	public Set getUserGroupNewsletters() {
		return this.userGroupNewsletters;
	}

	public void setUserGroupNewsletters(Set userGroupNewsletters) {
		this.userGroupNewsletters = userGroupNewsletters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userGroup")
	public Set getUserGroupSpeciesGroups() {
		return this.userGroupSpeciesGroups;
	}

	public void setUserGroupSpeciesGroups(Set userGroupSpeciesGroups) {
		this.userGroupSpeciesGroups = userGroupSpeciesGroups;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userGroup")
	public Set getSuserUserGroups() {
		return this.suserUserGroups;
	}

	public void setSuserUserGroups(Set suserUserGroups) {
		this.suserUserGroups = suserUserGroups;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userGroup")
	public Set getUserGroupMemberRoles() {
		return this.userGroupMemberRoles;
	}

	public void setUserGroupMemberRoles(Set userGroupMemberRoles) {
		this.userGroupMemberRoles = userGroupMemberRoles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userGroup")
	public Set getNewsletters() {
		return this.newsletters;
	}

	public void setNewsletters(Set newsletters) {
		this.newsletters = newsletters;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_group_discussions", schema = "public", joinColumns = {
			@JoinColumn(name = "user_group_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "discussion_id", nullable = false, updatable = false) })
	public Set getDiscussions() {
		return this.discussions;
	}

	public void setDiscussions(Set discussions) {
		this.discussions = discussions;
	}

}
