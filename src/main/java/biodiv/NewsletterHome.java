package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Newsletter.
 * @see biodiv.Newsletter
 * @author Hibernate Tools
 */
@Stateless
public class NewsletterHome {

	private static final Log log = LogFactory.getLog(NewsletterHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Newsletter transientInstance) {
		log.debug("persisting Newsletter instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Newsletter persistentInstance) {
		log.debug("removing Newsletter instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Newsletter merge(Newsletter detachedInstance) {
		log.debug("merging Newsletter instance");
		try {
			Newsletter result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Newsletter findById(long id) {
		log.debug("getting Newsletter instance with id: " + id);
		try {
			Newsletter instance = entityManager.find(Newsletter.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
