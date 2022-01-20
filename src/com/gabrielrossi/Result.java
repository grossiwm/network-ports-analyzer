package com.gabrielrossi;

public class Result {
    private int port;
    private String serviceName;
    private String transportProtocol;
    private String description;
    private double percent;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTransportProtocol() {
        return transportProtocol;
    }

    public void setTransportProtocol(String transportProtocol) {
        this.transportProtocol = transportProtocol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return this.port + ";" + String.valueOf(this.percent).replace(".", ",") + ";" + this.transportProtocol + ";" + this.serviceName + ";" + this.description;
    }
}
