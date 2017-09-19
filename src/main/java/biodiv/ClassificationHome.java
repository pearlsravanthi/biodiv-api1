package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Classification.
 * @see biodiv.Classification
 * @author Hibernate Tools
 */
@Stateless
public class ClassificationHome {

	private static final Log log = LogFactory.getLog(ClassificationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Classification transientInstance) {
		log.debug("persisting Classification instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Classification persistentInstance) {
		log.debug("removing Classification instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Classification merge(Classification detachedInstance) {
		log.debug("merging Classification instance");
		try {
			Classification result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Classification findById(long id) {
		log.debug("getting Classification instance with id: " + id);
		try {
			Classification instance = entityManager.find(Classification.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
