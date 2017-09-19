package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SpatialRefSys.
 * @see biodiv.SpatialRefSys
 * @author Hibernate Tools
 */
@Stateless
public class SpatialRefSysHome {

	private static final Log log = LogFactory.getLog(SpatialRefSysHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpatialRefSys transientInstance) {
		log.debug("persisting SpatialRefSys instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpatialRefSys persistentInstance) {
		log.debug("removing SpatialRefSys instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpatialRefSys merge(SpatialRefSys detachedInstance) {
		log.debug("merging SpatialRefSys instance");
		try {
			SpatialRefSys result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpatialRefSys findById(int id) {
		log.debug("getting SpatialRefSys instance with id: " + id);
		try {
			SpatialRefSys instance = entityManager.find(SpatialRefSys.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
