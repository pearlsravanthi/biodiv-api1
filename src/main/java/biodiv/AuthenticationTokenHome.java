package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class AuthenticationToken.
 * @see biodiv.AuthenticationToken
 * @author Hibernate Tools
 */
@Stateless
public class AuthenticationTokenHome {

	private static final Log log = LogFactory.getLog(AuthenticationTokenHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(AuthenticationToken transientInstance) {
		log.debug("persisting AuthenticationToken instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(AuthenticationToken persistentInstance) {
		log.debug("removing AuthenticationToken instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public AuthenticationToken merge(AuthenticationToken detachedInstance) {
		log.debug("merging AuthenticationToken instance");
		try {
			AuthenticationToken result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public AuthenticationToken findById(long id) {
		log.debug("getting AuthenticationToken instance with id: " + id);
		try {
			AuthenticationToken instance = entityManager.find(AuthenticationToken.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
