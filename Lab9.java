package uk.ac.mmu.advproglab9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab9 {

	public static void main(String[] args) {
		
		try ( Connection c = DriverManager.getConnection("jdbc:sqlite:database.db")){
			
			Statement s = c.createStatement();
			//ResultSet rs = s.executeQuery("SELECT Name FROM Artist; ");
			
			//while(rs.next()) {
				//System.out.println(rs.getString("Name"));
			
			//ResultSet rs = s.executeQuery("SELECT COUNT(AlbumId) FROM Album; ");
			
			//while(rs.next()) {
				//System.out.println(rs.getString(1));
				
			ResultSet rs = s.executeQuery("SELECT (Name) FROM Track INNER JOIN Album USING (AlbumId) WHERE AlbumId = 1; ");
				
			while(rs.next()) {
					System.out.println(rs.getString(1));
			
			
				
			}
		}
		
		catch (SQLException se) {
			se.printStackTrace();
		}
	}
	

}
