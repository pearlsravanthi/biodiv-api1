package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Topology.
 * @see biodiv.Topology
 * @author Hibernate Tools
 */
@Stateless
public class TopologyHome {

	private static final Log log = LogFactory.getLog(TopologyHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Topology transientInstance) {
		log.debug("persisting Topology instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Topology persistentInstance) {
		log.debug("removing Topology instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Topology merge(Topology detachedInstance) {
		log.debug("merging Topology instance");
		try {
			Topology result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Topology findById(int id) {
		log.debug("getting Topology instance with id: " + id);
		try {
			Topology instance = entityManager.find(Topology.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
