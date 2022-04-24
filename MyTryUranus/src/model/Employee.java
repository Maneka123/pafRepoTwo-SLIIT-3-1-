package model;


import java.sql.*;
import java.sql.DriverManager;


public class Employee {

	
	
	public Connection connect() {
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/manpower?serverTimezone=UTC", "root", "");
			// For testing
			System.out.print("Successfully connected");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	// code to insert item to mysql database
	public String insertItemOne(String f, String l, String d, String g,String fa,String m,String de,String dep)
	{ 
	 String output = ""; 

	try
	 { 
	 Connection con = connect(); 
	 if (con == null) 
	 { 
	 return "Error while connecting to the database"; 
	 } 
	 // create a prepared statement
	 //there are two apostrophes in the keyboard.Only using the left hand side apostrophe yields the correct output
	 String query = " insert into cusofficial(`fName`,`lName`,`date`,`gender`,`father`,`mother`,`designation`,`department`) "+"values (?,?,?,?,?,?,?,?)"; 
	 //java.sql.PreparedStatement preparedStmt =  con.prepareStatement(query); 
	 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
	 // binding values
	 //remeber index starts with a zero
	 preparedStmt.setString(1, f); 
	 preparedStmt.setString(2, l); 
	 preparedStmt.setString(3, d); 
	 preparedStmt.setString(4, g); 
	 preparedStmt.setString(5, fa); 
	 preparedStmt.setString(6, m);
	 preparedStmt.setString(7, de);
	 preparedStmt.setString(8, dep);
	 
	 //execute the statement
	 preparedStmt.execute(); 
	 con.close(); 
	 output = "Inserted successfully"; 
	 } 
	catch (Exception e) 
	 { 
	 output = "Error while inserting"; 
	 System.err.println(e.getMessage()); 
	 } 
	return output; 
	}
	
	
	
	
	// code to insert item to mysql database
		public String insertEmpTwo(String f, String l, String d, String g,String fa,String m,String de,String dep)
		{ 
		 String output = ""; 

		try
		 { 
		 Connection con = connect(); 
		 if (con == null) 
		 { 
		 return "Error while connecting to the database"; 
		 } 
		 // create a prepared statement
		 //there are two apostrophes in the keyboard.Only using the left hand side apostrophe yields the correct output
		 String query = " insert into cuscontact(`cAddr`,`pAddr`,`email`,`cNum`,`highEdu`,`language`,`pSkill`,`sSkill`) "+"values (?,?,?,?,?,?,?,?)"; 
		 //java.sql.PreparedStatement preparedStmt =  con.prepareStatement(query); 
		 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
		 // binding values
		 //remeber index starts with a zero
		 preparedStmt.setString(1, f); 
		 preparedStmt.setString(2, l); 
		 preparedStmt.setString(3, d); 
		 preparedStmt.setString(4, g); 
		 preparedStmt.setString(5, fa); 
		 preparedStmt.setString(6, m);
		 preparedStmt.setString(7, de);
		 preparedStmt.setString(8, dep);
		 
		 //execute the statement
		 preparedStmt.execute(); 
		 con.close(); 
		 output = "Inserted contact details successfully"; 
		 } 
		catch (Exception e) 
		 { 
		 output = "Error while inserting"; 
		 System.err.println(e.getMessage()); 
		 } 
		return output; 
		}
	
	
		// code to insert item to mysql database
				public String insertSalary(String f, String l, String d, String g)
				{ 
				 String output = ""; 

				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database"; 
				 } 
				 // create a prepared statement
				 //there are two apostrophes in the keyboard.Only using the left hand side apostrophe yields the correct output
				 String query = " insert into salary(`email`,`month`,`year`,`amount`) "+"values (?,?,?,?)"; 
				 //java.sql.PreparedStatement preparedStmt =  con.prepareStatement(query); 
				 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 //remeber index starts with a zero
				 preparedStmt.setString(1, f); 
				 preparedStmt.setString(2, l); 
				 preparedStmt.setString(3, d); 
				 preparedStmt.setString(4, g); 
				 
				 //execute the statement
				 preparedStmt.execute(); 
				 con.close(); 
				 output = "Inserted salary details successfully"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while inserting"; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
			
	
	
				// code to insert item to mysql database
				public String insertLeave(String f, String l, String d, String g,String h)
				{ 
				 String output = ""; 

				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database"; 
				 } 
				 // create a prepared statement
				 //there are two apostrophes in the keyboard.Only using the left hand side apostrophe yields the correct output
				 String query = " insert into cusleave(`empEmail`,`leaveDescription`,`fromLeave`,`toLeave`,`leaveStatus`) "+"values (?,?,?,?,?)"; 
				 //java.sql.PreparedStatement preparedStmt =  con.prepareStatement(query); 
				 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 //remeber index starts with a zero
				 preparedStmt.setString(1, f); 
				 preparedStmt.setString(2, l); 
				 preparedStmt.setString(3, d); 
				 preparedStmt.setString(4, g); 
				 preparedStmt.setString(5, h); 
				 //execute the statement
				 preparedStmt.execute(); 
				 con.close(); 
				 output = "Inserted leave details successfully"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while inserting"; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
			
				// code to insert item to mysql database
				public String insertTimesheet(String f, String l, String d, String g,String h)
				{ 
				 String output = ""; 

				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database"; 
				 } 
				 // create a prepared statement
				 //there are two apostrophes in the keyboard.Only using the left hand side apostrophe yields the correct output
				 String query = " insert into timesheet(`cusEmail`,`workTitle`,`workDescription`,`totalWorkHrs`,`date`) "+"values (?,?,?,?,?)"; 
				 //java.sql.PreparedStatement preparedStmt =  con.prepareStatement(query); 
				 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 //remeber index starts with a zero
				 preparedStmt.setString(1, f); 
				 preparedStmt.setString(2, l); 
				 preparedStmt.setString(3, d); 
				 preparedStmt.setString(4, g); 
				 preparedStmt.setString(5, h); 
				 //execute the statement
				 preparedStmt.execute(); 
				 con.close(); 
				 output = "Inserted timesheet details successfully"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while inserting"; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
	
				
				public String readOfficialDetails()
				{ 
				 String output = ""; 
				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database for reading."; 
				 } 
				 // Prepare the html table to be displayed
				 output = "<table border='1'><tr><th>First Name</th>" 
				 +"<th>Last Name</th>"+"<th>Date</th>"
				 + "<th>Gender</th>" +"<th>father</th>"+"<th>mother</th>"+"<th>designation</th>"+"<th>Department</th>"
				 + "<th>Update</th><th>Remove</th></tr>"; 
				 String query = "select * from cusofficial"; 
				 Statement stmt = con.createStatement(); 
				 ResultSet rs = stmt.executeQuery(query); 
				 // iterate through the rows in the result set
				 while (rs.next()) 
				 { 
				 //String itemID = Integer.toString(rs.getInt("itemID")); 
				 String a = rs.getString("fName"); 
				 String b = rs.getString("lName"); 
				 String c = rs.getString("date"); 
				 String d = rs.getString("gender"); 
				 String e = rs.getString("father"); 
				 String f= rs.getString("mother"); 
				 String g = rs.getString("designation"); 
				 String h = rs.getString("department"); 
				 String itemID = Integer.toString(rs.getInt("empID"));
				 //String itemPrice = Double.toString(rs.getDouble("itemPrice")); 
				 
				 // Add a row into the html table
				 output += "<tr><td>" + a + "</td>"; 
				 output += "<td>" + b + "</td>"; 
				output += "<td>" + c + "</td>";
				 
				output += "<td>" +d + "</td>"; 
				output += "<td>" +e+ "</td>"; 
				output += "<td>" +f + "</td>"; 
				output += "<td>" +g+ "</td>"; 
				output += "<td>" +h + "</td>"; 
				 // buttons
				 output += "<td><form method='post'  action='IndexThirteen.jsp'>"+"<input name='btnUpdate' " 
				 + " type='submit' value='Update' onclick='show()'>" + "<input name='itemID' type='hidden' " 
				 + " value='" +itemID + "'>"+ "</form></td>"
				 + "<td><form method='post' action='indexFourteen.jsp'>"
				 + "<input name='btnRemove' " 
				 + " type='submit' value='Remove'>"
				 + "<input name='itemID' type='hidden' " 
				 + " value='" +itemID + "'>"+ "</form></td></tr>"; 
				 } 
				 
				 
				 
				 
				 con.close(); 
				 // Complete the html table
				 output += "</table>"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while reading the items."; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
				
				
				public String readContactDetails()
				{ 
				 String output = ""; 
				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database for reading."; 
				 } 
				 // Prepare the html table to be displayed
				 output = "<table border='1'><tr><th>Current Address</th>" 
				 +"<th>Permanent Address</th>"+"<th>Email</th>"
				 + "<th>Contact Number</th>" +"<th>Higher Education</th>"+"<th>Language</th>"+"<th>Primary Skills</th>"+"<th>Secondary Skills</th>"
				 + "<th>Update</th><th>Remove</th></tr>"; 
				 String query = "select * from cuscontact"; 
				 Statement stmt = con.createStatement(); 
				 ResultSet rs = stmt.executeQuery(query); 
				 // iterate through the rows in the result set
				 while (rs.next()) 
				 { 
				 //String itemID = Integer.toString(rs.getInt("itemID")); 
				 String a = rs.getString("cAddr"); 
				 String b = rs.getString("pAddr"); 
				 String c = rs.getString("email"); 
				 String d = rs.getString("cNum"); 
				 String e = rs.getString("highEdu"); 
				 String f= rs.getString("language"); 
				 String g = rs.getString("pSkill"); 
				 String h = rs.getString("sSkill"); 
				 String itemID = Integer.toString(rs.getInt("conID"));
				 //String itemPrice = Double.toString(rs.getDouble("itemPrice")); 
				 
				 // Add a row into the html table
				 output += "<tr><td>" + a + "</td>"; 
				 output += "<td>" + b + "</td>"; 
				output += "<td>" + c + "</td>";
				 
				output += "<td>" +d + "</td>"; 
				output += "<td>" +e+ "</td>"; 
				output += "<td>" +f + "</td>"; 
				output += "<td>" +g+ "</td>"; 
				output += "<td>" +h + "</td>"; 
				 // buttons
				 output += "<td><input name='btnUpdate' " 
				 + " type='button' value='Update'></td>"
				 + "<td><form method='post' action='indexFifteen.jsp'>"
				 + "<input name='btnRemove' " 
				 + " type='submit' value='Remove'>"
				 + "<input name='itemID' type='hidden' " 
				 + " value='" +itemID + "'>"+ "</form></td></tr>"; 
				 } 
				 con.close(); 
				 // Complete the html table
				 output += "</table>"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while reading the items."; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
				
				
				
				public String readSalaryDetails()
				{ 
				 String output = ""; 
				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database for reading."; 
				 } 
				 // Prepare the html table to be displayed
				 output = "<table border='1'><tr><th>Email</th>" 
				 +"<th>Month</th>"+"<th>Year</th>"
				 + "<th>Amountr</th>" + "<th>Update</th><th>Remove</th></tr>"; 
				 String query = "select * from salary"; 
				 Statement stmt = con.createStatement(); 
				 ResultSet rs = stmt.executeQuery(query); 
				 // iterate through the rows in the result set
				 while (rs.next()) 
				 { 
				 //String itemID = Integer.toString(rs.getInt("itemID")); 
				 String a = rs.getString("email"); 
				 String b = rs.getString("month"); 
				 String c = rs.getString("year"); 
				 String d = rs.getString("amount"); 
				 String itemID = Integer.toString(rs.getInt("salID"));
				 //String itemPrice = Double.toString(rs.getDouble("itemPrice")); 
				 
				 // Add a row into the html table
				 output += "<tr><td>" + a + "</td>"; 
				 output += "<td>" + b + "</td>"; 
				output += "<td>" + c + "</td>";
				 
				output += "<td>" +d + "</td>"; 
				
				 // buttons
				 output += "<td><form method='post' action='indexThirteen.jsp'><input name='btnUpdate' " 
				 + " type='button' value='Update'></form></td>"
				 + "<td><form method='post' action='indexSixteen.jsp'>"
				 + "<input name='btnRemove' " 
				 + " type='submit' value='Remove'>"
				 + "<input name='itemID' type='hidden' " 
				 + " value='" +itemID + "'>"+ "</form></td></tr>"; 
				 } 
				 con.close(); 
				 // Complete the html table
				 output += "</table>"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while reading the items."; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}

				
				
				public String readLeaveDetails()
				{ 
				 String output = ""; 
				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database for reading."; 
				 } 
				 // Prepare the html table to be displayed
				 output = "<table border='1'><tr><th>Email</th>" 
				 +"<th>Leave Description</th>"
				 + "<th>From Leave</th>" +"<th>To Leave</th>"+"<th>Leave status</th> "+"<th>Update</th><th>Remove</th></tr>"; 
				 String query = "select * from cusleave"; 
				 Statement stmt = con.createStatement(); 
				 ResultSet rs = stmt.executeQuery(query); 
				 // iterate through the rows in the result set
				 while (rs.next()) 
				 { 
				 //String itemID = Integer.toString(rs.getInt("itemID")); 
				 String a = rs.getString("empEmail"); 
				 String b = rs.getString("fromLeave"); 
				 String c = rs.getString("leaveDescription"); 
				 String d = rs.getString("toLeave"); 
				 String e= rs.getString("leaveStatus"); 
				 String itemID = Integer.toString(rs.getInt("leaveID"));
				 //String itemPrice = Double.toString(rs.getDouble("itemPrice")); 
				 
				 // Add a row into the html table
				 output += "<tr><td>" + a + "</td>"; 
				 output += "<td>" + b + "</td>"; 
				output += "<td>" + c + "</td>";
				 
				output += "<td>" +d + "</td>"; 
				output += "<td>" +e + "</td>"; 
				
				 // buttons
				 output += "<td><input name='btnUpdate' " 
				 + " type='button' value='Update'></td>"
				 + "<td><form method='post' action='indexSeventeen.jsp'>"
				 + "<input name='btnRemove' " 
				 + " type='submit' value='Remove'>"
				 + "<input name='itemID' type='hidden' " 
				 + " value='" +itemID+ "'>"+ "</form></td></tr>"; 
				 } 
				 con.close(); 
				 // Complete the html table
				 output += "</table>"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while reading the items."; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
				
				
				
				public String readTimeSheetDetails()
				{ 
				 String output = ""; 
				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database for reading."; 
				 } 
				 // Prepare the html table to be displayed
				 output = "<table border='1'><tr><th>Email</th>" 
				 +"<th>Work Title</th>"
				 + "<th>Work Description</th>" +"<th>Total WorkHours</th>"+"<th>Date</th> "+"<th>Update</th><th>Remove</th></tr>"; 
				 String query = "select * from timesheet"; 
				 Statement stmt = con.createStatement(); 
				 ResultSet rs = stmt.executeQuery(query); 
				 // iterate through the rows in the result set
				 while (rs.next()) 
				 { 
				 //String itemID = Integer.toString(rs.getInt("itemID")); 
				 String a = rs.getString("cusEmail"); 
				 String b = rs.getString("workTitle"); 
				 String c = rs.getString("workDescription"); 
				 String d = rs.getString("totalWorkHrs"); 
				 String e= rs.getString("date"); 
				 String itemID = Integer.toString(rs.getInt("timesheetID"));
				 //String itemPrice = Double.toString(rs.getDouble("itemPrice")); 
				 
				 // Add a row into the html table
				 output += "<tr><td>" + a + "</td>"; 
				 output += "<td>" + b + "</td>"; 
				output += "<td>" + c + "</td>";
				 
				output += "<td>" +d + "</td>"; 
				output += "<td>" +e + "</td>"; 
				
				 // buttons
				 output += "<td><input name='btnUpdate' " 
				 + " type='button' value='Update'></td>"
				 + "<td><form method='post' action='indexEighteen.jsp'>"
				 + "<input name='btnRemove' " 
				 + " type='submit' value='Remove'>"
				 + "<input name='itemID' type='hidden' " 
				 + " value='" +itemID + "'>"+ "</form></td></tr>"; 
				 } 
				 con.close(); 
				 // Complete the html table
				 output += "</table>"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while reading the items."; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
				
				
				public String deleteItemOne(String fName) 
				{ 
				 String output = ""; 
				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database for deleting."; 
				 } 
				 // create a prepared statement
				 String query = "delete from cusofficial where empID=?"; 
				 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 preparedStmt.setInt(1, Integer.parseInt(fName));
				 
				 // execute the statement
				 preparedStmt.execute(); 
				 con.close(); 
				 output = "Deleted successfully"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while deleting the item."; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
				
				public String deleteItemTwo(String c) 
				{ 
				 String output = ""; 
				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database for deleting."; 
				 } 
				 // create a prepared statement
				 String query = "delete from cuscontact where conID=?"; 
				 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 preparedStmt.setString(1, c);
				 
				 // execute the statement
				 preparedStmt.execute(); 
				 con.close(); 
				 output = "Deleted successfully"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while deleting the item."; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
				
				public String deleteSal(String c) 
				{ 
				 String output = ""; 
				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database for deleting."; 
				 } 
				 // create a prepared statement
				 String query = "delete from salary where salID=?"; 
				 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 preparedStmt.setString(1, c);
				 
				 // execute the statement
				 preparedStmt.execute(); 
				 con.close(); 
				 output = "Deleted successfully"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while deleting the item."; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
				
				
				public String deleteLeave(String c) 
				{ 
				 String output = ""; 
				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database for deleting."; 
				 } 
				 // create a prepared statement
				 String query = "delete from cusleave where leaveID=?"; 
				 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 preparedStmt.setString(1, c);
				 
				 // execute the statement
				 preparedStmt.execute(); 
				 con.close(); 
				 output = "Deleted successfully"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while deleting the item."; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
				
				
				
				public String deleteTimesheet(String c) 
				{ 
				 String output = ""; 
				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database for deleting."; 
				 } 
				 // create a prepared statement
				 String query = "delete from timesheet where timesheetID=?"; 
				 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 preparedStmt.setString(1, c);
				 
				 // execute the statement
				 preparedStmt.execute(); 
				 con.close(); 
				 output = "Deleted successfully"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while deleting the item."; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
				//================================================================
				
				public String updateSalary(String e, String a, String b, String c, String d) 
				 
				 { 
				 String output = ""; 
				 try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 {return "Error while connecting to the database for updating."; } 
				 // create a prepared statement
				 String query = "UPDATE salary SET year=?,amount=?,email=?,month=?  WHERE salID=?"; 
				 PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 preparedStmt.setString(1, c); 
				 preparedStmt.setString(2, d); 
				 preparedStmt.setString(3, a); 
				 preparedStmt.setString(4, b); 
				 preparedStmt.setInt(5, Integer.parseInt(e)); 
				 // execute the statement
				 preparedStmt.execute(); 
				 con.close(); 
				 output = "Updated successfully"; 
				 } 
				 catch (Exception ex) 
				 { 
				 output = "Error while updating the item."; 
				 System.err.println(ex.getMessage()); 
				 } 
				 return output; 
				 }
				
}
				
				
