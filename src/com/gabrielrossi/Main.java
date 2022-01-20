package com.gabrielrossi;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        CsvsGenerator.generate(TransportProtocol.TCP);
        CsvsGenerator.generate(TransportProtocol.UDP);


    }
}
