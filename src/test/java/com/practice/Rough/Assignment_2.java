package com.practice.Rough;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_2 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		 //Lauch browser
		 System.getProperty("webdriver.gecko.driver", "F:\\GeckoDriver\\geckodriver.exe");	
         WebDriver driver=new FirefoxDriver();	

         //Navigate to Google
	     driver.get("https://www.google.com/");
         driver.manage().window().maximize();
         
         //click on the Google apps button 
         driver.findElement(By.xpath("Google_apps_button")).click();
         
 
   /*      
        //locate and swich to frames
 		//Account app
 		WebElement f=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 		driver.switchTo().frame(f); 
 		driver.findElement(By.linkText(object.getProperty("Account_App"))).click();
 		  Thread.sleep(3000); 
 		  driver.navigate().to("https://www.google.co.in/");
 		  
 		  //Search app 
 		  driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
 		  WebElement f1=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 		  driver.switchTo().frame(f1);
 		driver.findElement(By.partialLinkText(object.getProperty("Search_app"))).click();
 		  Thread.sleep(3000);
 		  driver.navigate().to("https://www.google.co.in/");
 		  
 		  
 		  //Map app
 		  driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
 		  WebElement f2=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 		  driver.switchTo().frame(f2);
 		driver.findElement(By.partialLinkText(object.getProperty("Map_app"))).click();
 		  Thread.sleep(3000);
 		  driver.navigate().to("https://www.google.co.in/");
 		  
 		  //YouTube app
 		  driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
 		 WebElement f3=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 		  driver.switchTo().frame(f3);
 		driver.findElement(By.partialLinkText(object.getProperty("YouTube_app"))).click();
 		  Thread.sleep(3000);
 		  driver.navigate().to("https://www.google.co.in/");
         
 		 //play app
 		  driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
 		  WebElement f4=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 		  driver.switchTo().frame(f4);
 		driver.findElement(By.partialLinkText(object.getProperty("play_app"))).click();
 		  Thread.sleep(3000);
 		  driver.navigate().to("https://www.google.co.in/");
 		  
 		 //News app
 		  driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
 		  WebElement f5=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 		  driver.switchTo().frame(f5);
 		driver.findElement(By.partialLinkText(object.getProperty("News_app"))).click();
 		  Thread.sleep(3000);
 		  driver.navigate().to("https://www.google.co.in/");
 		  
 		  
 		//Gmail app
 		  driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
 		  WebElement f6=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 		  driver.switchTo().frame(f6);
 		driver.findElement(By.partialLinkText(object.getProperty("Gmail_app"))).click();
 		  Thread.sleep(3000);
 		  driver.navigate().to("https://www.google.co.in/");
 		  
 		  
 		//Meet app
 		  driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
 		  WebElement f7=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 		  driver.switchTo().frame(f7);
 		driver.findElement(By.partialLinkText(object.getProperty("Meet_app"))).click();
 		  Thread.sleep(3000);
 		  driver.navigate().to("https://www.google.co.in/");
 		  
 		  
 		  
 	 		//Chat app
 	 		  driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
 	 		  WebElement f8=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 	 		  driver.switchTo().frame(f8);
 	 		driver.findElement(By.partialLinkText(object.getProperty("Chat_app"))).click();
 	 		  Thread.sleep(3000);
 	 		  driver.navigate().to("https://www.google.co.in/");
 	 		  
 	 		  
 	 		  
 	  		//Contacts app
 	  		  driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
 	  		  WebElement f9=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 	  		  driver.switchTo().frame(f9);
 	  		driver.findElement(By.partialLinkText(object.getProperty("Contacts_app"))).click();
 	  		  Thread.sleep(3000);
 	  		  driver.navigate().to("https://www.google.co.in/");
 	  		  
 	  		  
 	  		//Drive app
 	  		  driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
 	  		  WebElement f10=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 	  		  driver.switchTo().frame(f10);
 	  		driver.findElement(By.partialLinkText(object.getProperty("Drive_app"))).click();
 	  		  Thread.sleep(3000);
 	  		  driver.navigate().to("https://www.google.co.in/");
 	  		
 	  		//Calendar app
 	  		  driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
 	  		  WebElement f11=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 	  		  driver.switchTo().frame(f11);
 	  		driver.findElement(By.partialLinkText(object.getProperty("Calendar_app"))).click();
 	  		  Thread.sleep(3000);
 	  		  driver.navigate().to("https://www.google.co.in/");
 	  		
 	  		  
 	  		  
 	  		//Translate app
 	  		  driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
 	  		  WebElement f12=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 	  		  driver.switchTo().frame(f12);
 	  		driver.findElement(By.partialLinkText(object.getProperty("Translate_app"))).click();
 	  		  Thread.sleep(3000);
 	  		  driver.navigate().to("https://www.google.co.in/");
 	  		  
 	  		  
 	 	       //Photos app
 	 	  		  driver.findElement(By.xpath(object.getProperty("Google_apps_button"))).click();
 	 	  		  WebElement f13=driver.findElement(By.name(object.getProperty("swich_to_frames")));
 	 	  		  driver.switchTo().frame(f13);
 	 	  		driver.findElement(By.partialLinkText(object.getProperty("Photos_app"))).click();
 	 	  		  Thread.sleep(3000);
 	 	  		  driver.navigate().to("https://www.google.co.in/");
 	 	  		  
 	 		  	  		  
 	 		  	  
 	 	  		*/
 	 	  		Thread.sleep(3000);  
 		        driver.close();
 		  
 		  
 		  
 		  
 		  
 		  
 		  
	}

}
