package page;

import core.BasePage;
import core.Elemento;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import util.EvidenceManager;


import static util.EvidenceManager.GerarEvidencia;

public class HomePage extends BasePage {

    private Elemento enterVehicle = new Elemento(getDriver(), "xpath", "(//a[@id='entervehicledata'])[1]");

    private Elemento optionMake = new Elemento(getDriver(), "xpath", "//*[text()='Audi']");
    private Elemento optionModel = new Elemento(getDriver(), "xpath", "//*[text()='Scooter']");
    private Elemento cylinderCapacity = new Elemento(getDriver(), "xpath", "//input[@name='Cylinder Capacity']");
    private Elemento enginePerformance = new Elemento(getDriver(), "xpath", "//input[@name='[kW]']");
    private Elemento openDateCalender = new Elemento(getDriver(), "xpath", "//button[@id='opendateofmanufacturecalender']");
    private Elemento optionDateCalender = new Elemento(getDriver(), "xpath", "//*[text()='15']");
    private Elemento optionNumberOfSeats = new Elemento(getDriver(), "xpath", "//*[text()='9']");

    private Elemento rightHandNo = new Elemento(getDriver(), "xpath", "//*[text()='No']");
    private Elemento optionOfSeatsMotorCycle = new Elemento(getDriver(), "xpath", "(//*[text()='3'])[2]");
    private Elemento optionFuel = new Elemento(getDriver(), "xpath", "//*[text()='Petrol']");
    private Elemento payload = new Elemento(getDriver(), "xpath", "//input[@name='Payload']");
    private Elemento totalWeight = new Elemento(getDriver(), "xpath", "//input[@id='totalweight']");
    private Elemento listPrice = new Elemento(getDriver(), "xpath", "//input[@name='List Price']");
    private Elemento licensePlate = new Elemento(getDriver(), "xpath", "//input[@name='License Plate Number']");
    private Elemento annualMileage = new Elemento(getDriver(), "xpath", "//input[@name='Annual Mileage']");
    private Elemento nextEnterInsuranceData = new Elemento(getDriver(), "xpath", "//button[@id='nextenterinsurantdata']");

    private Elemento scrollUp = new Elemento(getDriver(), "xpath", "(//a[@id='enterinsurantdata'])[1]");

    private Elemento firstName = new Elemento(getDriver(), "xpath", "//input[@name='First Name']");
    private Elemento lastName = new Elemento(getDriver(), "xpath", "//input[@name='Last Name']");
    private Elemento openDateCalenderBirth = new Elemento(getDriver(), "xpath", "//input[@name='Date of Birth']");
    private Elemento genderFemale = new Elemento(getDriver(), "xpath", "//*[text()='Female']");
    private Elemento streetAddress = new Elemento(getDriver(), "xpath", "//input[@name='Street Address']");
    private Elemento optionCountry = new Elemento(getDriver(), "xpath", "//*[text()='Canada']");
    private Elemento zipCode = new Elemento(getDriver(), "xpath", "//input[@name='Zip Code']");
    private  Elemento city = new Elemento(getDriver(), "xpath", "//input[@name='City']");
    private Elemento optionOccupation = new Elemento(getDriver(), "xpath", "//*[text()='Farmer']");
    private Elemento hobbies = new Elemento(getDriver(), "xpath", "//*[text()=' Bungee Jumping']");
    private Elemento website = new Elemento(getDriver(), "xpath", "//input[@name='Website']");
    private Elemento nextEnterProductData = new Elemento(getDriver(), "xpath", "//button[@id='nextenterproductdata']");

    private Elemento startDate = new Elemento(getDriver(), "xpath", "//input[@name='Start Date']");
    private Elemento insuranceSum = new Elemento(getDriver(), "xpath", "//*[text()=' 7.000.000,00']");
    private Elemento meritRating = new Elemento(getDriver(), "xpath", "//*[text()='Bonus 9']");
    private Elemento damageInsurance = new Elemento(getDriver(), "xpath", "//*[text()='Partial Coverage']");
    private Elemento optionProducts = new Elemento(getDriver(), "xpath", "//*[text()='Euro Protection']");
    private Elemento courtesyCar = new Elemento(getDriver(), "xpath", "//*[text()=' Yes']");
    private Elemento nextEnterPriceOption = new Elemento(getDriver(), "xpath", "//button[@id='nextselectpriceoption']");

    private Elemento selectPrice = new Elemento(getDriver(), "xpath", "(//label[@class='choosePrice ideal-radiocheck-label'])[2]");
    private Elemento nextSendQuote = new Elemento(getDriver(), "xpath", "//button[@id='nextsendquote']");

