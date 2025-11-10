package be.ucll.craftsmanship.DataProcessingPipeline;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVProcessor extends DataProcessor {
    private String inputFile;
    private String outputFile;
    private List<String> data;

    public CSVProcessor(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.data = new ArrayList<>();
    }

    @Override
    void load() {
        System.out.println("Loading CSV from: " + inputFile);
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
            System.out.println("Loaded " + data.size() + " lines");
        } catch (IOException e) {
            System.err.println("Error loading CSV: " + e.getMessage());
        }
    }

    @Override
    void transform() {
        System.out.println("Transforming data to uppercase...");
        for (int i = 0; i < data.size(); i++) {
            data.set(i, data.get(i).toUpperCase());
        }
    }

    @Override
    void save() {
        System.out.println("Saving CSV to: " + outputFile);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("CSV saved successfully");
        } catch (IOException e) {
            System.err.println("Error saving CSV: " + e.getMessage());
        }
    }
}
