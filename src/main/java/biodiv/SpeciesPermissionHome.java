package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SpeciesPermission.
 * @see biodiv.SpeciesPermission
 * @author Hibernate Tools
 */
@Stateless
public class SpeciesPermissionHome {

	private static final Log log = LogFactory.getLog(SpeciesPermissionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpeciesPermission transientInstance) {
		log.debug("persisting SpeciesPermission instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpeciesPermission persistentInstance) {
		log.debug("removing SpeciesPermission instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpeciesPermission merge(SpeciesPermission detachedInstance) {
		log.debug("merging SpeciesPermission instance");
		try {
			SpeciesPermission result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpeciesPermission findById(long id) {
		log.debug("getting SpeciesPermission instance with id: " + id);
		try {
			SpeciesPermission instance = entityManager.find(SpeciesPermission.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
