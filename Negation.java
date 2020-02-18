public class Negation extends BooleanExpression {
    public Negation(BooleanExpression x)
    {
        this.a = x.a;
        this.b = x.b;
    }

    public Value evaluate(){
        if (this.a == null || !(this.a instanceof BooleanValue))
            return null;
        return BooleanValue(this.a.v);
    }

}
