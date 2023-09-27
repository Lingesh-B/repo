/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: 
 * Due: 09/26/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Lingesh Babu
*/



// This class sets and displays the different objects using the constructors. 
public class PatientDriverApp 
{
	Patient p1 = new Patient();
	
// Main method 
	public static void main(String[] args) 
	{
		Patient p1 = new Patient(); 
		p1.setFirstName("Lingesh");
		p1.setMiddleName("Waran"); 
		p1.setLastName("Babu");
		p1.setAddress("1234 Travis Ave");
		p1.setCity("Germantown");
		p1.setState("MD");
		p1.setZip("20879"); 
		p1.setEmergencyName("Abi Babu");
		p1.setEmergencyPhone("240-840-0992");
		displayPatient(p1); 
		
		Procedure pro = new Procedure(); 
		pro.setProcedureName("Brain Surgery");
		pro.setProcedureDate("10/12/2002");
		pro.setPractitionerName("Kevin");
		pro.setProcedureCharges(3000);
		displayProcedure(pro); 
		
		Procedure pro2 = new Procedure(); 
		pro2.setProcedureName("Heart Surgery");
		pro2.setProcedureDate("11/12/2022");
		pro2.setPractitionerName("Ryan");
		pro2.setProcedureCharges(4000);
		displayProcedure(pro2);
		
		Procedure pro3 = new Procedure(); 
		pro3.setProcedureName("Knee Surgery");
		pro3.setProcedureDate("08/01/2002");
		pro3.setPractitionerName("Bernat");
		pro3.setProcedureCharges(12000);
		displayProcedure(pro3);
		calculateTotalCharges(pro, pro2, pro3); 
		
		System.out.println("Student Name: Lingesh Babu");
		System.out.println("MC#: M21095870");
		System.out.println("Due Date: 09/26/2023");
	}
// Displays patient info
	public static void displayPatient(Patient p)
	{
		Patient p1 = p; 
		System.out.println(p);
	}
// Displays procedure info
	public static void displayProcedure(Procedure p)
	{
		Procedure pro = p; 
		System.out.println(p);
		
	}
// Calculates total charges for procedures
	public static void calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3)
	{
		double total = p1.getProcedureCharges() + p2.getProcedureCharges() + p3.getProcedureCharges(); 
		System.out.println("Total Charges: $" + total + "\n");
	}
	
}


