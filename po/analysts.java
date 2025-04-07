public class analysts extends employee {

    public analysts(String name, double salary, int age) {
        super(name, salary, age);
    }
    public double getAnnualBonus() {
        return super.salary * .05;
    }


    }
    

