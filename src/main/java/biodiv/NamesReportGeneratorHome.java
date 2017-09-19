package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class NamesReportGenerator.
 * @see biodiv.NamesReportGenerator
 * @author Hibernate Tools
 */
@Stateless
public class NamesReportGeneratorHome {

	private static final Log log = LogFactory.getLog(NamesReportGeneratorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(NamesReportGenerator transientInstance) {
		log.debug("persisting NamesReportGenerator instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(NamesReportGenerator persistentInstance) {
		log.debug("removing NamesReportGenerator instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public NamesReportGenerator merge(NamesReportGenerator detachedInstance) {
		log.debug("merging NamesReportGenerator instance");
		try {
			NamesReportGenerator result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public NamesReportGenerator findById(long id) {
		log.debug("getting NamesReportGenerator instance with id: " + id);
		try {
			NamesReportGenerator instance = entityManager.find(NamesReportGenerator.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
