package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ReferenceBak.
 * @see biodiv.ReferenceBak
 * @author Hibernate Tools
 */
@Stateless
public class ReferenceBakHome {

	private static final Log log = LogFactory.getLog(ReferenceBakHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ReferenceBak transientInstance) {
		log.debug("persisting ReferenceBak instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ReferenceBak persistentInstance) {
		log.debug("removing ReferenceBak instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ReferenceBak merge(ReferenceBak detachedInstance) {
		log.debug("merging ReferenceBak instance");
		try {
			ReferenceBak result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReferenceBak findById(ReferenceBakId id) {
		log.debug("getting ReferenceBak instance with id: " + id);
		try {
			ReferenceBak instance = entityManager.find(ReferenceBak.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
