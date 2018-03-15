package lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class uielements {
	
	public static final String email = "//input[@name='email']";
	public static final String pass = "//input[@name='password']";
	public static final String loginsubmit = "//button[@type='submit']";
	public static final String signupbutton = "//div[@class='container-fluid']/div/a[2]/div";
	public static final String signupfirstname = "//input[@name='first_name']";
	public static final String signuplastname = "//input[@name='last_name']";
	public static final String signupemailadd = "//div[@class='col-xs-12']/div/div/input[@name='email']";
	public static final String signuppassword = "//div[@class='col-xs-12']/div/div/input[@name='password']";
	public static final String signupsubmit = "//div[@class='offset-xs-1 col-xs-10']/button[@type='submit']";
	public static final String logout = "//*[@id=\'st-container\']/div/div/div[1]/div/div/div[2]/div/a[6]/div";
	public static final String proceedbutton = "//div[@class='offset-xs-2 col-xs-8']";
	public static final String planselectnumber = "//div[@class='small-card-height']/div/div/div";
	public static final String planselectphone = "//div[@class='default-phone']";
	public static final String planselect20gb = "//*[@id=\"st-container\"]/div/div/div[2]/span/div/div/div[6]/div/div/div/div/div/div/div[1]";
	public static final String planselectunlimitedcall = "//*[@id=\"st-container\"]/div/div/div[2]/span/div/div/div[7]/div/div/div/div/div/div/div[1]";
	public static final String planselectphoneonly = "//a[contains(text(), 'Buy phone here')]";
	public static final String getnumberkeepnumber = "//input[@type='number']";
	public static final String getnumbernewnumber = "//center[contains(text(), 'GET NEW NUMBER')]";
	public static final String getnumbergoldennumber = "//*[@id='number-select-container']/div[2]/div/div/div/div/div[2]/div[3]/div/div[2]/div[3]/div[1]/button";
	public static final String getnumberfreenumber = "//*[@id=\"number-select-container\"]/div[2]/div/div/div/div/div[2]/div[4]/div/div[2]/div[3]/div[6]/button";
	public static final String customplan = "//div[contains(text(), 'Add more Data, Talktime or SMS')]";
	public static final String customincreasedata = "//*[@id=\"st-container\"]/div/div/div[2]/span/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div[3]/span";
	public static final String customdecreasedata = "//*[@id=\"st-container\"]/div/div/div[2]/span/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div[1]/span";
	public static final String customeincreasetalktime = "//*[@id=\"st-container\"]/div/div/div[2]/span/div/div[2]/div/div[1]/div/div/div[2]/div[3]/div[2]/div/div[3]/span";
	public static final String customedecreasetalktime = "//*[@id=\"st-container\"]/div/div/div[2]/span/div/div[2]/div/div[1]/div/div/div[2]/div[3]/div[2]/div/div[1]/span";
	public static final String customeincreasesms = "//*[@id=\"st-container\"]/div/div/div[2]/span/div/div[2]/div/div[1]/div/div/div[2]/div[4]/div[2]/div/div[3]/span";
	public static final String customedecreasesms = "//*[@id=\"st-container\"]/div/div/div[2]/span/div/div[2]/div/div[1]/div/div/div[2]/div[4]/div[2]/div/div[1]/span";
	public static final String customeunlimitedcall = "//*[@id=\"st-container\"]/div/div/div[2]/span/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/img";
	public static final String customeselect2020 = "//*[@id=\"st-container\"]/div/div/div[2]/span/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/img";
	public static final String customegotoback = "//div[@class='hidden-small-device']/h5/div/div/a";
	public static final String customsavebutton = "//a[@action='PUSH']";
	public static final String precheckoutnumberchange = "//div[@class='hidden-small-device']/div/div[1]/div/div/div[2]/div/div[1]";
	public static final String precheckoutportin = "//div[@class='hidden-small-device']/div/div[1]/div/div/div[2]/div/div[3]";
	public static final String precheckoutpromo = "//input[@class='form-control']";
	public static final String deliveryinfofullname = "//input[@name='firstName']";
	public static final String deliveryinfobirthday = "//select[@name='birthDay']";
	public static final String deliveryinfobirthmonth = "//select[@name='birthMonth']";
	public static final String deliveryinfobirthyear = "//select[@name='birthYear']";
	public static final String deliveryinfomobileno = "//input[@name='contactNumber']";
	public static final String deliveryinfoemail = "//div[@class='col-xs-12']/div/div/input[@name='email']";
	public static final String deliveryinfonationality = "//select[@name='topNationality']";
	public static final String deliveryinfopincode = "//div[@id='PlacesAutocomplete__root']";
	public static final String deliveryinfohouse = "//input[@name='deliveryBlkHse']";
	public static final String deliveryinfostreet = "//input[@name='deliveryStreetName']";
	public static final String deliveryinfounit = "//input[@name='deliveryUnit']";
	public static final String deliveryinfobuilding = "//input[@name='deliveryBuildingName']";
	public static final String deliveryinfodoctypedropdown = "//select[@name='docType']";
	public static final String deliveryinfonric = "//input[@name='nric']";
	public static final String deliveryinfolocation = "//div[@id='PlacesAutocomplete__root']";
	public static final String deliveryinfoslot = "//div[@class='col-xs-15 delivery-slots-day'][4]";
	public static final String deliveryinfoslottime = "//div[@class='col-sm-4 col-xs-6 delivery-slots-time'][1]";
	public static final String deliveryinfofirstimg = "//div[@class= 'col-xs-6'][1]";
	public static final String deliveryinfosecondimg = "//div[@class= 'col-xs-6'][2]";
	public static final String ordersummaryplanchange = "//div[@class='col-xs-12']/div/div/div/a";
	public static final String ordersummarychangedeliveryinfo = "//div[@class='col-xs-4']/div";
	public static final String paymentbyvisa = "//img[@name='visa_button']";
	public static final String paymentbymaster = "//img[@name='mc_button']";
	public static final String paymentcancel = "//input[@value='Cancel']";
	public static final String paymententercard = "//*[@id='creditCardNum']";
	public static final String paymentselectmonth = "//select[@name='expMonth']";
	public static final String paymentselectyear = "//select[@name='expYear']";
	public static final String paymententercvv = "//input[@id='creditCardCvv2']";
	public static final String paymententername = "//*[@id=\'creditCardName\']";
	public static final String paymentsubmitbutton = "//*[@id=\'submitBtn\']";
	public static final String orderrefnumber = "//*[@id=\'st-container\']/div/div/div[2]/span/div/div/div[2]/div/div/div/div/div[5]/div/span[2]";
	public static final String orderrefno = "//span[contains(text(), '00000152')]";
	public static final String selectmobile = "//span[@class='text-primary']";
	public static final String selectmobilecolour = "//div[@class='col-xs-15'][1]";
	public static final String selectmobilememory = "//div[@class='col-xs-4']";
	public static final String selectfullamount = "//div[@class='col-xs-4'][1]/div/div/div[2]";
	public static final String selectinstallment = "//div[@class='col-xs-4'][2]/div/div/div[2]";
	public static final String selectsplit = "//div[@class='col-xs-4'][3]/div/div/div[2]";
	public static final String select24months = "//div[@class='col-xs-4'][3]/div/div/span";
	public static final String select12months = "//div[@class='col-xs-4'][2]/div/div/span";
	public static final String select6months = "//span[contains(text(), '6 months')]";
	public static final String selectbank = "//span[contains(text(), 'DBS')]";

}