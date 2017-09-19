package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ChecklistsObservation.
 * @see biodiv.ChecklistsObservation
 * @author Hibernate Tools
 */
@Stateless
public class ChecklistsObservationHome {

	private static final Log log = LogFactory.getLog(ChecklistsObservationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ChecklistsObservation transientInstance) {
		log.debug("persisting ChecklistsObservation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ChecklistsObservation persistentInstance) {
		log.debug("removing ChecklistsObservation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ChecklistsObservation merge(ChecklistsObservation detachedInstance) {
		log.debug("merging ChecklistsObservation instance");
		try {
			ChecklistsObservation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ChecklistsObservation findById(ChecklistsObservationId id) {
		log.debug("getting ChecklistsObservation instance with id: " + id);
		try {
			ChecklistsObservation instance = entityManager.find(ChecklistsObservation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
