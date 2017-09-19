package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Oauthid.
 * @see biodiv.Oauthid
 * @author Hibernate Tools
 */
@Stateless
public class OauthidHome {

	private static final Log log = LogFactory.getLog(OauthidHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Oauthid transientInstance) {
		log.debug("persisting Oauthid instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Oauthid persistentInstance) {
		log.debug("removing Oauthid instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Oauthid merge(Oauthid detachedInstance) {
		log.debug("merging Oauthid instance");
		try {
			Oauthid result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Oauthid findById(long id) {
		log.debug("getting Oauthid instance with id: " + id);
		try {
			Oauthid instance = entityManager.find(Oauthid.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
