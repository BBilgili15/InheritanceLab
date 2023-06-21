public abstract class Employee {

    private String name;
    private String ninumber;
    private Double salary;

    public Employee(String name, String ninumber, Double salary){
        this.name = name;
        this.ninumber = ninumber;
        this.salary = salary;
    }

    public void raiseSalary(Double percentage){
        double increase = this.salary * percentage;
        this.salary += increase;
    }

    public double payBonus(){
        return this.salary / 100 ;
    }

    public double getSalary(){
        return this.salary;
    }
}
