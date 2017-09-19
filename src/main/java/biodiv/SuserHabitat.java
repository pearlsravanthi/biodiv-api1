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
 * SuserHabitat generated by hbm2java
 */
@Entity
@Table(name = "suser_habitat", schema = "public")
public class SuserHabitat implements java.io.Serializable {

	private SuserHabitatId id;
	private Habitat habitat;
	private Suser suser;

	public SuserHabitat() {
	}

	public SuserHabitat(SuserHabitatId id) {
		this.id = id;
	}

	public SuserHabitat(SuserHabitatId id, Habitat habitat, Suser suser) {
		this.id = id;
		this.habitat = habitat;
		this.suser = suser;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "suserHabitatsId", column = @Column(name = "suser_habitats_id")),
			@AttributeOverride(name = "habitatId", column = @Column(name = "habitat_id")) })
	public SuserHabitatId getId() {
		return this.id;
	}

	public void setId(SuserHabitatId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "habitat_id", insertable = false, updatable = false)
	public Habitat getHabitat() {
		return this.habitat;
	}

	public void setHabitat(Habitat habitat) {
		this.habitat = habitat;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "suser_habitats_id", insertable = false, updatable = false)
	public Suser getSuser() {
		return this.suser;
	}

	public void setSuser(Suser suser) {
		this.suser = suser;
	}

}
