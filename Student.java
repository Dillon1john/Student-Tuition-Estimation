package StudentObject;

public class Student {
    String FirstName;
    String Lastname;
    int ID;
    char status;
    int credit;
    String StudentTime;
    int Tuition;
   Student (){  }

    Student (String fname ,String lname,int id, char stat, int c, String sTime) {
        fname= FirstName;
        lname=Lastname;
        id= ID;
        stat=status;
        c= credit;
        sTime= StudentTime;

    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public int getID() {
        return ID;
    }

    public int getCredit() {
        return credit;
    }

    public char getStatus() {
        return status;
    }

    public String getStudentTime() {
        return StudentTime;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setStudentTime(String StudentTime) {
        this.StudentTime = StudentTime;
    }



    boolean isRes() {
        if (status == 'R') {
            return true;
        } else {
            return false;
        }
    }
        boolean nonRes(){
            if (status == 'N') {
                return true;
            }
            else{
                return false;
            }


        }


          /*  if (StudentTime == "full"){
                Tuition = (620*credit);
            }
            if (StudentTime == "part"){
                 Tuition = (620*credit);
                 //return Tuition;
            }
            */




     int calcTuition() {
         if (isRes() == true) {
             if (StudentTime == "full") {
                 Tuition = 6930;
             }
             if (StudentTime == "part") {
                 Tuition = (305 * credit);
             }
         }
         if (nonRes() == true) {
             if (StudentTime == "full") {
                 Tuition = (620 * credit);
             } else if (StudentTime == "part") {
                 Tuition = (620 * credit);
             }







        /*StudentTime = null;
        int Tuition = 0;

         if (StudentTime == "full"){
             Tuition = 6930;
             // int creditTuition =
         }
         if (StudentTime == "part"){
             Tuition = (305*credit);
         }


         */
            // return Tuition;
         }

     return  Tuition;
     }
}
