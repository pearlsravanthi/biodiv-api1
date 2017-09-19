package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Checklists.
 * @see biodiv.Checklists
 * @author Hibernate Tools
 */
@Stateless
public class ChecklistsHome {

	private static final Log log = LogFactory.getLog(ChecklistsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Checklists transientInstance) {
		log.debug("persisting Checklists instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Checklists persistentInstance) {
		log.debug("removing Checklists instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Checklists merge(Checklists detachedInstance) {
		log.debug("merging Checklists instance");
		try {
			Checklists result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Checklists findById(long id) {
		log.debug("getting Checklists instance with id: " + id);
		try {
			Checklists instance = entityManager.find(Checklists.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