    private Elemento email = new Elemento(getDriver(), "xpath", "//input[@name='E-Mail']");
    private Elemento phone = new Elemento(getDriver(), "xpath", "//input[@name='Phone']");
    private Elemento username = new Elemento(getDriver(), "xpath", "//input[@name='Username']");
    private Elemento password = new Elemento(getDriver(), "xpath", "//input[@name='Password']");
    private Elemento confirmPassword = new Elemento(getDriver(), "xpath", "//input[@name='Confirm Password']");
    private Elemento comments = new Elemento(getDriver(), "xpath", "//textarea[@name='Comments']");
    private Elemento sendEmail = new Elemento(getDriver(), "xpath", "//button[@id='sendemail']");
    private Elemento messageSend = new Elemento(getDriver(), "xpath", "//h2[text()='Sending e-mail success!']");


    @Dado("que o usuário acesse o sistema do samplapp")
    public void acessHome() throws Exception {
        navegar("http://sampleapp.tricentis.com/101/app.php");
        GerarEvidencia("Tela inicial Sample APP");

    }

    @Quando("preencher o formulário da aba Enter Vehicle Data")
    public void formEnterVehicle() throws Exception {
        esperarElemento(enterVehicle, MIDDLE);
        clicar(optionMake);
        clicar(optionModel);
        escrever(cylinderCapacity, "900");
        escrever(enginePerformance,"1000");
        clicar(openDateCalender);
        clicar(optionDateCalender);
        clicar(optionNumberOfSeats);
        clicar(rightHandNo);
        clicar(optionOfSeatsMotorCycle);
        clicar(optionFuel);
        escrever(payload,"15");
        escrever(totalWeight,"500");
        escrever(listPrice,"600");
        escrever(licensePlate,"900");
        escrever(annualMileage,"110");
        EvidenceManager.GerarEvidencia("Preenchimento formulário Vehicle");

    }

    @E("clicar na opção Next Enter Vehicle Data")
    public void optionNextInsurant() throws Exception {

        clicar(nextEnterInsuranceData);
        EvidenceManager.GerarEvidencia("Opção Next Vehicle");
    }

    @E("preencher o formulário da aba Enter Insurant Data")
    public void formInsurantData() throws Exception {

        rolarAoElemento(scrollUp);
        escrever(firstName,"Mario");
        escrever(lastName,"Silva");
        escrever(openDateCalenderBirth,"05/15/1996");
        clicar(genderFemale);
        escrever(streetAddress,"Rua Alfa, 204");
        clicar(optionCountry);
        escrever(zipCode,"38400617");
        escrever(city,"Uberlandia");
        clicar(optionOccupation);
        clicar(hobbies);
        escrever(website,"https://www.google.com");
        EvidenceManager.GerarEvidencia("Preenchimento formulário Insurant");
    }

    @E("clicar na opção Next na aba Enter Insurant Data")
    public void optionNextProduct() throws Exception {

        clicar(nextEnterProductData);
        EvidenceManager.GerarEvidencia("Opção Next Insurant");
    }

    @E("preencher o formulário da aba Enter Product Data")
    public void formProductData() throws Exception {

        rolarAoElemento(scrollUp);
        escrever(startDate,"10/05/2023");
        clicar(insuranceSum);
        clicar(meritRating);
        clicar(damageInsurance);
        clicar(optionProducts);
        clicar(courtesyCar);

        EvidenceManager.GerarEvidencia("Preenchimento formulário Product");
    }


    @E("clicar na opção Next na aba Enter Product Data")
    public void nextEnterPriceOption() throws Exception {

        clicar(nextEnterPriceOption);
        EvidenceManager.GerarEvidencia("Opção Next Product");
    }

    @E("selecionar o plano desejado na aba Select Price Option")
    public void formPriceOption() throws Exception {

        rolarAoElemento(scrollUp);
        clicar(selectPrice);

        EvidenceManager.GerarEvidencia("Preenchimento formulário Price");
    }

    @E("clicar na opção Next na aba Select Price Option")
    public void nextsendquote() throws Exception {

        clicar(nextSendQuote);
        EvidenceManager.GerarEvidencia("Opção Next Price");
    }

    @E("preencher o formulário da aba Send Quote")
    public void formSendQuote() throws Exception {

        rolarAoElemento(scrollUp);
        escrever(email,"teste@gmail.com");
        escrever(phone,"34997999999");
        escrever(username,"teste");
        escrever(password,"Kkaa5544");
        escrever(confirmPassword,"Kkaa5544");
        escrever(comments,"Teste de envio de e-mail");

        EvidenceManager.GerarEvidencia("Preenchimento formulário Send");
    }

    @E("clicar na opção Send na aba Send Quote")
    public void sendSendQuote() throws Exception {

        clicar(sendEmail);
        EvidenceManager.GerarEvidencia("Opção Send Quote");
    }

    @Entao("o sistema exibe mensagem informando Sending e-mail success!")
    public void assertMessage() throws Exception {

        esperarElemento(messageSend,MIDDLE);

        String msgSucess = pegarInformacaoAtributo(messageSend,"innerText");
        Assert.assertEquals("Sending e-mail success!",msgSucess);

        EvidenceManager.GerarEvidencia("E-mail Enviado");
    }

}
