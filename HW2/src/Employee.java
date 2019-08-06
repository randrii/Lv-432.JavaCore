public class Employee {
    private String name;
    private int rate;
    private int hours;
    static double totalSum = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        totalSum = totalSum- getSalary()-getBonuses();

        this.rate = rate;
        totalSum = totalSum+ getSalary()+getBonuses();

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalSum = totalSum- getSalary()-getBonuses();

        this.hours = hours;
        totalSum = totalSum+ getSalary()+getBonuses();

    }

    public Employee(){}

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum+ getSalary()+getBonuses();

    }

    int getSalary(){
        return rate *hours;
    }

    void changeRate(int rate){
        totalSum = totalSum -(getSalary()+getBonuses());
        this.rate = rate;
        totalSum = totalSum +(getSalary()+getBonuses());
    }

    double getBonuses(){
        return this.getSalary()*0.1;
    }

    @Override
    public String toString() {
//        totalSum = totalSum+ getSalary()+getBonuses();

        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonuses=" + getBonuses() +
                ", summary=" + (getSalary()+getBonuses()) +
                '}';
    }
}
