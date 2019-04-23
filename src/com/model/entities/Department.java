package com.model.entities;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.model.db.DB;
import com.model.db.DbException;
import com.model.implement.ImplementOperations;

public class Department implements Serializable, ImplementOperations {

	/**
	 * 
	 */
	private Connection conn = null;
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;

	public Department() {

		conn = DB.getConnection();
	}

	public Department(String name) {
		this.setName(name);
	}

	public Department(Integer id, String name) {

		this.setId(id);
		this.setName(name);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("ID.: " + this.getId() + "\n");
		sb.append("Name.: " + this.getName().toUpperCase() + "\n");

		return sb.toString();
	}

	@Override
	public void insert(Object obj) {

		
		PreparedStatement pst = null;

		try {

			
			pst = conn.prepareStatement("insert into department (Name) values (?)");

			pst.setString(1,obj.toString());
			int rowsaffect = pst.executeUpdate();

			if (rowsaffect > 0) {

				System.out.printf("Done! %d rows affected.", rowsaffect);
			}

		} catch (SQLException e) {

			throw new DbException(e.getMessage());
		} finally {

			DB.closeConnection();
		}

	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object findById(int id) {

		PreparedStatement pst = null;
		ResultSet rs = null;

		try {

			pst = conn.prepareStatement("select * from department where department.Id = ?");

			pst.setInt(1, id);
			rs = pst.executeQuery();

			if (rs.next()) {

				Department obj = new Department();

				obj.setId(rs.getInt("Id"));
				obj.setName(rs.getString("Name"));

				return obj;
			}
			return null;

		} catch (SQLException e) {

			throw new DbException(e.getMessage());
		} finally {

			DB.closePrepareStatement(pst);
			DB.closeResultSet(rs);
		}

	}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
