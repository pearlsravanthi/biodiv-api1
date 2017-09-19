package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SpeciesField.
 * @see biodiv.SpeciesField
 * @author Hibernate Tools
 */
@Stateless
public class SpeciesFieldHome {

	private static final Log log = LogFactory.getLog(SpeciesFieldHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpeciesField transientInstance) {
		log.debug("persisting SpeciesField instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpeciesField persistentInstance) {
		log.debug("removing SpeciesField instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpeciesField merge(SpeciesField detachedInstance) {
		log.debug("merging SpeciesField instance");
		try {
			SpeciesField result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpeciesField findById(long id) {
		log.debug("getting SpeciesField instance with id: " + id);
		try {
			SpeciesField instance = entityManager.find(SpeciesField.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
