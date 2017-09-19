package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RasterColumns.
 * @see biodiv.RasterColumns
 * @author Hibernate Tools
 */
@Stateless
public class RasterColumnsHome {

	private static final Log log = LogFactory.getLog(RasterColumnsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RasterColumns transientInstance) {
		log.debug("persisting RasterColumns instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RasterColumns persistentInstance) {
		log.debug("removing RasterColumns instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RasterColumns merge(RasterColumns detachedInstance) {
		log.debug("merging RasterColumns instance");
		try {
			RasterColumns result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RasterColumns findById(RasterColumnsId id) {
		log.debug("getting RasterColumns instance with id: " + id);
		try {
			RasterColumns instance = entityManager.find(RasterColumns.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
