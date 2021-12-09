package com.bilgeadam.clientserverhwobject2;

import java.io.Serializable;

public class PortAndIpClass implements Serializable {
    private int port;
    private String ip; //127.0.0.1 / localhost

    public PortAndIpClass(int port) {
        this.port = port;
    }

    public PortAndIpClass(int port, String ip) {
        this.port = port;
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public String getIp() {
        return ip;
    }
}
