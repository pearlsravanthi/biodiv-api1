package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ObservationLocations.
 * @see biodiv.ObservationLocations
 * @author Hibernate Tools
 */
@Stateless
public class ObservationLocationsHome {

	private static final Log log = LogFactory.getLog(ObservationLocationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ObservationLocations transientInstance) {
		log.debug("persisting ObservationLocations instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ObservationLocations persistentInstance) {
		log.debug("removing ObservationLocations instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ObservationLocations merge(ObservationLocations detachedInstance) {
		log.debug("merging ObservationLocations instance");
		try {
			ObservationLocations result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ObservationLocations findById(ObservationLocationsId id) {
		log.debug("getting ObservationLocations instance with id: " + id);
		try {
			ObservationLocations instance = entityManager.find(ObservationLocations.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
