package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TagLinks.
 * @see biodiv.TagLinks
 * @author Hibernate Tools
 */
@Stateless
public class TagLinksHome {

	private static final Log log = LogFactory.getLog(TagLinksHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TagLinks transientInstance) {
		log.debug("persisting TagLinks instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TagLinks persistentInstance) {
		log.debug("removing TagLinks instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TagLinks merge(TagLinks detachedInstance) {
		log.debug("merging TagLinks instance");
		try {
			TagLinks result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TagLinks findById(long id) {
		log.debug("getting TagLinks instance with id: " + id);
		try {
			TagLinks instance = entityManager.find(TagLinks.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
