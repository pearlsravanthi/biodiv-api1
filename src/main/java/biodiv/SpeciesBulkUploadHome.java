package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SpeciesBulkUpload.
 * @see biodiv.SpeciesBulkUpload
 * @author Hibernate Tools
 */
@Stateless
public class SpeciesBulkUploadHome {

	private static final Log log = LogFactory.getLog(SpeciesBulkUploadHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpeciesBulkUpload transientInstance) {
		log.debug("persisting SpeciesBulkUpload instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpeciesBulkUpload persistentInstance) {
		log.debug("removing SpeciesBulkUpload instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpeciesBulkUpload merge(SpeciesBulkUpload detachedInstance) {
		log.debug("merging SpeciesBulkUpload instance");
		try {
			SpeciesBulkUpload result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpeciesBulkUpload findById(long id) {
		log.debug("getting SpeciesBulkUpload instance with id: " + id);
		try {
			SpeciesBulkUpload instance = entityManager.find(SpeciesBulkUpload.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
