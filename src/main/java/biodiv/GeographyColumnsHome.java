package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class GeographyColumns.
 * @see biodiv.GeographyColumns
 * @author Hibernate Tools
 */
@Stateless
public class GeographyColumnsHome {

	private static final Log log = LogFactory.getLog(GeographyColumnsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(GeographyColumns transientInstance) {
		log.debug("persisting GeographyColumns instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(GeographyColumns persistentInstance) {
		log.debug("removing GeographyColumns instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public GeographyColumns merge(GeographyColumns detachedInstance) {
		log.debug("merging GeographyColumns instance");
		try {
			GeographyColumns result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public GeographyColumns findById(GeographyColumnsId id) {
		log.debug("getting GeographyColumns instance with id: " + id);
		try {
			GeographyColumns instance = entityManager.find(GeographyColumns.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
