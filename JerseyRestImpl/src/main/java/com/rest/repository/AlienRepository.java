package com.rest.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.rest.models.Alien;

public class AlienRepository {
			
	Connection con = null;
	
	public AlienRepository() {
		super();
		String url= "jdbc:mysql://localhost:3306/tempschema";
		String username="root";
		String pass="root";
		try {  //com.mysql.jdbc.Driver is deprecated
			Class.forName("com.mysql.cj.jdbc.Driver"); //loading driver
		    con=DriverManager.getConnection(url,username,pass);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
/*		aliensList = new ArrayList<>();
		Alien a1 = new Alien();	
		a1.setId(1);		
		a1.setName("Alien1");
		a1.setPlanet("Jupiter");
		
		Alien a2 = new Alien();
		a2.setId(2);
		a2.setName("Alien2");
		a2.setPlanet("Saturn");
		
		aliensList.add(a1);
		aliensList.add(a2);
*/	}

	
	public List<Alien> getAliens() {
		List<Alien> aliensList = new ArrayList<>();
		String sql = "select * from alien";
		try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			Alien alien = new Alien();
			alien.setId(rs.getInt(1));
			alien.setName(rs.getString(2));
			alien.setPlanet(rs.getString(3));
			aliensList.add(alien);
		 }
		}catch(Exception e) {
			System.out.println(e);
		}
		return aliensList;
	}

	
	public Alien getAlien(int id) {		
		String sql = "select * from alien where id="+id;
		Alien alien = null;
		try {			
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			alien = new Alien();
			alien.setId(rs.getInt(1));
			alien.setName(rs.getString(2));
			alien.setPlanet(rs.getString(3));
			
		 }
		}catch(Exception e) {
			System.out.println(e);
		}
		return alien;
	}

	
	public void createAlien(Alien alien) {				
		String sql = "insert into alien values (?,?,?)";
		
		try {
		PreparedStatement pst = con.prepareStatement(sql);
		//these below setter will replace the ?
		pst.setInt(1, alien.getId()); //here 1 means it will replace 1st ?
		pst.setString(2, alien.getName());
		pst.setString(3, alien.getPlanet());
		pst.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		/*
		 <alien>
    		<id>2</id>
    		<name>Alien2</name>
    		<planet>Venus</planet>
		</alien>
		 */
		/* JSON has comma(,) separated key value pairs
		  {
  			"id":"3",	
  			"name":"Alien3",
  			"planet":"Mars"
		  }
		 */
	}
	
	
	
	public Alien updateAlien(Alien alien) {
		String sql = "update alien set name=?, planet=? where id=?";
		try {
		PreparedStatement pst = con.prepareStatement(sql);
		//these below setter will replace the ?
		pst.setInt(3, alien.getId()); //3 means replace 3rd ? with id
		pst.setString(1, alien.getName());
		pst.setString(2, alien.getPlanet());
		pst.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return alien;
	}
	
	
	
	public void deleteAlien(int id) {
		String sql = "delete from alien where id="+id;
		try {
		  Statement st = con.createStatement();
		  st.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println(e);
		}	
	}
}
