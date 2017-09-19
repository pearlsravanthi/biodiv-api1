package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SuserObservations.
 * @see biodiv.SuserObservations
 * @author Hibernate Tools
 */
@Stateless
public class SuserObservationsHome {

	private static final Log log = LogFactory.getLog(SuserObservationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SuserObservations transientInstance) {
		log.debug("persisting SuserObservations instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SuserObservations persistentInstance) {
		log.debug("removing SuserObservations instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SuserObservations merge(SuserObservations detachedInstance) {
		log.debug("merging SuserObservations instance");
		try {
			SuserObservations result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SuserObservations findById(SuserObservationsId id) {
		log.debug("getting SuserObservations instance with id: " + id);
		try {
			SuserObservations instance = entityManager.find(SuserObservations.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
