package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ChecklistsTalukas.
 * @see biodiv.ChecklistsTalukas
 * @author Hibernate Tools
 */
@Stateless
public class ChecklistsTalukasHome {

	private static final Log log = LogFactory.getLog(ChecklistsTalukasHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ChecklistsTalukas transientInstance) {
		log.debug("persisting ChecklistsTalukas instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ChecklistsTalukas persistentInstance) {
		log.debug("removing ChecklistsTalukas instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ChecklistsTalukas merge(ChecklistsTalukas detachedInstance) {
		log.debug("merging ChecklistsTalukas instance");
		try {
			ChecklistsTalukas result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ChecklistsTalukas findById(ChecklistsTalukasId id) {
		log.debug("getting ChecklistsTalukas instance with id: " + id);
		try {
			ChecklistsTalukas instance = entityManager.find(ChecklistsTalukas.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
