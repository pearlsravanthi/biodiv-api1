package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DocSciName.
 * @see biodiv.DocSciName
 * @author Hibernate Tools
 */
@Stateless
public class DocSciNameHome {

	private static final Log log = LogFactory.getLog(DocSciNameHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DocSciName transientInstance) {
		log.debug("persisting DocSciName instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DocSciName persistentInstance) {
		log.debug("removing DocSciName instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DocSciName merge(DocSciName detachedInstance) {
		log.debug("merging DocSciName instance");
		try {
			DocSciName result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DocSciName findById(long id) {
		log.debug("getting DocSciName instance with id: " + id);
		try {
			DocSciName instance = entityManager.find(DocSciName.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
