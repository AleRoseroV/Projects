package co.com.choucair.certification.proyectobase.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.com.choucair.certification.proyectobase.userinterface.Address;
import net.serenitybdd.screenplay.actions.Click;

public class RegistryAddress implements Task{

    private String RegistryAddress;

    public RegistryAddress(String registryAddress) {

        this.RegistryAddress = registryAddress;
    }

    public static RegistryAddress the(String registryAddress) {
        return Tasks.instrumented(RegistryAddress.class, registryAddress);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(Address.NEXT_DEVICES));
    }
}
