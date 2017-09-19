package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TemporalCoverage.
 * @see biodiv.TemporalCoverage
 * @author Hibernate Tools
 */
@Stateless
public class TemporalCoverageHome {

	private static final Log log = LogFactory.getLog(TemporalCoverageHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TemporalCoverage transientInstance) {
		log.debug("persisting TemporalCoverage instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TemporalCoverage persistentInstance) {
		log.debug("removing TemporalCoverage instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TemporalCoverage merge(TemporalCoverage detachedInstance) {
		log.debug("merging TemporalCoverage instance");
		try {
			TemporalCoverage result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TemporalCoverage findById(long id) {
		log.debug("getting TemporalCoverage instance with id: " + id);
		try {
			TemporalCoverage instance = entityManager.find(TemporalCoverage.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
