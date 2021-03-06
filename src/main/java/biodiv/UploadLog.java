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
 * UploadLog generated by hbm2java
 */
@Entity
@Table(name = "upload_log", schema = "public")
public class UploadLog implements java.io.Serializable {

	private long id;
	private long version;
	private Suser suser;
	private Date endDate;
	private String errorFilePath;
	private String filePath;
	private byte[] logFile;
	private String logFilePath;
	private String notes;
	private String paramsMapAsText;
	private Date startDate;
	private String status;
	private String uploadType;
	private String class_;
	private String imagesDir;
	private Integer speciesCreated;
	private Integer speciesUpdated;
	private Integer stubsCreated;

	public UploadLog() {
	}

	public UploadLog(long id, Suser suser, Date startDate, String status, String class_) {
		this.id = id;
		this.suser = suser;
		this.startDate = startDate;
		this.status = status;
		this.class_ = class_;
	}

	public UploadLog(long id, Suser suser, Date endDate, String errorFilePath, String filePath, byte[] logFile,
			String logFilePath, String notes, String paramsMapAsText, Date startDate, String status, String uploadType,
			String class_, String imagesDir, Integer speciesCreated, Integer speciesUpdated, Integer stubsCreated) {
		this.id = id;
		this.suser = suser;
		this.endDate = endDate;
		this.errorFilePath = errorFilePath;
		this.filePath = filePath;
		this.logFile = logFile;
		this.logFilePath = logFilePath;
		this.notes = notes;
		this.paramsMapAsText = paramsMapAsText;
		this.startDate = startDate;
		this.status = status;
		this.uploadType = uploadType;
		this.class_ = class_;
		this.imagesDir = imagesDir;
		this.speciesCreated = speciesCreated;
		this.speciesUpdated = speciesUpdated;
		this.stubsCreated = stubsCreated;
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

	@Column(name = "error_file_path")
	public String getErrorFilePath() {
		return this.errorFilePath;
	}

	public void setErrorFilePath(String errorFilePath) {
		this.errorFilePath = errorFilePath;
	}

	@Column(name = "file_path")
	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Column(name = "log_file")
	public byte[] getLogFile() {
		return this.logFile;
	}

	public void setLogFile(byte[] logFile) {
		this.logFile = logFile;
	}

	@Column(name = "log_file_path")
	public String getLogFilePath() {
		return this.logFilePath;
	}

	public void setLogFilePath(String logFilePath) {
		this.logFilePath = logFilePath;
	}

	@Column(name = "notes")
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "params_map_as_text")
	public String getParamsMapAsText() {
		return this.paramsMapAsText;
	}

	public void setParamsMapAsText(String paramsMapAsText) {
		this.paramsMapAsText = paramsMapAsText;
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

	@Column(name = "upload_type")
	public String getUploadType() {
		return this.uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

	@Column(name = "class", nullable = false)
	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
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

}
