import java.util.Scanner;
import java.sql.*;

public class Student {
    public static void main(String[] args) throws Exception {

        Scanner sin = new Scanner(System.in);
        String DATABASE_URL = "jdbc:mysql://localhost:3306/university managemen t";
        String DATABASE_USER = "root";
        String DATABASE_PASSWORD = "";
        String DRIVER = "com.mysql.cj.jdbc.Driver";
        Class.forName(DRIVER);
        Connection con = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
        if (con != null) {
            System.out.println("Connection successfully established.");
        } else {
            System.out.println("Connection failed.");
        }
        Statement st = con.createStatement();

        System.out.println("  " + String.format("%60s", "").replace(" ", "-"));
        System.out.println(
                "  ||" + String.format("%44s", ": UNIVERSITY MANAGEMENT SYSTEM :") + String.format("%12s", "") + "||");
        System.out.println("  " + String.format("%60s", "").replace(" ", "-"));
        System.out.println("  " + String.format("%60s", "").replace(" ", "-"));
        System.out.println("  |" + String.format("%33s", ": LOGIN :") + String.format("%26s", "|"));
        System.out.println("  |" + String.format("%58s", "") + "|");
        System.out.println("  |" + String.format("%3s", "") + "LOGIN AS :" + String.format("%46s", "|"));
        System.out.println("  |" + String.format("%58s", "") + "|");
        System.out.println("  |" + String.format("%12s", "") + "1. --> STUDENT" + String.format("%33s", "|"));
        System.out.println("  |" + String.format("%58s", "") + "|");
        System.out.println("  |" + String.format("%12s", "") + "2. --> FACULTY" + String.format("%33s", "|"));
        System.out.println("  |" + String.format("%58s", "") + "|");
        System.out.println("  |" + String.format("%12s", "") + "3. --> ADMIN" + String.format("%35s", "|"));
        System.out.println("  |" + String.format("%58s", "") + "|");
        System.out.println("  " + String.format("%60s", "").replace(" ", "-"));

        System.out.println("Enter your choice");
        int choice = sin.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter your roll number :");
                int roll_no = sin.nextInt();
                String sql = "Select * from management where Roll_no =" + roll_no;
                ResultSet rst = st.executeQuery(sql);
                if (rst.next()) {
                    String name = rst.getString(1);
                    System.out.println("Student name :" + name);
                    String mentor = rst.getString(2);
                    System.out.println("Mentor :" + mentor);
                    String rollno3 = rst.getString(3);
                    System.out.println("Roll no.:" + rollno3);
                    String div = rst.getString(4);
                    System.out.println("Div :" + " " + div);
                    String branch = rst.getString(5);
                    System.out.println("Branch" + " " + branch);
                    String java = rst.getString(6);
                    System.out.println("JAVA-II =" + " " + java);
                    String maths = rst.getString(7);
                    System.out.println("Maths-II =" + " " + maths);
                    String fee = rst.getString(8);
                    System.out.println("FEE =" + " " + fee);
                    String ds = rst.getString(9);
                    System.out.println("DS =" + " " + ds);
                    String dbms = rst.getString(10);
                    System.out.println("DBMS" + " " + dbms);

                }
                break;
            case 2:
                Scanner sin1 = new Scanner(System.in);
                System.out.println("Enter User id: ");
                String id = sin1.next();
                System.out.println("Enter password");
                String password = sin1.next();
                Student s = new Student();
                int x2 = s.checkFacultyDetails(id, password, st);
                if(x2==0)
                {
                System.out.println("");
                System.out.println("  " + String.format("%60s", "").replace(" ", "-"));
                System.out.println(
                        "  |" + String.format("%12s", "") + "1. --> TO MODIFY COLUMN" + String.format("%24s", "|"));
                System.out.println("  |" + String.format("%58s", "") + "|");
                System.out.println(
                        "  |" + String.format("%12s", "") + "2. --> INSERT STUDENT INFO" + String.format("%21s", "|"));
                System.out.println("  |" + String.format("%58s", "") + "|");
                System.out.println("  |" + String.format("%58s", "") + "|");
                System.out.println("  " + String.format("%60s", "").replace(" ", "-"));

                System.out.println("Enter your choice to perform task");
                int n = sin.nextInt();
                Statement st1 = con.createStatement();
                switch (n) {

                    case 1:
                        System.out
                                .println(
                                        "To change column data : Name/Mentor/Div/Rollno/Java-II/Maths-II/FEE/DS/DBMS");
                        System.out.println("1.1 Name");
                        System.out.println("1.2 Mentor");
                        System.out.println("1.3 Div");
                        System.out.println("1.4 Branch");
                        System.out.println("1.5 Rollno");
                        System.out.println("1.6 Java-II");
                        System.out.println("1.7 Maths-II");
                        System.out.println("1.8 FEE");
                        System.out.println("1.9 DS");
                        System.out.println("1.10 DBMS");

                        System.out.println("---Enter your choice to perform the change---");
                        System.out.println("---Select above given numbers only---");
                        String x = sin.next();
                        switch (x) {
                            case "1.1":
                                System.out.println("Enter the roll no. ");
                                int rollno = sin.nextInt();
                                System.out.println("Enter the name you want to update with");
                                String name = sin.next();
                                String sql1 = "update management set Name = '" + name + "'where Roll_no =" + rollno;
                                st1.executeUpdate(sql1);

                                break;

                            case "1.2":
                                System.out.println("Enter roll no.");
                                int rollno1 = sin.nextInt();
                                System.out.println("Enter the mentor name you want to update with");
                                String mentor = sin.next();
                                String sql2 = "update management set Mentor ='" + mentor + "'where Roll_no ="
                                        + rollno1;
                                st1.executeUpdate(sql2);
                                break;

                            case "1.3":
                                System.out.println("Enter roll no.");
                                int rollno2 = sin.nextInt();
                                System.out.println("Enter new Div");
                                String div = sin.next();
                                String sql3 = "update management set Div ='" + div + "'Where Roll_no =" + rollno2;
                                st1.executeUpdate(sql3);
                                break;
                            case "1.4":
                                System.out.println("Enter roll no.");
                                int rollno3 = sin.nextInt();
                                System.out.println("Enter new branch");
                                String branch = sin.next();
                                String sql4 = "update management set Branch ='" + branch + "'Where Roll_no ="
                                        + rollno3;
                                st1.executeUpdate(sql4);
                                break;

                            case "1.5":
                                System.out.println("Enter the name/div/branch ");
                                String name1 = sin.next();
                                String div1 = sin.next();
                                String branch1 = sin.next();
                                System.out.println("Enter updated roll no.");
                                int roll_no1 = sin.nextInt();
                                String sql5 = "update management set Roll_no ='" + roll_no1 + "'where Name ='"
                                        + name1
                                        + "'and Div =" + div1 + "'and Branch =" + branch1;
                                st1.executeUpdate(sql5);
                                break;

                            case "1.6":
                                System.out.println("Enter roll no.");
                                int rollno4 = sin.nextInt();
                                System.out.println("Enter updated Java-II marks ");
                                int javamarks = sin.nextInt();
                                String sql6 = "update management set JAVA-II ='" + javamarks + "'where Roll_no ="
                                        + rollno4;
                                st1.executeUpdate(sql6);
                                break;

                            case "1.7":
                                System.out.println("Enter roll no.");
                                int rollno5 = sin.nextInt();
                                System.out.println("Enter updated Maths-II marks");
                                int mathsmarks = sin.nextInt();
                                String sql7 = "update management set Maths-II ='" + mathsmarks + "'where Roll_no ="
                                        + rollno5;
                                st1.executeUpdate(sql7);

                                break;

                            case "1.8":
                                System.out.println("Enter roll no.");
                                int rollno6 = sin.nextInt();
                                System.out.println("Enter updated FEE marks ");
                                int feemarks = sin.nextInt();
                                String sql8 = "update management set FEE ='" + feemarks + "'where Roll_no ="
                                        + rollno6;
                                st1.executeUpdate(sql8);
                                break;

                            case "1.9":
                                System.out.println("Enter roll no.");
                                int rollno7 = sin.nextInt();
                                System.out.println("Enter updated DS marks");
                                int dsmarks = sin.nextInt();
                                String sql9 = "update management set DS ='" + dsmarks + "'where Roll_no ="
                                        + rollno7;
                                st1.executeUpdate(sql9);

                            case "1.10":
                                System.out.println("Enter roll no.");
                                int rollno8 = sin.nextInt();
                                System.out.println("Enter updated DBMS marks");
                                int dbmsmarks = sin.nextInt();
                                String sql10 = "update management set DBMS ='" + dbmsmarks + "'where Roll_no ="
                                        + rollno8;
                                st1.executeUpdate(sql10);
                                break;

                            default:
                                System.out.println("Changes had been made in the database!!!");
                                break;

                        }
                        break;

                    case 2:
                        System.out.println("Insert student info");
                        System.out.println("Enter number of students ");
                        int a = sin.nextInt();
                        sin.nextLine();
                        for (int i = 1; i <= a; i++) {
                            System.out.println("Enter full name of the student");
                            String name = sin.nextLine();
                            System.out.println("Enter name of the mentor");
                            String mentor = sin.next();
                            System.out.println("Enter roll no.");
                            int rollno = sin.nextInt();
                            System.out.println("Enter Div");
                            String div = sin.next();
                            System.out.println("Enter branch");
                            String branch1 = sin.next();
                            System.out.println("Enter marks of Java-II");
                            int java = sin.nextInt();
                            System.out.println("Enter marks of Maths-II");
                            int mathsmarks = sin.nextInt();
                            System.out.println("Enter marks of FEE");
                            int feemarks = sin.nextInt();
                            System.out.println("Enter marks of DS");
                            int dsmarks = sin.nextInt();
                            System.out.println("Enter marks of DBMS");
                            int dbmsmarks = sin.nextInt();

                            String sql1 = "insert into management values('"
                                    + name + "', '" + mentor + "', '" + rollno + "' ,'" + div + "', '"+ branch1+"', '"  + java 
                                    + "', '"
                                    + mathsmarks + "' , '" + feemarks + "', '" + dsmarks + "', '" + dbmsmarks
                                    + "')";
                                    // System.out.println(sql1);
                            st1.executeUpdate(sql1);
                        }

                }
            }
            else
            {
                System.out.println("Invalid credentials!!");
            }

                break;
            case 3:
            Data d = new Data();
            System.out.println("Enter admin id");
            String admin = sin.next();
            System.out.println("Enter admin password");
            String pass = sin.next();
            // String  x3 = d.getAdminPassword();
            // String x4 = d.getAdminUserID();
            d.admin();
            boolean login = d.checkAdmin(admin, pass);
                System.out.println("  " + String.format("%60s", "").replace(" ", "-"));

                System.out.println("  |" + String.format("%3s", "") + "LOGIN AS :" + String.format("%46s", "|"));
                System.out.println("  |" + String.format("%58s", "") + "|");
                System.out.println("  |" + String.format("%12s", "") + "1. --> FACULTY" + String.format("%33s", "|"));
                System.out.println("  |" + String.format("%58s", "") + "|");
                System.out.println("  |" + String.format("%12s", "") + "2. --> STUDENT" + String.format("%33s", "|"));
                System.out.println("  |" + String.format("%58s", "") + "|");
                System.out.println("  " + String.format("%60s", "").replace(" ", "-"));
                if(login)
                {

                int choice1 = sin.nextInt();
                Statement st2 = con.createStatement();
                switch (choice1) {

                    case 1:
                        System.out.println("---Select the task to perform---");
                        System.out.println("1. To modify columns");
                        System.out.println("2. To drop  specific columns");
                        System.out.println("3. Insert faculty info");
                        System.out.println("4. Delete ");

                        System.out.println("Enter your choice to perform task");
                        int ch = sin.nextInt();
                        switch (ch) {

                            case 1:
                                System.out
                                        .println(
                                                "To modify columns: Name/FAC_short_name/phone_no./Email_id/Subject_Full_Name");
                                System.out.println("1.1 Name");
                                System.out.println("1.2 FAC_short_name");
                                System.out.println("1.3 phone_no.");
                                System.out.println("1.4 Email_id");
                                System.out.println("1.5 Subject_Full_Name");

                                System.out.println("---Enter your choice to perform the change---");
                                System.out.println("---Select above given numbers only---");
                                System.out.println("---Faculty ID: 1 to 22");
                                String x = sin.next();
                                switch (x) {
                                    case "1.1":
                                        System.out.println("Enter Faculty ID ");
                                        int fid = sin.nextInt();
                                        System.out.println("Enter the name you want to update with");
                                        String name = sin.next();
                                        String sql1 = "update faculty set Name = '" + name + "'where Fid =" + fid;
                                        st2.executeUpdate(sql1);
                                        break;

                                    case "1.2":
                                        System.out.println("Enter Faculty ID ");
                                        int fid1 = sin.nextInt();
                                        System.out.println("Enter new short name");
                                        String short_name = sin.next();
                                        String sql2 = "update faculty set FAC_short_name ='" + short_name
                                                + "'where Fid ="
                                                + fid1;
                                        st2.executeUpdate(sql2);
                                        break;

                                    case "1.3":
                                        System.out.println("Enter Faculty ID");
                                        int fid2 = sin.nextInt();
                                        System.out.println("Enter new phone no.");
                                        String phone = sin.next();
                                        String sql3 = "update  faculty set phone_no. ='" + phone + "'where Fid ="
                                                + fid2;
                                        st2.executeUpdate(sql3);
                                        break;

                                    case "1.4":
                                        System.out.println("Enter Faculty ID");
                                        int fid3 = sin.nextInt();
                                        System.out.println("Enter new Email id");
                                        String email = sin.next();
                                        String sql4 = "update set Email_id ='" + email + "'where Fid =" + fid3;
                                        st2.executeUpdate(sql4);
                                        break;

                                    case "1.5":
                                        System.out.println("Enter Faculty ID");
                                        int fid4 = sin.nextInt();
                                        System.out.println("Enter new subject's full name");
                                        String subject = sin.next();
                                        String sql5 = "update set Subject_Full_Name ='" + subject + "'where Fid ="
                                                + fid4;
                                        st2.executeUpdate(sql5);
                                        break;

                                    default:
                                        System.out.println("Changes has been made in the database!!");
                                        break;

                                }

                            case 2:

                                System.out.println("To drop specific columns");
                                System.out.println("1.1 Name");
                                System.out.println("1.2 FAC_short_name");
                                System.out.println("1.3 phone_no.");
                                System.out.println("1.4 Email_id");
                                System.out.println("1.5 Subject_Full_Name");
                                String x1 = sin.next();

                                switch (x1) {
                                    case "1.1":
                                        String sql1 = "alter table faculty drop column Name";
                                        st2.executeUpdate(sql1);
                                        break;

                                    case "1.2":
                                        String sql2 = "alter table faculty drop column FAC_short_name";
                                        st2.executeUpdate(sql2);
                                        break;

                                    case "1.3":
                                        String sql3 = "alter table faculty drop column phone_no.";
                                        st2.executeUpdate(sql3);
                                        break;

                                    case "1.4":
                                        String sql4 = "alter table faculty drop column Email_id";
                                        st2.executeUpdate(sql4);
                                        break;

                                    case "1.5":

                                        String sql5 = "alter table faculty drop column Subject_Full_Name";
                                        st2.executeUpdate(sql5);
                                        break;
                                    default:
                                        System.out.println("Changes has been made in the database!!");

                                }
                                break;

                            case 3:
                                System.out.println("To insert faculty details");
                                System.out.println("Enter number of faculty ");
                                int a = sin.nextInt();
                                for (int i = 1; i <= a; i++) {
                                    System.out.println("Enter full name of the Faculty");
                                    String name = sin.next();
                                    System.out.println("Enter short name of faculty");
                                    String short_name = sin.next();
                                    System.out.println("Enter phone no.");
                                    String phone = sin.next();
                                    while (true) {
                                        if (phone.length() == 10
                                                && (phone.charAt(0) == '9' || phone.charAt(0) == '8'
                                                        || phone.charAt(0) == '7')) {
                                            break;
                                        } else {
                                            phone = null;
                                            System.out.println(
                                                    "Invalid Phone Number.\nPlease enter a valid phone number.");
                                            phone = sin.next();
                                        }
                                    }
                                    System.out.println("Enter email id");
                                    String email = sin.next();
                                    System.out.println("Enter subject full name");
                                    String subject = sin.next();
                                    System.out.println("Enter User ID for faculty");
                                    String user = sin.next();
                                    System.out.println("Enter password for faculty");
                                    String pass1 = sin.next();

                                    String sql1 = "insert into  faculty( `Name`, `FAC_short_name`, `phone_no.`, `Email_id`, `Subject_Full_Name`, `User_ID`, `Password`) values('"
                                            + name + "', '" + short_name + "', '" + phone + "','" + email + "', '"
                                            + subject + "','" + user + "','" + pass1 + "')";
                                    System.out.println(sql1);
                                    st2.executeUpdate(sql1);

                                }
                            case 4:
                                System.out.println("To delete table ");
                                String sql2 = "drop table faculty";
                                st2.executeUpdate(sql2);
                                break;
                            default:
                                System.out.println("Changes has been made!!");
                                break;

                        }
                        break;

                    case 2:
                        System.out.println("---Student---");
                        System.out.println("1. To get student details");
                        System.out.println("2. To modify student details");
                        System.out.println("3. To delete student details");
                        System.out.println("4. To insert student details");
                        System.out.println("5. To delete table");
                        System.out.println("Enter your choice from above");
                        int a1 = sin.nextInt();
                        switch (a1) {
                            case 1:
                                System.out.println("Enter your roll number :");
                                int roll_no1 = sin.nextInt();
                                String sql1 = "Select * from management where Roll_no =" + roll_no1;
                                ResultSet rst1 = st.executeQuery(sql1);
                                if (rst1.next()) {
                                    String name = rst1.getString(1);
                                    System.out.println("Student name :" + name);
                                    String mentor = rst1.getString(2);
                                    System.out.println("Mentor :" + mentor);
                                    String div = rst1.getString(3);
                                    System.out.println("Div :" + " " + div);
                                    int rollno = rst1.getInt(4);
                                    System.out.println("Roll no.:" + rollno);
                                    String branch = rst1.getString(5);
                                    System.out.println("Branch" + " " + branch);
                                    int java = rst1.getInt(6);
                                    System.out.println("JAVA-II =" + " " + java);
                                    int maths = rst1.getInt(7);
                                    System.out.println("Maths-II =" + " " + maths);
                                    int fee = rst1.getInt(8);
                                    System.out.println("FEE =" + " " + fee);
                                    int ds = rst1.getInt(9);
                                    System.out.println("DS =" + " " + ds);
                                    int dbms = rst1.getInt(10);
                                    System.out.println("DBMS" + " " + dbms);

                                }
                                break;

                            case 2:
                                System.out.println(
                                        "To change column data : Name/Mentor/Div/Rollno/Java-II/Maths-II/FEE/DS/DBMS");
                                System.out.println("1.1 Name");
                                System.out.println("1.2 Mentor");
                                System.out.println("1.3 Div");
                                System.out.println("1.4 Branch");
                                System.out.println("1.5 Rollno");
                                System.out.println("1.6 Java-II");
                                System.out.println("1.7 Maths-II");
                                System.out.println("1.8 FEE");
                                System.out.println("1.9 DS");
                                System.out.println("1.10 DBMS");

                                System.out.println("---Enter your choice to perform the change---");
                                System.out.println("---Select above given numbers only---");
                                String x = sin.next();
                                switch (x) {
                                    case "1.1":
                                        System.out.println("Enter the roll no. ");
                                        int rollno = sin.nextInt();
                                        System.out.println("Enter the name you want to update with");
                                        String name = sin.next();
                                        String sql2 = "update management set Name = '" + name + "'where Roll_no ="
                                                + rollno;
                                        st2.executeUpdate(sql2);

                                        break;

                                    case "1.2":
                                        System.out.println("Enter roll no.");
                                        int rollno1 = sin.nextInt();
                                        System.out.println("Enter the mentor name you want to update with");
                                        String mentor = sin.next();
                                        String sql3 = "update management set Mentor ='" + mentor + "'where Roll_no ="
                                                + rollno1;
                                        st2.executeUpdate(sql3);
                                        break;

                                    case "1.3":
                                        System.out.println("Enter roll no.");
                                        int rollno2 = sin.nextInt();
                                        System.out.println("Enter new Div");
                                        String div = sin.next();
                                        String sql4 = "update management set Div ='" + div + "'Where Roll_no ="
                                                + rollno2;
                                        st2.executeUpdate(sql4);
                                        break;
                                    case "1.4":
                                        System.out.println("Enter roll no.");
                                        int rollno3 = sin.nextInt();
                                        System.out.println("Enter new branch");
                                        String branch = sin.next();
                                        String sql5 = "update management set Branch ='" + branch + "'Where Roll_no ="
                                                + rollno3;
                                        st2.executeUpdate(sql5);
                                        break;

                                    case "1.5":
                                        System.out.println("Enter the name/div/branch ");
                                        String name1 = sin.next();
                                        String div1 = sin.next();
                                        String branch1 = sin.next();
                                        System.out.println("Enter updated roll no.");
                                        int roll_no2 = sin.nextInt();
                                        String sql6 = "update management set Roll_no ='" + roll_no2 + "'where Name ="
                                                + name1
                                                + "and Div ='" + div1 + "'and Branch =" + branch1;
                                        st2.executeUpdate(sql6);
                                        break;

                                    case "1.6":
                                        System.out.println("Enter roll no.");
                                        int rollno4 = sin.nextInt();
                                        System.out.println("Enter updated Java-II marks ");
                                        int javamarks = sin.nextInt();
                                        String sql7 = "update management set JAVA-II ='" + javamarks
                                                + "'where Roll_no ="
                                                + rollno4;
                                        st2.executeUpdate(sql7);
                                        break;

                                    case "1.7":
                                        System.out.println("Enter roll no.");
                                        int rollno5 = sin.nextInt();
                                        System.out.println("Enter updated Maths-II marks");
                                        int mathsmarks = sin.nextInt();
                                        String sql8 = "update management set Maths-II ='" + mathsmarks
                                                + "'where Roll_no ="
                                                + rollno5;
                                        st2.executeUpdate(sql8);

                                        break;

                                    case "1.8":
                                        System.out.println("Enter roll no.");
                                        int rollno6 = sin.nextInt();
                                        System.out.println("Enter updated FEE marks ");
                                        int feemarks = sin.nextInt();
                                        String sql9 = "update management set FEE ='" + feemarks + "'where Roll_no ="
                                                + rollno6;
                                        st2.executeUpdate(sql9);
                                        break;

                                    case "1.9":
                                        System.out.println("Enter roll no.");
                                        int rollno7 = sin.nextInt();
                                        System.out.println("Enter updated DS marks");
                                        int dsmarks = sin.nextInt();
                                        String sql10 = "update management set DS ='" + dsmarks + "'where Roll_no ="
                                                + rollno7;
                                        st2.executeUpdate(sql10);

                                    case "1.10":
                                        System.out.println("Enter roll no.");
                                        int rollno8 = sin.nextInt();
                                        System.out.println("Enter updated DBMS marks");
                                        int dbmsmarks = sin.nextInt();
                                        String sql11 = "update management set DBMS ='" + dbmsmarks + "'where Roll_no ="
                                                + rollno8;
                                        st2.executeUpdate(sql11);
                                        break;

                                    default:
                                        System.out.println("Changes had been made in the database!!!");

                                        break;

                                }
                                break;
                            case 3:
                                System.out.println("Delete data of the student");
                                System.out.println("1. Delete Column");
                                System.out.println("2. Delete specific row");
                                System.out.println("Enter your choice to perform above tasks");
                                int b = sin.nextInt();
                                switch (b) {
                                    case 1:
                                        System.out.println(
                                                "To delete column: Name/Mentor/Div/Rollno/Java-II/Maths-II/FEE/DS/DBMS");
                                        System.out.println("1.1 Name");
                                        System.out.println("1.2 Mentor");
                                        System.out.println("1.3 Div");
                                        System.out.println("1.4 Branch");
                                        System.out.println("1.5 Rollno");
                                        System.out.println("1.6 Java-II");
                                        System.out.println("1.7 Maths-II");
                                        System.out.println("1.8 FEE");
                                        System.out.println("1.9 DS");
                                        System.out.println("1.10 DBMS");
                                        String x1 = sin.next();
                                        switch (x1) {
                                            case "1.1":
                                                String sql2 = "alter table management drop column Name";
                                                st2.executeUpdate(sql2);

                                                break;

                                            case "1.2":
                                                String sql3 = "alter table management drop column Mentor";
                                                st2.executeUpdate(sql3);
                                                break;

                                            case "1.3":

                                                String sql4 = "alter table management drop column Div";
                                                st2.executeUpdate(sql4);
                                                break;

                                            case "1.4":

                                                String sql5 = "alter table management drop column Branch";
                                                st2.executeUpdate(sql5);
                                                break;

                                            case "1.5":

                                                String sql6 = "alter table management drop column Roll_no";
                                                st2.executeUpdate(sql6);
                                                break;

                                            case "1.6":

                                                String sql7 = "alter table management drop column Java-II";
                                                st2.executeUpdate(sql7);

                                                break;

                                            case "1.7":

                                                String sql8 = "alter table management drop column Maths-II";
                                                st2.executeUpdate(sql8);
                                                break;

                                            case "1.8":

                                                String sql9 = "alter table management drop column FEE";
                                                st2.executeUpdate(sql9);

                                            case "1.9":

                                                String sql10 = "alter table management drop column DS";
                                                st2.executeUpdate(sql10);
                                                break;

                                            case "1.10":
                                                String sql11 = "alter table management drop column DBMS";
                                                st2.executeUpdate(sql11);
                                                break;
                                        }
                                        break;
                                    case 2:
                                        System.out.println("To delete specific row using roll no");
                                        System.out.println("Enter roll no");
                                        int no = sin.nextInt();
                                        String sql12 = "Delete from management where Roll_no =" + no;
                                        st2.executeUpdate(sql12);
                                        break;
                                }
                                break;
                            case 4:
                                System.out.println("Insert student details");
                                System.out.println("Enter number of students ");
                                int a = sin.nextInt();
                                sin.nextLine();
                                Statement st3 = con.createStatement();
                                for (int i = 1; i <= a; i++) {
                                    System.out.println("Enter full name of the student");
                                    String name = sin.nextLine();
                                    System.out.println("Enter name of the mentor");
                                    String mentor = sin.next();
                                    sin.nextLine();
                                    System.out.println("Enter roll no.");
                                    int rollno = sin.nextInt();
                                    System.out.println("Enter Div");
                                    String div = sin.next();
                                    System.out.println("Enter branch");
                                    String branch = sin.next();
                                    System.out.println("Enter marks of Java-II");
                                    int java = sin.nextInt();
                                    System.out.println("Enter marks of Maths-II");
                                    int mathsmarks = sin.nextInt();
                                    System.out.println("Enter marks of FEE");
                                    int feemarks = sin.nextInt();
                                    System.out.println("Enter marks of DS");
                                    int dsmarks = sin.nextInt();
                                    System.out.println("Enter marks of DBMS");
                                    int dbmsmarks = sin.nextInt();

                                    String sql13 = "INSERT INTO management VALUES ('" + name + "', '" + mentor + "', "
                                            + rollno + ", '" + div + "', '" + branch + "', " +
                                            java + ", " + mathsmarks + ", " + feemarks + ", " + dsmarks + ", "
                                            + dbmsmarks + ")";
                                    System.out.println(sql13);
                                    st2.executeUpdate(sql13);

                                }
                                break;

                            case 5:
                                System.out.println("---To delete Whole table---");
                                String sql12 = "drop table faculty";
                                st2.executeUpdate(sql12);
                                System.out.println("Table deleted!!");
                                break;

                            default:
                                System.out.println("Changes has been made in the database!!");
                                break;
                            }

                            }
                        }
                        else
                        {
                            System.out.println("Invalid Credentials!!");
                        }

                        }
                
        }
    

    public int checkFacultyDetails(String id, String password, Statement st) {

        ResultSet rst = null;
        try {
            rst = st.executeQuery("SELECT User_ID, Password FROM faculty");
        } catch (Exception e) {
            System.out.println("Exception in checking faculty details");
        }
        try {
            while (rst.next()) {
                String tempid = "", tempPass = "";
                tempid = rst.getString(1);
                tempPass = rst.getString(2);
                if (tempid.equals(id)) {
                    if (tempPass.equals(password)) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("gfgg");
        }
        return 2;

    }

}
class Data{

    private String adminUserID ;
    private String adminPassword;
    private Statement st;

    Data()  {
        setStatment();
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public String getAdminUserID() {
        return adminUserID;
    }

    public Statement getSt() {
        return st;
    }

    void setStatment()  {
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "");
            st = cn.createStatement();
        }catch( Exception e ){
            System.out.println(e);
        }
    }
    void admin()
    {
        adminUserID = "Admin";
        adminPassword = "1234";
    }


    boolean success = false;
    boolean checkAdmin(String id, String pass)
{
    if(id.equals(adminUserID) && pass.equals(adminPassword)){
       success = true;
    }
    return success;
}
}
