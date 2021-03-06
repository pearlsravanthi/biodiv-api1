package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserGroupMemberRole.
 * @see biodiv.UserGroupMemberRole
 * @author Hibernate Tools
 */
@Stateless
public class UserGroupMemberRoleHome {

	private static final Log log = LogFactory.getLog(UserGroupMemberRoleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserGroupMemberRole transientInstance) {
		log.debug("persisting UserGroupMemberRole instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserGroupMemberRole persistentInstance) {
		log.debug("removing UserGroupMemberRole instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserGroupMemberRole merge(UserGroupMemberRole detachedInstance) {
		log.debug("merging UserGroupMemberRole instance");
		try {
			UserGroupMemberRole result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserGroupMemberRole findById(UserGroupMemberRoleId id) {
		log.debug("getting UserGroupMemberRole instance with id: " + id);
		try {
			UserGroupMemberRole instance = entityManager.find(UserGroupMemberRole.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
