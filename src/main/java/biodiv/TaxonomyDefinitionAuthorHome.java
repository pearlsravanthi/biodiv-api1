package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TaxonomyDefinitionAuthor.
 * @see biodiv.TaxonomyDefinitionAuthor
 * @author Hibernate Tools
 */
@Stateless
public class TaxonomyDefinitionAuthorHome {

	private static final Log log = LogFactory.getLog(TaxonomyDefinitionAuthorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TaxonomyDefinitionAuthor transientInstance) {
		log.debug("persisting TaxonomyDefinitionAuthor instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TaxonomyDefinitionAuthor persistentInstance) {
		log.debug("removing TaxonomyDefinitionAuthor instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TaxonomyDefinitionAuthor merge(TaxonomyDefinitionAuthor detachedInstance) {
		log.debug("merging TaxonomyDefinitionAuthor instance");
		try {
			TaxonomyDefinitionAuthor result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TaxonomyDefinitionAuthor findById(TaxonomyDefinitionAuthorId id) {
		log.debug("getting TaxonomyDefinitionAuthor instance with id: " + id);
		try {
			TaxonomyDefinitionAuthor instance = entityManager.find(TaxonomyDefinitionAuthor.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
