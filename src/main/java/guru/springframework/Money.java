package guru.springframework;

public class Money {
    protected int amount;

    public boolean equals(Object o) {
        Money money = (Money) o;
        return this.amount == money.amount
                && getClass().equals(o.getClass());
    }
}
