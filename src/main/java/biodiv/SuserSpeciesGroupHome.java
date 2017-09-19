package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SuserSpeciesGroup.
 * @see biodiv.SuserSpeciesGroup
 * @author Hibernate Tools
 */
@Stateless
public class SuserSpeciesGroupHome {

	private static final Log log = LogFactory.getLog(SuserSpeciesGroupHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SuserSpeciesGroup transientInstance) {
		log.debug("persisting SuserSpeciesGroup instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SuserSpeciesGroup persistentInstance) {
		log.debug("removing SuserSpeciesGroup instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SuserSpeciesGroup merge(SuserSpeciesGroup detachedInstance) {
		log.debug("merging SuserSpeciesGroup instance");
		try {
			SuserSpeciesGroup result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SuserSpeciesGroup findById(SuserSpeciesGroupId id) {
		log.debug("getting SuserSpeciesGroup instance with id: " + id);
		try {
			SuserSpeciesGroup instance = entityManager.find(SuserSpeciesGroup.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
