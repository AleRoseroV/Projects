package co.com.choucair.certification.proyectobase.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Personal {

    public static final Target FIRST_NAME = Target.the("Text box to write the first Name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Text box to write the last name").located(By.id("lastName"));
    public static final Target EMAIL_ADRRESS = Target.the("Text box to write the email of the user").located(By.id("email"));
    public static final Target BIRTH_MONTH = Target.the("Drop down list to choose the month birth").located(By.id("birthMonth"));
    public static final Target BIRTH_MONTH_OP =  Target.the("Choose the moth").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[4]/div[2]/div[1]/div[1]/select[1]/option[2]"));
    public static final Target BIRTH_DAY = Target.the("Drop down list of birth day").located(By.id("birthDay"));
    public static final Target BIRTH_DAY_OP = Target.the("Choose birth day").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[4]/div[2]/div[1]/div[2]/select[1]/option[11]"));
    public static final Target BIRTH_YEAR = Target.the("Drop down list of birth year").located(By.id("birthYear"));
    public static final Target BRITH_YEAR_OP = Target.the("Chose birth year").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[4]/div[2]/div[1]/div[3]/select[1]/option[6]"));
    public static final Target NEXT_LOCATION = Target.the("continue to record location data").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]"));
}
