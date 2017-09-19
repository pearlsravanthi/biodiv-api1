package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SpeciesFieldLicense.
 * @see biodiv.SpeciesFieldLicense
 * @author Hibernate Tools
 */
@Stateless
public class SpeciesFieldLicenseHome {

	private static final Log log = LogFactory.getLog(SpeciesFieldLicenseHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpeciesFieldLicense transientInstance) {
		log.debug("persisting SpeciesFieldLicense instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpeciesFieldLicense persistentInstance) {
		log.debug("removing SpeciesFieldLicense instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpeciesFieldLicense merge(SpeciesFieldLicense detachedInstance) {
		log.debug("merging SpeciesFieldLicense instance");
		try {
			SpeciesFieldLicense result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpeciesFieldLicense findById(SpeciesFieldLicenseId id) {
		log.debug("getting SpeciesFieldLicense instance with id: " + id);
		try {
			SpeciesFieldLicense instance = entityManager.find(SpeciesFieldLicense.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
