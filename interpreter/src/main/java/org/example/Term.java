package org.example;

public class Term extends AbstractExpression {

    private AbstractExpression term;
    private AbstractExpression constante;

    public Term(AbstractExpression constante) {
        super();
        this.constante = constante;
    }

    public Term(AbstractExpression constante, AbstractExpression term) {
        super();
        this.constante = constante;
        this.term = term;
    }

    public int interpret() {
        if (term == null) {
            return constante.interpret();
        }
        else {
            return term.interpret() * constante.interpret();
        }
    }
}
