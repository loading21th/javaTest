public class IntegerValue extends ArithmeticExpression implements Value,IntEvaluable,BoolEvaluable{
     public int v;
     public IntegerValue(int x)
     {
         this.v = x;
     }


//    @override
    public String toString(){
            return String.valueOf(this.v);
    }

//    @override
    public int intEvaluate(){
            return v;
    }

//    @override
    public boolean boolEvaluate(){
        if(v==0)
            return false;
        else
            return true;
    }

//     @override
    public Value evaluate(){
        return this;
    }
      
}
