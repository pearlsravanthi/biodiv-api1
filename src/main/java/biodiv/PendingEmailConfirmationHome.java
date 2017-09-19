package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PendingEmailConfirmation.
 * @see biodiv.PendingEmailConfirmation
 * @author Hibernate Tools
 */
@Stateless
public class PendingEmailConfirmationHome {

	private static final Log log = LogFactory.getLog(PendingEmailConfirmationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PendingEmailConfirmation transientInstance) {
		log.debug("persisting PendingEmailConfirmation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PendingEmailConfirmation persistentInstance) {
		log.debug("removing PendingEmailConfirmation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PendingEmailConfirmation merge(PendingEmailConfirmation detachedInstance) {
		log.debug("merging PendingEmailConfirmation instance");
		try {
			PendingEmailConfirmation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PendingEmailConfirmation findById(long id) {
		log.debug("getting PendingEmailConfirmation instance with id: " + id);
		try {
			PendingEmailConfirmation instance = entityManager.find(PendingEmailConfirmation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
