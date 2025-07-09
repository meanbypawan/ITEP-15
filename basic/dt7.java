/*
  area = 1/2 * b * h
  b :- base
  h :- height
  b & h both are the integer
  float [4-byte], double [8-byte]

  30.5  --> double
  30.5f --> float

 */
class Test{
    public static void main(String args[]){
       int b,h;
       b = 2;
       h = 4;
       float area;
       area = 1/2.0f * b * h;
       System.out.println("Area : "+area);
    }
}