
Feature: Cadastro de E-mail

  Scenario:  Deve ser cadastrado um novo e-mail com sucesso
    Given no site do Gmail
    And clico em 'crie uma conta'
    When informar o nome "Stéphanie"
    And informar o sobrenome "Fossati"
    And informar nome de usuário "FossatiRosaMaria2030"
    And  informar e confirmar a senha "trokeidesenha123"
    And clico em 'Próxima'
    When informo o numero "51985092217"
    And então clico em 'Próxima'
    When abre a tela de verificar número, informo
    And clico em 'Verificar'
    And informar o dia "10" , mês "05" e ano "1989" 
    And gênero "Feminino"
    And clico em 'Próxima'
    And concordo com os termos 
		Then visualizo a página inicial
		