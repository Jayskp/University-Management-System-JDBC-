// Code for uploading faculty details 
//You required same details for the faculty as mentioned in the code
//Code for student has been comment out 

import java.sql.*;
import java.io.*;

public class Uni{
    public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException, InterruptedException{
        Scanner sin = new Scanner(System.in);
        String DATABASE_URL = "jdbc:mysql://localhost:3306/university managemen t";
        String DATABASE_USER = "root";
        String DATABASE_PASSWORD = "";
        String DRIVER = "com.mysql.cj.jdbc.Driver";
        Class.forName(DRIVER);
        Connection cn = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
        if( cn != null ){
            System.out.println("Connection successfully established.");
        }else{
            System.out.println("Connection failed.");
        }
        Statement st = cn.createStatement();

        BufferedReader br1 = new BufferedReader(new FileReader("FAC.txt") );
        // BufferedReader br2 = new BufferedReader(new FileReader("UniData.txt") );

        String str1 = "";
        String str2 = "";
        while( ( str1 = br1.readLine() ) != null ){
            String[] arr1 = str1.split(" ");
          
            String intial = arr1[0];
            String firstName = arr1[1];
            String lastName = arr1[2];
            String shortname = arr1[3];
            String phoneNumber = arr1[4];
            String email= arr1[5];
        
            String subject = arr1[6] + " " + arr1[7] + " " + arr1[8] + " " + arr1[9];
            st.execute("INSERT INTO `faculty` VALUES ( " + "' " + intial + " " + firstName + " "  + lastName + "','" + shortname + "', " + phoneNumber + ", '" + email + "','" + subject +"' )");
             
              System.out.println("INSERT INTO `faculty` VALUES ( " + "' " + intial +" "+ firstName + " "  + lastName + "','" + shortname + "', " + phoneNumber + ", '" + email + "','" + subject +"' )");
            // str2 = br2.readLine();

            

            // String maths = arr1[9];
            // String physics = arr1[10];
            // String java = arr1[11];
            // String ds = arr1[12];
            // String dbms = sin.next();
            
            // System.out.println(" Last Name : " + lastName);
            // System.out.println(" First Name : " + firstName);
            // System.out.println(" Fathers Name : " + fathersName);
            // System.out.println(" Enrollment Number : " + enrollmentNumber);
            // System.out.println(" Roll Number : " + rollNumber);
            // System.out.println(" Batch : " + batch);
            // System.out.println(" Branch : " + branch);
            // System.out.println(" Mentor : " + mentor );
            // System.out.println(" Maths-I : " + maths);
            // System.out.println(" Physics : " + physics);
            // System.out.println(" Java-I : " + java);
            // System.out.println(" SE : " + se);
            // System.out.println(" Total : " + total);

        
        }
        
		

        br1.close();
        // br2.close();

    }
}

//MENTOR

