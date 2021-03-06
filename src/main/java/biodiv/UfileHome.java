package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Ufile.
 * @see biodiv.Ufile
 * @author Hibernate Tools
 */
@Stateless
public class UfileHome {

	private static final Log log = LogFactory.getLog(UfileHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Ufile transientInstance) {
		log.debug("persisting Ufile instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Ufile persistentInstance) {
		log.debug("removing Ufile instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Ufile merge(Ufile detachedInstance) {
		log.debug("merging Ufile instance");
		try {
			Ufile result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Ufile findById(long id) {
		log.debug("getting Ufile instance with id: " + id);
		try {
			Ufile instance = entityManager.find(Ufile.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
