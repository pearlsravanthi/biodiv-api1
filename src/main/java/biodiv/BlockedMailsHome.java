package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class BlockedMails.
 * @see biodiv.BlockedMails
 * @author Hibernate Tools
 */
@Stateless
public class BlockedMailsHome {

	private static final Log log = LogFactory.getLog(BlockedMailsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BlockedMails transientInstance) {
		log.debug("persisting BlockedMails instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BlockedMails persistentInstance) {
		log.debug("removing BlockedMails instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BlockedMails merge(BlockedMails detachedInstance) {
		log.debug("merging BlockedMails instance");
		try {
			BlockedMails result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BlockedMails findById(long id) {
		log.debug("getting BlockedMails instance with id: " + id);
		try {
			BlockedMails instance = entityManager.find(BlockedMails.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
