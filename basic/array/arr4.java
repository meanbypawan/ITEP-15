/*
    [size] ===> int size;
 */
class TestMain{
    public static void main(String args[]){

        //double x[] = new double[2147483647];
        //int x[] = new int[0];
        //int x[] = new int[-5];
        //int x[] = new int['A']; // 65
        // int x[] = new int[10L];
        int x[] = new int[3];
        
        float z[];
        z = (float[])x;
        System.out.println(z); 
    }
}