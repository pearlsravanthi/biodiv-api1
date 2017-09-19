package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class AclClass.
 * @see biodiv.AclClass
 * @author Hibernate Tools
 */
@Stateless
public class AclClassHome {

	private static final Log log = LogFactory.getLog(AclClassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(AclClass transientInstance) {
		log.debug("persisting AclClass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(AclClass persistentInstance) {
		log.debug("removing AclClass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public AclClass merge(AclClass detachedInstance) {
		log.debug("merging AclClass instance");
		try {
			AclClass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public AclClass findById(long id) {
		log.debug("getting AclClass instance with id: " + id);
		try {
			AclClass instance = entityManager.find(AclClass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
