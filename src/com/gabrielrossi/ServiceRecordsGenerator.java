package com.gabrielrossi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRecordsGenerator {
    public static List<ServiceRecord> generate() {
        String DELIMITER =",";
        int SERVICE_NAME_INDEX = 0;
        int PORT_NUMBER_INDEX = 1;
        int TRANSPORT_PROTOCOL_INDEX = 2;
        int DESCRIPTION_INDEX = 3;
        List<ServiceRecord> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("files/service-names-port-numbers.csv"))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String[] values = line.split(DELIMITER);
                    ServiceRecord serviceRecord = new ServiceRecord();
                    serviceRecord.setServiceName(values[SERVICE_NAME_INDEX]);
                    serviceRecord.setPort(Integer.parseInt(values[PORT_NUMBER_INDEX]));
                    serviceRecord.setTransportProtocol(values[TRANSPORT_PROTOCOL_INDEX]);
                    serviceRecord.setDescription(values[DESCRIPTION_INDEX]);
                    records.add(serviceRecord);
                } catch (Exception e) {

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return records;
    }
}
