// This class stores all the attributes for the Procedure object 
public class Procedure 
{
	String procedureName, procedureDate, practitionerName;
	double procedureCharges; 

// No argument constructor 
	public Procedure()
	{
		procedureName = "N/A"; 
		procedureDate = "N/A";
		practitionerName = "N/A";
		procedureCharges = 0;
		
	}
	
	public Procedure(String name, String date)
	{
		procedureName = name; 
		procedureDate = date; 
	}

// Initializing all attributes
	public Procedure(String name, String date,String pName, double charges)
	{
		procedureName = name; 
		procedureDate = date;
		practitionerName = pName;
		procedureCharges = charges;
	}
	

//Accessors and Mutators
	public void setProcedureName(String name)
	{
		procedureName = name;
	}
	public String getProcedurename()
	{
		return procedureName; 
	}
	
	public void setProcedureDate(String date)
	{
		procedureDate = date; 
	}
	public String getProcedureDate()
	{
		return procedureDate;
	}
	
	public void setPractitionerName(String pName)
	{
		practitionerName = pName;
	}
	public String getPractitionerName()
	{
		return practitionerName; 
	}
	
	public void setProcedureCharges(double charges)
	{
		procedureCharges = charges; 
	}
	public double getProcedureCharges()
	{
		return procedureCharges;
	}
// Displayed to the console
	public String toString()
	{
		return "  	Procedure: " + procedureName + "\n" + "  	ProcedureDate=" + 
	procedureDate + "\n" + "  	Practitioner=" + practitionerName + "\n" + "  	Charge=" + procedureCharges + "\n";  
	}

}
