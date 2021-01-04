class Student{
 	int NIM;
 	String name;
 	static String college ="Unsyiah";

 	static void change(){
 		college = "USK";
 	}

 	Student(int r,String n){
 		NIM = r;
 		name = n;
 	}
 
 	void display (){
 		System.out.println(NIM+" "+name+" "+college); 
 	}
 
 	public static void main(String args[]){
 		Student s1 = new Student(111,"Karen");
 		Student s2 = new Student(222,"Arya");
 		s1.display();
 		s2.display();

 		Student.change();
 		s1.display();
 		s2.display();
 	}
} 

/**
 * line 2-17 = Deklarasi variable dan method
 * line 19 = method main
 *  nim, nama dan kampus dari siswanya dimana pada method void display 
akan di print namun setelah itu terdapat student.change, yang maknanya 
ada data yang di change pada siswa pada method static void change 
terdapat deklarasi baru utnuk collage nya, di line 25-27
 * 
 */