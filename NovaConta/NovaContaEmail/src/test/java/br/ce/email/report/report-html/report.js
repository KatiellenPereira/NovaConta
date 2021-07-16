$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/CriarConta.feature");
formatter.feature({
  "line": 2,
  "name": "Cadastro de E-mail",
  "description": "",
  "id": "cadastro-de-e-mail",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Deve ser cadastrado um novo e-mail com sucesso",
  "description": "",
  "id": "cadastro-de-e-mail;deve-ser-cadastrado-um-novo-e-mail-com-sucesso",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "no site do Gmail",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "clico em \u0027crie uma conta\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "informar o nome \"Rosane\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "informar o sobrenome \"Silva Solange\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "informar nome de usuário \"Margarida2021Rosangela\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "informar e confirmar a senha \"trokeidesenha@\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "clico em \u0027Próxima\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "informo o numero \"51999972753\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "então clico em \u0027Próxima\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "abre a tela de verificar número, informo",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "clico em \u0027Verificar\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "informar o dia \"01\" , mês \"10\" e ano \"1980\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "gênero \"Feminino\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "clico em \u0027Próxima\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "concordo com os termos",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "visualizo a página inicial",
  "keyword": "Then "
});
formatter.match({
  "location": "criarConta.no_site_do_Gmail()"
});
formatter.result({
  "duration": 8712762200,
  "status": "passed"
});
formatter.match({
  "location": "criarConta.clico_em_crie_uma_connta()"
});
formatter.result({
  "duration": 1629335400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rosane",
      "offset": 17
    }
  ],
  "location": "criarConta.informar_o_nome(String)"
});
formatter.result({
  "duration": 137367700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Silva Solange",
      "offset": 22
    }
  ],
  "location": "criarConta.informar_o_sobrenome(String)"
});
formatter.result({
  "duration": 712303800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Margarida2021Rosangela",
      "offset": 26
    }
  ],
  "location": "criarConta.informar_nome_de_usuário(String)"
});
formatter.result({
  "duration": 229670600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "trokeidesenha@",
      "offset": 30
    }
  ],
  "location": "criarConta.informar_e_confirmar_a_senha(String)"
});
formatter.result({
  "duration": 345531800,
  "status": "passed"
});
formatter.match({
  "location": "criarConta.clico_em_Próxima()"
});
formatter.result({
  "duration": 121685700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "51999972753",
      "offset": 18
    }
  ],
  "location": "criarConta.informo_o_numero(String)"
});
formatter.result({
  "duration": 2525796400,
  "status": "passed"
});
formatter.match({
  "location": "criarConta.então_clico_em_Próxima()"
});
formatter.result({
  "duration": 78554200,
  "status": "passed"
});
formatter.match({
  "location": "criarConta.abre_a_tela_de_verificar_número_informo()"
});
formatter.result({
  "duration": 12050140400,
  "status": "passed"
});
formatter.match({
  "location": "criarConta.clico_em_Verificar()"
});
