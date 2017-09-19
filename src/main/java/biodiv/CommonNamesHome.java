package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CommonNames.
 * @see biodiv.CommonNames
 * @author Hibernate Tools
 */
@Stateless
public class CommonNamesHome {

	private static final Log log = LogFactory.getLog(CommonNamesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CommonNames transientInstance) {
		log.debug("persisting CommonNames instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CommonNames persistentInstance) {
		log.debug("removing CommonNames instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CommonNames merge(CommonNames detachedInstance) {
		log.debug("merging CommonNames instance");
		try {
			CommonNames result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CommonNames findById(long id) {
		log.debug("getting CommonNames instance with id: " + id);
		try {
			CommonNames instance = entityManager.find(CommonNames.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
