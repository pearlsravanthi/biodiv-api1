package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectLocation.
 * @see biodiv.ProjectLocation
 * @author Hibernate Tools
 */
@Stateless
public class ProjectLocationHome {

	private static final Log log = LogFactory.getLog(ProjectLocationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectLocation transientInstance) {
		log.debug("persisting ProjectLocation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectLocation persistentInstance) {
		log.debug("removing ProjectLocation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectLocation merge(ProjectLocation detachedInstance) {
		log.debug("merging ProjectLocation instance");
		try {
			ProjectLocation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectLocation findById(ProjectLocationId id) {
		log.debug("getting ProjectLocation instance with id: " + id);
		try {
			ProjectLocation instance = entityManager.find(ProjectLocation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
