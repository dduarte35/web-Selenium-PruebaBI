package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
 
  @BeforeTest
  public void beforeTest() {
  }

  @Test
  public void f() {
  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe"); //declaracion de la ruta del chromedriver
  WebDriver driver = new ChromeDriver();      //declaración del objeto driver
  driver.get("https://www.google.com/");
  driver.manage().window().maximize();       //sentencia para maximizar pagina de google

  }
  
  
  @AfterTest
  public void afterTest() {
  }

}
