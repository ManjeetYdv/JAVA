import java.sql.*;
import java.util.Scanner;

class Student{
    private int Sid;
    private String Sname;
    private String Course;

    public Student(int Sid, String Sname , String Course){
        this.Sid = Sid;
        this.Sname = Sname;
        this.Course = Course;
    }

    public int getId(){
        return Sid;
    }
    public String getName(){
        return Sname;
    }
    public String getCourse(){
        return Course;
    }
}

class Manage_Record{

    String url="jdbc:mysql://localhost:3306/Students";
    String username="manjeet";
    String password ="haha1100";
    //add student
    public void addStudent(Student stud) throws SQLException {

        int id =stud.getId();
        String name = stud.getName();
        String course = stud.getCourse();

        if(isPresent(id)) {
            System.out.println("Student with id "+id+ " already present" );
            return;
        }

        String query = "insert into record values(? ,?, ?)";
        Connection con = DriverManager.getConnection(url , username , password);
        PreparedStatement st = con.prepareStatement(query);

        st.setInt(1 , id);
        st.setString(2,name);
        st.setString(3, course);

        st.executeUpdate();

        st.close();
        con.close();

    }

    //delete student
    public void deleteStudent(int roll) throws SQLException {
        if(!isPresent(roll)) {
            System.out.println("No student with id " +roll);
            return;
        }
         String query = "delete from record where sid =?";

         Connection con = DriverManager.getConnection(url , username , password);
         PreparedStatement st = con.prepareStatement(query);
         st.setInt(1, roll);
         st.executeUpdate();
         st.close();
         con.close();;

    }
    //show all students
    public void printAllStudent() throws SQLException {
        String query= "select * from record";
        Connection con = DriverManager.getConnection(url , username , password);
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);

        while(res.next()){
            System.out.print("ID : "+res.getInt(1)+" || Name : "+res.getString(2)+" || Course : "+res.getString(3)+"\n");
        }

    }
    //show details with given roll number
    public void showDetails(int roll) throws SQLException {
        if(!isPresent(roll)) {
            System.out.println("No student with id " +roll);
            return;
        }
        String query= "select * from record where sid ="+roll;
        Connection con = DriverManager.getConnection(url , username , password);
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);
        res.next();
        System.out.print("ID : "+res.getInt(1)+" || Name : "+res.getString(2)+" || Course : "+res.getString(3)+"\n");
    }

    private boolean isPresent(int roll) throws SQLException {
        Connection con = DriverManager.getConnection(url , username , password);
        String query = "select sid from record";
        Statement st  = con.createStatement();
        ResultSet res = st.executeQuery(query);

        while(res.next()){
            if(res.getInt(1)==roll) return true;
        }
        return false;
    }


}
public class Student_management {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Manage_Record obj = new Manage_Record();

        int choice;
        int id;
        String name;
        String course;
        Student stud;
        Character repeat = 'Y';
        System.out.println("1.Add a new student\n2.Show details of all Students\n3.Show details of Student with given ID\n4.Delete Student Record");


        while (repeat == 'Y' || repeat == 'y') {
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter id : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name : ");
                    name = sc.nextLine();
                    System.out.print("Enter Course : ");
                    course = sc.nextLine();
                    stud = new Student(id, name, course);
                    obj.addStudent(stud);
                    break;

                case 2:
                    System.out.println("Student Record : ");
                    obj.printAllStudent();
                    break;

                case 3:
                    System.out.print("Enter roll number : ");
                    id = sc.nextInt();
                    obj.showDetails(id);
                    break;

                case 4:
                    System.out.print("Enter roll number to be deleted : ");
                    id = sc.nextInt();
                    obj.deleteStudent(id);
                    break;

                default:
                    System.out.println("Wrong choice !");
            }

            System.out.println("\nDo you wish to continue (Y/y for yes , any other character for no) ");
            repeat = sc.next().charAt(0);
        }
    }


}
