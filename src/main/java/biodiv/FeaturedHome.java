package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Featured.
 * @see biodiv.Featured
 * @author Hibernate Tools
 */
@Stateless
public class FeaturedHome {

	private static final Log log = LogFactory.getLog(FeaturedHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Featured transientInstance) {
		log.debug("persisting Featured instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Featured persistentInstance) {
		log.debug("removing Featured instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Featured merge(Featured detachedInstance) {
		log.debug("merging Featured instance");
		try {
			Featured result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Featured findById(long id) {
		log.debug("getting Featured instance with id: " + id);
		try {
			Featured instance = entityManager.find(Featured.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
