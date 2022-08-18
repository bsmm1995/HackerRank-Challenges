package com.bsmm.network;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void getNetworkAddress() {
        String result = Main.getNetworkAddress("192.128.64.5", "255.255.0.0");
        assertEquals("192.128.0.0", result);

        result = Main.getNetworkAddress("192.168.1.56", "255.255.255.0");
        assertEquals("192.168.1.0", result);
    }
}