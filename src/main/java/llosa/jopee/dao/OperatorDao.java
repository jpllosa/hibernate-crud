package llosa.jopee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import llosa.jopee.model.Operator;

public class OperatorDao implements OperatorDaoInterface<Operator, Integer> {

	private Session currentSession;
	private Transaction currentTransaction;

	public OperatorDao() {

	}

	private static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}

	public void closeCurrentSession() {
		currentSession.close();
	}

	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

	@Override
	public void create(Operator entity) {
		getCurrentSession().save(entity);
	}

	@Override
	public void update(Operator entity) {
		getCurrentSession().update(entity);
	}

	@Override
	public Operator findById(Integer id) {
		return getCurrentSession().get(Operator.class, id);
	}

	@Override
	public void delete(Operator entity) {
		getCurrentSession().delete(entity);
	}

	
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Operator> findAll() {
		return (List<Operator>) getCurrentSession().createQuery("from Operator").list();
	}

	@Override
	public void deleteAll() {
		List<Operator> entityList = findAll();
		for (Operator entity : entityList) {
			delete(entity);
		}
	}

}
