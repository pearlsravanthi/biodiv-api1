package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DocumentSpeciesGroup.
 * @see biodiv.DocumentSpeciesGroup
 * @author Hibernate Tools
 */
@Stateless
public class DocumentSpeciesGroupHome {

	private static final Log log = LogFactory.getLog(DocumentSpeciesGroupHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DocumentSpeciesGroup transientInstance) {
		log.debug("persisting DocumentSpeciesGroup instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DocumentSpeciesGroup persistentInstance) {
		log.debug("removing DocumentSpeciesGroup instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DocumentSpeciesGroup merge(DocumentSpeciesGroup detachedInstance) {
		log.debug("merging DocumentSpeciesGroup instance");
		try {
			DocumentSpeciesGroup result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DocumentSpeciesGroup findById(DocumentSpeciesGroupId id) {
		log.debug("getting DocumentSpeciesGroup instance with id: " + id);
		try {
			DocumentSpeciesGroup instance = entityManager.find(DocumentSpeciesGroup.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
