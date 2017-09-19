package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Calendar.
 * @see biodiv.Calendar
 * @author Hibernate Tools
 */
@Stateless
public class CalendarHome {

	private static final Log log = LogFactory.getLog(CalendarHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Calendar transientInstance) {
		log.debug("persisting Calendar instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Calendar persistentInstance) {
		log.debug("removing Calendar instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Calendar merge(Calendar detachedInstance) {
		log.debug("merging Calendar instance");
		try {
			Calendar result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Calendar findById(Date id) {
		log.debug("getting Calendar instance with id: " + id);
		try {
			Calendar instance = entityManager.find(Calendar.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
