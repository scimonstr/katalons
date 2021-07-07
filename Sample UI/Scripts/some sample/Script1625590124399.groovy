import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')
WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), 'John Doe')
WebUI.setEncryptedText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'), 'Make Appointment')
WebUI.closeBrowser()