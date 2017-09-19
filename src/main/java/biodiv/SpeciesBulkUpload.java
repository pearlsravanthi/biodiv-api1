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
 * SpeciesBulkUpload generated by hbm2java
 */
@Entity
@Table(name = "species_bulk_upload", schema = "public")
public class SpeciesBulkUpload implements java.io.Serializable {

	private long id;
	private long version;
	private Suser suser;
	private Date endDate;
	private String filePath;
	private String notes;
	private Date startDate;
	private String status;
	private String errorFilePath;
	private String imagesDir;
	private Integer speciesCreated;
	private Integer speciesUpdated;
	private Integer stubsCreated;
	private String uploadType;
	private String logFilePath;

	public SpeciesBulkUpload() {
	}

	public SpeciesBulkUpload(long id, Suser suser, Date startDate, String status) {
		this.id = id;
		this.suser = suser;
		this.startDate = startDate;
		this.status = status;
	}

	public SpeciesBulkUpload(long id, Suser suser, Date endDate, String filePath, String notes, Date startDate,
			String status, String errorFilePath, String imagesDir, Integer speciesCreated, Integer speciesUpdated,
			Integer stubsCreated, String uploadType, String logFilePath) {
		this.id = id;
		this.suser = suser;
		this.endDate = endDate;
		this.filePath = filePath;
		this.notes = notes;
		this.startDate = startDate;
		this.status = status;
		this.errorFilePath = errorFilePath;
		this.imagesDir = imagesDir;
		this.speciesCreated = speciesCreated;
		this.speciesUpdated = speciesUpdated;
		this.stubsCreated = stubsCreated;
		this.uploadType = uploadType;
		this.logFilePath = logFilePath;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date", length = 29)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "file_path")
	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Column(name = "notes")
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date", nullable = false, length = 29)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "status", nullable = false)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "error_file_path")
	public String getErrorFilePath() {
		return this.errorFilePath;
	}

	public void setErrorFilePath(String errorFilePath) {
		this.errorFilePath = errorFilePath;
	}

	@Column(name = "images_dir")
	public String getImagesDir() {
		return this.imagesDir;
	}

	public void setImagesDir(String imagesDir) {
		this.imagesDir = imagesDir;
	}

	@Column(name = "species_created")
	public Integer getSpeciesCreated() {
		return this.speciesCreated;
	}

	public void setSpeciesCreated(Integer speciesCreated) {
		this.speciesCreated = speciesCreated;
	}

	@Column(name = "species_updated")
	public Integer getSpeciesUpdated() {
		return this.speciesUpdated;
	}

	public void setSpeciesUpdated(Integer speciesUpdated) {
		this.speciesUpdated = speciesUpdated;
	}

	@Column(name = "stubs_created")
	public Integer getStubsCreated() {
		return this.stubsCreated;
	}

	public void setStubsCreated(Integer stubsCreated) {
		this.stubsCreated = stubsCreated;
	}

	@Column(name = "upload_type")
	public String getUploadType() {
		return this.uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

	@Column(name = "log_file_path")
	public String getLogFilePath() {
		return this.logFilePath;
	}

	public void setLogFilePath(String logFilePath) {
		this.logFilePath = logFilePath;
	}

}