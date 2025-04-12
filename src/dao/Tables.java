/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class Tables {
    public static void main (String args[]){
    try{
        Connection con= ConnectionProvider.getCon();
         Statement st = con.createStatement();
//         st.executeUpdate("create table APPUSER(USERID int AUTO_INCREMENT PRIMARY KEY, ROLE varchar(100),NAME varchar(200),DOB date,CONTACTNO BIGINT,EMAIL VARCHAR(200),USERNAME VARCHAR(100) ,PASSWORD VARCHAR(100) NOT NULL, ADDRESS VARCHAR(350),UNIQUE (USERNAME))");
//         st.executeUpdate("CREATE TABLE MEDICINE (MEDICINEID INT AUTO_INCREMENT PRIMARY KEY, UNIQUEID VARCHAR(55), NAME VARCHAR(65), COMPANY VARCHAR(70), QUANTITY BIGINT, PRICE BIGINT )");
//           st.executeUpdate("CREATE TABLE BILL (BILLID INT AUTO_INCREMENT PRIMARY KEY, UNIQUEID VARCHAR(55), NAME VARCHAR(65),COMPANY VARCHAR(70), QUANTITY BIGINT, PRICE BIGINT, TOTAL BIGINT)");
            st.executeUpdate("CREATE TABLE BILkLNEW (BILL_SRNO INT AUTO_INCREMENT PRIMARY KEY,BILLID VARCHAR(250), BILLDATE DATE, AMOUNTPAID BIGINT, GENERATEDBY VARCHAR(75))");
         JOptionPane.showMessageDialog(null, "Table created successfully");
        
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}
}
