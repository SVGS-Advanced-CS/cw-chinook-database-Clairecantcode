package com.svgs;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:./src/main/resources/chinook.db";

        try{
            Connection conn = DriverManager.getConnection(url);

            conn.close();
        }

        catch(Exception e){
            
        }

    }
}