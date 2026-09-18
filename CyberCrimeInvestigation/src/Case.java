public class Case {

    String caseId;
    String crimeType;
    String description;
    String severity;
    String status;

    Case(String caseId, String crimeType, String description,
         String severity, String status) {

        this.caseId = caseId;
        this.crimeType = crimeType;
        this.description = description;
        this.severity = severity;
        this.status = status;
    }

    void displayCase() {

        System.out.println("\n----- CASE DETAILS -----");
        System.out.println("Case ID     : " + caseId);
        System.out.println("Crime Type  : " + crimeType);
        System.out.println("Description : " + description);
        System.out.println("Severity    : " + severity);
        System.out.println("Status      : " + status);
    }
}
