#language: pt
Funcionalidade: Cadastro de Produtos no Carrinho

  Como futuro cliente da Livelo
  Quero poder adicionar produtos no carrinho
  De modo que possa usufruir após meus acessos

  Contexto:
    Dado que estou acessando o site livelo
    Quando realizo uma busca por um item
      |Camisa Masculina|
    E o seleciono
    E preencho os campos
    E clico para adicionar ao carrinho

  Cenario: Adicionar produto no carrinho
    Então vejo que o item foi adicionado com sucesso

  @test
  Cenario: Remover Produto do carrinho
    E removo o item do carrinho
    Entao sou notificado que carrinho está vazio
