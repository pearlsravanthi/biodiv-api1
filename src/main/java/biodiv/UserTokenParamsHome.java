package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserTokenParams.
 * @see biodiv.UserTokenParams
 * @author Hibernate Tools
 */
@Stateless
public class UserTokenParamsHome {

	private static final Log log = LogFactory.getLog(UserTokenParamsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserTokenParams transientInstance) {
		log.debug("persisting UserTokenParams instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserTokenParams persistentInstance) {
		log.debug("removing UserTokenParams instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserTokenParams merge(UserTokenParams detachedInstance) {
		log.debug("merging UserTokenParams instance");
		try {
			UserTokenParams result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserTokenParams findById(UserTokenParamsId id) {
		log.debug("getting UserTokenParams instance with id: " + id);
		try {
			UserTokenParams instance = entityManager.find(UserTokenParams.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
