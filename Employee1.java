class Employee1 {
    String name;
    int salary;

    Employee1(String name,int salary){
        this.name=name;
        this.salary=salary;
    }

    void display(){
        System.out.println(name+" "+salary);
    }

    public static void main(String[] args){
        Employee1 e=new Employee1("Ritika",20000);
        e.display();
    }
}