package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RecoVoteDetails.
 * @see biodiv.RecoVoteDetails
 * @author Hibernate Tools
 */
@Stateless
public class RecoVoteDetailsHome {

	private static final Log log = LogFactory.getLog(RecoVoteDetailsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RecoVoteDetails transientInstance) {
		log.debug("persisting RecoVoteDetails instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RecoVoteDetails persistentInstance) {
		log.debug("removing RecoVoteDetails instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RecoVoteDetails merge(RecoVoteDetails detachedInstance) {
		log.debug("merging RecoVoteDetails instance");
		try {
			RecoVoteDetails result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RecoVoteDetails findById(RecoVoteDetailsId id) {
		log.debug("getting RecoVoteDetails instance with id: " + id);
		try {
			RecoVoteDetails instance = entityManager.find(RecoVoteDetails.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
