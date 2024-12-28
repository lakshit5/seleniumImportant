package TestNG;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliEx {

	public static void main(String[] args) throws Throwable {

		Screen scr = new Screen();

		Pattern miniBar = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\imgMini.png");
		scr.click(miniBar);
		
		Pattern search = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\imgSearchbar.png");
		scr.type(search, "Notepad");
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Pattern page = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\imgPage.png");
		scr.type(page, "Shobha");
		
		
		
		
		
	}

}
