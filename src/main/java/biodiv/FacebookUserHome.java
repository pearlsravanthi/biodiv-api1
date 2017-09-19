package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class FacebookUser.
 * @see biodiv.FacebookUser
 * @author Hibernate Tools
 */
@Stateless
public class FacebookUserHome {

	private static final Log log = LogFactory.getLog(FacebookUserHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(FacebookUser transientInstance) {
		log.debug("persisting FacebookUser instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(FacebookUser persistentInstance) {
		log.debug("removing FacebookUser instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public FacebookUser merge(FacebookUser detachedInstance) {
		log.debug("merging FacebookUser instance");
		try {
			FacebookUser result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FacebookUser findById(long id) {
		log.debug("getting FacebookUser instance with id: " + id);
		try {
			FacebookUser instance = entityManager.find(FacebookUser.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
