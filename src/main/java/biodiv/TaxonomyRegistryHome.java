package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TaxonomyRegistry.
 * @see biodiv.TaxonomyRegistry
 * @author Hibernate Tools
 */
@Stateless
public class TaxonomyRegistryHome {

	private static final Log log = LogFactory.getLog(TaxonomyRegistryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TaxonomyRegistry transientInstance) {
		log.debug("persisting TaxonomyRegistry instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TaxonomyRegistry persistentInstance) {
		log.debug("removing TaxonomyRegistry instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TaxonomyRegistry merge(TaxonomyRegistry detachedInstance) {
		log.debug("merging TaxonomyRegistry instance");
		try {
			TaxonomyRegistry result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TaxonomyRegistry findById(long id) {
		log.debug("getting TaxonomyRegistry instance with id: " + id);
		try {
			TaxonomyRegistry instance = entityManager.find(TaxonomyRegistry.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
