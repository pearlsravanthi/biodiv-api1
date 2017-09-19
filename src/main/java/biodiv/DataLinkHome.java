package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DataLink.
 * @see biodiv.DataLink
 * @author Hibernate Tools
 */
@Stateless
public class DataLinkHome {

	private static final Log log = LogFactory.getLog(DataLinkHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DataLink transientInstance) {
		log.debug("persisting DataLink instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DataLink persistentInstance) {
		log.debug("removing DataLink instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DataLink merge(DataLink detachedInstance) {
		log.debug("merging DataLink instance");
		try {
			DataLink result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DataLink findById(long id) {
		log.debug("getting DataLink instance with id: " + id);
		try {
			DataLink instance = entityManager.find(DataLink.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
