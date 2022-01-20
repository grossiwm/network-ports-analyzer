package com.gabrielrossi;

public enum TransportProtocol {
    TCP("files/capture-results/tcp"), UDP("files/capture-results/udp");

    TransportProtocol(String captureFolder) {
        this.captureFolder = captureFolder;
    }

    private String captureFolder;

    public String getCaptureFolder() {
        return captureFolder;
    }
}
