package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Devices {
    public static final Target COMPUTER = Target.the("choose your computer").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target COMPUTER_OP= Target.the(("choose in the drop down list the computer")).located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[4]/span[1]/div[1]"));
    public static final Target VERSION= Target.the(("Choose version of operating system")).located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target VERSION_OP = Target.the("Choose in the drop down list the version of system").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[19]/span[1]"));
    public static final Target LANGUAGE = Target.the("Choose Language").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target LANGUAGE_OP=Target.the("Choose in the drop down list the language").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[1]/div[40]/span[1]"));
    public static final Target MOBILE_DEVICE = Target.the("Choose your mobile device").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target MOBILE_DEVICE_OP= Target.the("Choose in the drop down list the mobile device").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[5]/span[1]"));
    public static final Target MODEL = Target.the("Choose the model the mobile").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target MODEL_OP = Target.the("Choose the model the mobile").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[19]/span[1]"));
    public static final Target OPE_SYSTEM = Target.the("Choose the operating system of the mobile").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target OPE_SYSTEM_OP = Target.the("Choose in the drop down list the operating system of the mobile").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/ul[1]/li[1]/div[7]/span[1]"));
    public static final Target NEXT_LAST_STEP = Target.the("Continue to record last step").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));

}
