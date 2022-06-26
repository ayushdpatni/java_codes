package com.learner;

import java.sql.*;

class JDBC{
    public static void main(String args[]){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee","ayush123","Arihant@1008");

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employee\n");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+ rs.getInt(4));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}