package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class MapLayerFeatures.
 * @see biodiv.MapLayerFeatures
 * @author Hibernate Tools
 */
@Stateless
public class MapLayerFeaturesHome {

	private static final Log log = LogFactory.getLog(MapLayerFeaturesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MapLayerFeatures transientInstance) {
		log.debug("persisting MapLayerFeatures instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MapLayerFeatures persistentInstance) {
		log.debug("removing MapLayerFeatures instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MapLayerFeatures merge(MapLayerFeatures detachedInstance) {
		log.debug("merging MapLayerFeatures instance");
		try {
			MapLayerFeatures result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MapLayerFeatures findById(MapLayerFeaturesId id) {
		log.debug("getting MapLayerFeatures instance with id: " + id);
		try {
			MapLayerFeatures instance = entityManager.find(MapLayerFeatures.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
