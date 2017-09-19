package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TaxonomyDefinitionYearId generated by hbm2java
 */
@Embeddable
public class TaxonomyDefinitionYearId implements java.io.Serializable {

	private Long taxonomyDefinitionId;
	private String yearString;

	public TaxonomyDefinitionYearId() {
	}

	public TaxonomyDefinitionYearId(Long taxonomyDefinitionId, String yearString) {
		this.taxonomyDefinitionId = taxonomyDefinitionId;
		this.yearString = yearString;
	}

	@Column(name = "taxonomy_definition_id")
	public Long getTaxonomyDefinitionId() {
		return this.taxonomyDefinitionId;
	}

	public void setTaxonomyDefinitionId(Long taxonomyDefinitionId) {
		this.taxonomyDefinitionId = taxonomyDefinitionId;
	}

	@Column(name = "year_string")
	public String getYearString() {
		return this.yearString;
	}

	public void setYearString(String yearString) {
		this.yearString = yearString;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TaxonomyDefinitionYearId))
			return false;
		TaxonomyDefinitionYearId castOther = (TaxonomyDefinitionYearId) other;

		return ((this.getTaxonomyDefinitionId() == castOther.getTaxonomyDefinitionId())
				|| (this.getTaxonomyDefinitionId() != null && castOther.getTaxonomyDefinitionId() != null
						&& this.getTaxonomyDefinitionId().equals(castOther.getTaxonomyDefinitionId())))
				&& ((this.getYearString() == castOther.getYearString())
						|| (this.getYearString() != null && castOther.getYearString() != null
								&& this.getYearString().equals(castOther.getYearString())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTaxonomyDefinitionId() == null ? 0 : this.getTaxonomyDefinitionId().hashCode());
		result = 37 * result + (getYearString() == null ? 0 : this.getYearString().hashCode());
		return result;
	}

}
