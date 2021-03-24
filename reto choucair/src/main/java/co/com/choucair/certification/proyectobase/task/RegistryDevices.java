package co.com.choucair.certification.proyectobase.task;
import co.com.choucair.certification.proyectobase.userinterface.Devices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegistryDevices implements Task {

    private String RegistryDevices;

    public RegistryDevices(String registryDevices) {

        this.RegistryDevices = registryDevices;
    }

    public static RegistryDevices the(String registryDevices) {
        return Tasks.instrumented(RegistryDevices.class, registryDevices);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(Devices.COMPUTER),
                Click.on(Devices.COMPUTER_OP),
                Click.on(Devices.VERSION),
                Click.on(Devices.VERSION_OP),
                Click.on(Devices.LANGUAGE),
                Click.on(Devices.LANGUAGE_OP),
                Click.on(Devices.MOBILE_DEVICE),
                Click.on(Devices.MOBILE_DEVICE_OP),
                Click.on(Devices.MODEL),
                Click.on(Devices.MODEL_OP),
                Click.on(Devices.OPE_SYSTEM),
                Click.on(Devices.OPE_SYSTEM_OP),
                Click.on(Devices.NEXT_LAST_STEP)
        );
    }
}
