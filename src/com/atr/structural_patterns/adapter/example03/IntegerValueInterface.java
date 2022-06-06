package com.atr.structural_patterns.adapter.example03;

public interface IntegerValueInterface {
    public int getInteger();
}

class IntegerValue implements IntegerValueInterface {
    @Override
    public int getInteger() {
        return 5;
    }
}

class ClassAdapter extends IntegerValue { //inheritance
    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}

class ObjectAdapter { // composition
    private IntegerValueInterface myInt;

    public  ObjectAdapter(IntegerValueInterface myInt) {
        this.myInt = myInt;
    }

    public int getInteger() {
        return 2 + this.myInt.getInteger();
    }
}