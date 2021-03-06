package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MapLayerFeaturesId generated by hbm2java
 */
@Embeddable
public class MapLayerFeaturesId implements java.io.Serializable {

	private String type;
	private String feature;
	private Serializable topology;

	public MapLayerFeaturesId() {
	}

	public MapLayerFeaturesId(String type, String feature, Serializable topology) {
		this.type = type;
		this.feature = feature;
		this.topology = topology;
	}

	@Column(name = "type")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "feature")
	public String getFeature() {
		return this.feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	@Column(name = "topology")
	public Serializable getTopology() {
		return this.topology;
	}

	public void setTopology(Serializable topology) {
		this.topology = topology;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MapLayerFeaturesId))
			return false;
		MapLayerFeaturesId castOther = (MapLayerFeaturesId) other;

		return ((this.getType() == castOther.getType()) || (this.getType() != null && castOther.getType() != null
				&& this.getType().equals(castOther.getType())))
				&& ((this.getFeature() == castOther.getFeature()) || (this.getFeature() != null
						&& castOther.getFeature() != null && this.getFeature().equals(castOther.getFeature())))
				&& ((this.getTopology() == castOther.getTopology()) || (this.getTopology() != null
						&& castOther.getTopology() != null && this.getTopology().equals(castOther.getTopology())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result + (getFeature() == null ? 0 : this.getFeature().hashCode());
		result = 37 * result + (getTopology() == null ? 0 : this.getTopology().hashCode());
		return result;
	}

}
