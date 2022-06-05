/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsoftware;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author PRINCE E
 */
public class SchoolManagementSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
    Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooolmgtsoftware", "root", "");
    Statement st = Con.createStatement();
    //String q1="create table login(id int, username varchar(25), password varchar(20))";
    //String q1="create table studreg(id varchar(12), name varchar(50), fathername varchar(50), phone_no int, father_phone_no int, class varchar(20), rollnum int, address varchar(100))";
    //String q1="create table addteacher(id varchar(12), name varchar(50), specialization varchar(25), subject varchar(30))";
    //String q1="create table feesubmit(id varchar(12), studname varchar(50), monthname varchar(50), annualfee double, monthfee double, sportfee double, libraryfee double, status varchar(10))";
    //String q1="create table managereport(id int, subject varchar(25), teacher varchar(30))";
    String q1="create table reportcard(id varchar(12), rollnum int, name varchar(50), class varchar(20), subject1 varchar(30), score1 double, subject2 varchar(30), score2 double, subject3 varchar(30), score3 double, subject4 varchar(30), score4 double, subject5 varchar(30), score5 double, subject6 varchar(30), score6 double, subject7 varchar(30), score7 double, subject8 varchar(30), score8 double, subject9 varchar(30), score9 double, grade varchar(10))";
    System.out.println(q1);
    st.execute(q1);
    System.out.print("Table Created ");
    Con.close();
    
}catch(Exception e){
    System.out.print(e);
}
    }
    
}
