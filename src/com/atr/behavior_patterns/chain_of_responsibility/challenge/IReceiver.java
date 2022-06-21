package com.atr.behavior_patterns.chain_of_responsibility.challenge;

public interface IReceiver {
    Boolean processMessage(Message message);

    void setNextChain(IReceiver nextChain);
}

class EmailErrorHandler implements IReceiver {

    private IReceiver nextReceiver;

    @Override
    public Boolean processMessage(Message message) {
        if (message.getText().contains("Email")) {
            System.out.println("EmailErrorHandler processed " + message.getPriority() + " priority " + message.getText());
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(message);
            }
            return false;
        }
    }

    @Override
    public void setNextChain(IReceiver nextChain) {
        this.nextReceiver = nextChain;
    }
}

class FaxErrorHandler implements IReceiver {

    private IReceiver nextReceiver;

    @Override
    public Boolean processMessage(Message message) {
        if (message.getText().contains("Fax")) {
            System.out.println("FaxErrorHandler processed " + message.getPriority() + " priority " + message.getText());
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(message);
            }
            return false;
        }
    }

    @Override
    public void setNextChain(IReceiver nextChain) {
        this.nextReceiver = nextChain;
    }
}
