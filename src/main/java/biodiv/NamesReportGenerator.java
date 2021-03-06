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
 * NamesReportGenerator generated by hbm2java
 */
@Entity
@Table(name = "names_report_generator", schema = "public")
public class NamesReportGenerator implements java.io.Serializable {

	private long id;
	private long version;
	private Suser suser;
	private Date endDate;
	private String filePath;
	private Date startDate;
	private String status;

	public NamesReportGenerator() {
	}

	public NamesReportGenerator(long id, Suser suser, Date startDate, String status) {
		this.id = id;
		this.suser = suser;
		this.startDate = startDate;
		this.status = status;
	}

	public NamesReportGenerator(long id, Suser suser, Date endDate, String filePath, Date startDate, String status) {
		this.id = id;
		this.suser = suser;
		this.endDate = endDate;
		this.filePath = filePath;
		this.startDate = startDate;
		this.status = status;
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

}
