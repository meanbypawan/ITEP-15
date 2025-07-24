// A	b	C	d	E	f	G	h	…… n terms
class TestMain{
    public static void main(String args[]){
        int n = 10;
        for(int i=65; n!=0 ; n--){
            if(i%2==0)
             System.out.println((char)(i+32));
            else
              System.out.println((char)i);
            i++;
        }
    }
}