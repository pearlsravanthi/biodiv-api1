package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProcessImage.
 * @see biodiv.ProcessImage
 * @author Hibernate Tools
 */
@Stateless
public class ProcessImageHome {

	private static final Log log = LogFactory.getLog(ProcessImageHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProcessImage transientInstance) {
		log.debug("persisting ProcessImage instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProcessImage persistentInstance) {
		log.debug("removing ProcessImage instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProcessImage merge(ProcessImage detachedInstance) {
		log.debug("merging ProcessImage instance");
		try {
			ProcessImage result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProcessImage findById(long id) {
		log.debug("getting ProcessImage instance with id: " + id);
		try {
			ProcessImage instance = entityManager.find(ProcessImage.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
