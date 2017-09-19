package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class NamePermission.
 * @see biodiv.NamePermission
 * @author Hibernate Tools
 */
@Stateless
public class NamePermissionHome {

	private static final Log log = LogFactory.getLog(NamePermissionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(NamePermission transientInstance) {
		log.debug("persisting NamePermission instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(NamePermission persistentInstance) {
		log.debug("removing NamePermission instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public NamePermission merge(NamePermission detachedInstance) {
		log.debug("merging NamePermission instance");
		try {
			NamePermission result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public NamePermission findById(long id) {
		log.debug("getting NamePermission instance with id: " + id);
		try {
			NamePermission instance = entityManager.find(NamePermission.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
