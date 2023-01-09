package org.example;

public class Const extends AbstractExpression {
    private int value;

    public Const(int value) {
        this.value = value;
    }

    public int interpret() {
        return value;
    }
}
