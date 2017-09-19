package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DocumentTokenUrl.
 * @see biodiv.DocumentTokenUrl
 * @author Hibernate Tools
 */
@Stateless
public class DocumentTokenUrlHome {

	private static final Log log = LogFactory.getLog(DocumentTokenUrlHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DocumentTokenUrl transientInstance) {
		log.debug("persisting DocumentTokenUrl instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DocumentTokenUrl persistentInstance) {
		log.debug("removing DocumentTokenUrl instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DocumentTokenUrl merge(DocumentTokenUrl detachedInstance) {
		log.debug("merging DocumentTokenUrl instance");
		try {
			DocumentTokenUrl result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DocumentTokenUrl findById(long id) {
		log.debug("getting DocumentTokenUrl instance with id: " + id);
		try {
			DocumentTokenUrl instance = entityManager.find(DocumentTokenUrl.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}