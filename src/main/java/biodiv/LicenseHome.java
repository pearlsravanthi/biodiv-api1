package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class License.
 * @see biodiv.License
 * @author Hibernate Tools
 */
@Stateless
public class LicenseHome {

	private static final Log log = LogFactory.getLog(LicenseHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(License transientInstance) {
		log.debug("persisting License instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(License persistentInstance) {
		log.debug("removing License instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public License merge(License detachedInstance) {
		log.debug("merging License instance");
		try {
			License result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public License findById(long id) {
		log.debug("getting License instance with id: " + id);
		try {
			License instance = entityManager.find(License.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
