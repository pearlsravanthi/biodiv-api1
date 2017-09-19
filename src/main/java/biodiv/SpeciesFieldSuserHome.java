package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SpeciesFieldSuser.
 * @see biodiv.SpeciesFieldSuser
 * @author Hibernate Tools
 */
@Stateless
public class SpeciesFieldSuserHome {

	private static final Log log = LogFactory.getLog(SpeciesFieldSuserHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpeciesFieldSuser transientInstance) {
		log.debug("persisting SpeciesFieldSuser instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpeciesFieldSuser persistentInstance) {
		log.debug("removing SpeciesFieldSuser instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpeciesFieldSuser merge(SpeciesFieldSuser detachedInstance) {
		log.debug("merging SpeciesFieldSuser instance");
		try {
			SpeciesFieldSuser result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpeciesFieldSuser findById(SpeciesFieldSuserId id) {
		log.debug("getting SpeciesFieldSuser instance with id: " + id);
		try {
			SpeciesFieldSuser instance = entityManager.find(SpeciesFieldSuser.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
