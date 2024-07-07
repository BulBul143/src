package july5;

public class creditCard implements paymentMethod {
    long CN;String date;
    public creditCard(long CN,String date) {
        this.CN = CN;
        this.date = date;
    }
    public void pay() {
        System.out.println("you are payying to astha");
    }
    public void getPaymentDetails() {
        System.out.println("your payment details are: card no. :"+CN+", Expiring on:"+date);
    }
    }



