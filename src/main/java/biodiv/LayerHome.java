package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Layer.
 * @see biodiv.Layer
 * @author Hibernate Tools
 */
@Stateless
public class LayerHome {

	private static final Log log = LogFactory.getLog(LayerHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Layer transientInstance) {
		log.debug("persisting Layer instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Layer persistentInstance) {
		log.debug("removing Layer instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Layer merge(Layer detachedInstance) {
		log.debug("merging Layer instance");
		try {
			Layer result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Layer findById(LayerId id) {
		log.debug("getting Layer instance with id: " + id);
		try {
			Layer instance = entityManager.find(Layer.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
