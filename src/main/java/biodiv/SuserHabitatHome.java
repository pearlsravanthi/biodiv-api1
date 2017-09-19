package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SuserHabitat.
 * @see biodiv.SuserHabitat
 * @author Hibernate Tools
 */
@Stateless
public class SuserHabitatHome {

	private static final Log log = LogFactory.getLog(SuserHabitatHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SuserHabitat transientInstance) {
		log.debug("persisting SuserHabitat instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SuserHabitat persistentInstance) {
		log.debug("removing SuserHabitat instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SuserHabitat merge(SuserHabitat detachedInstance) {
		log.debug("merging SuserHabitat instance");
		try {
			SuserHabitat result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SuserHabitat findById(SuserHabitatId id) {
		log.debug("getting SuserHabitat instance with id: " + id);
		try {
			SuserHabitat instance = entityManager.find(SuserHabitat.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
