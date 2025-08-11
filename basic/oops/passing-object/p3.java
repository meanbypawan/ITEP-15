/*
  int arr[] = new int[5];
  arr[0] = 10;
  arr[1] = 30;
 */
class Product{
    private int pid;
    private int price;
    private int quantity;
    public Product(int pid, int price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public int getPid(){
        return pid;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public static int findPid(Product p[]){
      int id=0,maxPrice = 0;
      for(Product product : p){
         if(product.price > maxPrice){
            id = product.pid;
            maxPrice = product.price;
         }
      } 
      return id;
    }
    public static int getTotalAmount(Product p[]){
        int totalAmount = 0;
        for(Product element : p){
          totalAmount = totalAmount + element.price * element.quantity;   
        }
        return totalAmount;
    }
}

class TestMain{
    public static void main(String args[]){
        Product productList[] = new Product[5];
        productList[0] = new Product(1,3000,2);
        productList[1] = new Product(2,50,2);
        productList[2] = new Product(3,40,1);
        productList[3] = new Product(4,20000,5);
        productList[4] = new Product(5,10,6);
        //Product.findPid(productList);
        for(Product product: productList)
          System.out.println(product.getPid()+" "+product.getPrice()); 
        System.out.println("---------------------");
        int pid = Product.findPid(productList);
        System.out.println("Id Of Product With Max Price : "+pid);

        int total = Product.getTotalAmount(productList);
        System.out.println("Total Anmount : "+total);
    }
}