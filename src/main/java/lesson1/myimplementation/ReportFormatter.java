package lesson1.myimplementation;

public class ReportFormatter {

    String formatType = "";

    private String convertObjectToXML(Object object) {
        String displayedMessage = "Here the XML report of your object";
        System.out.println(displayedMessage);
        return displayedMessage;
    }

    private String convertObjectToCSV(Object object) {
        String displayedMessage = "Here the CSV report of your object";
        System.out.println(displayedMessage);
        return displayedMessage;
    }

    public String getFormattedValue(Object object) {
        switch (formatType) {
            case "XML":
                this.convertObjectToXML(object);
                break;
            case "CSV":
                this.convertObjectToCSV(object);
                break;
            default:
                this.convertObjectToCSV(object);
        }
    };
}
