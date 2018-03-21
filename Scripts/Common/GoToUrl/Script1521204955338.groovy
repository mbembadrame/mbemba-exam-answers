import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

try {
    WebUI.getUrl()
}
catch (StepFailedException e) {
    // browser not open	
    WebUI.openBrowser(GlobalVariable.loginUrl)

    WebUI.maximizeWindow()

    WebUI.setText(findTestObject('Login/input_txtUsername'), GlobalVariable.loginUsername)

    WebUI.setText(findTestObject('Login/input_txtPassword'), GlobalVariable.loginPassword)

    WebUI.click(findTestObject('Login/input_Submit'))
} 

WebUI.navigateToUrl(url)

WebUI.waitForPageLoad(GlobalVariable.timeOut)

