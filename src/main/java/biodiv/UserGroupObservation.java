package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UserGroupObservation generated by hbm2java
 */
@Entity
@Table(name = "user_group_observation", schema = "public")
public class UserGroupObservation implements java.io.Serializable {

	private UserGroupObservationId id;
	private Observation observation;
	private UserGroup userGroup;

	public UserGroupObservation() {
	}

	public UserGroupObservation(UserGroupObservationId id) {
		this.id = id;
	}

	public UserGroupObservation(UserGroupObservationId id, Observation observation, UserGroup userGroup) {
		this.id = id;
		this.observation = observation;
		this.userGroup = userGroup;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "userGroupObservationsId", column = @Column(name = "user_group_observations_id")),
			@AttributeOverride(name = "observationId", column = @Column(name = "observation_id")) })
	public UserGroupObservationId getId() {
		return this.id;
	}

	public void setId(UserGroupObservationId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "observation_id", insertable = false, updatable = false)
	public Observation getObservation() {
		return this.observation;
	}

	public void setObservation(Observation observation) {
		this.observation = observation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_group_observations_id", insertable = false, updatable = false)
	public UserGroup getUserGroup() {
		return this.userGroup;
	}

	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}

}