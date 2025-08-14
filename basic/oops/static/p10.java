class CreditCard{
    public void handlePayment(){}
}
class DebitCard{
    public void handlePayment(){}
}
class UPIPayment{
    public void handlePayment(){}
}
class Payment{
    public void handlePayment(String paymentBy){
        if(paymentBy.equals("credit")){
            // Creadit card payment 
        }
        else if(paymentBy.equals("Debit")){
            // Depit Card payment...
        }
    }
}