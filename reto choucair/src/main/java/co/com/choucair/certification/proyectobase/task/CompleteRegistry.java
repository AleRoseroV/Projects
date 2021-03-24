package co.com.choucair.certification.proyectobase.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.com.choucair.certification.proyectobase.userinterface.Complete;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteRegistry implements Task {

    private String CompleteRegistry;

    public CompleteRegistry(String completeReg) {

        this.CompleteRegistry = completeReg;
    }

    public static CompleteRegistry the(String completeReg) {
        return Tasks.instrumented(CompleteRegistry.class, completeReg);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("ContraseñaSegura123*.").into(Complete.CREATE_PASSWORD),
                Enter.theValue("ContraseñaSegura123*.").into(Complete.CONFIRM_PASSWORD),
                Click.on(Complete.STAY_INFORMED),
                Click.on(Complete.TERM_OF_USE),
                Click.on(Complete.PRIVACY_SECURITY)

            );
    }
}
