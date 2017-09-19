package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Annotation.
 * @see biodiv.Annotation
 * @author Hibernate Tools
 */
@Stateless
public class AnnotationHome {

	private static final Log log = LogFactory.getLog(AnnotationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Annotation transientInstance) {
		log.debug("persisting Annotation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Annotation persistentInstance) {
		log.debug("removing Annotation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Annotation merge(Annotation detachedInstance) {
		log.debug("merging Annotation instance");
		try {
			Annotation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Annotation findById(long id) {
		log.debug("getting Annotation instance with id: " + id);
		try {
			Annotation instance = entityManager.find(Annotation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
