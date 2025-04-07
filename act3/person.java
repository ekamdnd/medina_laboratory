package act3;
public class person {
   private String name;
   private int id;

   // Constructor
   public person(String name, int id) {
       this.name = name;
       this.id = id;
   }
   public String getName() {
       return this.name;
   }
   public int getId() {
       return this.id;
   }
   //Display method
   public void displayinfo() {
       System.out.println("Name: " + this.name);
       System.out.println("ID: " + this.id);
   }
   // SchoolTest Main Method
   public static void main (String[] args){
       // Create instances of subclasses
       Student student = new Student("anj", 202490867, "1st Year");
       Teacher teacher = new Teacher("ernesto", 202443256, "Object Oriented Programming");
       Staff staff = new Staff("doms", 2024231309, "Guidance Office");
  
       // Display information
       System.out.println("Student Information:");
       student.displayinfo();
       System.out.println("\nTeacher Information:");
       teacher.displayinfo();
       System.out.println("\nStaff Information:");
       staff.displayinfo();
   }
}

