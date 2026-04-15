package com.shyam.design;

//The "How" Side- defines how a message is actually sent
public interface MessageSender {
void sendMessage(String recipient, String subject, String body);
String getSenderType();
}
