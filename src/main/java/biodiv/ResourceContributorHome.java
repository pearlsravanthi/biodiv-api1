package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ResourceContributor.
 * @see biodiv.ResourceContributor
 * @author Hibernate Tools
 */
@Stateless
public class ResourceContributorHome {

	private static final Log log = LogFactory.getLog(ResourceContributorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ResourceContributor transientInstance) {
		log.debug("persisting ResourceContributor instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ResourceContributor persistentInstance) {
		log.debug("removing ResourceContributor instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ResourceContributor merge(ResourceContributor detachedInstance) {
		log.debug("merging ResourceContributor instance");
		try {
			ResourceContributor result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ResourceContributor findById(ResourceContributorId id) {
		log.debug("getting ResourceContributor instance with id: " + id);
		try {
			ResourceContributor instance = entityManager.find(ResourceContributor.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
