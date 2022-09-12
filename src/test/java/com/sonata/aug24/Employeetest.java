package com.sonata.aug24;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.sonata.DAO.Employee;
import com.sonata.DAO.EmployeeImpl;

public class Employeetest {
 Employee p1 = new Employee();
 EmployeeImpl p2 = new EmployeeImpl();
 
 @Test
 public void dbTest1() {
     p1.setEmpid(108);
     p1.setEmpName("ram");
     p1.setEmpSal(6500.00);
     assertEquals(0, p2.save(p1));
}
 @Test
 public void dbTest2() {
     p1.setEmpid(106);
     p1.setEmpName("dev");
     p1.setEmpSal(7000.00);
     assertEquals(1, p2.save(p1));
 }
}
