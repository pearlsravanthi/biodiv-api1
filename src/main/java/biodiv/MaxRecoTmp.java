package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MaxRecoTmp generated by hbm2java
 */
@Entity
@Table(name = "max_reco_tmp", schema = "public")
public class MaxRecoTmp implements java.io.Serializable {

	private MaxRecoTmpId id;

	public MaxRecoTmp() {
	}

	public MaxRecoTmp(MaxRecoTmpId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id")),
			@AttributeOverride(name = "maxVoted", column = @Column(name = "max_voted_")) })
	public MaxRecoTmpId getId() {
		return this.id;
	}

	public void setId(MaxRecoTmpId id) {
		this.id = id;
	}

}