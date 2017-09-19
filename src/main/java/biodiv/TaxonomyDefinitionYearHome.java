package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TaxonomyDefinitionYear.
 * @see biodiv.TaxonomyDefinitionYear
 * @author Hibernate Tools
 */
@Stateless
public class TaxonomyDefinitionYearHome {

	private static final Log log = LogFactory.getLog(TaxonomyDefinitionYearHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TaxonomyDefinitionYear transientInstance) {
		log.debug("persisting TaxonomyDefinitionYear instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TaxonomyDefinitionYear persistentInstance) {
		log.debug("removing TaxonomyDefinitionYear instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TaxonomyDefinitionYear merge(TaxonomyDefinitionYear detachedInstance) {
		log.debug("merging TaxonomyDefinitionYear instance");
		try {
			TaxonomyDefinitionYear result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TaxonomyDefinitionYear findById(TaxonomyDefinitionYearId id) {
		log.debug("getting TaxonomyDefinitionYear instance with id: " + id);
		try {
			TaxonomyDefinitionYear instance = entityManager.find(TaxonomyDefinitionYear.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
