package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectDataLink.
 * @see biodiv.ProjectDataLink
 * @author Hibernate Tools
 */
@Stateless
public class ProjectDataLinkHome {

	private static final Log log = LogFactory.getLog(ProjectDataLinkHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectDataLink transientInstance) {
		log.debug("persisting ProjectDataLink instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectDataLink persistentInstance) {
		log.debug("removing ProjectDataLink instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectDataLink merge(ProjectDataLink detachedInstance) {
		log.debug("merging ProjectDataLink instance");
		try {
			ProjectDataLink result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectDataLink findById(ProjectDataLinkId id) {
		log.debug("getting ProjectDataLink instance with id: " + id);
		try {
			ProjectDataLink instance = entityManager.find(ProjectDataLink.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
