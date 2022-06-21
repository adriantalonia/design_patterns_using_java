package com.atr.behavior_patterns.chain_of_responsibility.challenge;

public class IssueRaiser {

    private IReceiver setFirstReceiver;

    public IssueRaiser(IReceiver receiver) {
        this.setFirstReceiver = receiver;
    }

    public void raiseMessage(Message message) {
        if(setFirstReceiver !=  null) {
            setFirstReceiver.processMessage(message);
        }
    }
}
