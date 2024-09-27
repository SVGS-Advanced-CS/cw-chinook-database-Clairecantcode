package com.svgs;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    private static Connection conn;
    private static Statement state;
    public static void main(String[] args) {
        createDB();
        menu();
    }

    public static void menu(){
        System.out.println("1. Create a user");
        Scanner input =  new Scanner(System.in);
        String choice = input.nextLine();
        if(choice.equals("1")){
            System.out.println("Username: "){
                String username = input.nextLine();
                System.out.println("Password: ");
                String password = input.nextLine();
                System.out.println("Role: ");
                String role= input.nextLine();
                createUser(username,password,role);
            }
        }
    }

    public static void createUser(String u, String p, String r){
        
    }

    public static void createDB(){
        String url = "jdbc:sqlite:./src/main/resources/users.db";

        try{ 
            conn = DriverManager.getConnection(url);
            state=conn.createStatement();
            String query= "CREATE TABLE users(userId TEXT, password TEXT, role TEXT)";
            state.executeUpdate(query);
        }
        catch( Exception e){

        }
    }
        //String url = "jdbc:sqlite:./src/main/resources/users.db";
/* 
        try{
            Connection conn = DriverManager.getConnection(url);
            Statement state = conn.createStatement();


            String query = "UPDATE employees SET FirstName= 'Garfield, LastName='Andrew WHERE FirstName='Andrew";
            state.executeUpdate(query);

            query = "DELETE FROM employees WHERE FirstName= 'Laura'";
            state.executeUpdate(query);


             query = "SELECT  * FROM  employees ORDER BY LastName ASC";
            ResultSet results = state.executeQuery(query);
            while(results.next()){
                String first= results.getString("FirstName");
                System.out.println(first);

            }
            conn.close();
        }

        catch(Exception e){
            
        }
        /* /* */

    }
