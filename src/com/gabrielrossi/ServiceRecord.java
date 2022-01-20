package com.gabrielrossi;

public class ServiceRecord {
    private int port;
    private String serviceName;
    private String transportProtocol;
    private String description;

    public int getPort() {
        return port;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setPort(int port) {
        this.port = port;
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
}
