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
import javax.persistence.Version;

/**
 * Suser generated by hbm2java
 */
@Entity
@Table(name = "suser", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Suser implements java.io.Serializable {

	private long id;
	private long version;
	private Language language;
	private boolean accountExpired;
	private boolean accountLocked;
	private boolean enabled;
	private String password;
	private boolean passwordExpired;
	private String username;
	private String aboutMe;
	private Date dateCreated;
	private String email;
	private Boolean hideEmailId;
	private Date lastLoginDate;
	private String location;
	private String name;
	private String profilePic;
	private Boolean sendNotification;
	private Float timezone;
	private String website;
	private Boolean allowIdentifactionMail;
	private String icon;
	private String fbProfilePic;
	private Boolean sendDigest;
	private String institutionType;
	private String occupationType;
	private String sexType;
	private Double latitude;
	private Double longitude;
	private Set observations = new HashSet(0);
	private Set projects = new HashSet(0);
	private Set flags = new HashSet(0);
	private Set speciesFieldSusers = new HashSet(0);
	private Set datasets = new HashSet(0);
	private Set namesReportGenerators = new HashSet(0);
	private Set recommendationVotes = new HashSet(0);
	private Set taxonomyRegistrySusers = new HashSet(0);
	private Set commonNameses = new HashSet(0);
	private Set roles = new HashSet(0);
	private Set downloadLogs = new HashSet(0);
	private Set suserSpeciesGroups = new HashSet(0);
	private Set featureds = new HashSet(0);
	private Set activityFeeds = new HashSet(0);
	private Set openids = new HashSet(0);
	private Set commentSusers = new HashSet(0);
	private Set userGroupMemberRoles = new HashSet(0);
	private Set speciesPermissions = new HashSet(0);
	private Set usersResources = new HashSet(0);
	private Set datasources = new HashSet(0);
	private Set suserUserGroups = new HashSet(0);
	private Set documents = new HashSet(0);
	private Set resources = new HashSet(0);
	private Set speciesBulkUploads = new HashSet(0);
	private Set facts = new HashSet(0);
	private Set customFields = new HashSet(0);
	private Set facebookUsers = new HashSet(0);
	private Set comments = new HashSet(0);
	private Set follows = new HashSet(0);
	private Set discussions = new HashSet(0);
	private Set oauthids = new HashSet(0);
	private Set contacts = new HashSet(0);
	private Set suserObservationses = new HashSet(0);
	private Set commonNamesSusers = new HashSet(0);
	private Set taxonomyRegistries = new HashSet(0);
	private Set taxonomyDefinitions = new HashSet(0);
	private Set synonymses = new HashSet(0);
	private Set uploadLogs = new HashSet(0);
	private Set contributors = new HashSet(0);
	private Set follows_1 = new HashSet(0);
	private Set suserHabitats = new HashSet(0);
	private Set namePermissions = new HashSet(0);
	private Set taxonomyDefinitionSusers = new HashSet(0);
	private Set flags_1 = new HashSet(0);
	private Set synonymsSusers = new HashSet(0);
	private Set speciesFields = new HashSet(0);

	public Suser() {
	}

	public Suser(long id, Language language, boolean accountExpired, boolean accountLocked, boolean enabled,
			String password, boolean passwordExpired, String username) {
		this.id = id;
		this.language = language;
		this.accountExpired = accountExpired;
		this.accountLocked = accountLocked;
		this.enabled = enabled;
		this.password = password;
		this.passwordExpired = passwordExpired;
		this.username = username;
	}

	public Suser(long id, Language language, boolean accountExpired, boolean accountLocked, boolean enabled,
			String password, boolean passwordExpired, String username, String aboutMe, Date dateCreated, String email,
			Boolean hideEmailId, Date lastLoginDate, String location, String name, String profilePic,
			Boolean sendNotification, Float timezone, String website, Boolean allowIdentifactionMail, String icon,
			String fbProfilePic, Boolean sendDigest, String institutionType, String occupationType, String sexType,
			Double latitude, Double longitude, Set observations, Set projects, Set flags, Set speciesFieldSusers,
			Set datasets, Set namesReportGenerators, Set recommendationVotes, Set taxonomyRegistrySusers,
			Set commonNameses, Set roles, Set downloadLogs, Set suserSpeciesGroups, Set featureds, Set activityFeeds,
			Set openids, Set commentSusers, Set userGroupMemberRoles, Set speciesPermissions, Set usersResources,
			Set datasources, Set suserUserGroups, Set documents, Set resources, Set speciesBulkUploads, Set facts,
			Set customFields, Set facebookUsers, Set comments, Set follows, Set discussions, Set oauthids, Set contacts,
			Set suserObservationses, Set commonNamesSusers, Set taxonomyRegistries, Set taxonomyDefinitions,
			Set synonymses, Set uploadLogs, Set contributors, Set follows_1, Set suserHabitats, Set namePermissions,
			Set taxonomyDefinitionSusers, Set flags_1, Set synonymsSusers, Set speciesFields) {
		this.id = id;
		this.language = language;
		this.accountExpired = accountExpired;
		this.accountLocked = accountLocked;
		this.enabled = enabled;
		this.password = password;
		this.passwordExpired = passwordExpired;
		this.username = username;
		this.aboutMe = aboutMe;
		this.dateCreated = dateCreated;
		this.email = email;
		this.hideEmailId = hideEmailId;
		this.lastLoginDate = lastLoginDate;
		this.location = location;
		this.name = name;
		this.profilePic = profilePic;
		this.sendNotification = sendNotification;
		this.timezone = timezone;
		this.website = website;
		this.allowIdentifactionMail = allowIdentifactionMail;
		this.icon = icon;
		this.fbProfilePic = fbProfilePic;
		this.sendDigest = sendDigest;
		this.institutionType = institutionType;
		this.occupationType = occupationType;
		this.sexType = sexType;
		this.latitude = latitude;
		this.longitude = longitude;
		this.observations = observations;
		this.projects = projects;
		this.flags = flags;
		this.speciesFieldSusers = speciesFieldSusers;
		this.datasets = datasets;
		this.namesReportGenerators = namesReportGenerators;
		this.recommendationVotes = recommendationVotes;
		this.taxonomyRegistrySusers = taxonomyRegistrySusers;
		this.commonNameses = commonNameses;
		this.roles = roles;
		this.downloadLogs = downloadLogs;
		this.suserSpeciesGroups = suserSpeciesGroups;
		this.featureds = featureds;
		this.activityFeeds = activityFeeds;
		this.openids = openids;
		this.commentSusers = commentSusers;
		this.userGroupMemberRoles = userGroupMemberRoles;
		this.speciesPermissions = speciesPermissions;
		this.usersResources = usersResources;
		this.datasources = datasources;
		this.suserUserGroups = suserUserGroups;
		this.documents = documents;
		this.resources = resources;
		this.speciesBulkUploads = speciesBulkUploads;
		this.facts = facts;
		this.customFields = customFields;
		this.facebookUsers = facebookUsers;
		this.comments = comments;
		this.follows = follows;
		this.discussions = discussions;
		this.oauthids = oauthids;
		this.contacts = contacts;
		this.suserObservationses = suserObservationses;
		this.commonNamesSusers = commonNamesSusers;
		this.taxonomyRegistries = taxonomyRegistries;
		this.taxonomyDefinitions = taxonomyDefinitions;
		this.synonymses = synonymses;
		this.uploadLogs = uploadLogs;
		this.contributors = contributors;
		this.follows_1 = follows_1;
		this.suserHabitats = suserHabitats;
		this.namePermissions = namePermissions;
		this.taxonomyDefinitionSusers = taxonomyDefinitionSusers;
		this.flags_1 = flags_1;
		this.synonymsSusers = synonymsSusers;
		this.speciesFields = speciesFields;
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

	@Column(name = "account_expired", nullable = false)
	public boolean isAccountExpired() {
		return this.accountExpired;
	}

	public void setAccountExpired(boolean accountExpired) {
		this.accountExpired = accountExpired;
	}

	@Column(name = "account_locked", nullable = false)
	public boolean isAccountLocked() {
		return this.accountLocked;
	}

	public void setAccountLocked(boolean accountLocked) {
		this.accountLocked = accountLocked;
	}

	@Column(name = "enabled", nullable = false)
	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "password_expired", nullable = false)
	public boolean isPasswordExpired() {
		return this.passwordExpired;
	}

	public void setPasswordExpired(boolean passwordExpired) {
		this.passwordExpired = passwordExpired;
	}

	@Column(name = "username", nullable = false)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "about_me")
	public String getAboutMe() {
		return this.aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_created", length = 29)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Column(name = "email", unique = true)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "hide_email_id")
	public Boolean getHideEmailId() {
		return this.hideEmailId;
	}

	public void setHideEmailId(Boolean hideEmailId) {
		this.hideEmailId = hideEmailId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_login_date", length = 29)
	public Date getLastLoginDate() {
		return this.lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	@Column(name = "location")
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "profile_pic")
	public String getProfilePic() {
		return this.profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	@Column(name = "send_notification")
	public Boolean getSendNotification() {
		return this.sendNotification;
	}

	public void setSendNotification(Boolean sendNotification) {
		this.sendNotification = sendNotification;
	}

	@Column(name = "timezone", precision = 8, scale = 8)
	public Float getTimezone() {
		return this.timezone;
	}

	public void setTimezone(Float timezone) {
		this.timezone = timezone;
	}

	@Column(name = "website")
	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Column(name = "allow_identifaction_mail")
	public Boolean getAllowIdentifactionMail() {
		return this.allowIdentifactionMail;
	}

	public void setAllowIdentifactionMail(Boolean allowIdentifactionMail) {
		this.allowIdentifactionMail = allowIdentifactionMail;
	}

	@Column(name = "icon")
	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Column(name = "fb_profile_pic")
	public String getFbProfilePic() {
		return this.fbProfilePic;
	}

	public void setFbProfilePic(String fbProfilePic) {
		this.fbProfilePic = fbProfilePic;
	}

	@Column(name = "send_digest")
	public Boolean getSendDigest() {
		return this.sendDigest;
	}

	public void setSendDigest(Boolean sendDigest) {
		this.sendDigest = sendDigest;
	}

	@Column(name = "institution_type")
	public String getInstitutionType() {
		return this.institutionType;
	}

	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}

	@Column(name = "occupation_type")
	public String getOccupationType() {
		return this.occupationType;
	}

	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}

	@Column(name = "sex_type")
	public String getSexType() {
		return this.sexType;
	}

	public void setSexType(String sexType) {
		this.sexType = sexType;
	}

	@Column(name = "latitude", precision = 17, scale = 17)
	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude", precision = 17, scale = 17)
	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getObservations() {
		return this.observations;
	}

	public void setObservations(Set observations) {
		this.observations = observations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getProjects() {
		return this.projects;
	}

	public void setProjects(Set projects) {
		this.projects = projects;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getFlags() {
		return this.flags;
	}

	public void setFlags(Set flags) {
		this.flags = flags;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getSpeciesFieldSusers() {
		return this.speciesFieldSusers;
	}

	public void setSpeciesFieldSusers(Set speciesFieldSusers) {
		this.speciesFieldSusers = speciesFieldSusers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getDatasets() {
		return this.datasets;
	}

	public void setDatasets(Set datasets) {
		this.datasets = datasets;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getNamesReportGenerators() {
		return this.namesReportGenerators;
	}

	public void setNamesReportGenerators(Set namesReportGenerators) {
		this.namesReportGenerators = namesReportGenerators;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getRecommendationVotes() {
		return this.recommendationVotes;
	}

	public void setRecommendationVotes(Set recommendationVotes) {
		this.recommendationVotes = recommendationVotes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getTaxonomyRegistrySusers() {
		return this.taxonomyRegistrySusers;
	}

	public void setTaxonomyRegistrySusers(Set taxonomyRegistrySusers) {
		this.taxonomyRegistrySusers = taxonomyRegistrySusers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getCommonNameses() {
		return this.commonNameses;
	}

	public void setCommonNameses(Set commonNameses) {
		this.commonNameses = commonNameses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "suser_role", schema = "public", joinColumns = {
			@JoinColumn(name = "s_user_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "role_id", nullable = false, updatable = false) })
	public Set getRoles() {
		return this.roles;
	}

	public void setRoles(Set roles) {
		this.roles = roles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getDownloadLogs() {
		return this.downloadLogs;
	}

	public void setDownloadLogs(Set downloadLogs) {
		this.downloadLogs = downloadLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getSuserSpeciesGroups() {
		return this.suserSpeciesGroups;
	}

	public void setSuserSpeciesGroups(Set suserSpeciesGroups) {
		this.suserSpeciesGroups = suserSpeciesGroups;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getFeatureds() {
		return this.featureds;
	}

	public void setFeatureds(Set featureds) {
		this.featureds = featureds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getActivityFeeds() {
		return this.activityFeeds;
	}

	public void setActivityFeeds(Set activityFeeds) {
		this.activityFeeds = activityFeeds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getOpenids() {
		return this.openids;
	}

	public void setOpenids(Set openids) {
		this.openids = openids;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getCommentSusers() {
		return this.commentSusers;
	}

	public void setCommentSusers(Set commentSusers) {
		this.commentSusers = commentSusers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getUserGroupMemberRoles() {
		return this.userGroupMemberRoles;
	}

	public void setUserGroupMemberRoles(Set userGroupMemberRoles) {
		this.userGroupMemberRoles = userGroupMemberRoles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getSpeciesPermissions() {
		return this.speciesPermissions;
	}

	public void setSpeciesPermissions(Set speciesPermissions) {
		this.speciesPermissions = speciesPermissions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getUsersResources() {
		return this.usersResources;
	}

	public void setUsersResources(Set usersResources) {
		this.usersResources = usersResources;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getDatasources() {
		return this.datasources;
	}

	public void setDatasources(Set datasources) {
		this.datasources = datasources;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getSuserUserGroups() {
		return this.suserUserGroups;
	}

	public void setSuserUserGroups(Set suserUserGroups) {
		this.suserUserGroups = suserUserGroups;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getDocuments() {
		return this.documents;
	}

	public void setDocuments(Set documents) {
		this.documents = documents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getResources() {
		return this.resources;
	}

	public void setResources(Set resources) {
		this.resources = resources;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getSpeciesBulkUploads() {
		return this.speciesBulkUploads;
	}

	public void setSpeciesBulkUploads(Set speciesBulkUploads) {
		this.speciesBulkUploads = speciesBulkUploads;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getFacts() {
		return this.facts;
	}

	public void setFacts(Set facts) {
		this.facts = facts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getCustomFields() {
		return this.customFields;
	}

	public void setCustomFields(Set customFields) {
		this.customFields = customFields;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getFacebookUsers() {
		return this.facebookUsers;
	}

	public void setFacebookUsers(Set facebookUsers) {
		this.facebookUsers = facebookUsers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getFollows() {
		return this.follows;
	}

	public void setFollows(Set follows) {
		this.follows = follows;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getDiscussions() {
		return this.discussions;
	}

	public void setDiscussions(Set discussions) {
		this.discussions = discussions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getOauthids() {
		return this.oauthids;
	}

	public void setOauthids(Set oauthids) {
		this.oauthids = oauthids;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getContacts() {
		return this.contacts;
	}

	public void setContacts(Set contacts) {
		this.contacts = contacts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getSuserObservationses() {
		return this.suserObservationses;
	}

	public void setSuserObservationses(Set suserObservationses) {
		this.suserObservationses = suserObservationses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getCommonNamesSusers() {
		return this.commonNamesSusers;
	}

	public void setCommonNamesSusers(Set commonNamesSusers) {
		this.commonNamesSusers = commonNamesSusers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getTaxonomyRegistries() {
		return this.taxonomyRegistries;
	}

	public void setTaxonomyRegistries(Set taxonomyRegistries) {
		this.taxonomyRegistries = taxonomyRegistries;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getTaxonomyDefinitions() {
		return this.taxonomyDefinitions;
	}

	public void setTaxonomyDefinitions(Set taxonomyDefinitions) {
		this.taxonomyDefinitions = taxonomyDefinitions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getSynonymses() {
		return this.synonymses;
	}

	public void setSynonymses(Set synonymses) {
		this.synonymses = synonymses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getUploadLogs() {
		return this.uploadLogs;
	}

	public void setUploadLogs(Set uploadLogs) {
		this.uploadLogs = uploadLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getContributors() {
		return this.contributors;
	}

	public void setContributors(Set contributors) {
		this.contributors = contributors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getFollows_1() {
		return this.follows_1;
	}

	public void setFollows_1(Set follows_1) {
		this.follows_1 = follows_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getSuserHabitats() {
		return this.suserHabitats;
	}

	public void setSuserHabitats(Set suserHabitats) {
		this.suserHabitats = suserHabitats;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getNamePermissions() {
		return this.namePermissions;
	}

	public void setNamePermissions(Set namePermissions) {
		this.namePermissions = namePermissions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getTaxonomyDefinitionSusers() {
		return this.taxonomyDefinitionSusers;
	}

	public void setTaxonomyDefinitionSusers(Set taxonomyDefinitionSusers) {
		this.taxonomyDefinitionSusers = taxonomyDefinitionSusers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getFlags_1() {
		return this.flags_1;
	}

	public void setFlags_1(Set flags_1) {
		this.flags_1 = flags_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getSynonymsSusers() {
		return this.synonymsSusers;
	}

	public void setSynonymsSusers(Set synonymsSusers) {
		this.synonymsSusers = synonymsSusers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suser")
	public Set getSpeciesFields() {
		return this.speciesFields;
	}

	public void setSpeciesFields(Set speciesFields) {
		this.speciesFields = speciesFields;
	}

}
