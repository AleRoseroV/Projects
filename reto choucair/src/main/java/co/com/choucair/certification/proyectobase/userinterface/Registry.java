package co.com.choucair.certification.proyectobase.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Registry {
    public static final Target JOIN_TODAY = Target.the("Button to login in to the page").located(By.xpath("//unauthenticated-header/div[1]/div[3]/ul[2]/li[2]/a[1]"));

}
