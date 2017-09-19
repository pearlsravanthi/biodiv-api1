package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PushNotificationToken.
 * @see biodiv.PushNotificationToken
 * @author Hibernate Tools
 */
@Stateless
public class PushNotificationTokenHome {

	private static final Log log = LogFactory.getLog(PushNotificationTokenHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PushNotificationToken transientInstance) {
		log.debug("persisting PushNotificationToken instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PushNotificationToken persistentInstance) {
		log.debug("removing PushNotificationToken instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PushNotificationToken merge(PushNotificationToken detachedInstance) {
		log.debug("merging PushNotificationToken instance");
		try {
			PushNotificationToken result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PushNotificationToken findById(long id) {
		log.debug("getting PushNotificationToken instance with id: " + id);
		try {
			PushNotificationToken instance = entityManager.find(PushNotificationToken.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
