package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserGroupHabitat.
 * @see biodiv.UserGroupHabitat
 * @author Hibernate Tools
 */
@Stateless
public class UserGroupHabitatHome {

	private static final Log log = LogFactory.getLog(UserGroupHabitatHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserGroupHabitat transientInstance) {
		log.debug("persisting UserGroupHabitat instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserGroupHabitat persistentInstance) {
		log.debug("removing UserGroupHabitat instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserGroupHabitat merge(UserGroupHabitat detachedInstance) {
		log.debug("merging UserGroupHabitat instance");
		try {
			UserGroupHabitat result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserGroupHabitat findById(UserGroupHabitatId id) {
		log.debug("getting UserGroupHabitat instance with id: " + id);
		try {
			UserGroupHabitat instance = entityManager.find(UserGroupHabitat.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
