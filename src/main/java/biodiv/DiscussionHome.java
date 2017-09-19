package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Discussion.
 * @see biodiv.Discussion
 * @author Hibernate Tools
 */
@Stateless
public class DiscussionHome {

	private static final Log log = LogFactory.getLog(DiscussionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Discussion transientInstance) {
		log.debug("persisting Discussion instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Discussion persistentInstance) {
		log.debug("removing Discussion instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Discussion merge(Discussion detachedInstance) {
		log.debug("merging Discussion instance");
		try {
			Discussion result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Discussion findById(long id) {
		log.debug("getting Discussion instance with id: " + id);
		try {
			Discussion instance = entityManager.find(Discussion.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
