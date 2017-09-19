package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SynonymsSuser.
 * @see biodiv.SynonymsSuser
 * @author Hibernate Tools
 */
@Stateless
public class SynonymsSuserHome {

	private static final Log log = LogFactory.getLog(SynonymsSuserHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SynonymsSuser transientInstance) {
		log.debug("persisting SynonymsSuser instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SynonymsSuser persistentInstance) {
		log.debug("removing SynonymsSuser instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SynonymsSuser merge(SynonymsSuser detachedInstance) {
		log.debug("merging SynonymsSuser instance");
		try {
			SynonymsSuser result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SynonymsSuser findById(SynonymsSuserId id) {
		log.debug("getting SynonymsSuser instance with id: " + id);
		try {
			SynonymsSuser instance = entityManager.find(SynonymsSuser.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
