package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import FingerReader.Models.Employees;


@Repository
public interface EmployeesRepository extends JpaRepository<Employees, String>{

}
