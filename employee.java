public class employee{

    private String name;
    private int age;
    protected double salary;

   public employee(String name,double salary2, double salary){
    this.name = name;
    this.age =  salary2;
    this.salary = salary;    
    }
    public employee(String name2, double salary2, int age2) {
    //TODO Auto-generated constructor stub
}
    public String getName(){
        return name;
    }
    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(){
        this.salary = this.salary * 1.2;
    }


    public static void main(String[]args) {
        employee emp = new employee("abdhul", 23, 2000);

        System.out.println("Name:" + emp.getName());
        System.out.println("Age:" + emp.getAge());
        System.out.println("Salary:" + emp.getSalary());

        emp.raiseSalary();

        System.out.println("New Salary" + emp.getSalary());
    }



}
