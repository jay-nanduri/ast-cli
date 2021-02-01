package com.checkmarx.ast;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Component
public class CxASTAuth {

    public CxASTAuth(){
        astRun();
    }

    public void astRun() {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec("ast.exe");
            System.out.println(process.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
