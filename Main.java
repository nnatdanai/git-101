public class Main {
    public static void main(String [] args){
        Employee e1 = new Employee(); // Create Object
        e1.setID("1");
        e1.setName("Fuu");
        e1.setSalary(30000.00);
        //e1.displayEmployee();
        System.out.println(""+e1.getName());
        
        Employee e2 = new Employee(); // Create Object
        e2.setID("2");
        e2.setName("Hong");
        e2.setSalary(70000.00);
        System.out.println(""+e2.getName());



    }
}
