package lib;

public class ExcelData {
	
	ExcelConfig excel = new ExcelConfig("/Users/sumitkumar/git/CirclesLife/src/Test Data.xlsx");
	public String getemail() {
	String email = excel.getData(2, 1, 1);
	return email;
	}
	
	public String getpass() {
	String pass = excel.getData(2, 2, 1);
	return pass;
	}
	
	public String getmobile() {
	String mobile = excel.getData(2, 3, 1);
	return mobile;
	}
	
	public String getpincode() {
	String pincode = excel.getData(2, 4, 1);
	return pincode;
	}
	
	public String gethouse() {
	String house = excel.getData(2, 5, 1);
	return house;
	}
	
	public String getstreet() {
	String street = excel.getData(2, 6, 1);
	return street;
	}
	
	public String getunit() {
	String unit = excel.getData(2, 7, 1);
	return unit;
	}
	
	public String getbuilding() {
	String building = excel.getData(2, 8, 1);
	return building;
	}
	
	public String getnric() {
	String nric = excel.getData(2, 9, 1);
	return nric;
	}
	
	public String getportin() {
	String portin = excel.getData(2, 10, 1);
	return portin;
	}
	
	public String getvisa() {
	String visa = excel.getData(2, 11, 1);
	return visa;
	}
	
	public String getcvv() {
	String cvv = excel.getData(2, 12, 1);
	return cvv;
	}
	
	public String getname() {
	String name = excel.getData(2, 13, 1);
	return name;
	}
	
	public String getadminemail() {
		String ademail = excel.getData(1, 1, 3);
		return ademail;
	}
	
	public String getadminpass() {
		String adpass = excel.getData(1, 2, 3);
		return adpass;
	}
	
	public String getorderno() {
		String orderref = excel.getData(1, 3, 3);
		return orderref;
	}
	

}
