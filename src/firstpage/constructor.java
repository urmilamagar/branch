package firstpage;

public class constructor{
     	class Student5{
		int id;
		String name;
		int age;
	Student5(int i, String n){
		this.id =id;
		this.name = name;
	}
	Student5(int i, String n, int a){
		this.id =id;
		this.name =name;
		this.age =age;
	}
	void display() {System.out.println(id+""+name+""+age);}
	
	public static void main(String[] args) {
		Student5 s1 = new Student5(111, "karan");
		Student5 s2 = new Student5(222, "shyam", 25);
		s1.display();
		s2.display();
	}
}
		// TODO Auto-generated method stub

	}


