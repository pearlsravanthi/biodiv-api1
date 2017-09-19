package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserGroupObservation.
 * @see biodiv.UserGroupObservation
 * @author Hibernate Tools
 */
@Stateless
public class UserGroupObservationHome {

	private static final Log log = LogFactory.getLog(UserGroupObservationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserGroupObservation transientInstance) {
		log.debug("persisting UserGroupObservation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserGroupObservation persistentInstance) {
		log.debug("removing UserGroupObservation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserGroupObservation merge(UserGroupObservation detachedInstance) {
		log.debug("merging UserGroupObservation instance");
		try {
			UserGroupObservation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserGroupObservation findById(UserGroupObservationId id) {
		log.debug("getting UserGroupObservation instance with id: " + id);
		try {
			UserGroupObservation instance = entityManager.find(UserGroupObservation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
