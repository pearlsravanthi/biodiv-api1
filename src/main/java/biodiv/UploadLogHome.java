package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UploadLog.
 * @see biodiv.UploadLog
 * @author Hibernate Tools
 */
@Stateless
public class UploadLogHome {

	private static final Log log = LogFactory.getLog(UploadLogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UploadLog transientInstance) {
		log.debug("persisting UploadLog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UploadLog persistentInstance) {
		log.debug("removing UploadLog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UploadLog merge(UploadLog detachedInstance) {
		log.debug("merging UploadLog instance");
		try {
			UploadLog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UploadLog findById(long id) {
		log.debug("getting UploadLog instance with id: " + id);
		try {
			UploadLog instance = entityManager.find(UploadLog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
