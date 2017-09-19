package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Flag.
 * @see biodiv.Flag
 * @author Hibernate Tools
 */
@Stateless
public class FlagHome {

	private static final Log log = LogFactory.getLog(FlagHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Flag transientInstance) {
		log.debug("persisting Flag instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Flag persistentInstance) {
		log.debug("removing Flag instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Flag merge(Flag detachedInstance) {
		log.debug("merging Flag instance");
		try {
			Flag result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Flag findById(long id) {
		log.debug("getting Flag instance with id: " + id);
		try {
			Flag instance = entityManager.find(Flag.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
