package co.com.choucair.certification.proyecto1.tasks;

import co.com.choucair.certification.proyecto1.userinterface.ChoucairLoginPage;
import co.com.choucair.certification.proyecto1.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

public class Search implements Task {

    private String course;

    public Search(String course) {

        this.course = course;
    }

    public static Search the (String course) {
            return Tasks.instrumented(Search.class,course);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(Click.on(SearchCoursePage.SELECT_COURSE),
                Click.on(SearchCoursePage.COURSE)

        );

    }
}
