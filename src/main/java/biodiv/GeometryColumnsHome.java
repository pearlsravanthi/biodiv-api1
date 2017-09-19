package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class GeometryColumns.
 * @see biodiv.GeometryColumns
 * @author Hibernate Tools
 */
@Stateless
public class GeometryColumnsHome {

	private static final Log log = LogFactory.getLog(GeometryColumnsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(GeometryColumns transientInstance) {
		log.debug("persisting GeometryColumns instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(GeometryColumns persistentInstance) {
		log.debug("removing GeometryColumns instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public GeometryColumns merge(GeometryColumns detachedInstance) {
		log.debug("merging GeometryColumns instance");
		try {
			GeometryColumns result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GeometryColumns findById(GeometryColumnsId id) {
		log.debug("getting GeometryColumns instance with id: " + id);
		try {
			GeometryColumns instance = entityManager.find(GeometryColumns.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
