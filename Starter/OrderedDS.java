public abstract class OrderedDS extends DataStructure{
    public:
        abstract void add(int element);
        abstract int size();
        abstract int peek();
        abstract int delete();
    
    protected:
        int[] array;
}
