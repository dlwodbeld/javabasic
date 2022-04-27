package jdbc;

import java.sql.*;
import java.util.ArrayList;

import jdbc.*;
import util.ConnectionPool;

import javax.naming.NamingException;

public class StuDAO {
	public ArrayList<StuDTO> getList() throws NamingException, SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM student";

			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			ArrayList<StuDTO> students = new ArrayList<StuDTO>();

			while (rs.next()) {
				students.add(new StuDTO(rs.getString("num"), rs.getString("depart"), rs.getString("name"),
						rs.getString("address"), rs.getString("phone")));
			}
			return students;

		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}

	}

	public StuDTO getDetail(String bid) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM student WHERE name = ?";

			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bid);
			rs = pstmt.executeQuery();

			rs.next();

			String num = rs.getString(1);
			String depart = rs.getString(2);
			String name = rs.getString(3);
			String address = rs.getString(4);
			String phone = rs.getString(5);

			StuDTO student = new StuDTO(num, depart, name, address, phone);

			return student;

		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}

	}

	public boolean insert(String num, String depart, String name, String address,String phone)
			throws NamingException, SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			String sql = "INSERT INTO student (num, depart, name, address, phone) VALUES (?,?,?,?,?)";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.setString(2, depart);
			pstmt.setString(3, name);
			pstmt.setString(4, address);
			pstmt.setString(5, phone);
			int result = pstmt.executeUpdate();

			return (result == 1) ? true : false;

		} finally {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	}
}
