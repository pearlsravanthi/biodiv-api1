package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * Observation generated by hbm2java
 */
@Entity
@Table(name = "observation", schema = "public")
public class Observation implements java.io.Serializable {

	private long id;
	private long version;
	private Language language;
	private License license;
	private Habitat habitat;
	private Resource resource;
	private SpeciesGroup speciesGroup;
	private Suser suser;
	private Recommendation recommendation;
	private Dataset dataset;
	private Date createdOn;
	private double latitude;
	private double longitude;
	private String notes;
	private Date fromDate;
	private String placeName;
	private int rating;
	private String reverseGeocodedName;
	private Integer flagCount;
	private Boolean geoPrivacy;
	private Boolean isDeleted;
	private Date lastRevised;
	private String locationAccuracy;
	private Long visitCount;
	private String searchText;
	private Boolean agreeTerms;
	private boolean isChecklist;
	private boolean isShowable;
	private Long sourceId;
	private Date toDate;
	private Serializable topology;
	private String checklistAnnotations;
	private Integer featureCount;
	private Boolean isLocked;
	private String locationScale;
	private String accessRights;
	private String catalogNumber;
	private String externalDatasetKey;
	private String externalId;
	private String externalUrl;
	private String informationWithheld;
	private Date lastCrawled;
	private Date lastInterpreted;
	private String originalAuthor;
	private String publishingCountry;
	private String viaCode;
	private String viaId;
	private String protocol;
	private String basisOfRecord;
	private int noOfImages;
	private int noOfVideos;
	private int noOfAudio;
	private int noOfIdentifications;
	private Set resources = new HashSet(0);
	private Set recommendationVotes = new HashSet(0);
	private Checklists checklists;
	private Set customFieldsGroup18s = new HashSet(0);
	private Set userGroups = new HashSet(0);
	private Set userGroupObservations = new HashSet(0);
	private Set observationReprImages = new HashSet(0);
	private Set annotations = new HashSet(0);
	private Set checklistsObservations = new HashSet(0);

	public Observation() {
	}

	public Observation(long id, Language language, License license, SpeciesGroup speciesGroup, Suser suser,
			Date createdOn, double latitude, double longitude, int rating, boolean isChecklist, boolean isShowable,
			Serializable topology, String locationScale, String protocol, String basisOfRecord, int noOfImages,
			int noOfVideos, int noOfAudio, int noOfIdentifications) {
		this.id = id;
		this.language = language;
		this.license = license;
		this.speciesGroup = speciesGroup;
		this.suser = suser;
		this.createdOn = createdOn;
		this.latitude = latitude;
		this.longitude = longitude;
		this.rating = rating;
		this.isChecklist = isChecklist;
		this.isShowable = isShowable;
		this.topology = topology;
		this.locationScale = locationScale;
		this.protocol = protocol;
		this.basisOfRecord = basisOfRecord;
		this.noOfImages = noOfImages;
		this.noOfVideos = noOfVideos;
		this.noOfAudio = noOfAudio;
		this.noOfIdentifications = noOfIdentifications;
	}

