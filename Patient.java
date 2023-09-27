// This class stores all the attributes for the Patient object 
public class Patient 
{
	String firstName, middleName, lastName, streetAddress, city, state, phone, emergencyName, emergencyPhone, zipCode; 

// No argument constructor
	public Patient()
	{
		firstName = "N/A";
		middleName = "N/A";
		lastName = "N/A";
		streetAddress = "N/A";
		city = "N/A";
		state = "N/A";
		phone = "N/A";
		emergencyName = "N/A";
		emergencyPhone = "N/A";
		zipCode = "N/A";
	}
	
	public Patient(String fName, String mName, String lName)
	{
		firstName = fName; 
		middleName = mName;
		lastName = lName; 
	}

// Initializing all attributes
	public Patient(String fName, String mName, String lName, String address, 
			String c, String s, String ph, String ePh, String eName, String zip)
	{
		firstName = fName; 
		middleName = mName; 
		lastName = lName; 
		streetAddress = address; 
		city = c; 
		state = s; 
		phone = ph; 
		emergencyName = eName;
		emergencyPhone = ePh;  
		zipCode = zip; 
	}

	
// Accessors and Mutators
	public void setFirstName(String fName)
	{
		firstName = fName; 
	}
	
	public String getFirstName()
	{
		return firstName; 
	}
	
	public void setMiddleName(String mName)
	{
		middleName = mName; 
	}
	
	public String getMiddleName()
	{
		return middleName;
	}
	
	public void setLastName(String lName)
	{
		lastName = lName; 
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setAddress(String a)
	{
		streetAddress = a; 
	}
	
	public String getAddress()
	{
		return streetAddress; 
	}
	
	public void setCity(String c)
	{
		city = c; 
	}
	
	public String getCity()
	{
		return city; 
	}
	
	public void setState(String s)
	{
		state = s; 
	}
	
	public String getState()
	{
		return state; 
	}
	
	public void setZip(String z)
	{
		zipCode = z;
	}
	public String getZip()
	{
		return zipCode;
	}
	
	public void setPhone(String p)
	{
		phone = p;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setEmergencyName(String eName)
	{
		emergencyName = eName;
	}
	
	public String getEmergencyName()
	{
		return emergencyName; 
	}
	
	public void setEmergencyPhone(String ep)
	{
		emergencyPhone = ep; 
	}
	
	public String getEmergencyPhone()
	{
		return emergencyPhone; 
	}
	
	public String buildFullName()
	{
		String fullName = firstName + " " + middleName + " " + lastName;
		return fullName; 
	}
	
	public String buildAddress()
	{
		String Address = streetAddress + " " + city + " " + state + " " + zipCode;
		return Address; 
	}
	
	public String buildEmergencyContact()
	{
		String emergencyContact = emergencyName + " " + emergencyPhone; 
		return emergencyContact; 
	}
// Displayed to the console
	public String toString()
	{
		return "Patient info: \n" + "  Name: " + firstName + " " + middleName + " " + lastName + "\n" + 
	"  Address: " + streetAddress + " " + city + " " + zipCode + "\n" + "  EmergencyContact: " + emergencyName + " " + emergencyPhone + "\n"; 
	}
}
