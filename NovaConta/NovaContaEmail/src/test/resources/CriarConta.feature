
Feature: Cadastro de E-mail

  Scenario:  Deve ser cadastrado um novo e-mail com sucesso
    Given no site do Gmail
    And clico em 'crie uma conta'
    When informar o nome "Bete Regina"
    And informar o sobrenome "Porporati Silva"
    And informar nome de usuário "Porporatiltda0607"
    And  informar e confirmar a senha "novasenhaempresa123"
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