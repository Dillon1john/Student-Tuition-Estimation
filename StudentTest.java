package StudentObject;
import java.util.Scanner;
import java.io.*;
public class StudentTest {
    public static void main(String [] args) throws IOException {
        //String fname;
        //String lname;
        //String sTime;

        Scanner in = new Scanner(System.in);

        Student stu = new Student();

        //Student temp = new Student();


        File SampleRecord = new File("src/StudentObject/sampRecord");
        Scanner sr = new Scanner(SampleRecord);

        PrintWriter Record = new PrintWriter("RecordStu.txt");



        while (sr.hasNext()){
            Record.println(sr.next());
        }

                System.out.println("Enter first name:");
       // fname= in.next();
        stu.setFirstName(in.next());
        System.out.println("Enter last name:");
        stu.setLastname(in.next());
        System.out.println("Enter your student ID #: ");
        stu.setID(in.nextInt());
        System.out.println("Enter amount of credits:");
        stu.setCredit(in.nextInt());
        System.out.println("Enter 'R' if you are a NYC resident:" +
                "\t Enter 'N' if you are out of state resident: ");
        stu.setStatus(in.next().charAt(0));
        if (stu.isRes() == true){
            System.out.println("You are a resident of NYC.\t Are you a full time or part time student?\nEnter 'full' or 'part' to indicate: ");
            stu.StudentTime= in.next();
            /*if (stu.StudentTime=="full"){
                stu.Tuition = 6930;
            }
            if (stu.StudentTime=="part"){
                stu.Tuition=(305* stu.credit);
            }*/
        }
        if (stu.nonRes() == true) {
            System.out.println("You are not a resident of NYC.\t Are you a full time or part time student?\nEnter 'full' or 'part' to indicate: ");
            stu.StudentTime = in.next();
            /*if (stu.StudentTime =="full") {
                stu.Tuition = (620 * stu.credit);
            }
            else if(stu.StudentTime=="part"){
                stu.Tuition = (620* stu.credit);
            }*/

        }


       /* System.out.println("Are you a full-time student or part-time? Enter 'full' or 'part' to indicate");
        stu.StudentTime= in.next();
*/

        System.out.println("Your name is: "+stu.getFirstName()+" "+stu.getLastname()+"\tYour amount of credits is: "+stu.getCredit()+"\t Your student ID # is: "+stu.getID()+
                "\n Your residency status is: "+ stu.getStatus()+"\t The amount of tuition due is: "+stu.calcTuition());




    }
}
