package co.com.choucair.certification.proyectobase.task;
import co.com.choucair.certification.proyectobase.userinterface.Personal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistryPersonal implements Task {

    private String RegistryPersonal;

    public RegistryPersonal(String registryPersonal) {

        this.RegistryPersonal = registryPersonal;
    }

    public static RegistryPersonal the(String registryPersonal) {
        return Tasks.instrumented(RegistryPersonal.class, registryPersonal);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Alejandra").into(Personal.FIRST_NAME),
                Enter.theValue("Rosero").into(Personal.LAST_NAME),
                Enter.theValue("EmailPruebaAlejandraRV@gmail.com").into(Personal.EMAIL_ADRRESS),
                Click.on(Personal.BIRTH_MONTH),
                Click.on(Personal.BIRTH_MONTH_OP),
                Click.on(Personal.BIRTH_DAY),
                Click.on(Personal.BIRTH_DAY_OP),
                Click.on(Personal.BIRTH_YEAR),
                Click.on(Personal.BIRTH_YEAR),
                Click.on(Personal.BRITH_YEAR_OP),
                Click.on(Personal.NEXT_LOCATION)
        );
    }
}
