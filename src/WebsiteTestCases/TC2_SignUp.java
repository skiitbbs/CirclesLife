package WebsiteTestCases;

import lib.ExcelData;

public class TC2_SignUp {
	
	//below lines of code is going to extract the information from excel file.
	//Please use(Initialize) those data only which you want to use and assign accordingly
	ExcelData data = new ExcelData();
	String Auth = data.getauthurl();
	String url = data.getstagurl();
	
	/*
	String url = data.getprodurl();
	String borgurl = data.getborgurl();
	String vulcurl = data.getvulcanurl();
	String rikerurl = data.getrikerurl();
	String kirkurl = data.getkirkurl();
	*/

}
