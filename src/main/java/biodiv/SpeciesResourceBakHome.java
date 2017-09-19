package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SpeciesResourceBak.
 * @see biodiv.SpeciesResourceBak
 * @author Hibernate Tools
 */
@Stateless
public class SpeciesResourceBakHome {

	private static final Log log = LogFactory.getLog(SpeciesResourceBakHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpeciesResourceBak transientInstance) {
		log.debug("persisting SpeciesResourceBak instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpeciesResourceBak persistentInstance) {
		log.debug("removing SpeciesResourceBak instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpeciesResourceBak merge(SpeciesResourceBak detachedInstance) {
		log.debug("merging SpeciesResourceBak instance");
		try {
			SpeciesResourceBak result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpeciesResourceBak findById(SpeciesResourceBakId id) {
		log.debug("getting SpeciesResourceBak instance with id: " + id);
		try {
			SpeciesResourceBak instance = entityManager.find(SpeciesResourceBak.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