	public Observation(long id, Language language, License license, Habitat habitat, Resource resource,
			SpeciesGroup speciesGroup, Suser suser, Recommendation recommendation, Dataset dataset, Date createdOn,
			double latitude, double longitude, String notes, Date fromDate, String placeName, int rating,
			String reverseGeocodedName, Integer flagCount, Boolean geoPrivacy, Boolean isDeleted, Date lastRevised,
			String locationAccuracy, Long visitCount, String searchText, Boolean agreeTerms, boolean isChecklist,
			boolean isShowable, Long sourceId, Date toDate, Serializable topology, String checklistAnnotations,
			Integer featureCount, Boolean isLocked, String locationScale, String accessRights, String catalogNumber,
			String externalDatasetKey, String externalId, String externalUrl, String informationWithheld,
			Date lastCrawled, Date lastInterpreted, String originalAuthor, String publishingCountry, String viaCode,
			String viaId, String protocol, String basisOfRecord, int noOfImages, int noOfVideos, int noOfAudio,
			int noOfIdentifications, Set resources, Set recommendationVotes, Checklists checklists,
			Set customFieldsGroup18s, Set userGroups, Set userGroupObservations, Set observationReprImages,
			Set annotations, Set checklistsObservations) {
		this.id = id;
		this.language = language;
		this.license = license;
		this.habitat = habitat;
		this.resource = resource;
		this.speciesGroup = speciesGroup;
		this.suser = suser;
		this.recommendation = recommendation;
		this.dataset = dataset;
		this.createdOn = createdOn;
		this.latitude = latitude;
		this.longitude = longitude;
		this.notes = notes;
		this.fromDate = fromDate;
		this.placeName = placeName;
		this.rating = rating;
		this.reverseGeocodedName = reverseGeocodedName;
		this.flagCount = flagCount;
		this.geoPrivacy = geoPrivacy;
		this.isDeleted = isDeleted;
		this.lastRevised = lastRevised;
		this.locationAccuracy = locationAccuracy;
		this.visitCount = visitCount;
		this.searchText = searchText;
		this.agreeTerms = agreeTerms;
		this.isChecklist = isChecklist;
		this.isShowable = isShowable;
		this.sourceId = sourceId;
		this.toDate = toDate;
		this.topology = topology;
		this.checklistAnnotations = checklistAnnotations;
		this.featureCount = featureCount;
		this.isLocked = isLocked;
		this.locationScale = locationScale;
		this.accessRights = accessRights;
		this.catalogNumber = catalogNumber;
		this.externalDatasetKey = externalDatasetKey;
		this.externalId = externalId;
		this.externalUrl = externalUrl;
		this.informationWithheld = informationWithheld;
		this.lastCrawled = lastCrawled;
		this.lastInterpreted = lastInterpreted;
		this.originalAuthor = originalAuthor;
		this.publishingCountry = publishingCountry;
		this.viaCode = viaCode;
		this.viaId = viaId;
		this.protocol = protocol;
		this.basisOfRecord = basisOfRecord;
		this.noOfImages = noOfImages;
		this.noOfVideos = noOfVideos;
		this.noOfAudio = noOfAudio;
		this.noOfIdentifications = noOfIdentifications;
		this.resources = resources;
		this.recommendationVotes = recommendationVotes;
		this.checklists = checklists;
		this.customFieldsGroup18s = customFieldsGroup18s;
		this.userGroups = userGroups;
		this.userGroupObservations = userGroupObservations;
		this.observationReprImages = observationReprImages;
		this.annotations = annotations;
		this.checklistsObservations = checklistsObservations;
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
	@JoinColumn(name = "license_id", nullable = false)
	public License getLicense() {
		return this.license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "habitat_id")
	public Habitat getHabitat() {
		return this.habitat;
	}

	public void setHabitat(Habitat habitat) {
		this.habitat = habitat;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "repr_image_id")
	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id", nullable = false)
	public SpeciesGroup getSpeciesGroup() {
		return this.speciesGroup;
	}

	public void setSpeciesGroup(SpeciesGroup speciesGroup) {
		this.speciesGroup = speciesGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id", nullable = false)
	public Suser getSuser() {
		return this.suser;
	}

	public void setSuser(Suser suser) {
		this.suser = suser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "max_voted_reco_id")
	public Recommendation getRecommendation() {
		return this.recommendation;
	}

	public void setRecommendation(Recommendation recommendation) {
		this.recommendation = recommendation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dataset_id")
	public Dataset getDataset() {
		return this.dataset;
	}

	public void setDataset(Dataset dataset) {
		this.dataset = dataset;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on", nullable = false, length = 29)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "latitude", nullable = false, precision = 17, scale = 17)
	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude", nullable = false, precision = 17, scale = 17)
	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Column(name = "notes")
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "from_date", length = 29)
	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	@Column(name = "place_name")
	public String getPlaceName() {
		return this.placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	@Column(name = "rating", nullable = false)
	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Column(name = "reverse_geocoded_name")
	public String getReverseGeocodedName() {
		return this.reverseGeocodedName;
	}

	public void setReverseGeocodedName(String reverseGeocodedName) {
		this.reverseGeocodedName = reverseGeocodedName;
	}

	@Column(name = "flag_count")
	public Integer getFlagCount() {
		return this.flagCount;
	}

	public void setFlagCount(Integer flagCount) {
		this.flagCount = flagCount;
	}

	@Column(name = "geo_privacy")
	public Boolean getGeoPrivacy() {
		return this.geoPrivacy;
	}

	public void setGeoPrivacy(Boolean geoPrivacy) {
		this.geoPrivacy = geoPrivacy;
	}

	@Column(name = "is_deleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_revised", length = 29)
	public Date getLastRevised() {
		return this.lastRevised;
	}

	public void setLastRevised(Date lastRevised) {
		this.lastRevised = lastRevised;
	}

	@Column(name = "location_accuracy")
	public String getLocationAccuracy() {
		return this.locationAccuracy;
	}

	public void setLocationAccuracy(String locationAccuracy) {
		this.locationAccuracy = locationAccuracy;
	}

	@Column(name = "visit_count")
	public Long getVisitCount() {
		return this.visitCount;
	}

	public void setVisitCount(Long visitCount) {
		this.visitCount = visitCount;
	}

	@Column(name = "search_text")
	public String getSearchText() {
		return this.searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	@Column(name = "agree_terms")
	public Boolean getAgreeTerms() {
		return this.agreeTerms;
	}

	public void setAgreeTerms(Boolean agreeTerms) {
		this.agreeTerms = agreeTerms;
	}

	@Column(name = "is_checklist", nullable = false)
	public boolean isIsChecklist() {
		return this.isChecklist;
	}

	public void setIsChecklist(boolean isChecklist) {
		this.isChecklist = isChecklist;
	}

	@Column(name = "is_showable", nullable = false)
	public boolean isIsShowable() {
		return this.isShowable;
	}

	public void setIsShowable(boolean isShowable) {
		this.isShowable = isShowable;
	}

	@Column(name = "source_id")
	public Long getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "to_date", length = 29)
	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Column(name = "topology", nullable = false)
	public Serializable getTopology() {
		return this.topology;
	}

	public void setTopology(Serializable topology) {
		this.topology = topology;
	}

	@Column(name = "checklist_annotations")
	public String getChecklistAnnotations() {
		return this.checklistAnnotations;
	}

	public void setChecklistAnnotations(String checklistAnnotations) {
		this.checklistAnnotations = checklistAnnotations;
	}

	@Column(name = "feature_count")
	public Integer getFeatureCount() {
		return this.featureCount;
	}

	public void setFeatureCount(Integer featureCount) {
		this.featureCount = featureCount;
	}

	@Column(name = "is_locked")
	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	@Column(name = "location_scale", nullable = false)
	public String getLocationScale() {
		return this.locationScale;
	}

	public void setLocationScale(String locationScale) {
		this.locationScale = locationScale;
	}

	@Column(name = "access_rights")
	public String getAccessRights() {
		return this.accessRights;
	}

	public void setAccessRights(String accessRights) {
		this.accessRights = accessRights;
	}

	@Column(name = "catalog_number")
	public String getCatalogNumber() {
		return this.catalogNumber;
	}

	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	@Column(name = "external_dataset_key")
	public String getExternalDatasetKey() {
		return this.externalDatasetKey;
	}

	public void setExternalDatasetKey(String externalDatasetKey) {
		this.externalDatasetKey = externalDatasetKey;
	}

	@Column(name = "external_id")
	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	@Column(name = "external_url")
	public String getExternalUrl() {
		return this.externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}

	@Column(name = "information_withheld")
	public String getInformationWithheld() {
		return this.informationWithheld;
	}

	public void setInformationWithheld(String informationWithheld) {
		this.informationWithheld = informationWithheld;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_crawled", length = 29)
	public Date getLastCrawled() {
		return this.lastCrawled;
	}

	public void setLastCrawled(Date lastCrawled) {
		this.lastCrawled = lastCrawled;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_interpreted", length = 29)
	public Date getLastInterpreted() {
		return this.lastInterpreted;
	}

	public void setLastInterpreted(Date lastInterpreted) {
		this.lastInterpreted = lastInterpreted;
	}

	@Column(name = "original_author")
	public String getOriginalAuthor() {
		return this.originalAuthor;
	}

	public void setOriginalAuthor(String originalAuthor) {
		this.originalAuthor = originalAuthor;
	}

	@Column(name = "publishing_country")
	public String getPublishingCountry() {
		return this.publishingCountry;
	}

	public void setPublishingCountry(String publishingCountry) {
		this.publishingCountry = publishingCountry;
	}

	@Column(name = "via_code")
	public String getViaCode() {
		return this.viaCode;
	}

	public void setViaCode(String viaCode) {
		this.viaCode = viaCode;
	}

	@Column(name = "via_id")
	public String getViaId() {
		return this.viaId;
	}

	public void setViaId(String viaId) {
		this.viaId = viaId;
	}

	@Column(name = "protocol", nullable = false)
	public String getProtocol() {
		return this.protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	@Column(name = "basis_of_record", nullable = false)
	public String getBasisOfRecord() {
		return this.basisOfRecord;
	}

	public void setBasisOfRecord(String basisOfRecord) {
		this.basisOfRecord = basisOfRecord;
	}

	@Column(name = "no_of_images", nullable = false)
	public int getNoOfImages() {
		return this.noOfImages;
	}

	public void setNoOfImages(int noOfImages) {
		this.noOfImages = noOfImages;
	}

	@Column(name = "no_of_videos", nullable = false)
	public int getNoOfVideos() {
		return this.noOfVideos;
	}

	public void setNoOfVideos(int noOfVideos) {
		this.noOfVideos = noOfVideos;
	}

	@Column(name = "no_of_audio", nullable = false)
	public int getNoOfAudio() {
		return this.noOfAudio;
	}

	public void setNoOfAudio(int noOfAudio) {
		this.noOfAudio = noOfAudio;
	}

	@Column(name = "no_of_identifications", nullable = false)
	public int getNoOfIdentifications() {
		return this.noOfIdentifications;
	}

	public void setNoOfIdentifications(int noOfIdentifications) {
		this.noOfIdentifications = noOfIdentifications;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "observation_resource", schema = "public", joinColumns = {
			@JoinColumn(name = "observation_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "resource_id", nullable = false, updatable = false) })
	public Set getResources() {
		return this.resources;
	}

	public void setResources(Set resources) {
		this.resources = resources;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "observation")
	public Set getRecommendationVotes() {
		return this.recommendationVotes;
	}

	public void setRecommendationVotes(Set recommendationVotes) {
		this.recommendationVotes = recommendationVotes;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "observation")
	public Checklists getChecklists() {
		return this.checklists;
	}

	public void setChecklists(Checklists checklists) {
		this.checklists = checklists;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "observation")
	public Set getCustomFieldsGroup18s() {
		return this.customFieldsGroup18s;
	}

	public void setCustomFieldsGroup18s(Set customFieldsGroup18s) {
		this.customFieldsGroup18s = customFieldsGroup18s;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_group_observations", schema = "public", joinColumns = {
			@JoinColumn(name = "observation_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "user_group_id", nullable = false, updatable = false) })
	public Set getUserGroups() {
		return this.userGroups;
	}

	public void setUserGroups(Set userGroups) {
		this.userGroups = userGroups;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "observation")
	public Set getUserGroupObservations() {
		return this.userGroupObservations;
	}

	public void setUserGroupObservations(Set userGroupObservations) {
		this.userGroupObservations = userGroupObservations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "observation")
	public Set getObservationReprImages() {
		return this.observationReprImages;
	}

	public void setObservationReprImages(Set observationReprImages) {
		this.observationReprImages = observationReprImages;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "observation")
	public Set getAnnotations() {
		return this.annotations;
	}

	public void setAnnotations(Set annotations) {
		this.annotations = annotations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "observation")
	public Set getChecklistsObservations() {
		return this.checklistsObservations;
	}

	public void setChecklistsObservations(Set checklistsObservations) {
		this.checklistsObservations = checklistsObservations;
	}

}
