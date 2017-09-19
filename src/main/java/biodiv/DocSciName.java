package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * DocSciName generated by hbm2java
 */
@Entity
@Table(name = "doc_sci_name", schema = "public")
public class DocSciName implements java.io.Serializable {

	private long id;
	private long version;
	private Document document;
	private TaxonomyDefinition taxonomyDefinition;
	private String canonicalForm;
	private int displayOrder;
	private int frequency;
	private String offsetValues;
	private String scientificName;
	private int primaryName;
	private boolean isDeleted;

	public DocSciName() {
	}

	public DocSciName(long id, Document document, int displayOrder, int frequency, String offsetValues,
			String scientificName, int primaryName, boolean isDeleted) {
		this.id = id;
		this.document = document;
		this.displayOrder = displayOrder;
		this.frequency = frequency;
		this.offsetValues = offsetValues;
		this.scientificName = scientificName;
		this.primaryName = primaryName;
		this.isDeleted = isDeleted;
	}

	public DocSciName(long id, Document document, TaxonomyDefinition taxonomyDefinition, String canonicalForm,
			int displayOrder, int frequency, String offsetValues, String scientificName, int primaryName,
			boolean isDeleted) {
		this.id = id;
		this.document = document;
		this.taxonomyDefinition = taxonomyDefinition;
		this.canonicalForm = canonicalForm;
		this.displayOrder = displayOrder;
		this.frequency = frequency;
		this.offsetValues = offsetValues;
		this.scientificName = scientificName;
		this.primaryName = primaryName;
		this.isDeleted = isDeleted;
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
	@JoinColumn(name = "document_id", nullable = false)
	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "taxon_concept_id")
	public TaxonomyDefinition getTaxonomyDefinition() {
		return this.taxonomyDefinition;
	}

	public void setTaxonomyDefinition(TaxonomyDefinition taxonomyDefinition) {
		this.taxonomyDefinition = taxonomyDefinition;
	}

	@Column(name = "canonical_form")
	public String getCanonicalForm() {
		return this.canonicalForm;
	}

	public void setCanonicalForm(String canonicalForm) {
		this.canonicalForm = canonicalForm;
	}

	@Column(name = "display_order", nullable = false)
	public int getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	@Column(name = "frequency", nullable = false)
	public int getFrequency() {
		return this.frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	@Column(name = "offset_values", nullable = false, length = 2000)
	public String getOffsetValues() {
		return this.offsetValues;
	}

	public void setOffsetValues(String offsetValues) {
		this.offsetValues = offsetValues;
	}

	@Column(name = "scientific_name", nullable = false)
	public String getScientificName() {
		return this.scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	@Column(name = "primary_name", nullable = false)
	public int getPrimaryName() {
		return this.primaryName;
	}

	public void setPrimaryName(int primaryName) {
		this.primaryName = primaryName;
	}

	@Column(name = "is_deleted", nullable = false)
	public boolean isIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}