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
 * ChecklistsTalukas generated by hbm2java
 */
@Entity
@Table(name = "checklists_talukas", schema = "public")
public class ChecklistsTalukas implements java.io.Serializable {

	private ChecklistsTalukasId id;
	private Checklists checklists;

	public ChecklistsTalukas() {
	}

	public ChecklistsTalukas(ChecklistsTalukasId id) {
		this.id = id;
	}

	public ChecklistsTalukas(ChecklistsTalukasId id, Checklists checklists) {
		this.id = id;
		this.checklists = checklists;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "checklistsId", column = @Column(name = "checklists_id")),
			@AttributeOverride(name = "talukasString", column = @Column(name = "talukas_string")) })
	public ChecklistsTalukasId getId() {
		return this.id;
	}

	public void setId(ChecklistsTalukasId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "checklists_id", insertable = false, updatable = false)
	public Checklists getChecklists() {
		return this.checklists;
	}

	public void setChecklists(Checklists checklists) {
		this.checklists = checklists;
	}

}
