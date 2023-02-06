package com.crud.repository;

import com.crud.Employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findByNameAndCity(String name, String city);

    public List<Employee> findByName(String name);

    public List<Employee> findBySalaryLessThanEqual(String salary);

    public List<Employee> findByNameOrderByName(String name);

    public List<Employee> findByNameOrderByNameDesc(String name);

    public List<Employee> findByAge(int age);

    //Custom Query
    @Query("select u from Employee u from")
    public List<Employee> getAllEmployee(Employee employee);

    @Query("select u from Employee u where u.name =:n")
    public List<Employee> findByNam(@Param("n") String name);

    @Query("select u from Employee u where u.city =:c and u.name =:name")
    public List<Employee> findByCityAndName(@Param("city") String city, @Param("name") String name);
}
