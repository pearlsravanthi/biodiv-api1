package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DocumentHabitat.
 * @see biodiv.DocumentHabitat
 * @author Hibernate Tools
 */
@Stateless
public class DocumentHabitatHome {

	private static final Log log = LogFactory.getLog(DocumentHabitatHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DocumentHabitat transientInstance) {
		log.debug("persisting DocumentHabitat instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DocumentHabitat persistentInstance) {
		log.debug("removing DocumentHabitat instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DocumentHabitat merge(DocumentHabitat detachedInstance) {
		log.debug("merging DocumentHabitat instance");
		try {
			DocumentHabitat result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DocumentHabitat findById(DocumentHabitatId id) {
		log.debug("getting DocumentHabitat instance with id: " + id);
		try {
			DocumentHabitat instance = entityManager.find(DocumentHabitat.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
