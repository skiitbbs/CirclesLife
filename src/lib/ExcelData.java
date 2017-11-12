package lib;

public class ExcelData {
	
	ExcelConfig excel = new ExcelConfig("/Users/sumitkumar/eclipse-workspace/CirclesLife/Test Data.xlsx");
	public String getemail() {
	String email = excel.getData(0, 1, 1);
	return email;
	}
	
	public String getpass() {
	String pass = excel.getData(0, 2, 1);
	return pass;
	}
	
	public String getmobile() {
	String mobile = excel.getData(0, 3, 1);
	return mobile;
	}
	
	public String getpincode() {
	String pincode = excel.getData(0, 4, 1);
	return pincode;
	}
	
	public String gethouse() {
	String house = excel.getData(0, 5, 1);
	return house;
	}
	
	public String getstreet() {
	String street = excel.getData(0, 6, 1);
	return street;
	}
	
	public String getunit() {
	String unit = excel.getData(0, 7, 1);
	return unit;
	}
	
	public String getbuilding() {
	String building = excel.getData(0, 8, 1);
	return building;
	}
	
	public String getnric() {
	String nric = excel.getData(0, 9, 1);
	return nric;
	}
	
	public String getportin() {
	String portin = excel.getData(0, 10, 1);
	return portin;
	}
	
	public String getvisa() {
	String visa = excel.getData(0, 11, 1);
	return visa;
	}
	
	public String getcvv() {
	String cvv = excel.getData(0, 12, 1);
	return cvv;
	}
	
	public String getname() {
	String name = excel.getData(0, 13, 1);
	return name;
	}
	
	public String getadminemail() {
		String ademail = excel.getData(0, 1, 3);
		return ademail;
	}
	
	public String getadminpass() {
		String adpass = excel.getData(0, 2, 3);
		return adpass;
	}
	
	public String getorderno() {
		String orderref = excel.getData(0, 3, 3);
		return orderref;
	}
	

}
