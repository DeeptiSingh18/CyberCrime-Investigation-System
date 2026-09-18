import java.util.ArrayList;
import java.util.List;

public class EvidenceManager {

    private List<Evidence> evidenceList = new ArrayList<>();

    public void addEvidence(Evidence evidence) {
        evidenceList.add(evidence);
        System.out.println("Evidence added successfully!");
    }

    public void viewEvidence() {

        if (evidenceList.isEmpty()) {
            System.out.println("No evidence found.");
            return;
        }

        System.out.println("\n===== EVIDENCE LIST =====");

        for (Evidence evidence : evidenceList) {
            evidence.displayEvidence();
            System.out.println("------------------------");
        }
    }
}
