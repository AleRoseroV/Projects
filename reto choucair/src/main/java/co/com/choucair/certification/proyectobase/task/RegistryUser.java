package co.com.choucair.certification.proyectobase.task;

import co.com.choucair.certification.proyectobase.userinterface.Registry;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegistryUser implements Task {

    private String registryNewUser;

    public RegistryUser(String registryNewUser) {

        this.registryNewUser = registryNewUser;
    }

    public static RegistryUser the(String registryNewUser) {
        return Tasks.instrumented(RegistryUser.class, registryNewUser);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Registry.JOIN_TODAY)



        );

    }

}