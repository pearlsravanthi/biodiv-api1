package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RecommendationVote.
 * @see biodiv.RecommendationVote
 * @author Hibernate Tools
 */
@Stateless
public class RecommendationVoteHome {

	private static final Log log = LogFactory.getLog(RecommendationVoteHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RecommendationVote transientInstance) {
		log.debug("persisting RecommendationVote instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RecommendationVote persistentInstance) {
		log.debug("removing RecommendationVote instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RecommendationVote merge(RecommendationVote detachedInstance) {
		log.debug("merging RecommendationVote instance");
		try {
			RecommendationVote result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RecommendationVote findById(long id) {
		log.debug("getting RecommendationVote instance with id: " + id);
		try {
			RecommendationVote instance = entityManager.find(RecommendationVote.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
