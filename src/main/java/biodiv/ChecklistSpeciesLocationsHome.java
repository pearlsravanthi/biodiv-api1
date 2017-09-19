package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ChecklistSpeciesLocations.
 * @see biodiv.ChecklistSpeciesLocations
 * @author Hibernate Tools
 */
@Stateless
public class ChecklistSpeciesLocationsHome {

	private static final Log log = LogFactory.getLog(ChecklistSpeciesLocationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ChecklistSpeciesLocations transientInstance) {
		log.debug("persisting ChecklistSpeciesLocations instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ChecklistSpeciesLocations persistentInstance) {
		log.debug("removing ChecklistSpeciesLocations instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ChecklistSpeciesLocations merge(ChecklistSpeciesLocations detachedInstance) {
		log.debug("merging ChecklistSpeciesLocations instance");
		try {
			ChecklistSpeciesLocations result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ChecklistSpeciesLocations findById(ChecklistSpeciesLocationsId id) {
		log.debug("getting ChecklistSpeciesLocations instance with id: " + id);
		try {
			ChecklistSpeciesLocations instance = entityManager.find(ChecklistSpeciesLocations.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
