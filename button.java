package selenium_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class button {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajaganapathy\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		/*WebElement clickButton=driver.findElement(By.id("j_idt88:j_idt90"));
		clickButton.click();
		driver.navigate().back();
		
		WebElement disabledButton=driver.findElement(By.id("j_idt88:j_idt92"));
		boolean disable=disabledButton.isEnabled();
		System.out.println(disable);
		
		WebElement positionButton=driver.findElement(By.id("j_idt88:j_idt94"));
		Point position=positionButton.getLocation();
		int xValue=position.getX();
		int yValue=position.getY();
		System.out.println("X value is "+xValue+" and Y value is "+yValue);
		
		WebElement colorButton=driver.findElement(By.id("j_idt88:j_idt96"));
		String background=colorButton.getCssValue("background");
		System.out.println(background);
		
		String color=colorButton.getCssValue("color");
		System.out.println(color);
		
		String border=colorButton.getCssValue("border");
		System.out.println(border);
		
		WebElement sizeButton=driver.findElement(By.id("j_idt88:j_idt98"));
		Dimension size=sizeButton.getSize();
		int height=size.getHeight();
		int width=size.getWidth();
		System.out.println("height value "+height+" and width value "+width );
		
		Thread.sleep(1500);
		
		WebElement mouseHover=driver.findElement(By.id("j_idt88:j_idt100"));
		
		Actions a=new Actions(driver);
		a.moveToElement(mouseHover).build().perform();
		
		WebElement imageButton=driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		imageButton.click();
		Thread.sleep(1500);
		imageButton.click();*/
		
		List<WebElement> roundedButton=driver.findElements(By.cssSelector(".rounded-button"));
		int round=roundedButton.size();
		System.out.println(round);
		
		List<WebElement> Buttons=driver.findElements(By.tagName("button"));
		int countButton=Buttons.size();
		System.out.println(countButton);
	}

}
