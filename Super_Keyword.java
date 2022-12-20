class User{
    int Id;
    String name;
    String address;
    User(int Id,String name,String address){
        this.Id=Id;
        this.name = name;
        this.address = address;
    }

//    OR

//    public void setDta(int Id,String name,String address){
//        this.Id=Id;
//        this.name = name;
//        this.address = address;
//    }

    public void display(){
        System.out.println("Id "+Id+" Name "+name+" Address "+address);
    }
}

class Employee extends User{
    int salary;
    String designation;
    Employee(int Id,String name,String address,int salary,String designation){
        super(Id,name,address);
        this.designation=designation;
        this.salary = salary;
    }

    public void getData() {
        super.display();
        System.out.println("Salary"+salary);
        System.out.println("Designation"+designation);
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        Employee emp1 = new Employee(4,"Sapndan","Salkia Howrah",25000,"Web Developer");
        emp1.getData();
    }
}
