package com.learner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {

        String url="jdbc:mysql://localhost:3306/employee";
        String user="ayush123";
        String pwd="Arihant@1008";

        Scanner in = new Scanner(System.in);
        int choice=0;
        do {
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "ayush123", "Arihant@1008");
                Statement st=con.createStatement();

                System.out.println("Enter your choice:\n1. Insert\n2. Delete\n3. Fetch\n4. Update\n0. Exit");
                choice = in.nextInt();

                switch(choice) {
                    case 1:
                        System.out.println("Employee ID: ");
                        int id = in.nextInt();
                        System.out.println("Employee Name: ");
                        String name = in.next();
                        System.out.println("Designation: ");
                        String designation = in.next();
                        System.out.println("Years of Experience: ");
                        int experience = in.nextInt();
                        String sqlInsert="insert into employee values('"+id+"','"+name+"','"+designation+"','"+experience+"')";
                        st.executeUpdate(sqlInsert);
                        System.out.println("Record Inserted Successfully");
                        break;

                    case 2:
                        System.out.println("Enter the id you want to delete: ");
                        int idDelete = in.nextInt();
                        String sqldelete="delete from employee where id = " + idDelete;
                        st.executeUpdate(sqldelete);
                        System.out.println("Record Deleted Successfully");
                        break;

                    case 3:
                        System.out.println("Enter ID to fetch details: ");
                        int idDetails = in.nextInt();
                        String sql="select * from employee where id = " + idDetails ;
                        ResultSet rs= st.executeQuery(sql);
                        while(rs.next()) {
                            System.out.println("ID: "+rs.getInt(1));
                            System.out.println("Name: "+rs.getString(2));
                            System.out.println("Designation: "+rs.getString(3));
                            System.out.println("Experience: "+rs.getInt(4));
                        }
                        break;

                    case 4:
                        System.out.println("Enter ID to update details: ");
                        int idUpdate = in.nextInt();
                        System.out.println("Update Name: ");
                        String nameUp = in.next();
                        String sqlupdateN="update employee set name= '" + nameUp + "' where id = " + idUpdate;
                        System.out.println("Update Designation: ");
                        String desUp = in.next();
                        String sqlupdateD="update employee set designation='" + desUp + "'  where id = " + idUpdate;
                        System.out.println("Update Experience: ");
                        String expUp = in.next();
                        String sqlupdateE="update employee set experience='" + expUp + "'  where id = " + idUpdate;
                        st.executeUpdate(sqlupdateN);
                        st.executeUpdate(sqlupdateD);
                        st.executeUpdate(sqlupdateE);
                        System.out.println("Record updated!");
                        break;
                }
            }
            catch(Exception ex) {
                System.out.println(ex);
            }}
        while(choice != 0);

    }
}
