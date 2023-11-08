package telran.company.service;

import java.time.*;
import java.util.*;
import java.util.List;
import java.util.Set;

import telran.company.dto.DepartmentAvgSalary;
import telran.company.dto.Employee;
import telran.company.dto.SalaryIntervalDistribution;

public class CompanyServiceImpl implements CompanyService {
	HashMap<Long, Employee> employeesMap = new HashMap<>();
	HashMap<String, Set<Employee>> employeesDepartment = new HashMap<>(); // key - department, value = set of employees working in this dept
	TreeMap<Integer, Set<Employee>> employeesSalary = new TreeMap<>(); // key = salary, value set of employees having that salary value
	TreeMap<LocalDate, Set<Employee>> employeesAge = new TreeMap<>(); // key = date of birth, value set of employees having that birth date

	@Override
	/**
	 *  adds new Employee into a company
	 *  In the case an employee with the given ID already exists, 
	 *  the exception IllegalStateException must be thrown.
	 *  returns reference to the being added Employee object
	 *  
	 */
	public Employee hireEmployee(Employee empl) {
		return null;
	}

	@Override

	/**
	 * removes employee object from company according to a given ID
	 * In the case an employee with the given ID doesn't exist
	 * the method must throw IllegalStateException
	 */
	public Employee fireEmployee(long id) {
		
		return null;
	}

	@Override
	/**
	 * returns reference to Employee object with a given ID value
	 * in the case employee with the ID doesn't exist 
	 * the method returns null 
	 */
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub O[LogN]
		return null;
	}

	@Override
	/**
	 *  return list of employee objects working in a given department
	 *  in the case none employees in the department, the method returns empty list
	 */
	public List<Employee> getEmployeesByDepartment(String department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesBySalary(int salaryFrom, int salaryTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeByAge(int ageFrom, int ageTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DepartmentAvgSalary> salaryDistributionByDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SalaryIntervalDistribution> getSalaryDistribution(int interval) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateDepartment(long id, String newDepartment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateSalary(long id, int newSalary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(String filePath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void restore(String filePath) {
		// TODO Auto-generated method stub

	}

}
