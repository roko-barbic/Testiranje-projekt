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

WebUI.navigateToUrl('https://www.links.hr/hr/')

WebUI.setText(findTestObject('Object Repository/ShopingCart/Page_Links.hr Informatika i oprema, Sport, _dce119/input_Naini plaanja_q'), 
    'smartphone POCO M3')

WebUI.click(findTestObject('Object Repository/ShopingCart/Page_Links.hr Informatika i oprema, Sport, _dce119/div_Smartphone POCO M3 Pro 5G, 6.5, 4GB, 64_76fa85'))

WebUI.click(findTestObject('Object Repository/ShopingCart/Page_Smartphone POCO M3 Pro 5G, 6.5, 4GB - _bb8ff0/button_Dodaj'))

WebUI.click(findTestObject('Object Repository/ShopingCart/Page_Smartphone POCO M3 Pro 5G, 6.5, 4GB - _bb8ff0/span_1'))

WebUI.click(findTestObject('Object Repository/ShopingCart/Page_Koarica - Links/button_Dovri'))

WebUI.closeBrowser()

