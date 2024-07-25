package com.tnsif.jdbcprograms;
//step 1
import java.sql.*;
import javax.sql.*;
public class Preparedstatementdemo {
	
	public static void main(String[] args) {
		
		//step 2
		//step 3
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu", "root", "root");
			
			//step 4 create statement 
			
			     Statement st=conn.createStatement();
			     
			     //insert values
			     String sqlinsert="insert into student values(5,'javascript',760,4)";
			     System.out.println("the sql statement is"+sqlinsert);
			     
			       int countinsert=st.executeUpdate(sqlinsert);
			       System.out.println(countinsert +"record inserted");
			     
			     //update query
			     String updateqty="update student set booktitle='react' where booktitle='javascript'";
			     int rowupdate=st.executeUpdate(updateqty);
			     System.out.println(rowupdate);
			     
			     //delete record from database
			     String sqldelete="delete from student where bookid=1";
			     System.out.println("the sql statement is"+sqldelete);
			     int countdeleted=st.executeUpdate(sqldelete);
			     System.out.println(countdeleted+"record deleted");
			     
			     String strselect="select booktitle,price,qty from student";
			     
			     System.out.println("the sql statement is"+strselect);
			     
			     //to display
			     ResultSet rst=st.executeQuery(strselect);
			     System.out.println("the records are");
			     
			     int rowcount=0;
			     while(rst.next()) {
			    	 String booktitle=rst.getString("booktitle");
			    	 int price=rst.getInt("price");
			    	 int qty=rst.getInt("qty");
			    	 
			    	 System.out.println(booktitle+" "+price+" "+qty);
			    	 ++rowcount;
			    	 
			     }
			          
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
