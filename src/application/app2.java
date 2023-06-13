package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class app2 {

  public static void main(String[] args) throws Exception {

    DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

    System.out.println("=== Test 1: department findById ====");
    Department department = departmentDao.findById(2);

    System.out.println(department);
  }
}
