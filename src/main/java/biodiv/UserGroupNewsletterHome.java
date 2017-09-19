package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserGroupNewsletter.
 * @see biodiv.UserGroupNewsletter
 * @author Hibernate Tools
 */
@Stateless
public class UserGroupNewsletterHome {

	private static final Log log = LogFactory.getLog(UserGroupNewsletterHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserGroupNewsletter transientInstance) {
		log.debug("persisting UserGroupNewsletter instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserGroupNewsletter persistentInstance) {
		log.debug("removing UserGroupNewsletter instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserGroupNewsletter merge(UserGroupNewsletter detachedInstance) {
		log.debug("merging UserGroupNewsletter instance");
		try {
			UserGroupNewsletter result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserGroupNewsletter findById(UserGroupNewsletterId id) {
		log.debug("getting UserGroupNewsletter instance with id: " + id);
		try {
			UserGroupNewsletter instance = entityManager.find(UserGroupNewsletter.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
