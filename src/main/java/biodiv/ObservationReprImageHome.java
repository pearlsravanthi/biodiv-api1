package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ObservationReprImage.
 * @see biodiv.ObservationReprImage
 * @author Hibernate Tools
 */
@Stateless
public class ObservationReprImageHome {

	private static final Log log = LogFactory.getLog(ObservationReprImageHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ObservationReprImage transientInstance) {
		log.debug("persisting ObservationReprImage instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ObservationReprImage persistentInstance) {
		log.debug("removing ObservationReprImage instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ObservationReprImage merge(ObservationReprImage detachedInstance) {
		log.debug("merging ObservationReprImage instance");
		try {
			ObservationReprImage result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ObservationReprImage findById(ObservationReprImageId id) {
		log.debug("getting ObservationReprImage instance with id: " + id);
		try {
			ObservationReprImage instance = entityManager.find(ObservationReprImage.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
