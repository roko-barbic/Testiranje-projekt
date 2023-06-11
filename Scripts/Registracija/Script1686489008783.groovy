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

WebUI.click(findTestObject('Object Repository/registracija/Page_Links.hr Informatika i oprema, Sport, _dce119/span_Registrirajte se'))

WebUI.click(findTestObject('Object Repository/registracija/Page_Registrirajte se - Links/input_Rod_Gender'))

WebUI.setText(findTestObject('Object Repository/registracija/Page_Registrirajte se - Links/input_Ime_FirstName'), 'Roko')

WebUI.click(findTestObject('Object Repository/registracija/Page_Registrirajte se - Links/input_Prezime_LastName'))

WebUI.setText(findTestObject('Object Repository/registracija/Page_Registrirajte se - Links/input_Prezime_LastName'), 'Test')

WebUI.selectOptionByValue(findTestObject('Object Repository/registracija/Page_Registrirajte se - Links/select_Dan123456789101112131415161718192021_4018b4'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/registracija/Page_Registrirajte se - Links/select_Dan123456789101112131415161718192021_4018b4'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/registracija/Page_Registrirajte se - Links/select_Mjesecsijeanjveljaaoujaktravanjsviba_867e78'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/registracija/Page_Registrirajte se - Links/select_Godine191319141915191619171918191919_ebd7bd'), 
    '1920', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/registracija/Page_Registrirajte se - Links/select_Godine191319141915191619171918191919_ebd7bd'), 
    '1981', true)

WebUI.setText(findTestObject('Object Repository/registracija/Page_Registrirajte se - Links/input_Elektronska pota_Email'), 
    'test123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/registracija/Page_Registrirajte se - Links/input_Lozinka_Password'), 
    '5xx1bkCcAlw=')

WebUI.setEncryptedText(findTestObject('Object Repository/registracija/Page_Registrirajte se - Links/input_Potvrdite lozinku_ConfirmPassword'), 
    '5xx1bkCcAlw=')

WebUI.click(findTestObject('Object Repository/registracija/Page_Registrirajte se - Links/input_Potvrdite lozinku_register-button'))

WebUI.closeBrowser()

