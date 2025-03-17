package Encapsulation;
class student
{
private	int id;
private	String name;
private	String email;
private	String password;

public void setid(int a) {
	this.id=a;
}
public int getId() {
	return id;
}
public String getname(String name) {
	return name;
}
public void setname(String name) {
	this.name=name;
}
public void setemail(String e) {
	if(e.contains("@")) {
		this.email=e;
	}
	else {
		System.out.println("email not  access");
	}
	public String getemail() {
		return this.email;
		}
			
}
	
	
}



