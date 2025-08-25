/*
   Area :-- Properties : (l,w)
            behaviour : int getArea()

   Volume :-- Properties : (l,w,h)
              behaviour :- getArea()
                           getVolume() 
*/

class Area{
    private int l,w;
    public void setData(int l, int w){
        this.l = l;
        this.w = w;
    }
    public int getArea(){
        return l*w;
    }
}
class Volume extends Area{
    private int h;
    public void setData(int l, int w, int h){
        setData(l,w);
        this.h = h;
    }
    public int getVolume(){
        return getArea()*h;
    }
}
class TestMain{
    public static void main(String args[]){
      Volume v = new Volume();
      v.setData(2,3,4);
      System.out.println("Area : "+v.getArea());
      System.out.println("Volume : "+v.getVolume());
    }
}