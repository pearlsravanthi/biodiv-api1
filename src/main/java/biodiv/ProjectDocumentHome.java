package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectDocument.
 * @see biodiv.ProjectDocument
 * @author Hibernate Tools
 */
@Stateless
public class ProjectDocumentHome {

	private static final Log log = LogFactory.getLog(ProjectDocumentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectDocument transientInstance) {
		log.debug("persisting ProjectDocument instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectDocument persistentInstance) {
		log.debug("removing ProjectDocument instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectDocument merge(ProjectDocument detachedInstance) {
		log.debug("merging ProjectDocument instance");
		try {
			ProjectDocument result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectDocument findById(ProjectDocumentId id) {
		log.debug("getting ProjectDocument instance with id: " + id);
		try {
			ProjectDocument instance = entityManager.find(ProjectDocument.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
