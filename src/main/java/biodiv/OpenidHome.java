package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Openid.
 * @see biodiv.Openid
 * @author Hibernate Tools
 */
@Stateless
public class OpenidHome {

	private static final Log log = LogFactory.getLog(OpenidHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Openid transientInstance) {
		log.debug("persisting Openid instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Openid persistentInstance) {
		log.debug("removing Openid instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Openid merge(Openid detachedInstance) {
		log.debug("merging Openid instance");
		try {
			Openid result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Openid findById(long id) {
		log.debug("getting Openid instance with id: " + id);
		try {
			Openid instance = entityManager.find(Openid.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
