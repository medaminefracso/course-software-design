package interfacesegregationprinciple;

public class AccountReceivable {

    private Accounting transactionObject;

    public AccountReceivable(Accounting aTransaction) {
        transactionObject = aTransaction;
    }

    public void postPayment() {
        transactionObject.chargeCustomer();
    }

    public void sendInvoice() {
        transactionObject.prepareInvoice();
        // sends the invoice
    }
}
