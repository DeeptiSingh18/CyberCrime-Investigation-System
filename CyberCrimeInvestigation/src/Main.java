import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CaseManager manager = new CaseManager();
        SuspectManager suspectManager = new SuspectManager();
        EvidenceManager evidenceManager = new EvidenceManager();

        while (true) {

            System.out.println("\n======================================");
            System.out.println("   CYBER CRIME INVESTIGATION SYSTEM");
            System.out.println("======================================");

            System.out.println("1. Add Case");
            System.out.println("2. View Cases");
            System.out.println("3. Search Case");
            System.out.println("4. Add Suspect");
            System.out.println("5. View Suspects");
            System.out.println("6. Add Evidence");
            System.out.println("7. View Evidence");
            System.out.println("8. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            // ADD CASE
            if (choice == 1) {

                System.out.print("Enter Case ID: ");
                String caseId = sc.nextLine();

                System.out.print("Enter Crime Type: ");
                String crimeType = sc.nextLine();

                System.out.print("Enter Description: ");
                String description = sc.nextLine();

                System.out.print("Enter Severity: ");
                String severity = sc.nextLine();

                Case c = new Case(
                        caseId,
                        crimeType,
                        description,
                        severity,
                        "Open"
                );

                manager.addCase(c);

            }

            // VIEW CASES
            else if (choice == 2) {

                manager.viewCases();

            }

            // SEARCH CASE
            else if (choice == 3) {

                System.out.print("Enter Case ID to search: ");
                String id = sc.nextLine();

                manager.searchCase(id);

            }

            // ADD SUSPECT
            else if (choice == 4) {

                System.out.println("\n===== ADD SUSPECT =====");

                System.out.print("Enter Suspect ID: ");
                int suspectId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Suspect Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Contact: ");
                String contact = sc.nextLine();

                System.out.print("Enter Address: ");
                String address = sc.nextLine();

                Suspect suspect = new Suspect(
                        suspectId,
                        name,
                        contact,
                        address
                );

                suspectManager.addSuspect(suspect);

            }

            // VIEW SUSPECTS
            else if (choice == 5) {

                suspectManager.viewSuspects();

            }

            // ADD EVIDENCE
            else if (choice == 6) {

                System.out.println("\n===== ADD EVIDENCE =====");

                System.out.print("Enter Evidence ID: ");
                int evidenceId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Evidence Type: ");
                String type = sc.nextLine();

                System.out.print("Enter Evidence Description: ");
                String description = sc.nextLine();

                Evidence evidence = new Evidence(
                        evidenceId,
                        type,
                        description
                );

                evidenceManager.addEvidence(evidence);

            }

            // VIEW EVIDENCE
            else if (choice == 7) {

                evidenceManager.viewEvidence();

            }

            // EXIT
            else if (choice == 8) {

                System.out.println("Thank you!");
                break;

            }

            else {

                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}