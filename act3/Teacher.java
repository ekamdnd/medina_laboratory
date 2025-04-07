package act3;
public class Teacher extends person {
    String subject;
 
//call the constructor of the superclass (Person)
    Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }
 
   
}