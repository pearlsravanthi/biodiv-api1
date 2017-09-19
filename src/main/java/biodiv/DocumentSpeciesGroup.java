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
 * DocumentSpeciesGroup generated by hbm2java
 */
@Entity
@Table(name = "document_species_group", schema = "public")
public class DocumentSpeciesGroup implements java.io.Serializable {

	private DocumentSpeciesGroupId id;
	private SpeciesGroup speciesGroup;
	private Document document;

	public DocumentSpeciesGroup() {
	}

	public DocumentSpeciesGroup(DocumentSpeciesGroupId id) {
		this.id = id;
	}

	public DocumentSpeciesGroup(DocumentSpeciesGroupId id, SpeciesGroup speciesGroup, Document document) {
		this.id = id;
		this.speciesGroup = speciesGroup;
		this.document = document;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "documentSpeciesGroupsId", column = @Column(name = "document_species_groups_id")),
			@AttributeOverride(name = "speciesGroupId", column = @Column(name = "species_group_id")) })
	public DocumentSpeciesGroupId getId() {
		return this.id;
	}

	public void setId(DocumentSpeciesGroupId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "species_group_id", insertable = false, updatable = false)
	public SpeciesGroup getSpeciesGroup() {
		return this.speciesGroup;
	}

	public void setSpeciesGroup(SpeciesGroup speciesGroup) {
		this.speciesGroup = speciesGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "document_species_groups_id", insertable = false, updatable = false)
	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

}