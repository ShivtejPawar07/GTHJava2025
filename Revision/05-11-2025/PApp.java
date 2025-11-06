/*Q4. Write program to Create class name as PersonalInfo with parameterized constructor
PersonalInfo(String name, String middlename, String lastname) and you have to create class name
 as ProfessionalInfo with parameterized constructor like as ProfessionalInfo(int id,String des,
 int salary,String skillset) and you have to inherit PersonalInfo class in ProfessionalInfo and 
 pass parameter from ProfessionalInfo class to PersonalInfo using super() constructor and you have 
 to define void show() method in ProfessionalInfo and you have to show the all data in show() method.
*/
class PersonalInfo{
	String fn;
	String mn;
	String ln;
	
	PersonalInfo(String name, String middlename, String lastname){
		fn=name;
		mn=middlename;
		ln=lastname;
	}
	

}
class ProfessionalInfo extends PersonalInfo{
	int id;
	String des;
	int sal;
	String set;
	  ProfessionalInfo(String name, String middlename, String lastname, int id, String des, int salary, String skillset) {
        super(name, middlename, lastname); 
        this.id = id;
        this.des = des;
        this.sal = salary;
        this.set = skillset;
    }
	void show(){
		System.out.println("Fname="+fn);
		System.out.println("Mname="+mn);
		System.out.println("Lname="+ln);
		System.out.println("id="+id);
		System.out.println("des="+des);
		System.out.println("salary="+sal);
		System.out.println("set="+set);
		
	}
}
class PApp{
	public static void main(String x[]){
		  ProfessionalInfo p = new ProfessionalInfo("Shivtej", "Dipak", "Pawar", 101, "Software Engineer", 50000, "Java, MySQL");
        p.show();
	}
}