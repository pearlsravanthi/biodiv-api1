package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SuserUserGroup.
 * @see biodiv.SuserUserGroup
 * @author Hibernate Tools
 */
@Stateless
public class SuserUserGroupHome {

	private static final Log log = LogFactory.getLog(SuserUserGroupHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SuserUserGroup transientInstance) {
		log.debug("persisting SuserUserGroup instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SuserUserGroup persistentInstance) {
		log.debug("removing SuserUserGroup instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SuserUserGroup merge(SuserUserGroup detachedInstance) {
		log.debug("merging SuserUserGroup instance");
		try {
			SuserUserGroup result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SuserUserGroup findById(SuserUserGroupId id) {
		log.debug("getting SuserUserGroup instance with id: " + id);
		try {
			SuserUserGroup instance = entityManager.find(SuserUserGroup.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
