package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Species.
 * @see biodiv.Species
 * @author Hibernate Tools
 */
@Stateless
public class SpeciesHome {

	private static final Log log = LogFactory.getLog(SpeciesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Species transientInstance) {
		log.debug("persisting Species instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Species persistentInstance) {
		log.debug("removing Species instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Species merge(Species detachedInstance) {
		log.debug("merging Species instance");
		try {
			Species result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Species findById(long id) {
		log.debug("getting Species instance with id: " + id);
		try {
			Species instance = entityManager.find(Species.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
