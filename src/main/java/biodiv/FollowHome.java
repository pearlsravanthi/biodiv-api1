package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Follow.
 * @see biodiv.Follow
 * @author Hibernate Tools
 */
@Stateless
public class FollowHome {

	private static final Log log = LogFactory.getLog(FollowHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Follow transientInstance) {
		log.debug("persisting Follow instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Follow persistentInstance) {
		log.debug("removing Follow instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Follow merge(Follow detachedInstance) {
		log.debug("merging Follow instance");
		try {
			Follow result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Follow findById(long id) {
		log.debug("getting Follow instance with id: " + id);
		try {
			Follow instance = entityManager.find(Follow.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
