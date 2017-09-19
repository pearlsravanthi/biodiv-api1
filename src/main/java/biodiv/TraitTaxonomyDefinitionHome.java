package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TraitTaxonomyDefinition.
 * @see biodiv.TraitTaxonomyDefinition
 * @author Hibernate Tools
 */
@Stateless
public class TraitTaxonomyDefinitionHome {

	private static final Log log = LogFactory.getLog(TraitTaxonomyDefinitionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TraitTaxonomyDefinition transientInstance) {
		log.debug("persisting TraitTaxonomyDefinition instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TraitTaxonomyDefinition persistentInstance) {
		log.debug("removing TraitTaxonomyDefinition instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TraitTaxonomyDefinition merge(TraitTaxonomyDefinition detachedInstance) {
		log.debug("merging TraitTaxonomyDefinition instance");
		try {
			TraitTaxonomyDefinition result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TraitTaxonomyDefinition findById(TraitTaxonomyDefinitionId id) {
		log.debug("getting TraitTaxonomyDefinition instance with id: " + id);
		try {
			TraitTaxonomyDefinition instance = entityManager.find(TraitTaxonomyDefinition.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
