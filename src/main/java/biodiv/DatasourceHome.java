package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Datasource.
 * @see biodiv.Datasource
 * @author Hibernate Tools
 */
@Stateless
public class DatasourceHome {

	private static final Log log = LogFactory.getLog(DatasourceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Datasource transientInstance) {
		log.debug("persisting Datasource instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Datasource persistentInstance) {
		log.debug("removing Datasource instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Datasource merge(Datasource detachedInstance) {
		log.debug("merging Datasource instance");
		try {
			Datasource result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Datasource findById(long id) {
		log.debug("getting Datasource instance with id: " + id);
		try {
			Datasource instance = entityManager.find(Datasource.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
