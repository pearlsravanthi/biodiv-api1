package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class MissingHierarchy.
 * @see biodiv.MissingHierarchy
 * @author Hibernate Tools
 */
@Stateless
public class MissingHierarchyHome {

	private static final Log log = LogFactory.getLog(MissingHierarchyHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MissingHierarchy transientInstance) {
		log.debug("persisting MissingHierarchy instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MissingHierarchy persistentInstance) {
		log.debug("removing MissingHierarchy instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MissingHierarchy merge(MissingHierarchy detachedInstance) {
		log.debug("merging MissingHierarchy instance");
		try {
			MissingHierarchy result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MissingHierarchy findById(MissingHierarchyId id) {
		log.debug("getting MissingHierarchy instance with id: " + id);
		try {
			MissingHierarchy instance = entityManager.find(MissingHierarchy.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
