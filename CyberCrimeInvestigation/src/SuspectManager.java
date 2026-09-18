import java.util.ArrayList;
import java.util.List;

public class SuspectManager {

    private List<Suspect> suspects = new ArrayList<>();

    public void addSuspect(Suspect suspect) {
        suspects.add(suspect);
        System.out.println("Suspect added successfully!");
    }

    public void viewSuspects() {

        if (suspects.isEmpty()) {
            System.out.println("No suspects found.");
            return;
        }

        System.out.println("\n===== SUSPECT LIST =====");

        for (Suspect suspect : suspects) {
            suspect.displaySuspect();
            System.out.println("------------------------");
        }
    }
}
