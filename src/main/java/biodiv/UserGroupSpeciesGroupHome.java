package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserGroupSpeciesGroup.
 * @see biodiv.UserGroupSpeciesGroup
 * @author Hibernate Tools
 */
@Stateless
public class UserGroupSpeciesGroupHome {

	private static final Log log = LogFactory.getLog(UserGroupSpeciesGroupHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserGroupSpeciesGroup transientInstance) {
		log.debug("persisting UserGroupSpeciesGroup instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserGroupSpeciesGroup persistentInstance) {
		log.debug("removing UserGroupSpeciesGroup instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserGroupSpeciesGroup merge(UserGroupSpeciesGroup detachedInstance) {
		log.debug("merging UserGroupSpeciesGroup instance");
		try {
			UserGroupSpeciesGroup result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserGroupSpeciesGroup findById(UserGroupSpeciesGroupId id) {
		log.debug("getting UserGroupSpeciesGroup instance with id: " + id);
		try {
			UserGroupSpeciesGroup instance = entityManager.find(UserGroupSpeciesGroup.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
