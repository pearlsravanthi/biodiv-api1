package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ChecklistSpeciesView.
 * @see biodiv.ChecklistSpeciesView
 * @author Hibernate Tools
 */
@Stateless
public class ChecklistSpeciesViewHome {

	private static final Log log = LogFactory.getLog(ChecklistSpeciesViewHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ChecklistSpeciesView transientInstance) {
		log.debug("persisting ChecklistSpeciesView instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ChecklistSpeciesView persistentInstance) {
		log.debug("removing ChecklistSpeciesView instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ChecklistSpeciesView merge(ChecklistSpeciesView detachedInstance) {
		log.debug("merging ChecklistSpeciesView instance");
		try {
			ChecklistSpeciesView result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ChecklistSpeciesView findById(ChecklistSpeciesViewId id) {
		log.debug("getting ChecklistSpeciesView instance with id: " + id);
		try {
			ChecklistSpeciesView instance = entityManager.find(ChecklistSpeciesView.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
