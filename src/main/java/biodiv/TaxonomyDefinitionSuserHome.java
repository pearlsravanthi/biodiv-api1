package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TaxonomyDefinitionSuser.
 * @see biodiv.TaxonomyDefinitionSuser
 * @author Hibernate Tools
 */
@Stateless
public class TaxonomyDefinitionSuserHome {

	private static final Log log = LogFactory.getLog(TaxonomyDefinitionSuserHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TaxonomyDefinitionSuser transientInstance) {
		log.debug("persisting TaxonomyDefinitionSuser instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TaxonomyDefinitionSuser persistentInstance) {
		log.debug("removing TaxonomyDefinitionSuser instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TaxonomyDefinitionSuser merge(TaxonomyDefinitionSuser detachedInstance) {
		log.debug("merging TaxonomyDefinitionSuser instance");
		try {
			TaxonomyDefinitionSuser result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TaxonomyDefinitionSuser findById(TaxonomyDefinitionSuserId id) {
		log.debug("getting TaxonomyDefinitionSuser instance with id: " + id);
		try {
			TaxonomyDefinitionSuser instance = entityManager.find(TaxonomyDefinitionSuser.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
