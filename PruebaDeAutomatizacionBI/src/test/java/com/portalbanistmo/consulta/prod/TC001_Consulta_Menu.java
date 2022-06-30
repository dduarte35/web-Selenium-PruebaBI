package com.portalbanistmo.consulta.prod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_Consulta_Menu {
  
  @BeforeTest
  public void beforeTest() {
  }

  @Test
  public void TC001_Consulta_Menu_script() {
	  
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe"); //declaracion de la ruta del chromedriver
	  WebDriver driver = new ChromeDriver();      //declaración del objeto driver
	  
	  //Paso 1 - Abrir Página "Banistmo" pagina web
	  
	  Reporter.log("Abrir Página \"Banistmo\" pagina web");                  //TestNG nos ayuda a colocar los logs en caso de que falle el caso
	  driver.get("https://www.banistmo.com/wps/portal/banistmo/personas/"); //URL dada para la prueba
	  driver.manage().window().maximize();                                  //sentencia para maximizar la pagina web.
	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);       //se declara para establecer un tiempo de espera para que cargue los elementos de la pantalla
	  
	  // Paso 2 - Dar clic "Acerca de nosotros" pagina web
	  
	  Reporter.log("Dar clic \"Acerca de nosotros\" pagina web");                           //TestNG nos ayuda a colocar los logs en caso de que falle el caso
	  driver.findElement(By.xpath("//a[contains(text(), 'Acerca de nosotros')]")).click(); //Dando clic al elemento
	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);                      //se declara para establecer un tiempo de espera para que cargue los elementos de la pantalla
	  
      // Paso 3- Dar clic "Información Corporativa" pagina web
	  
	  Reporter.log("Dar clic \"Acerca de nosotros\" pagina web");                                //TestNG nos ayuda a colocar los logs en caso de que falle el caso
	  driver.findElement(By.xpath("//a[contains(text(), 'Información Corporativa')]")).click(); //Dando clic al elemento
	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);                          //se declara para establecer un tiempo de espera para que cargue los elementos de la pantalla
	  
	// Paso 4- Dar clic "Sostenibilidad" pagina web
	  
	  Reporter.log("Dar clic \"Sostenibilidad\" pagina web");                                  //TestNG nos ayuda a colocar los logs en caso de que falle el caso
      driver.findElement(By.xpath("//a[contains(text(), 'Sostenibilidad')]")).click();         //Dando clic al elemento
	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);                          //se declara para establecer un tiempo de espera para que cargue los elementos de la pantalla
	  
  }
  
  
  
  @AfterTest
  public void afterTest() {
  }

}
