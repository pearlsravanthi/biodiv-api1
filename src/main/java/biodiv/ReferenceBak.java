package biodiv;
// Generated 31 Jul, 2017 7:18:53 AM by Hibernate Tools 3.5.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ReferenceBak generated by hbm2java
 */
@Entity
@Table(name = "reference_bak", schema = "public")
public class ReferenceBak implements java.io.Serializable {

	private ReferenceBakId id;

	public ReferenceBak() {
	}

	public ReferenceBak(ReferenceBakId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id")),
			@AttributeOverride(name = "version", column = @Column(name = "version")),
			@AttributeOverride(name = "speciesFieldId", column = @Column(name = "species_field_id")),
			@AttributeOverride(name = "title", column = @Column(name = "title")),
			@AttributeOverride(name = "url", column = @Column(name = "url")) })
	public ReferenceBakId getId() {
		return this.id;
	}

	public void setId(ReferenceBakId id) {
		this.id = id;
	}

}