package july5;

public class Run2 {
	public static void main(String[] args) {
        paymentMethod c_card = new creditCard(12675498, "5july2024");
        paymentMethod pp = new paypal("astha.com", 1239876, "5july2024");
        c_card.pay();
        c_card.getPaymentDetails();
        pp.pay();
        pp.getPaymentDetails();
        
    }
}

