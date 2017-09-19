package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Fact.
 * @see biodiv.Fact
 * @author Hibernate Tools
 */
@Stateless
public class FactHome {

	private static final Log log = LogFactory.getLog(FactHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Fact transientInstance) {
		log.debug("persisting Fact instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Fact persistentInstance) {
		log.debug("removing Fact instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Fact merge(Fact detachedInstance) {
		log.debug("merging Fact instance");
		try {
			Fact result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Fact findById(long id) {
		log.debug("getting Fact instance with id: " + id);
		try {
			Fact instance = entityManager.find(Fact.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
