package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ResourceRedirect.
 * @see biodiv.ResourceRedirect
 * @author Hibernate Tools
 */
@Stateless
public class ResourceRedirectHome {

	private static final Log log = LogFactory.getLog(ResourceRedirectHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ResourceRedirect transientInstance) {
		log.debug("persisting ResourceRedirect instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ResourceRedirect persistentInstance) {
		log.debug("removing ResourceRedirect instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ResourceRedirect merge(ResourceRedirect detachedInstance) {
		log.debug("merging ResourceRedirect instance");
		try {
			ResourceRedirect result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ResourceRedirect findById(long id) {
		log.debug("getting ResourceRedirect instance with id: " + id);
		try {
			ResourceRedirect instance = entityManager.find(ResourceRedirect.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
