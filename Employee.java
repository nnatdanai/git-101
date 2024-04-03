public class Employee {
    //Attribute
    private String id;
    private String name;
    private Double salary;

    //mathod
    public void setID(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }

    public void displayEmployee(){
        System.out.println("ID = " + this.id);
        System.out.println("name = " + this.name);
        System.out.println("salary = " + this.salary);
    }

    public String getName(){
        return this.name;
    }
}
