public class FifoList extends OrderedDS{
  private int maxSize;
  private int first;  //第一个插入的元素,初始无元素为-1
  private int last;   //最后一个插入元素之后的位置,即期望插入的位置初始为0
  private static final String EMPTY_ERROR = "FifoList is empty";
  private static final String MAX_SIZE_ERROR = "FifoList maximum limit reached";

  public FifoList(){
    maxSize = 0;
    first = -1;
    last = 0;
    array = null;
  }

  public FifoList(int maxSize){
    if(maxSize < 0){
      this.maxSize = 0;
      this.array = null;
      first = -1;
      last = 0;
      return ;
    }
    this.maxSize = maxSize;
    first = -1;
    last = 0;
    this.array = new int[maxSize];

  }

  public FifoList(FifoList q){
    if(q==null){
      this.maxSize = 0;
      this.array = null;
      first = -1;
      last = 0;
      return;
    }
    this.maxSize = q.maxSize;

    if(q.array == null){
      this.array = null;
      return;
    }

    first = q.first;
    last = q.last;
    this.array = new int[this.maxSize];

    for(int i = first; i < last; i++){
      if(i>=maxSize)
          i=0;
      this.array[i] = q.array[i];

    }

  }

  public void add(int element){
    if(this.array == null || first == last){
      System.out.println(MAX_SIZE_ERROR);
      return;
    }
    int tmp = last + 1;
    if (tmp >= maxSize) tmp = 0;
    this.array[last] = element;
    if(-1 == first)
    {
        first = last;
    }
    last = tmp;
  }


/*
 *@override
*/
  public int delete(){
    if(this.array == null || -1 == first ){
      System.out.println(EMPTY_ERROR);
      return -1;
    }
    int top = array[first];
    int tmp = first + 1;
    if (tmp >= maxSize) 
    {
        tmp = 0;
    }
    if (tmp == last) 
    {
        first = -1;
    }else{
        first = tmp;
    }
    return top;
  }

  /*
   *@override
  */
  public int peek(){
    if(this.array == null && first == last){
      System.out.println(EMPTY_ERROR);
      return -1;
    }
    return array[first];
  }

  public int size(){
    if (-1 == first)
        return 0;
    else if (first<=last)
        return last-first;
    else
        return (maxSize-first)+last;
  }



  public String toString(){
    String empty = "";
    if(this.array == null && -1 == first){
      return empty;
    }
    for(int i = first; ; i++){
      if(i >= maxSize){
          i = 0;
      }
      if (i == last)
      {
          break;
      }
      empty += this.array[i];
      empty += "-";
    }

    empty = empty.substring(0, empty.length() - 1);
    return empty;
  }

}

