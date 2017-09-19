package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * PendingEmailConfirmation generated by hbm2java
 */
@Entity
@Table(name = "pending_email_confirmation", schema = "public")
public class PendingEmailConfirmation implements java.io.Serializable {

	private long id;
	private long version;
	private String confirmationToken;
	private String emailAddress;
	private Date timestamp;
	private String userToken;

	public PendingEmailConfirmation() {
	}

	public PendingEmailConfirmation(long id, String confirmationToken, String emailAddress, Date timestamp) {
		this.id = id;
		this.confirmationToken = confirmationToken;
		this.emailAddress = emailAddress;
		this.timestamp = timestamp;
	}

	public PendingEmailConfirmation(long id, String confirmationToken, String emailAddress, Date timestamp,
			String userToken) {
		this.id = id;
		this.confirmationToken = confirmationToken;
		this.emailAddress = emailAddress;
		this.timestamp = timestamp;
		this.userToken = userToken;
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

	@Column(name = "confirmation_token", nullable = false, length = 80)
	public String getConfirmationToken() {
		return this.confirmationToken;
	}

	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	@Column(name = "email_address", nullable = false, length = 80)
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp", nullable = false, length = 29)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Column(name = "user_token", length = 500)
	public String getUserToken() {
		return this.userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

}