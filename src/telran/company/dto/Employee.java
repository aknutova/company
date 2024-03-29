package telran.company.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public record Employee(long id, String name, int salary, String department, LocalDate birthDate) implements Serializable, Comparable<Employee> {

	@Override
    public boolean equals(Object o) {
        if (this == o) 
        	return true;
        if (o == null || getClass() != o.getClass()) 
        	return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

	@Override
	public int compareTo(Employee o) {
		return Long.compare(id, o.id);
	}
	
}
