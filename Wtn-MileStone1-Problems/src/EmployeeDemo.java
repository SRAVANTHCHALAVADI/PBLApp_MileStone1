class Employee{

int id;
String name;
int salary;

void setId(int no){
id=no;
}

void setName(String n){
name=n;
}

void setSalary(int s){
salary=s;
}

void getEmpDetails(){
System.out.println(name+"'s salary is "+salary+" with id "+id);
}

}
class EmployeeDemo{
public static void main(String [] args){
Employee emp=new Employee();
emp.setId(30190);
emp.setName("Sravanth");
emp.setSalary(50000);
emp.getEmpDetails();

}
}