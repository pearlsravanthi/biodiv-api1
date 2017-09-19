package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Recommendation.
 * @see biodiv.Recommendation
 * @author Hibernate Tools
 */
@Stateless
public class RecommendationHome {

	private static final Log log = LogFactory.getLog(RecommendationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Recommendation transientInstance) {
		log.debug("persisting Recommendation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Recommendation persistentInstance) {
		log.debug("removing Recommendation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Recommendation merge(Recommendation detachedInstance) {
		log.debug("merging Recommendation instance");
		try {
			Recommendation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Recommendation findById(long id) {
		log.debug("getting Recommendation instance with id: " + id);
		try {
			Recommendation instance = entityManager.find(Recommendation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
