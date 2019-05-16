package com.Manager;

import java.sql.*;

public class ActivEdge2 {


	  public static void main(String[] args)
	  {
	    try
	    {
	    	String JDBC_LOADER = "com.mysql.jdbc.Driver";
	    	String URL = "jdbc:mysql://localhost:3306/test";
	        String LOGIN = "root";
	        String PASSWORD = "nugeez";
	      Class.forName(JDBC_LOADER);
	      
	      Connection conn = DriverManager.getConnection(URL, LOGIN, PASSWORD);
	      
	      
	      String query = "SELECT * FROM T1 JOIN T2 WHERE T1.name != T2.name";

	      Statement stm = conn.createStatement();
	      
	      ResultSet res = stm.executeQuery(query);

	      while (res.next())
	      {
	        int id = res.getInt("id");
	        String name = res.getString("name");
	        String age = res.getString("age");
	        
	        // print the results
	        System.out.format("%s, %s, %s\n", id, name, age);
	      }
	      stm.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! " + e.getMessage());
	    }
	  }
}
