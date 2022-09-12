package com.sonata.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeImpl implements EmployeeIntf{
	DBConnection db = new DBConnection();
	int row =0;
	public int save (Object object ) {
		Employee p1=(Employee) object;
		try {
			PreparedStatement s1 =db.getConnection().prepareStatement("insert into employee values (?,?,?)");		
			s1.setInt(1, p1.getEmpid());
			s1.setNString(2, p1.getEmpName());
			s1.setDouble(3, p1.getEmpSal());
			row =s1.executeUpdate();
			db.closeConnection();
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
	return row;
	}
}
