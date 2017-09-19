package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Observation.
 * @see biodiv.Observation
 * @author Hibernate Tools
 */
@Stateless
public class ObservationHome {

	private static final Log log = LogFactory.getLog(ObservationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Observation transientInstance) {
		log.debug("persisting Observation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Observation persistentInstance) {
		log.debug("removing Observation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Observation merge(Observation detachedInstance) {
		log.debug("merging Observation instance");
		try {
			Observation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Observation findById(long id) {
		log.debug("getting Observation instance with id: " + id);
		try {
			Observation instance = entityManager.find(Observation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
