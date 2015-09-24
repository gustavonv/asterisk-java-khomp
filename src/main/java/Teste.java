import org.asteriskjava.khomp.AMIEventUtils;
import org.asteriskjava.khomp.manager.action.KSendSMSAction;
import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.ManagerConnection;
import org.asteriskjava.manager.ManagerConnectionFactory;
import org.asteriskjava.manager.TimeoutException;
import org.asteriskjava.manager.response.ManagerResponse;

import java.io.IOException;

/**
 * @author kennedy
 */
public class Teste {

    public static void main(String[] args) throws InterruptedException, AuthenticationFailedException, TimeoutException, IOException {
        final ManagerConnectionFactory connectionFactory = new ManagerConnectionFactory("192.168.1.244", 5038, "catix", "zupa@zupa!");

        final ManagerConnection connection = connectionFactory.createManagerConnection();

        AMIEventUtils.registerKhompEvents(connection);

        connection.login();
//        connection.addEventListener(new ManagerEventListener() {
//            @Override
//            public void onManagerEvent(ManagerEvent event) {
//                if (event instanceof NewSMSEvent || event instanceof NewSMSConfirmationEvent) {
//                    System.out.println();
//                } else {
//                    System.out.println(event);
//                }
//            }
//        });

// TODO Verificar os erros e os códigos de erros segundo a Khomp
        final KSendSMSAction action = new KSendSMSAction();
        action.setDevice("B0");
        action.setDestination("17991357611");
        action.setMessage("Olá!");
//        action.setLineFeed(true);
//        action.setConfirmation(true);
//        action.setAlert(true);
//        action.setAsync(true);

//        final KSendUSSDAction action = new KSendUSSDAction("B0", "*222#");

//        final CommandAction action = new CommandAction("khomp channels show");

        final ManagerResponse managerResponse = connection.sendAction(action, 30000L);
//
//        System.out.println("Ok");

        Thread.sleep(Long.MAX_VALUE);
    }
}
