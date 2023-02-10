import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nxtgenaiacademy.com/demo-site/')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site 102/input__vfb-5'), 'Rattana')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site 102/input__vfb-7'), 'Jirawattanakij')

WebUI.click(findTestObject('Object Repository/Page_Demo Site 102/input_Male_vfb-31'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Site 102/input_Address_vfb-13address'), 
    'Malaiman')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site 102/input_Street Address_vfb-13address-2'), 
    '85')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site 102/input_Apt, Suite, Bldg. (optional)_vfb-13city'), 
    'Mueang')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site 102/input_City_vfb-13state'), 
    'Nakhon Pathom')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site 102/input_State  Province  Region_vfb-13zip'), 
    '73000')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site 102/input__vfb-14'), '644259032@webmail.npru.ac.th')

WebUI.click(findTestObject('Object Repository/Page_Demo Site 102/input_Date of Demo_vfb-18'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site 102/a_10'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Site 102/input_Mobile Number_vfb-19'), 
    '0830038009')

WebUI.click(findTestObject('Object Repository/Page_Demo Site 102/input_Course Interested_vfb-20'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site 102/input_Selenium WebDriver_vfb-20'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site 102/input_UFT_vfb-20'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site 102/input_TestNG_vfb-20'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site 102/input_Core Java_vfb-20'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site 102/input_Functional Testing_vfb-20'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Site 102/textarea_Enter your query_vfb-23'), 
    'no')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site 102/input__vfb-3'), 'no')

WebUI.click(findTestObject('Object Repository/Page_Demo Site 102/ul_Please enter two digits as displayed in _6d8a93'))

WebUI.verifyTextPresent('Please enter only digits.', false)

WebUI.closeBrowser()

