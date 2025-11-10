package be.ucll.craftsmanship.DataProcessingPipeline;

import java.io.*;
import java.time.LocalDateTime;

public class JSONProcessor extends DataProcessor {
    private String inputFile;
    private String outputFile;
    private StringBuilder jsonData;

    public JSONProcessor(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.jsonData = new StringBuilder();
    }

    @Override
    void load() {
        System.out.println("Loading JSON from: " + inputFile);
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jsonData.append(line);
            }
            System.out.println("JSON loaded successfully");
        } catch (IOException e) {
            System.err.println("Error loading JSON: " + e.getMessage());
        }
    }

    @Override
    void transform() {
        System.out.println("Adding timestamp to JSON data...");
        String timestamp = LocalDateTime.now().toString();
        
        String json = jsonData.toString().trim();
        if (json.endsWith("}")) {
            json = json.substring(0, json.length() - 1);
            json += ", \"timestamp\": \"" + timestamp + "\"}";
            jsonData = new StringBuilder(json);
        }
    }

    @Override
    void save() {
        System.out.println("Saving JSON to: " + outputFile);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(jsonData.toString());
            System.out.println("JSON saved successfully");
        } catch (IOException e) {
            System.err.println("Error saving JSON: " + e.getMessage());
        }
    }
}
