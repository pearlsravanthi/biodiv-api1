package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DownloadLog.
 * @see biodiv.DownloadLog
 * @author Hibernate Tools
 */
@Stateless
public class DownloadLogHome {

	private static final Log log = LogFactory.getLog(DownloadLogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DownloadLog transientInstance) {
		log.debug("persisting DownloadLog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DownloadLog persistentInstance) {
		log.debug("removing DownloadLog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DownloadLog merge(DownloadLog detachedInstance) {
		log.debug("merging DownloadLog instance");
		try {
			DownloadLog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DownloadLog findById(long id) {
		log.debug("getting DownloadLog instance with id: " + id);
		try {
			DownloadLog instance = entityManager.find(DownloadLog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
