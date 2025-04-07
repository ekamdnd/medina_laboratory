package act3;
public class Student extends person {
    String gradeLevel;

    public Student(String name, int id, String gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;   
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
@Override
 public void displayinfo() {
    System.out.println("Grade Level: " + gradeLevel);
}


    
    
}
