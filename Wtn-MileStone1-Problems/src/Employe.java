
public class Employe {
private String name;
private int id;
private int salary;
public Employe(String name,int id,int salary) {
	this.name=name;
	this.id=id;
	this.salary=salary;
}
Employe e[]=new Employe[3];
public String highSal() {
e[0]=new Employe("Sravanth",190,20000);

e[1]=new Employe("Harsha",347,15000);

e[2]=new Employe("Sumanth",440,10000);

int max=0,index=0;
for(int i=0;i<3;i++) {
	if(e[i].salary>max) {
		max=e[i].salary;
		index=i;
	}
}
return e[index].name;
	
}

}
