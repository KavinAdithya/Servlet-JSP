package com.techcrack;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.io.IOException;

public class JDBC{
		//Basic requirement to connect database
		private String userName=null;
		private String passWord=null;
		private String url=null;
		private String driverLoader=null;
		private Connection connect=null;
		private boolean dataSecurityCheckUp=false;
		private PreparedStatement prepare=null;
		
		
		//Intanting DataBase during Object Creation
		JDBC(){
			super();
			userName="root";
			passWord="KavinDharani@3";
			url="jdbc:mysql://localhost:3306/companydataBase";
			driverLoader="com.mysql.cj.jdbc.Driver";
			dataSecurityCheckUp=false;
		}
		
		//Central Method For Security Checkingg!!!!
		private boolean centralSecurityCheckUp(String name,String passWord) {
			if(name.compareTo("KaVin_AdithYa")!=0) {
				System.out.println("Access Has Been Denied Due To Mismatch UserName!!!");
				return false;
			}
			
			if(passWord.compareTo("KavinDharani@3")!=0) {
				System.out.println("Access Has Been Denied Due To Incorrect PassWord!!");
				return false;
			}
			return true;
		}
		
		//Accessing From Outer To Connect dataBase After The Security Check
		public boolean connectDB(String name,String passWord) {
			
			if(!centralSecurityCheckUp(name,passWord)) 
				return false;
		
			dataSecurityCheckUp=dataInterface();
			
			return dataSecurityCheckUp;
		}
		
		//Connection method which is encapsulated From other classes Directly
		private boolean dataInterface() {
			
			try {
				Class.forName(driverLoader);
				connect=DriverManager.getConnection(url,userName,passWord); //Connecting The data Base using database url,username and passWord!!
				
				return true;
			}
			catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
	 
		//Insert data Into DataBase
		
		public boolean dataBaseIntoDB(String name,String passWord,Student stud) {
			if(!centralSecurityCheckUp(name,passWord))
				return false;
			if(!dataSecurityCheckUp) {
				System.out.println("Data Base Has Not Been Connected!!!");
				return false;
			}
			return insertData(stud);
		}
	
		// Main MEthod For Updating Data
		private boolean insertData(Student student) {
			String query="INSERT INTO filterTable VALUES(?,?)";
			
			try {
					prepare=connect.prepareStatement(query);
					prepare.setString(1,student.getName());
					prepare.setInt(2,student.getID());
				
				return 1==prepare.executeUpdate();
			}
			
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		//checking The User is Already Exists
		public ResultSet isUserPresent(String name,String passWord) {
			if(!centralSecurityCheckUp(name,passWord))
				return null;
			if(!dataSecurityCheckUp) {
				System.out.println("Data Base Has Not Been Connected!!!");
				return null;
			}
			return checkData();
		}
		
		//Actual Checking The Data
		
		private ResultSet checkData() {
			try {
				Statement state=connect.createStatement();
				return state.executeQuery("SELECT * FROM filtertable");
			}
			catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
}
