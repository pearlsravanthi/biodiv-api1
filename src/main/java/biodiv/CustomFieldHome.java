package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CustomField.
 * @see biodiv.CustomField
 * @author Hibernate Tools
 */
@Stateless
public class CustomFieldHome {

	private static final Log log = LogFactory.getLog(CustomFieldHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CustomField transientInstance) {
		log.debug("persisting CustomField instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CustomField persistentInstance) {
		log.debug("removing CustomField instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CustomField merge(CustomField detachedInstance) {
		log.debug("merging CustomField instance");
		try {
			CustomField result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CustomField findById(long id) {
		log.debug("getting CustomField instance with id: " + id);
		try {
			CustomField instance = entityManager.find(CustomField.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
