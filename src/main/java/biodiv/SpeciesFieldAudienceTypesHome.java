package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SpeciesFieldAudienceTypes.
 * @see biodiv.SpeciesFieldAudienceTypes
 * @author Hibernate Tools
 */
@Stateless
public class SpeciesFieldAudienceTypesHome {

	private static final Log log = LogFactory.getLog(SpeciesFieldAudienceTypesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpeciesFieldAudienceTypes transientInstance) {
		log.debug("persisting SpeciesFieldAudienceTypes instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpeciesFieldAudienceTypes persistentInstance) {
		log.debug("removing SpeciesFieldAudienceTypes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpeciesFieldAudienceTypes merge(SpeciesFieldAudienceTypes detachedInstance) {
		log.debug("merging SpeciesFieldAudienceTypes instance");
		try {
			SpeciesFieldAudienceTypes result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpeciesFieldAudienceTypes findById(SpeciesFieldAudienceTypesId id) {
		log.debug("getting SpeciesFieldAudienceTypes instance with id: " + id);
		try {
			SpeciesFieldAudienceTypes instance = entityManager.find(SpeciesFieldAudienceTypes.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
