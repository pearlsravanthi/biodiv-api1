package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CoverageHabitat.
 * @see biodiv.CoverageHabitat
 * @author Hibernate Tools
 */
@Stateless
public class CoverageHabitatHome {

	private static final Log log = LogFactory.getLog(CoverageHabitatHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CoverageHabitat transientInstance) {
		log.debug("persisting CoverageHabitat instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CoverageHabitat persistentInstance) {
		log.debug("removing CoverageHabitat instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CoverageHabitat merge(CoverageHabitat detachedInstance) {
		log.debug("merging CoverageHabitat instance");
		try {
			CoverageHabitat result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CoverageHabitat findById(CoverageHabitatId id) {
		log.debug("getting CoverageHabitat instance with id: " + id);
		try {
			CoverageHabitat instance = entityManager.find(CoverageHabitat.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
