package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Trait.
 * @see biodiv.Trait
 * @author Hibernate Tools
 */
@Stateless
public class TraitHome {

	private static final Log log = LogFactory.getLog(TraitHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Trait transientInstance) {
		log.debug("persisting Trait instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Trait persistentInstance) {
		log.debug("removing Trait instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Trait merge(Trait detachedInstance) {
		log.debug("merging Trait instance");
		try {
			Trait result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Trait findById(long id) {
		log.debug("getting Trait instance with id: " + id);
		try {
			Trait instance = entityManager.find(Trait.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
