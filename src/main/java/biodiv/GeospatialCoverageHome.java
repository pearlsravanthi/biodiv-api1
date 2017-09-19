package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class GeospatialCoverage.
 * @see biodiv.GeospatialCoverage
 * @author Hibernate Tools
 */
@Stateless
public class GeospatialCoverageHome {

	private static final Log log = LogFactory.getLog(GeospatialCoverageHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(GeospatialCoverage transientInstance) {
		log.debug("persisting GeospatialCoverage instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(GeospatialCoverage persistentInstance) {
		log.debug("removing GeospatialCoverage instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public GeospatialCoverage merge(GeospatialCoverage detachedInstance) {
		log.debug("merging GeospatialCoverage instance");
		try {
			GeospatialCoverage result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GeospatialCoverage findById(long id) {
		log.debug("getting GeospatialCoverage instance with id: " + id);
		try {
			GeospatialCoverage instance = entityManager.find(GeospatialCoverage.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
