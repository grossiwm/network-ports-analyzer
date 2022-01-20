package com.gabrielrossi;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class CsvsGenerator {

    public static void generate(TransportProtocol transportProtocol) {

            File captureFolder = new File(transportProtocol.getCaptureFolder());
            List<File> captureFiles = Arrays.asList(Objects.requireNonNull(captureFolder.listFiles()));

            captureFiles.forEach(f -> {
                List<ServiceRecord> serviceRecords = ServiceRecordsGenerator.generate();

                List<CaptureRecord> captureRecords = CaptureRecordsGenerator.generate(f.getPath());

                Set<Result> results = ResultListGenerator.generate(captureRecords, serviceRecords, transportProtocol);

                try {
                    ResultCsvGenerator.generate(results, f.getName().replace(".csv", "") + "_out");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

    }
}
