/*
  Valid signature of main method
  1. public static void main(String args[])
  2. public static final void main(String args[])
  3. public static synchronized void main(String args[])
  4. public static stirctfp void main(String args[]) // strictfp :- strict floating-point
  5. static public void main(String args[])
  6. public static void main(String... args) // ... var-arg [Variable length argument]
  7. public static final synchronized strictfp void main(String... lili)
 */
class Test{
    public static final synchronized strictfp void main(String... lili){
        System.out.println("Hello Java.");
    }
}








