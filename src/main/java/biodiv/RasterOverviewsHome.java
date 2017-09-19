package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RasterOverviews.
 * @see biodiv.RasterOverviews
 * @author Hibernate Tools
 */
@Stateless
public class RasterOverviewsHome {

	private static final Log log = LogFactory.getLog(RasterOverviewsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RasterOverviews transientInstance) {
		log.debug("persisting RasterOverviews instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RasterOverviews persistentInstance) {
		log.debug("removing RasterOverviews instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RasterOverviews merge(RasterOverviews detachedInstance) {
		log.debug("merging RasterOverviews instance");
		try {
			RasterOverviews result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RasterOverviews findById(RasterOverviewsId id) {
		log.debug("getting RasterOverviews instance with id: " + id);
		try {
			RasterOverviews instance = entityManager.find(RasterOverviews.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
