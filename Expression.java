public abstract class Expression{
    public abstract Value evaluate();

//    @override
    public String toString(){
        return "undefined";
    }

//    @override
    public boolean equal(Expression x){
        return false;
    }
}
