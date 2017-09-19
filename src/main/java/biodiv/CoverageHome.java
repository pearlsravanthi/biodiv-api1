package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Coverage.
 * @see biodiv.Coverage
 * @author Hibernate Tools
 */
@Stateless
public class CoverageHome {

	private static final Log log = LogFactory.getLog(CoverageHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Coverage transientInstance) {
		log.debug("persisting Coverage instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Coverage persistentInstance) {
		log.debug("removing Coverage instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Coverage merge(Coverage detachedInstance) {
		log.debug("merging Coverage instance");
		try {
			Coverage result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Coverage findById(long id) {
		log.debug("getting Coverage instance with id: " + id);
		try {
			Coverage instance = entityManager.find(Coverage.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
