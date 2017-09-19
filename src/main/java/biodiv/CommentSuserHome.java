package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CommentSuser.
 * @see biodiv.CommentSuser
 * @author Hibernate Tools
 */
@Stateless
public class CommentSuserHome {

	private static final Log log = LogFactory.getLog(CommentSuserHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CommentSuser transientInstance) {
		log.debug("persisting CommentSuser instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CommentSuser persistentInstance) {
		log.debug("removing CommentSuser instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CommentSuser merge(CommentSuser detachedInstance) {
		log.debug("merging CommentSuser instance");
		try {
			CommentSuser result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CommentSuser findById(CommentSuserId id) {
		log.debug("getting CommentSuser instance with id: " + id);
		try {
			CommentSuser instance = entityManager.find(CommentSuser.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
