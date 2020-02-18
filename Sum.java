public class Sum extends ArithmeticExpression {
    public Sum(ArithmeticExpression x, ArithmeticExpression y)
    {
        this.a = x;
        this.b = y;
    }
    
//    @override
    public Value evaluate(){
        if (this.a == null || this.b ==null )
            return null;
        IntegerValue n = (IntegerValue)this.a.evaluate();
        IntegerValue m = (IntegerValue)this.b.evaluate();
        return new IntegerValue(n.v + m.v);
    }

    public String toString(){
        return this.evaluate().toString();
    }
}
