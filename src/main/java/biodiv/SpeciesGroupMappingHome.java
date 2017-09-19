package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SpeciesGroupMapping.
 * @see biodiv.SpeciesGroupMapping
 * @author Hibernate Tools
 */
@Stateless
public class SpeciesGroupMappingHome {

	private static final Log log = LogFactory.getLog(SpeciesGroupMappingHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpeciesGroupMapping transientInstance) {
		log.debug("persisting SpeciesGroupMapping instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpeciesGroupMapping persistentInstance) {
		log.debug("removing SpeciesGroupMapping instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpeciesGroupMapping merge(SpeciesGroupMapping detachedInstance) {
		log.debug("merging SpeciesGroupMapping instance");
		try {
			SpeciesGroupMapping result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpeciesGroupMapping findById(long id) {
		log.debug("getting SpeciesGroupMapping instance with id: " + id);
		try {
			SpeciesGroupMapping instance = entityManager.find(SpeciesGroupMapping.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
