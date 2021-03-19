package co.com.choucair.certification.proyecto1.tasks;

import co.com.choucair.certification.proyecto1.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String srtUSer;

    public Login(String srtUSer, String srtPassword) {
        this.srtUSer = srtUSer;
        this.srtPassword = srtPassword;
    }

    private String srtPassword;

    public static Login onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class,strUser,strPassword);

        }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
        Enter.theValue(srtUSer).into(ChoucairLoginPage.IMPUT_USER),
        Enter.theValue(srtPassword).into(ChoucairLoginPage.IMPUT_PASSWORD),
        Click.on(ChoucairLoginPage.ENTER_BUTTON)
     );
    }
}

