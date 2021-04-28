$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Carro.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Realizar busca de automoveis",
  "description": "",
  "id": "realizar-busca-de-automoveis",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Pesquisar automoveis com sucesso",
  "description": "",
  "id": "realizar-busca-de-automoveis;pesquisar-automoveis-com-sucesso",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 4,
      "name": "@#jheferson_oliveira"
    },
    {
      "line": 5,
      "name": "@fluxo_positivo"
    },
    {
      "line": 6,
      "name": "@icarros"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "acessar a tela tutorial do aplicativo",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "acessar a tela inicial do aplicativo",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "realizar a pesquisa de \"\u003cmarca\u003e\" e \"\u003cmodelo\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "validar as informacoes de \"\u003cmarca\u003e\" e \"\u003cmodelo\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "Salvar valores em um arquivo",
  "keyword": "Então "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "realizar-busca-de-automoveis;pesquisar-automoveis-com-sucesso;",
  "rows": [
    {
      "cells": [
        "marca",
        "modelo"
      ],
      "line": 16,
      "id": "realizar-busca-de-automoveis;pesquisar-automoveis-com-sucesso;;1"
    },
    {
      "cells": [
        "bmw",
        "m4"
      ],
      "line": 17,
      "id": "realizar-busca-de-automoveis;pesquisar-automoveis-com-sucesso;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 13576310600,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Pesquisar automoveis com sucesso",
  "description": "",
  "id": "realizar-busca-de-automoveis;pesquisar-automoveis-com-sucesso;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@icarros"
    },
    {
      "line": 4,
      "name": "@#jheferson_oliveira"
    },
    {
      "line": 5,
      "name": "@fluxo_positivo"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "acessar a tela tutorial do aplicativo",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "acessar a tela inicial do aplicativo",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "realizar a pesquisa de \"bmw\" e \"m4\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "validar as informacoes de \"bmw\" e \"m4\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "Salvar valores em um arquivo",
  "keyword": "Então "
});
formatter.match({
  "location": "CarroStep.acessar_a_tela_tutorial_do_aplicativo()"
});
formatter.result({
  "duration": 4367971900,
  "status": "passed"
});
formatter.match({
  "location": "CarroStep.acessar_a_tela_inicial_do_aplicativo()"
});
formatter.result({
  "duration": 1088052700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bmw",
      "offset": 24
    },
    {
      "val": "m4",
      "offset": 32
    }
  ],
  "location": "CarroStep.realizar_a_pesquisa_de_e(String,String)"
});
formatter.result({
  "duration": 19065260400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bmw",
      "offset": 27
    },
    {
      "val": "m4",
      "offset": 35
    }
  ],
  "location": "CarroStep.validar_as_informacoes_dos_carros_exibidos(String,String)"
});
formatter.result({
  "duration": 5948697500,
  "status": "passed"
});
formatter.match({
  "location": "CarroStep.salvar_valores_em_um_arquivo()"
});
formatter.result({
  "duration": 3489500,
  "status": "passed"
});
formatter.after({
  "duration": 2088735900,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Pesquisar automoveis armazenados",
  "description": "",
  "id": "realizar-busca-de-automoveis;pesquisar-automoveis-armazenados",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 19,
      "name": "@#jheferson_oliveira"
    },
    {
      "line": 20,
      "name": "@fluxo_positivo"
    },
    {
      "line": 21,
      "name": "@pesquisar_automoveis_armazenados"
    },
    {
      "line": 22,
      "name": "@icarros"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "acessar a tela tutorial do aplicativo",
  "keyword": "Dado "
});
formatter.step({
  "line": 25,
  "name": "acessar a tela inicial do aplicativo",
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "realizar a pesquisa de \"\u003cmarca\u003e\" e \"\u003cmodelo\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 27,
  "name": "validar os valores armazenados por \"\u003cmarca\u003e\" e \"\u003cmodelo\u003e\"",
  "keyword": "Então "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "realizar-busca-de-automoveis;pesquisar-automoveis-armazenados;",
  "rows": [
    {
      "cells": [
        "marca",
        "modelo"
      ],
      "line": 31,
      "id": "realizar-busca-de-automoveis;pesquisar-automoveis-armazenados;;1"
    },
    {
      "cells": [
        "bmw",
        "m4"
      ],
      "line": 32,
      "id": "realizar-busca-de-automoveis;pesquisar-automoveis-armazenados;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 9033199800,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Pesquisar automoveis armazenados",
  "description": "",
  "id": "realizar-busca-de-automoveis;pesquisar-automoveis-armazenados;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 21,
      "name": "@pesquisar_automoveis_armazenados"
    },
    {
      "line": 22,
      "name": "@icarros"
    },
    {
      "line": 19,
      "name": "@#jheferson_oliveira"
    },
    {
      "line": 20,
      "name": "@fluxo_positivo"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "acessar a tela tutorial do aplicativo",
  "keyword": "Dado "
});
formatter.step({
  "line": 25,
  "name": "acessar a tela inicial do aplicativo",
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "realizar a pesquisa de \"bmw\" e \"m4\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 27,
  "name": "validar os valores armazenados por \"bmw\" e \"m4\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Então "
});
formatter.match({
  "location": "CarroStep.acessar_a_tela_tutorial_do_aplicativo()"
});
formatter.result({
  "duration": 3250470800,
  "status": "passed"
});
formatter.match({
  "location": "CarroStep.acessar_a_tela_inicial_do_aplicativo()"
});
formatter.result({
  "duration": 1118069300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bmw",
      "offset": 24
    },
    {
      "val": "m4",
      "offset": 32
    }
  ],
  "location": "CarroStep.realizar_a_pesquisa_de_e(String,String)"
});
formatter.result({
  "duration": 15217338300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bmw",
      "offset": 36
    },
    {
      "val": "m4",
      "offset": 44
    }
  ],
  "location": "CarroStep.validar_os_valores_armazenados(String,String)"
});
formatter.result({
  "duration": 5414484300,
  "status": "passed"
});
formatter.after({
  "duration": 1563818600,
  "status": "passed"
});
});