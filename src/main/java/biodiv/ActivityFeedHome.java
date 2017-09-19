package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ActivityFeed.
 * @see biodiv.ActivityFeed
 * @author Hibernate Tools
 */
@Stateless
public class ActivityFeedHome {

	private static final Log log = LogFactory.getLog(ActivityFeedHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ActivityFeed transientInstance) {
		log.debug("persisting ActivityFeed instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ActivityFeed persistentInstance) {
		log.debug("removing ActivityFeed instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ActivityFeed merge(ActivityFeed detachedInstance) {
		log.debug("merging ActivityFeed instance");
		try {
			ActivityFeed result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ActivityFeed findById(long id) {
		log.debug("getting ActivityFeed instance with id: " + id);
		try {
			ActivityFeed instance = entityManager.find(ActivityFeed.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
