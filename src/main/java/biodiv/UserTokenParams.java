package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UserTokenParams generated by hbm2java
 */
@Entity
@Table(name = "user_token_params", schema = "public")
public class UserTokenParams implements java.io.Serializable {

	private UserTokenParamsId id;

	public UserTokenParams() {
	}

	public UserTokenParams(UserTokenParamsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "params", column = @Column(name = "params")),
			@AttributeOverride(name = "paramsIdx", column = @Column(name = "params_idx")),
			@AttributeOverride(name = "paramsElt", column = @Column(name = "params_elt", nullable = false)) })
	public UserTokenParamsId getId() {
		return this.id;
	}

	public void setId(UserTokenParamsId id) {
		this.id = id;
	}

}
