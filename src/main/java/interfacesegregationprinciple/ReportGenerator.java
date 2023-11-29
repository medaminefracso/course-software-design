package interfacesegregationprinciple;

public class ReportGenerator {

    private Reporting transactionObject;

    public ReportGenerator(Reporting aTransactionObject) {
        transactionObject = aTransactionObject;
    }

    public void generateReport() {
        System.out.println(transactionObject.getName() + " " +
                transactionObject.productBreakdown() + " " +
                transactionObject.getDate());
    }
}
