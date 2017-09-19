package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class AclEntry.
 * @see biodiv.AclEntry
 * @author Hibernate Tools
 */
@Stateless
public class AclEntryHome {

	private static final Log log = LogFactory.getLog(AclEntryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(AclEntry transientInstance) {
		log.debug("persisting AclEntry instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(AclEntry persistentInstance) {
		log.debug("removing AclEntry instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public AclEntry merge(AclEntry detachedInstance) {
		log.debug("merging AclEntry instance");
		try {
			AclEntry result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public AclEntry findById(long id) {
		log.debug("getting AclEntry instance with id: " + id);
		try {
			AclEntry instance = entityManager.find(AclEntry.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
