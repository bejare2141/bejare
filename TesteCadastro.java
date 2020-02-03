
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class TesteCadastro {
@Test
public void Teste() {

WebDriver driver = new FirefoxDriver();
driver.manage().window().setSize(new org.openqa.selenium.Dimension(1200, 765));
driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
WebElement element = driver.findElement(By.id("elementosForm:nome"));
element.sendKeys("Renato");
WebElement element2 = driver.findElement(By.id("elementosForm:sobrenome"));
element2.sendKeys("Beja");
WebElement element3 = driver.findElement(By.id("elementosForm:sexo:0")).click();
WebElement element4 = driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
WebElement element5 = driver.findElement(By.id("elementosForm:escolaridade"));
org.openqa.selenium.support.ui.Select combo = new org.openqa.selenium.support.ui.Select(element5);
combo.selectByIndex(3);
combo.selectByVisibleText("superior");
WebElement element6 = driver.findElement(By.id("elementosForm:esportes"));
org.openqa.selenium.support.ui.Select combo = new org.openqa.selenium.support.ui.Select(element6);
combo.selectByVisibleText("Natacao");
WebElement element7 = driver.findElement(By.id("elementosForm:cadastrar"));
element7.click();
new org.openqa.selenium.support.ui.Select(element7)

}
}
