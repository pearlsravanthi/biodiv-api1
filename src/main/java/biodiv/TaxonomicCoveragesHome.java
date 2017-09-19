package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TaxonomicCoverages.
 * @see biodiv.TaxonomicCoverages
 * @author Hibernate Tools
 */
@Stateless
public class TaxonomicCoveragesHome {

	private static final Log log = LogFactory.getLog(TaxonomicCoveragesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TaxonomicCoverages transientInstance) {
		log.debug("persisting TaxonomicCoverages instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TaxonomicCoverages persistentInstance) {
		log.debug("removing TaxonomicCoverages instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TaxonomicCoverages merge(TaxonomicCoverages detachedInstance) {
		log.debug("merging TaxonomicCoverages instance");
		try {
			TaxonomicCoverages result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TaxonomicCoverages findById(long id) {
		log.debug("getting TaxonomicCoverages instance with id: " + id);
		try {
			TaxonomicCoverages instance = entityManager.find(TaxonomicCoverages.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
