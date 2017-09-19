package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Digest.
 * @see biodiv.Digest
 * @author Hibernate Tools
 */
@Stateless
public class DigestHome {

	private static final Log log = LogFactory.getLog(DigestHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Digest transientInstance) {
		log.debug("persisting Digest instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Digest persistentInstance) {
		log.debug("removing Digest instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Digest merge(Digest detachedInstance) {
		log.debug("merging Digest instance");
		try {
			Digest result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Digest findById(long id) {
		log.debug("getting Digest instance with id: " + id);
		try {
			Digest instance = entityManager.find(Digest.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
