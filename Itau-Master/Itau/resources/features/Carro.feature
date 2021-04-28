#language: pt
Funcionalidade: Realizar busca de automoveis

@#jheferson_oliveira
@fluxo_positivo
@icarros
Esquema do Cenario: Pesquisar automoveis com sucesso
Dado acessar a tela tutorial do aplicativo
E acessar a tela inicial do aplicativo
Quando realizar a pesquisa de "<marca>" e "<modelo>"
E validar as informacoes de "<marca>" e "<modelo>"
Então Salvar valores em um arquivo


   Exemplos:
    |marca | modelo |
    | bmw  | m4    	|
    
@#jheferson_oliveira
@fluxo_positivo
@pesquisar_automoveis_armazenados
@icarros
Esquema do Cenario: Pesquisar automoveis armazenados
Dado acessar a tela tutorial do aplicativo
E acessar a tela inicial do aplicativo
Quando realizar a pesquisa de "<marca>" e "<modelo>"
Então validar os valores armazenados por "<marca>" e "<modelo>"


   Exemplos:
    |marca | modelo |
    | bmw  | m4    	|
    
