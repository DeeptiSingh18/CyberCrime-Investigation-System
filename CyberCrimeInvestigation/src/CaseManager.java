import java.util.ArrayList;
import java.io.*;

public class CaseManager {

    ArrayList<Case> cases = new ArrayList<>();

    public CaseManager() {
        loadCases();
    }

    public void addCase(Case c) {

        cases.add(c);

        String data = c.caseId + " | "
                + c.crimeType + " | "
                + c.description + " | "
                + c.severity + " | "
                + c.status;

        FileManager.saveCase(data);
    }

    public void viewCases() {

        if (cases.isEmpty()) {
            System.out.println("No cases available.");
            return;
        }

        for (Case c : cases) {
            c.displayCase();
        }
    }

    public void searchCase(String id) {

        for (Case c : cases) {

            if (c.caseId.equalsIgnoreCase(id)) {
                c.displayCase();
                return;
            }
        }

        System.out.println("Case not found.");
    }

    private void loadCases() {

        File file = new File("data/cases.txt");

        if (!file.exists()) {
            return;
        }

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("\\|");

                if (parts.length >= 5) {

                    String caseId = parts[0].trim();
                    String crimeType = parts[1].trim();
                    String description = parts[2].trim();
                    String severity = parts[3].trim();
                    String status = parts[4].trim();

                    Case c = new Case(
                            caseId,
                            crimeType,
                            description,
                            severity,
                            status
                    );

                    cases.add(c);
                }
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Error while loading cases.");
        }
    }
}