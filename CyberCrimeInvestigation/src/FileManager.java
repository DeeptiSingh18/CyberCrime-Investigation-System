import java.io.*;

public class FileManager {

    static String fileName = "data/cases.txt";

    public static void saveCase(String data) {

        try {

            FileWriter writer = new FileWriter(fileName, true);

            writer.write(data + "\n");

            writer.close();

            System.out.println("Case saved successfully!");

        } catch (IOException e) {

            System.out.println("Error while saving the case.");
        }
    }

    public static void readCases() {

        try {

            File file = new File(fileName);

            if (!file.exists()) {
                System.out.println("No cases found.");
                return;
            }

            BufferedReader reader =
                    new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Error while reading cases.");
        }
    }
}
