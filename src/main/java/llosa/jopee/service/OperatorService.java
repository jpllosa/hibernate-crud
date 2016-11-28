package llosa.jopee.service;

import java.util.List;

import llosa.jopee.dao.OperatorDao;
import llosa.jopee.model.Operator;

public class OperatorService {
	
	private final OperatorDao operatorDao;
	
	public OperatorService() {
		operatorDao = new OperatorDao();
	}

	public void save(Operator entity) {
		operatorDao.openCurrentSessionwithTransaction();
		operatorDao.create(entity);
		operatorDao.closeCurrentSessionwithTransaction();
	}
	
	public void update(Operator entity) {
		operatorDao.openCurrentSessionwithTransaction();
		operatorDao.update(entity);
		operatorDao.closeCurrentSessionwithTransaction();
	}
	
	public Operator findById(Integer id) {
		operatorDao.openCurrentSession();
		Operator entity = operatorDao.findById(id);
		operatorDao.closeCurrentSession();
		return entity;
	}
	
	public List<Operator> findAll() {
		operatorDao.openCurrentSession();
		List<Operator> entities = operatorDao.findAll();
		operatorDao.closeCurrentSession();
		return entities;
	}
	
	public void delete(Integer id) {
		operatorDao.openCurrentSessionwithTransaction();
		Operator entity = operatorDao.findById(id);
		operatorDao.delete(entity);
		operatorDao.closeCurrentSessionwithTransaction();
	}
	
	public void deletAll() {
		operatorDao.openCurrentSessionwithTransaction();
		operatorDao.deleteAll();
		operatorDao.closeCurrentSessionwithTransaction();
	}
}
