public class Evidence {

    int evidenceId;
    String type;
    String description;

    public Evidence(int evidenceId, String type, String description) {
        this.evidenceId = evidenceId;
        this.type = type;
        this.description = description;
    }

    public void displayEvidence() {
        System.out.println("Evidence ID: " + evidenceId);
        System.out.println("Type: " + type);
        System.out.println("Description: " + description);
    }
}
