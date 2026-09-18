import javax.swing.*;
import java.awt.*;

public class CaseManagementGUI extends JFrame {

    private CaseManager caseManager;
    private SuspectManager suspectManager;
    private EvidenceManager evidenceManager;

    public CaseManagementGUI() {

        caseManager = new CaseManager();
        suspectManager = new SuspectManager();
        evidenceManager = new EvidenceManager();

        setTitle("Cyber Crime Investigation System");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1, 10, 10));

        JLabel title = new JLabel(
                "CYBER CRIME INVESTIGATION SYSTEM",
                SwingConstants.CENTER
        );

        title.setFont(new Font("Arial", Font.BOLD, 20));

        panel.add(title);

        JButton addCase = new JButton("Add Case");
        JButton viewCases = new JButton("View Cases");
        JButton searchCase = new JButton("Search Case");
        JButton addSuspect = new JButton("Add Suspect");
        JButton viewSuspects = new JButton("View Suspects");
        JButton addEvidence = new JButton("Add Evidence");
        JButton viewEvidence = new JButton("View Evidence");

        panel.add(addCase);
        panel.add(viewCases);
        panel.add(searchCase);
        panel.add(addSuspect);
        panel.add(viewSuspects);
        panel.add(addEvidence);
        panel.add(viewEvidence);

        add(panel);

        // ADD CASE
        addCase.addActionListener(e -> {

            JTextField id = new JTextField();
            JTextField crime = new JTextField();
            JTextField description = new JTextField();
            JTextField severity = new JTextField();

            Object[] fields = {
                    "Case ID:", id,
                    "Crime Type:", crime,
                    "Description:", description,
                    "Severity:", severity
            };

            int result = JOptionPane.showConfirmDialog(
                    this,
                    fields,
                    "Add Case",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (result == JOptionPane.OK_OPTION) {

                Case c = new Case(
                        id.getText(),
                        crime.getText(),
                        description.getText(),
                        severity.getText(),
                        "Open"
                );

                caseManager.addCase(c);

                JOptionPane.showMessageDialog(
                        this,
                        "Case added successfully!"
                );
            }
        });

        // VIEW CASES
        viewCases.addActionListener(e -> {

            caseManager.viewCases();

            JOptionPane.showMessageDialog(
                    this,
                    "Cases are displayed in the console."
            );
        });

        // SEARCH CASE
        searchCase.addActionListener(e -> {

            String id = JOptionPane.showInputDialog(
                    this,
                    "Enter Case ID:"
            );

            if (id != null) {
                caseManager.searchCase(id);
            }
        });

        // ADD SUSPECT
        addSuspect.addActionListener(e -> {

            JTextField id = new JTextField();
            JTextField name = new JTextField();
            JTextField contact = new JTextField();
            JTextField address = new JTextField();

            Object[] fields = {
                    "Suspect ID:", id,
                    "Name:", name,
                    "Contact:", contact,
                    "Address:", address
            };

            int result = JOptionPane.showConfirmDialog(
                    this,
                    fields,
                    "Add Suspect",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (result == JOptionPane.OK_OPTION) {

                Suspect suspect = new Suspect(
                        Integer.parseInt(id.getText()),
                        name.getText(),
                        contact.getText(),
                        address.getText()
                );

                suspectManager.addSuspect(suspect);

                JOptionPane.showMessageDialog(
                        this,
                        "Suspect added successfully!"
                );
            }
        });

        // VIEW SUSPECTS
        viewSuspects.addActionListener(e -> {

            suspectManager.viewSuspects();

            JOptionPane.showMessageDialog(
                    this,
                    "Suspects are displayed in the console."
            );
        });

        // ADD EVIDENCE
        addEvidence.addActionListener(e -> {

            JTextField id = new JTextField();
            JTextField type = new JTextField();
            JTextField description = new JTextField();

            Object[] fields = {
                    "Evidence ID:", id,
                    "Evidence Type:", type,
                    "Description:", description
            };

            int result = JOptionPane.showConfirmDialog(
                    this,
                    fields,
                    "Add Evidence",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (result == JOptionPane.OK_OPTION) {

                Evidence evidence = new Evidence(
                        Integer.parseInt(id.getText()),
                        type.getText(),
                        description.getText()
                );

                evidenceManager.addEvidence(evidence);

                JOptionPane.showMessageDialog(
                        this,
                        "Evidence added successfully!"
                );
            }
        });

        // VIEW EVIDENCE
        viewEvidence.addActionListener(e -> {

            evidenceManager.viewEvidence();

            JOptionPane.showMessageDialog(
                    this,
                    "Evidence is displayed in the console."
            );
        });
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            CaseManagementGUI gui = new CaseManagementGUI();
            gui.setVisible(true);

        });
    }
}
