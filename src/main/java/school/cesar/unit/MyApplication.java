package school.cesar.unit;

public class MyApplication {

    private MessageService service;

    public void setService(MessageService service) {

        this.service = service;
    }

    public boolean processMessage(Message message) {
        return this.service.sendMessage(message.getMsg(), message.getRec());
    }
}
