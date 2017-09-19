package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SpeciesGroup.
 * @see biodiv.SpeciesGroup
 * @author Hibernate Tools
 */
@Stateless
public class SpeciesGroupHome {

	private static final Log log = LogFactory.getLog(SpeciesGroupHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpeciesGroup transientInstance) {
		log.debug("persisting SpeciesGroup instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpeciesGroup persistentInstance) {
		log.debug("removing SpeciesGroup instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpeciesGroup merge(SpeciesGroup detachedInstance) {
		log.debug("merging SpeciesGroup instance");
		try {
			SpeciesGroup result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpeciesGroup findById(long id) {
		log.debug("getting SpeciesGroup instance with id: " + id);
		try {
			SpeciesGroup instance = entityManager.find(SpeciesGroup.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
