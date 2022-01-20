package com.gabrielrossi;

import java.util.*;

public class ResultListGenerator {

    public static Set<Result> generate(List<CaptureRecord> captureRecords, List<ServiceRecord> serviceRecords, TransportProtocol transportProtocol) {

        Set<Result> results = new HashSet<>();
        Result result;
        for (CaptureRecord captureRecord : captureRecords) {
            result = new Result();
            result.setPort(captureRecord.getPort());
            result.setPercent(captureRecord.getPercent());
            serviceRecords = serviceRecords.stream().filter(sr -> sr.getTransportProtocol().equalsIgnoreCase(transportProtocol.toString())).toList();
            Optional<ServiceRecord> serviceRecordOptional = serviceRecords.stream()
                    .filter(sr -> sr.getPort() == captureRecord.getPort()).findFirst();

            if (serviceRecordOptional.isPresent()) {
                ServiceRecord serviceRecord = serviceRecordOptional.get();
                result.setDescription(serviceRecord.getDescription());
                result.setServiceName(serviceRecord.getServiceName());
                result.setTransportProtocol(serviceRecord.getTransportProtocol());
            }

            results.add(result);

        }
        return results;
    }
}
