package Task6;

public class Student {

	public String name;
	
	public Student()
	{
		this.name= "unknown";
	}
	
	public  Student(String str)
	{
		this.name=str;
	}
	
	

	

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}
