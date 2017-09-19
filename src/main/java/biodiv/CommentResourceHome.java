package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CommentResource.
 * @see biodiv.CommentResource
 * @author Hibernate Tools
 */
@Stateless
public class CommentResourceHome {

	private static final Log log = LogFactory.getLog(CommentResourceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CommentResource transientInstance) {
		log.debug("persisting CommentResource instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CommentResource persistentInstance) {
		log.debug("removing CommentResource instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CommentResource merge(CommentResource detachedInstance) {
		log.debug("merging CommentResource instance");
		try {
			CommentResource result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CommentResource findById(CommentResourceId id) {
		log.debug("getting CommentResource instance with id: " + id);
		try {
			CommentResource instance = entityManager.find(CommentResource.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
