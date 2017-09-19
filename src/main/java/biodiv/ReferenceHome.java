package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Reference.
 * @see biodiv.Reference
 * @author Hibernate Tools
 */
@Stateless
public class ReferenceHome {

	private static final Log log = LogFactory.getLog(ReferenceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Reference transientInstance) {
		log.debug("persisting Reference instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Reference persistentInstance) {
		log.debug("removing Reference instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Reference merge(Reference detachedInstance) {
		log.debug("merging Reference instance");
		try {
			Reference result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Reference findById(long id) {
		log.debug("getting Reference instance with id: " + id);
		try {
			Reference instance = entityManager.find(Reference.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
