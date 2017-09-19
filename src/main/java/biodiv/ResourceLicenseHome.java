package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ResourceLicense.
 * @see biodiv.ResourceLicense
 * @author Hibernate Tools
 */
@Stateless
public class ResourceLicenseHome {

	private static final Log log = LogFactory.getLog(ResourceLicenseHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ResourceLicense transientInstance) {
		log.debug("persisting ResourceLicense instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ResourceLicense persistentInstance) {
		log.debug("removing ResourceLicense instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ResourceLicense merge(ResourceLicense detachedInstance) {
		log.debug("merging ResourceLicense instance");
		try {
			ResourceLicense result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ResourceLicense findById(ResourceLicenseId id) {
		log.debug("getting ResourceLicense instance with id: " + id);
		try {
			ResourceLicense instance = entityManager.find(ResourceLicense.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
