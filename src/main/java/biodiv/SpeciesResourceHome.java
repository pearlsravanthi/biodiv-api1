package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SpeciesResource.
 * @see biodiv.SpeciesResource
 * @author Hibernate Tools
 */
@Stateless
public class SpeciesResourceHome {

	private static final Log log = LogFactory.getLog(SpeciesResourceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpeciesResource transientInstance) {
		log.debug("persisting SpeciesResource instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpeciesResource persistentInstance) {
		log.debug("removing SpeciesResource instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpeciesResource merge(SpeciesResource detachedInstance) {
		log.debug("merging SpeciesResource instance");
		try {
			SpeciesResource result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpeciesResource findById(SpeciesResourceId id) {
		log.debug("getting SpeciesResource instance with id: " + id);
		try {
			SpeciesResource instance = entityManager.find(SpeciesResource.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
