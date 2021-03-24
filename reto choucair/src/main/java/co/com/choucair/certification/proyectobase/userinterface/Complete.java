package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Complete {
    public static final Target CREATE_PASSWORD = Target.the("Write the password").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/input[1]"));
    public static final Target CONFIRM_PASSWORD = Target.the("confirm the password").located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED = Target.the("Agree the information").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/label[1]/span[1]"));
    public static final Target TERM_OF_USE = Target.the("Agree the terms of use and code of conduct").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));
    public static final Target PRIVACY_SECURITY = Target.the("Agree the privacy and security policy").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));
    public static final Target COMPLETE_SETUP= Target.the("Complete an end the registry in the page").located(By.xpath("//span[contains(text(),'Complete Setup')]"));

}
