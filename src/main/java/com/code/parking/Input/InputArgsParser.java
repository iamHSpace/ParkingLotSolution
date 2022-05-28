package com.code.parking.Input;

public class InputArgsParser {
    public static void getInputParserConfig(String string) throws Exception {
        if(string.isEmpty()) {   // this means user is going to pass input via terminal
            new InputParser();
        }
        else {  // this means that user is going to pass instructions via input.txt file
            new FileParser(string);
        }
    }
}
