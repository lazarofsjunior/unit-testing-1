package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MyApplicationTest {

    MessageService fakeservice = new MessageService();

    @Test
    public void processMessage_sendMessageIsTrue_true() {

        MessageService service = new MessageService() {
            @Override
            public boolean sendMessage(String msg, String rec) {
                return Math.random() > 0.5;
            }
        };
        MyApplication application = new MyApplication();
        application.setService(service);

        Message dummy = new Message();

        Assertions.assertTrue(application.processMessage(dummy));
    }
}
