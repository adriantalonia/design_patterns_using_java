package com.atr.behavior_patterns.chain_of_responsibility.challenge;

public class Message {
    private String text;
    private MessagePriority priority;

    public Message(String message, MessagePriority priority) {
        this.text = message;
        this.priority = priority;
    }

    public String getText() {
        return text;
    }

    public MessagePriority getPriority() {
        return priority;
    }
}
