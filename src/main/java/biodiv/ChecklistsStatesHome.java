package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ChecklistsStates.
 * @see biodiv.ChecklistsStates
 * @author Hibernate Tools
 */
@Stateless
public class ChecklistsStatesHome {

	private static final Log log = LogFactory.getLog(ChecklistsStatesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ChecklistsStates transientInstance) {
		log.debug("persisting ChecklistsStates instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ChecklistsStates persistentInstance) {
		log.debug("removing ChecklistsStates instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ChecklistsStates merge(ChecklistsStates detachedInstance) {
		log.debug("merging ChecklistsStates instance");
		try {
			ChecklistsStates result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ChecklistsStates findById(ChecklistsStatesId id) {
		log.debug("getting ChecklistsStates instance with id: " + id);
		try {
			ChecklistsStates instance = entityManager.find(ChecklistsStates.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
