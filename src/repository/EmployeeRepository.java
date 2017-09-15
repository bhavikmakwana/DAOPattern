package repository;

import java.util.List;
import model.Employee;

public interface EmployeeRepository {
	boolean insert(Employee employee);
	boolean update(Employee employee);
	Employee getById(int id);
	List findAll();
}
