package springboot.springboot_data_mybatis.mapper;

import springboot.springboot_data_mybatis.bean.Employee;

public interface employeeMapper {

    public Employee getEmpById(Integer eid);

    public void insertEmp(Employee employee);
}
