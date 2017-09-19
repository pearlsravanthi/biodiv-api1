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
 * CommonNamesSuser generated by hbm2java
 */
@Entity
@Table(name = "common_names_suser", schema = "public")
public class CommonNamesSuser implements java.io.Serializable {

	private CommonNamesSuserId id;
	private CommonNames commonNames;
	private Suser suser;

	public CommonNamesSuser() {
	}

	public CommonNamesSuser(CommonNamesSuserId id) {
		this.id = id;
	}

	public CommonNamesSuser(CommonNamesSuserId id, CommonNames commonNames, Suser suser) {
		this.id = id;
		this.commonNames = commonNames;
		this.suser = suser;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "commonNamesContributorsId", column = @Column(name = "common_names_contributors_id")),
			@AttributeOverride(name = "suserId", column = @Column(name = "suser_id")),
			@AttributeOverride(name = "contributorsIdx", column = @Column(name = "contributors_idx")),
			@AttributeOverride(name = "commonNamesCuratorsId", column = @Column(name = "common_names_curators_id")),
			@AttributeOverride(name = "curatorsIdx", column = @Column(name = "curators_idx")) })
	public CommonNamesSuserId getId() {
		return this.id;
	}

	public void setId(CommonNamesSuserId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "common_names_contributors_id", insertable = false, updatable = false)
	public CommonNames getCommonNames() {
		return this.commonNames;
	}

	public void setCommonNames(CommonNames commonNames) {
		this.commonNames = commonNames;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "suser_id", insertable = false, updatable = false)
	public Suser getSuser() {
		return this.suser;
	}

	public void setSuser(Suser suser) {
		this.suser = suser;
	}

}
