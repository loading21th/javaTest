public class BooleanValue extends BooleanExpression implements Value,IntEvaluable,BoolEvaluable{
     public boolean v;
     public BooleanValue(boolean x)
     {
         this.v = x;
     }


//    @override
    public String toString(){
        if(v)
            return "true";
        else
            return "false";
    }

//    @override
    public int intEvaluate(){
        if(v)
            return 1;
        else
            return 0;
    }

//    @override
    public boolean boolEvaluate(){
        return v;
    }

//     @override
    public Value evaluate(){
        return this;
    }
      
}
