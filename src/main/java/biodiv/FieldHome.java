package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Field.
 * @see biodiv.Field
 * @author Hibernate Tools
 */
@Stateless
public class FieldHome {

	private static final Log log = LogFactory.getLog(FieldHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Field transientInstance) {
		log.debug("persisting Field instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Field persistentInstance) {
		log.debug("removing Field instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Field merge(Field detachedInstance) {
		log.debug("merging Field instance");
		try {
			Field result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Field findById(long id) {
		log.debug("getting Field instance with id: " + id);
		try {
			Field instance = entityManager.find(Field.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
