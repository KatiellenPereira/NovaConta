
Feature: Cadastro de E-mail

  Scenario:  Deve ser cadastrado um novo e-mail com sucesso
    Given no site do Gmail
    And clico em 'crie uma conta'
    When informar o nome "Rosane"
    And informar o sobrenome "Silva Solange"
    And informar nome de usuário "Margarida2021Rosangela"
    And  informar e confirmar a senha "trokeidesenha@"
    And clico em 'Próxima'
    When informo o numero "51999972753"
    And então clico em 'Próxima'
    When abre a tela de verificar número, informo
    And clico em 'Verificar'
    And informar o dia "01" , mês "10" e ano "1980" 
    And gênero "Feminino"
    And clico em 'Próxima'
    And concordo com os termos 
		Then visualizo a página inicial	