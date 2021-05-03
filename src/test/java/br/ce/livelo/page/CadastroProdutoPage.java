package br.ce.livelo.page;

import br.ce.livelo.core.BasePage;

public class CadastroProdutoPage extends BasePage {


    public void setEscreverNomeItem(String nome) {
        dsl.escrever("//input[@autocomplete='off' and @class='group__input group__input--right search gtm-element-event search-query']", nome);
    }

    public void setBuscarItem() {
        dsl.clicar("//*[@id='span-searchIcon']");
    }

    public void setClicarPopup() {
        dsl.clicar("//*[@id='btn-authorizeCoookies']");
    }

    public void setClicarNoItem() {
        dsl.clicar("//*[@id='CC-product-list-name-LVL18547892-00']");
    }

    public void setClicarListBoxCor() {
        dsl.clicar("//*[@class='group__select' and @id='CC-prodDetails-sku-type_clothes_v_color']");
    }

    public void setEscolherCor() {
        dsl.clicar("//*[@id='CC-prodDetails-sku-type_clothes_v_color']//*[@id='#option-1']");
    }

    public void setClicarNoTamanho() {
        dsl.clicar("//*[@class='group__select' and @id='CC-prodDetails-sku-type_clothes_v_size']");
    }

    public void setEscolherTamanho() {
        dsl.clicar("//*[@id='CC-prodDetails-sku-type_clothes_v_size']//*[@id='#option-2']");
    }

    public void setEscreverCEP() {
        dsl.escrever("//*[@id='inpt-cep__pdp']", "08505-400");
    }

    public void setAdicionarAoCarrinho() {
        dsl.clicar("//*[@id='cc-prodDetails-addToCart']");
    }

    public String setTexto() {
        return dsl.validarTexto("Camisa Futebol Topper Classic Masculina");
    }

    public void setRemoverItem() {
        dsl.clicar("//*[@class='cart-list__remove-item cart-list__remove-item--padding-left body-text body-text--small']");
    }

    public String setTextoRemocaoItem() {
        return dsl.validarTextoRemocaoItem("Ainda não existem itens no seu carrinho");
    }
}
