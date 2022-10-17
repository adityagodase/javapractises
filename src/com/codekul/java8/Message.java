package com.codekul.java8;

public interface Message {
    void sendMsg();
    default void sendPicture(){
        System.out.println("send picture");
    }
}
class SendMessage implements Message{
    @Override
    public void sendMsg() {
        System.out.println("send msg");
    }


}

class MessageImpl{
    public static void main(String[] args) {
        Message message = new SendMessage();
        message.sendMsg();
        message.sendPicture();

        Message sendMessage = () -> {
            System.out.println("In lambda");
        };
        sendMessage.sendMsg();
        sendMessage.sendPicture();
    }
}
