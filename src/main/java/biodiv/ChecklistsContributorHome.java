package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ChecklistsContributor.
 * @see biodiv.ChecklistsContributor
 * @author Hibernate Tools
 */
@Stateless
public class ChecklistsContributorHome {

	private static final Log log = LogFactory.getLog(ChecklistsContributorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ChecklistsContributor transientInstance) {
		log.debug("persisting ChecklistsContributor instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ChecklistsContributor persistentInstance) {
		log.debug("removing ChecklistsContributor instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ChecklistsContributor merge(ChecklistsContributor detachedInstance) {
		log.debug("merging ChecklistsContributor instance");
		try {
			ChecklistsContributor result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ChecklistsContributor findById(ChecklistsContributorId id) {
		log.debug("getting ChecklistsContributor instance with id: " + id);
		try {
			ChecklistsContributor instance = entityManager.find(ChecklistsContributor.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
