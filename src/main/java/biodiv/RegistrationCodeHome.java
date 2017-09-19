package biodiv;
// Generated 31 Jul, 2017 7:18:54 AM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RegistrationCode.
 * @see biodiv.RegistrationCode
 * @author Hibernate Tools
 */
@Stateless
public class RegistrationCodeHome {

	private static final Log log = LogFactory.getLog(RegistrationCodeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RegistrationCode transientInstance) {
		log.debug("persisting RegistrationCode instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RegistrationCode persistentInstance) {
		log.debug("removing RegistrationCode instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RegistrationCode merge(RegistrationCode detachedInstance) {
		log.debug("merging RegistrationCode instance");
		try {
			RegistrationCode result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RegistrationCode findById(long id) {
		log.debug("getting RegistrationCode instance with id: " + id);
		try {
			RegistrationCode instance = entityManager.find(RegistrationCode.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
