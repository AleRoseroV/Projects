package co.com.choucair.certification.proyecto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {



        public static final Target SELECT_COURSE = Target.the("Select Course").located(By.xpath("//body/div[@id='page-wrapper']/nav[1]/div[1]/button[1]"));
        public static final Target COURSE = Target.the("Select b Course").located(By.xpath("/html[1]/body[1]/div[2]/div[4]/nav[1]/ul[1]/li[6]/a[1]/div[1]/div[1]/span[2]"));
        public static final Target NAME_COURSE = Target.the("Course Name").located(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/h1[1]"));
}
