package com.company;

import java.io.File;

public class ErrorCatcher {
    public static void catchErrors (String[] args) throws Exception {
        if (args.length != Constants.ARGUMENTS_COUNT) {
            throw new Exception("incorrect number of arguments!");
        }
        File inFile = new File(args[Constants.INPUT_FILE]);
        if (!inFile.exists()) {
            throw new Exception("input file is not exist / have incorrect name");
        }
    }
}