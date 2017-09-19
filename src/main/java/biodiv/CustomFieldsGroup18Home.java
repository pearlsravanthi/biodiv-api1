package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CustomFieldsGroup18.
 * @see biodiv.CustomFieldsGroup18
 * @author Hibernate Tools
 */
@Stateless
public class CustomFieldsGroup18Home {

	private static final Log log = LogFactory.getLog(CustomFieldsGroup18Home.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CustomFieldsGroup18 transientInstance) {
		log.debug("persisting CustomFieldsGroup18 instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CustomFieldsGroup18 persistentInstance) {
		log.debug("removing CustomFieldsGroup18 instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CustomFieldsGroup18 merge(CustomFieldsGroup18 detachedInstance) {
		log.debug("merging CustomFieldsGroup18 instance");
		try {
			CustomFieldsGroup18 result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CustomFieldsGroup18 findById(CustomFieldsGroup18Id id) {
		log.debug("getting CustomFieldsGroup18 instance with id: " + id);
		try {
			CustomFieldsGroup18 instance = entityManager.find(CustomFieldsGroup18.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
