package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserGroupSpeciesGroupId generated by hbm2java
 */
@Embeddable
public class UserGroupSpeciesGroupId implements java.io.Serializable {

	private Long userGroupSpeciesGroupsId;
	private Long speciesGroupId;

	public UserGroupSpeciesGroupId() {
	}

	public UserGroupSpeciesGroupId(Long userGroupSpeciesGroupsId, Long speciesGroupId) {
		this.userGroupSpeciesGroupsId = userGroupSpeciesGroupsId;
		this.speciesGroupId = speciesGroupId;
	}

	@Column(name = "user_group_species_groups_id")
	public Long getUserGroupSpeciesGroupsId() {
		return this.userGroupSpeciesGroupsId;
	}

	public void setUserGroupSpeciesGroupsId(Long userGroupSpeciesGroupsId) {
		this.userGroupSpeciesGroupsId = userGroupSpeciesGroupsId;
	}

	@Column(name = "species_group_id")
	public Long getSpeciesGroupId() {
		return this.speciesGroupId;
	}

	public void setSpeciesGroupId(Long speciesGroupId) {
		this.speciesGroupId = speciesGroupId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserGroupSpeciesGroupId))
			return false;
		UserGroupSpeciesGroupId castOther = (UserGroupSpeciesGroupId) other;

		return ((this.getUserGroupSpeciesGroupsId() == castOther.getUserGroupSpeciesGroupsId())
				|| (this.getUserGroupSpeciesGroupsId() != null && castOther.getUserGroupSpeciesGroupsId() != null
						&& this.getUserGroupSpeciesGroupsId().equals(castOther.getUserGroupSpeciesGroupsId())))
				&& ((this.getSpeciesGroupId() == castOther.getSpeciesGroupId())
						|| (this.getSpeciesGroupId() != null && castOther.getSpeciesGroupId() != null
								&& this.getSpeciesGroupId().equals(castOther.getSpeciesGroupId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUserGroupSpeciesGroupsId() == null ? 0 : this.getUserGroupSpeciesGroupsId().hashCode());
		result = 37 * result + (getSpeciesGroupId() == null ? 0 : this.getSpeciesGroupId().hashCode());
		return result;
	}

}