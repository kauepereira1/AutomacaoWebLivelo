package br.ce.livelo.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static br.ce.livelo.core.DriverFactory.getDriver;

public class DSL {

    public void escrever(String id_campo, String texto) {
        getDriver().findElement(By.xpath(id_campo)).sendKeys(texto);
    }

    public void clicar(String xpath_id) {
        getDriver().findElement(By.xpath(xpath_id)).click();
    }

    public String validarTexto(String texto) {
        return texto = getDriver().findElement(By.partialLinkText(texto)).getText();
    }

    public String validarTextoRemocaoItem(String texto) {
        return texto = getDriver().findElement(By.partialLinkText(texto)).getText();
    }

    public void clicarPopup(){
        WebDriver element = getDriver().switchTo().frame("social-push");
       if ( element != null){
           getDriver().findElement(By.id("btClose")).click();
       }
       return;
    }
}
