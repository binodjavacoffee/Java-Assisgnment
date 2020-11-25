package asssignment_day_22;

public class PersonTest {

	public static void main(String[] args) {
		Person obj= new Person();
		obj.setName("Prithivi");
		obj.setNationality("Nepali");
		obj.setAddress("Kathmandu, Nepal");
		obj.setPhone(9841123287l);
		System.out.println("======================================");
		System.out.println("\tName: " +obj.getName());
		System.out.println("\tNationality: "+obj.getNationality());
		System.out.println("\tAddress: "+obj.getAddress());
		System.out.println("\tPhone No: "+obj.getPhone());
		System.out.println("=======================================");
		
		Person obj1= new Person();
		obj1.setName("Narayan");
		obj1.setNationality("Nepali");
		obj1.setAddress("Kathmandu, Nepal");
		obj1.setPhone(9841135287l);
		System.out.println("========================================");
		System.out.println("\tName: " +obj1.getName());
		System.out.println("\tNationality: "+obj1.getNationality());
		System.out.println("\tAddress: "+obj1.getAddress());
		System.out.println("\tPhone No: "+obj1.getPhone());
		System.out.println("========================================");
		
	}

}
