/*
  Primitive ----> Object
  int x = 100; // stack
  Process of converting primitive into it's corresponding
  compatible object is called Boxing.

*/
class TestMain{
    public static void main(String args[]){
       int x = 100; // mutable,stack,not-thread-safe,not-serializab;e
       Integer iobj =  new Integer(x);
       System.out.println(iobj);// immutable,heap,thread-safe,serializable
    }
}

