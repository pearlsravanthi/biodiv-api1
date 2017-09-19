package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CoverageSpeciesGroup.
 * @see biodiv.CoverageSpeciesGroup
 * @author Hibernate Tools
 */
@Stateless
public class CoverageSpeciesGroupHome {

	private static final Log log = LogFactory.getLog(CoverageSpeciesGroupHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CoverageSpeciesGroup transientInstance) {
		log.debug("persisting CoverageSpeciesGroup instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CoverageSpeciesGroup persistentInstance) {
		log.debug("removing CoverageSpeciesGroup instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CoverageSpeciesGroup merge(CoverageSpeciesGroup detachedInstance) {
		log.debug("merging CoverageSpeciesGroup instance");
		try {
			CoverageSpeciesGroup result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CoverageSpeciesGroup findById(CoverageSpeciesGroupId id) {
		log.debug("getting CoverageSpeciesGroup instance with id: " + id);
		try {
			CoverageSpeciesGroup instance = entityManager.find(CoverageSpeciesGroup.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
