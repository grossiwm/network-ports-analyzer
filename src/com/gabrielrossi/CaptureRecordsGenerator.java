package com.gabrielrossi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CaptureRecordsGenerator {
    public static List<CaptureRecord> generate(String csvPath) {
        String DELIMITER =";";
        int PORT_INDEX = 0;
        int PERCENT_INDEX = 1;
        List<CaptureRecord> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String[] values = line.split(DELIMITER);
                    CaptureRecord captureRecord = new CaptureRecord();
                    captureRecord.setPercent(Double.parseDouble(values[PERCENT_INDEX].replace(",", ".")));
                    captureRecord.setPort(Integer.parseInt(values[PORT_INDEX]));
                    records.add(captureRecord);
                } catch (Exception e) {

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return records;
    }
}
