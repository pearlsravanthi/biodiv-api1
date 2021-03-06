package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * RecoVoteDetails generated by hbm2java
 */
@Entity
@Table(name = "reco_vote_details", schema = "public")
public class RecoVoteDetails implements java.io.Serializable {

	private RecoVoteDetailsId id;

	public RecoVoteDetails() {
	}

	public RecoVoteDetails(RecoVoteDetailsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "recoVoteId", column = @Column(name = "reco_vote_id")),
			@AttributeOverride(name = "commonNameRecoId", column = @Column(name = "common_name_reco_id")),
			@AttributeOverride(name = "authorId", column = @Column(name = "author_id")),
			@AttributeOverride(name = "votedOn", column = @Column(name = "voted_on", length = 29)),
			@AttributeOverride(name = "comment", column = @Column(name = "comment")),
			@AttributeOverride(name = "originalAuthor", column = @Column(name = "original_author")),
			@AttributeOverride(name = "givenSciName", column = @Column(name = "given_sci_name")),
			@AttributeOverride(name = "givenCommonName", column = @Column(name = "given_common_name")),
			@AttributeOverride(name = "recoId", column = @Column(name = "reco_id")),
			@AttributeOverride(name = "name", column = @Column(name = "name")),
			@AttributeOverride(name = "isScientificName", column = @Column(name = "is_scientific_name")),
			@AttributeOverride(name = "languageId", column = @Column(name = "language_id")),
			@AttributeOverride(name = "taxonConceptId", column = @Column(name = "taxon_concept_id")),
			@AttributeOverride(name = "normalizedForm", column = @Column(name = "normalized_form")),
			@AttributeOverride(name = "status", column = @Column(name = "status")),
			@AttributeOverride(name = "speciesId", column = @Column(name = "species_id")),
			@AttributeOverride(name = "observationId", column = @Column(name = "observation_id")),
			@AttributeOverride(name = "isLocked", column = @Column(name = "is_locked")),
			@AttributeOverride(name = "maxVotedRecoId", column = @Column(name = "max_voted_reco_id")) })
	public RecoVoteDetailsId getId() {
		return this.id;
	}

	public void setId(RecoVoteDetailsId id) {
		this.id = id;
	}

}
