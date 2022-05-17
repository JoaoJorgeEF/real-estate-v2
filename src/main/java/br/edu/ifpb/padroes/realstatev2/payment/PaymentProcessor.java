package br.edu.ifpb.padroes.realstatev2.payment;

import br.edu.ifpb.padroes.realstatev2.domain.Property;

public abstract class PaymentProcessor {

    private PaymentProcessor next;

    public PaymentProcessor linkWith(PaymentProcessor next) {
        this.next = next;
        return next;
    }

    public abstract boolean process(Property property);

    protected boolean processNext(Property property) {
        if (next == null) {
            return true;
        }
        return next.process(property);
    }

}
