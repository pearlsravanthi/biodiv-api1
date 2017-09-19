package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class StrategicDirection.
 * @see biodiv.StrategicDirection
 * @author Hibernate Tools
 */
@Stateless
public class StrategicDirectionHome {

	private static final Log log = LogFactory.getLog(StrategicDirectionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StrategicDirection transientInstance) {
		log.debug("persisting StrategicDirection instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StrategicDirection persistentInstance) {
		log.debug("removing StrategicDirection instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StrategicDirection merge(StrategicDirection detachedInstance) {
		log.debug("merging StrategicDirection instance");
		try {
			StrategicDirection result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StrategicDirection findById(long id) {
		log.debug("getting StrategicDirection instance with id: " + id);
		try {
			StrategicDirection instance = entityManager.find(StrategicDirection.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
