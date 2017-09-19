package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class AclObjectIdentity.
 * @see biodiv.AclObjectIdentity
 * @author Hibernate Tools
 */
@Stateless
public class AclObjectIdentityHome {

	private static final Log log = LogFactory.getLog(AclObjectIdentityHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(AclObjectIdentity transientInstance) {
		log.debug("persisting AclObjectIdentity instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(AclObjectIdentity persistentInstance) {
		log.debug("removing AclObjectIdentity instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public AclObjectIdentity merge(AclObjectIdentity detachedInstance) {
		log.debug("merging AclObjectIdentity instance");
		try {
			AclObjectIdentity result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public AclObjectIdentity findById(long id) {
		log.debug("getting AclObjectIdentity instance with id: " + id);
		try {
			AclObjectIdentity instance = entityManager.find(AclObjectIdentity.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
