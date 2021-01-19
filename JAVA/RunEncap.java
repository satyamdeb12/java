class DefEncap{
	private int age;
	private String name;
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int newAge)
	{
		age = newAge;
	}
	public void setName(String newName)
	{
		name = newName;
	}
}
public class RunEncap{
	public static void main(String[] args)
	{
		DefEncap obj = new DefEncap();
		obj.setAge(23);
		obj.setName("Satyam Deb");
		System.out.print("Name: " + obj.getName() +"\nAge: " + obj.getAge());
	}
}