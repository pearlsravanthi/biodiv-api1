package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PersistentLogins.
 * @see biodiv.PersistentLogins
 * @author Hibernate Tools
 */
@Stateless
public class PersistentLoginsHome {

	private static final Log log = LogFactory.getLog(PersistentLoginsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PersistentLogins transientInstance) {
		log.debug("persisting PersistentLogins instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PersistentLogins persistentInstance) {
		log.debug("removing PersistentLogins instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PersistentLogins merge(PersistentLogins detachedInstance) {
		log.debug("merging PersistentLogins instance");
		try {
			PersistentLogins result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PersistentLogins findById(String id) {
		log.debug("getting PersistentLogins instance with id: " + id);
		try {
			PersistentLogins instance = entityManager.find(PersistentLogins.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
