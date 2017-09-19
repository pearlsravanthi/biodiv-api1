package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Habitat.
 * @see biodiv.Habitat
 * @author Hibernate Tools
 */
@Stateless
public class HabitatHome {

	private static final Log log = LogFactory.getLog(HabitatHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Habitat transientInstance) {
		log.debug("persisting Habitat instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Habitat persistentInstance) {
		log.debug("removing Habitat instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Habitat merge(Habitat detachedInstance) {
		log.debug("merging Habitat instance");
		try {
			Habitat result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Habitat findById(long id) {
		log.debug("getting Habitat instance with id: " + id);
		try {
			Habitat instance = entityManager.find(Habitat.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
