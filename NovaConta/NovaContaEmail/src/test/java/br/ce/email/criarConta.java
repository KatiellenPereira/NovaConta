package br.ce.email;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class criarConta {
	private WebDriver driver;


	@Given("^no site do Gmail$")
	public void no_site_do_Gmail() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Katiellen Pereira\\Documents\\Cucumber\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");

	}

	@Given("^clico em 'crie uma conta'$")
	public void clico_em_crie_uma_connta() throws Throwable {
		driver.findElement(By.xpath("//span[.='Criar conta']")).click();
		driver.findElement(By.xpath("//span[.='Para mim']")).click();

	}

	@When("^informar o nome \"([^\"]*)\"$")
	public void informar_o_nome(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@When("^informar o sobrenome \"([^\"]*)\"$")
	public void informar_o_sobrenome(String arg1) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(arg1);
	}

	@When("^informar nome de usuário \"([^\"]*)\"$")
	public void informar_nome_de_usuário(String arg1) throws Throwable {
		driver.findElement(By.name("Username")).sendKeys(arg1);
	}

	@When("^informar e confirmar a senha \"([^\"]*)\"$")
	public void informar_e_confirmar_a_senha(String arg1) throws Throwable {
				driver.findElement(By.name("Passwd")).sendKeys(arg1);
				driver.findElement(By.name("ConfirmPasswd")).sendKeys(arg1);
	}

	@When("^clico em 'Próxima'$")
	public void clico_em_Próxima() throws Throwable {
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
	}

	@When("^informo o numero \"([^\"]*)\"$")
	public void informo_o_numero(String arg1) throws Throwable {
		Thread.sleep(1200);
	driver.findElement(By.id("phoneNumberId")).sendKeys(arg1);
	Thread.sleep(1200);

	} 
	@When("^então clico em 'Próxima'$")
	public void então_clico_em_Próxima() throws Throwable {
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
	}
	@When("^abre a tela de verificar número, informo$")
	public void abre_a_tela_de_verificar_número_informo() throws Throwable {
		String texto = driver.findElement(By.xpath("//div[@class='jXeDnc ']")).getText();
		Assert.assertEquals("Verifique seu número de telefone", texto);
		Thread.sleep(8000);
	}

	@When("^clico em 'Verificar'$")
	public void clico_em_Verificar() throws Throwable {
		try {
			Thread.sleep(8000);
			
			if (driver.findElement(By.id("code")).getAttribute(("data-initial-value")).length() < 6) {
				Thread.sleep(3000);Thread.sleep(8000);
			}
			
		} catch (Exception e) {
			if (driver.findElement(By.className("whsOnd zHQkBf")).getAttribute(("data-initial-value")).length() < 6) {
				Thread.sleep(8000);
			}
		}
		

		driver.findElement(By.xpath("//span[.='Verificar']")).click();
	}

	@When("^informar o dia \"([^\"]*)\" , mês \"([^\"]*)\" e ano \"([^\"]*)\"$")
	public void informar_o_dia_mês_e_ano(String arg1, int arg2, String arg3) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id("day")).sendKeys(arg1);
		Select dropdown = new Select(driver.findElement(By.id("month")));
		dropdown.selectByIndex(arg2);		
		driver.findElement(By.id("year")).sendKeys(arg3);
	}

	@When("^gênero \"([^\"]*)\"$")
	public void gênero(String arg1) throws Throwable {
		Select dropdown = new Select(driver.findElement(By.id("gender")));
		dropdown.selectByIndex(1);
	}

	@When("^concordo com os termos$")
	public void concordo_com_os_termos() throws Throwable {
		Thread.sleep(1200);
		driver.findElement(By.xpath("//span[.='Pular']")).click();
		Thread.sleep(800);
		driver.findElement(By.id("c3")).click();
		driver.findElement(By.id("c7")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[.='Criar conta']")).click();
		Thread.sleep(500);
	}

	@Then("^visualizo a página inicial$")
	public void visualizo_a_página_inicial() throws Throwable {
		Thread.sleep(1000);
			
	}

	@After(order = 1)
	public void screenshoot(Scenario cenario) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("src/test/java/br/ce/screenshot/screenshot/" + cenario.getId() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
