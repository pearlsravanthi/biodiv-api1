package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ObservationLocationsBak.
 * @see biodiv.ObservationLocationsBak
 * @author Hibernate Tools
 */
@Stateless
public class ObservationLocationsBakHome {

	private static final Log log = LogFactory.getLog(ObservationLocationsBakHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ObservationLocationsBak transientInstance) {
		log.debug("persisting ObservationLocationsBak instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ObservationLocationsBak persistentInstance) {
		log.debug("removing ObservationLocationsBak instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ObservationLocationsBak merge(ObservationLocationsBak detachedInstance) {
		log.debug("merging ObservationLocationsBak instance");
		try {
			ObservationLocationsBak result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ObservationLocationsBak findById(ObservationLocationsBakId id) {
		log.debug("getting ObservationLocationsBak instance with id: " + id);
		try {
			ObservationLocationsBak instance = entityManager.find(ObservationLocationsBak.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
