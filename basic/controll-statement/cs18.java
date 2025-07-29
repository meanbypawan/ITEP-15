class TestMain{
    public static void main(String args[]){
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                if(i == 5 || j == 5 || (i==1 && j> 5) || (i==9 && j < 5) || (j==1 && i< 5) || (j==9 && i>5))
                 System.out.print("*");
                else
                 System.out.print(" "); 
            }
            System.out.println();
        }
    }
}