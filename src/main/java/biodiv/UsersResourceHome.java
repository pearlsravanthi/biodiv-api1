package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UsersResource.
 * @see biodiv.UsersResource
 * @author Hibernate Tools
 */
@Stateless
public class UsersResourceHome {

	private static final Log log = LogFactory.getLog(UsersResourceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UsersResource transientInstance) {
		log.debug("persisting UsersResource instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UsersResource persistentInstance) {
		log.debug("removing UsersResource instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UsersResource merge(UsersResource detachedInstance) {
		log.debug("merging UsersResource instance");
		try {
			UsersResource result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UsersResource findById(long id) {
		log.debug("getting UsersResource instance with id: " + id);
		try {
			UsersResource instance = entityManager.find(UsersResource.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
