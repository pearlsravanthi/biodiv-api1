package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Suser.
 * @see biodiv.Suser
 * @author Hibernate Tools
 */
@Stateless
public class SuserHome {

	private static final Log log = LogFactory.getLog(SuserHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Suser transientInstance) {
		log.debug("persisting Suser instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Suser persistentInstance) {
		log.debug("removing Suser instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Suser merge(Suser detachedInstance) {
		log.debug("merging Suser instance");
		try {
			Suser result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Suser findById(long id) {
		log.debug("getting Suser instance with id: " + id);
		try {
			Suser instance = entityManager.find(Suser.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
