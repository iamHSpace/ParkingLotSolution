package com.code.parking.Input;

public class InputArgsParser {
    public static void getInputParserConfig(String string) throws Exception {
        if(string.isEmpty()) {
            new InputParser();
        }
        else {
            new FileParser(string);
        }
    }
}
