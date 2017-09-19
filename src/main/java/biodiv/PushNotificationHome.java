package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PushNotification.
 * @see biodiv.PushNotification
 * @author Hibernate Tools
 */
@Stateless
public class PushNotificationHome {

	private static final Log log = LogFactory.getLog(PushNotificationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PushNotification transientInstance) {
		log.debug("persisting PushNotification instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PushNotification persistentInstance) {
		log.debug("removing PushNotification instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PushNotification merge(PushNotification detachedInstance) {
		log.debug("merging PushNotification instance");
		try {
			PushNotification result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PushNotification findById(long id) {
		log.debug("getting PushNotification instance with id: " + id);
		try {
			PushNotification instance = entityManager.find(PushNotification.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
