package testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility

{
	public void fileUploadusingSendKeys(WebElement element, String filepath)

	{
		element.sendKeys(filepath);
	}

	public void fileUplaodUsingRobotClass(WebElement element, String filepath) throws AWTException

	{
		StringSelection s = new StringSelection(filepath); // StringSelection is a Class
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null); // Toolkit is another Class has 3 methods
																				// getDefaultToolkit(),getSystemClipboard(),setContents
																				// used to copy value(file loc) to
																				// Clipboard.

		Robot robot = new Robot(); // Creating object for Robot class --Used to perform Keyboard events
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL); // Constants in KeyEvent Class
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
