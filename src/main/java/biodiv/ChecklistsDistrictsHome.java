package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ChecklistsDistricts.
 * @see biodiv.ChecklistsDistricts
 * @author Hibernate Tools
 */
@Stateless
public class ChecklistsDistrictsHome {

	private static final Log log = LogFactory.getLog(ChecklistsDistrictsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ChecklistsDistricts transientInstance) {
		log.debug("persisting ChecklistsDistricts instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ChecklistsDistricts persistentInstance) {
		log.debug("removing ChecklistsDistricts instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ChecklistsDistricts merge(ChecklistsDistricts detachedInstance) {
		log.debug("merging ChecklistsDistricts instance");
		try {
			ChecklistsDistricts result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ChecklistsDistricts findById(ChecklistsDistrictsId id) {
		log.debug("getting ChecklistsDistricts instance with id: " + id);
		try {
			ChecklistsDistricts instance = entityManager.find(ChecklistsDistricts.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
