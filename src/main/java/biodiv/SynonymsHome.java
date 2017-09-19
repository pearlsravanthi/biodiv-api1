package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Synonyms.
 * @see biodiv.Synonyms
 * @author Hibernate Tools
 */
@Stateless
public class SynonymsHome {

	private static final Log log = LogFactory.getLog(SynonymsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Synonyms transientInstance) {
		log.debug("persisting Synonyms instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Synonyms persistentInstance) {
		log.debug("removing Synonyms instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Synonyms merge(Synonyms detachedInstance) {
		log.debug("merging Synonyms instance");
		try {
			Synonyms result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Synonyms findById(long id) {
		log.debug("getting Synonyms instance with id: " + id);
		try {
			Synonyms instance = entityManager.find(Synonyms.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
