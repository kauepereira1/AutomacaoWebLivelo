package br.ce.livelo.steps;

import br.ce.livelo.core.DSL;
import br.ce.livelo.page.CadastroProdutoPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static br.ce.livelo.core.DriverFactory.KillDriver;
import static br.ce.livelo.core.DriverFactory.getDriver;

public class CadastroProdutoCarrinho {

    private DSL dsl;
    private CadastroProdutoPage page;

    @Before
    public void inicializar() {
        dsl = new DSL();
        page = new CadastroProdutoPage();

    }

    @Dado("que estou acessando o site livelo")
    public void queEstouAcessandoOSiteLivelo() {
        getDriver().get("https://www.livelo.com.br/");
    }

    @Quando("realizo uma busca por um item")
    public void realizoUmaBuscaPorUmItem(String item) {
        page.setEscreverNomeItem(item);
        page.setBuscarItem();
    }

    @Quando("o seleciono")
    public void oSeleciono() {
        page.setClicarPopup();
        page.setClicarNoItem();


    }

    @Quando("preencho os campos")
    public void preenchoOsCampos() {
        page.setClicarListBoxCor();
        page.setEscolherCor();

        page.setClicarNoTamanho();
        page.setEscolherTamanho();
        page.setEscreverCEP();

    }

    @Quando("clico para adicionar ao carrinho")
    public void clicoParaAdicionarAoCarrinho() {
        page.setAdicionarAoCarrinho();
    }

    @Então("vejo que o item foi adicionado com sucesso")
    public void vejoQueOItemFoiAdicionadoComSucesso() {
        Assert.assertEquals("Camisa Futebol Topper Classic Masculina", page.setTexto());

    }

    @E("removo o item do carrinho")
    public void removoOItemDoCarrinho() {
        page.setRemoverItem();
    }

    @Entao("sou notificado que carrinho está vazio")
    public void souNotificadoQueCarrinhoEstáVazio() {
        dsl.clicarPopup();
        Assert.assertEquals("Ainda não existem itens no seu carrinho", page.setTextoRemocaoItem());
    }

    @After()
    public void fecharNavegador() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target\\screenshot\\screenshot.jpg"));
        getDriver().quit();
        KillDriver();
    }
}
