
Feature: Cadastro de E-mail

  Scenario:  Deve ser cadastrado um novo e-mail com sucesso
    Given no site do Gmail
    And clico em 'crie uma conta'
    When informar o nome "Rosangela"
    And informar o sobrenome "Batista Porporati"
    And informar nome de usuário "batista0710"
    And  informar e confirmar a senha "novasenharosangela123"
    And clico em 'Próxima'
    When informo o numero "51999972753"
    And então clico em 'Próxima'
    When abre a tela de verificar número, informo
    And clico em 'Verificar'
    And informar o dia "10" , mês "07" e ano "1979" 
    And gênero "Feminino"
    And clico em 'Próxima'
    And concordo com os termos 
		Then visualizo a página inicial	