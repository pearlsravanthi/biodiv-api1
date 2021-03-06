package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class AcceptedSynonym.
 * @see biodiv.AcceptedSynonym
 * @author Hibernate Tools
 */
@Stateless
public class AcceptedSynonymHome {

	private static final Log log = LogFactory.getLog(AcceptedSynonymHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(AcceptedSynonym transientInstance) {
		log.debug("persisting AcceptedSynonym instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(AcceptedSynonym persistentInstance) {
		log.debug("removing AcceptedSynonym instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public AcceptedSynonym merge(AcceptedSynonym detachedInstance) {
		log.debug("merging AcceptedSynonym instance");
		try {
			AcceptedSynonym result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public AcceptedSynonym findById(long id) {
		log.debug("getting AcceptedSynonym instance with id: " + id);
		try {
			AcceptedSynonym instance = entityManager.find(AcceptedSynonym.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
