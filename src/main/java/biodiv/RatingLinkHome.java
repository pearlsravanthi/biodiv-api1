package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RatingLink.
 * @see biodiv.RatingLink
 * @author Hibernate Tools
 */
@Stateless
public class RatingLinkHome {

	private static final Log log = LogFactory.getLog(RatingLinkHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RatingLink transientInstance) {
		log.debug("persisting RatingLink instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RatingLink persistentInstance) {
		log.debug("removing RatingLink instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RatingLink merge(RatingLink detachedInstance) {
		log.debug("merging RatingLink instance");
		try {
			RatingLink result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RatingLink findById(long id) {
		log.debug("getting RatingLink instance with id: " + id);
		try {
			RatingLink instance = entityManager.find(RatingLink.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
