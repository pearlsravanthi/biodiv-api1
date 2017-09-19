package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TaxonomyRegistrySuser.
 * @see biodiv.TaxonomyRegistrySuser
 * @author Hibernate Tools
 */
@Stateless
public class TaxonomyRegistrySuserHome {

	private static final Log log = LogFactory.getLog(TaxonomyRegistrySuserHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TaxonomyRegistrySuser transientInstance) {
		log.debug("persisting TaxonomyRegistrySuser instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TaxonomyRegistrySuser persistentInstance) {
		log.debug("removing TaxonomyRegistrySuser instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TaxonomyRegistrySuser merge(TaxonomyRegistrySuser detachedInstance) {
		log.debug("merging TaxonomyRegistrySuser instance");
		try {
			TaxonomyRegistrySuser result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TaxonomyRegistrySuser findById(TaxonomyRegistrySuserId id) {
		log.debug("getting TaxonomyRegistrySuser instance with id: " + id);
		try {
			TaxonomyRegistrySuser instance = entityManager.find(TaxonomyRegistrySuser.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
