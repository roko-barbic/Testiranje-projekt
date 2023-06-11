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

WebUI.click(findTestObject('Object Repository/Komentar/Page_Links.hr Informatika i oprema, Sport, _dce119/a_Akcije'))

WebUI.click(findTestObject('Object Repository/Komentar/Page_Akcije - INFORMATIKA - Links/a_MacBook Air'))

WebUI.click(findTestObject('Object Repository/Komentar/Page_Akcije - INFORMATIKA - Links/div_Quick View'))

WebUI.click(findTestObject('Object Repository/Komentar/Page_Akcije - INFORMATIKA - Links/a_vie o proizvodu'))

WebUI.click(findTestObject('Object Repository/Komentar/Page_Laptop APPLE MacBook Air 13.3 Retin - _866d9b/a_Komentari'))

WebUI.setText(findTestObject('Object Repository/Komentar/Page_Laptop APPLE MacBook Air 13.3 Retin - _866d9b/input_Recenzija naslova_AddProductReview.Title'), 
    'asf')

WebUI.click(findTestObject('Object Repository/Komentar/Page_Laptop APPLE MacBook Air 13.3 Retin - _866d9b/input_Recenzija naslova_AddProductReview.Title'))

WebUI.setText(findTestObject('Object Repository/Komentar/Page_Laptop APPLE MacBook Air 13.3 Retin - _866d9b/textarea_Recenzija teksta_AddProductReview._6e9ebe'), 
    'Solidan laptop')

WebUI.click(findTestObject('Object Repository/Komentar/Page_Laptop APPLE MacBook Air 13.3 Retin - _866d9b/input_Loe_AddProductReview.Rating'))

WebUI.closeBrowser()

