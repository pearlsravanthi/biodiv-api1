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
 * ProjectLocation generated by hbm2java
 */
@Entity
@Table(name = "project_location", schema = "public")
public class ProjectLocation implements java.io.Serializable {

	private ProjectLocationId id;
	private Location location;

	public ProjectLocation() {
	}

	public ProjectLocation(ProjectLocationId id) {
		this.id = id;
	}

	public ProjectLocation(ProjectLocationId id, Location location) {
		this.id = id;
		this.location = location;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "projectLocationsId", column = @Column(name = "project_locations_id")),
			@AttributeOverride(name = "locationId", column = @Column(name = "location_id")),
			@AttributeOverride(name = "locationsIdx", column = @Column(name = "locations_idx")) })
	public ProjectLocationId getId() {
		return this.id;
	}

	public void setId(ProjectLocationId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "location_id", insertable = false, updatable = false)
	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
