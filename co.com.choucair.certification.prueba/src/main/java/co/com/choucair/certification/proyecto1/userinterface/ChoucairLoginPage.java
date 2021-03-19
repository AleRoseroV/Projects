package co.com.choucair.certification.proyecto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button that shows us te form to login").located(By.xpath("//header/div[1]/nav[1]/ul[2]/li[1]/a[1]"));
    public static final Target IMPUT_USER = Target.the("Where to we write user").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div[1]/div/div/div[2]/div[2]/form/div[1]/input"));
    public static final Target IMPUT_PASSWORD = Target.the("Where to we write password").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div[1]/div/div/div[2]/div[2]/form/div[2]/input"));
    public static final Target ENTER_BUTTON = Target.the("Button to confirm login").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div[1]/div/div/div[2]/div[2]/form/div[3]/button"));

}
