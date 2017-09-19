package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TaxonomicCoverage.
 * @see biodiv.TaxonomicCoverage
 * @author Hibernate Tools
 */
@Stateless
public class TaxonomicCoverageHome {

	private static final Log log = LogFactory.getLog(TaxonomicCoverageHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TaxonomicCoverage transientInstance) {
		log.debug("persisting TaxonomicCoverage instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TaxonomicCoverage persistentInstance) {
		log.debug("removing TaxonomicCoverage instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TaxonomicCoverage merge(TaxonomicCoverage detachedInstance) {
		log.debug("merging TaxonomicCoverage instance");
		try {
			TaxonomicCoverage result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TaxonomicCoverage findById(long id) {
		log.debug("getting TaxonomicCoverage instance with id: " + id);
		try {
			TaxonomicCoverage instance = entityManager.find(TaxonomicCoverage.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
