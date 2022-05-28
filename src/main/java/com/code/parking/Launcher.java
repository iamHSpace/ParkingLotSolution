package com.code.parking;

import com.code.parking.Input.InputArgsParser;

public class Launcher {
    public static void main(String[] args) throws Exception {
        if (args.length != 0) {
            InputArgsParser.getInputParserConfig(args[0]);   // if instruction file (input.txt) is being passed as parameter in terminal
        } else {
            InputArgsParser.getInputParserConfig(""); // if user wants to input instruction via terminal
        }
    }
}
