package test;

import ConnectionManager.PostgresConnectionManager;

import java.sql.Connection;

/**
 * Created by admin on 19-09-2017.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Welcome Java DAO Pattern Test Example");
        try {
            Connection connection = PostgresConnectionManager.getPostgresConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("success");
    }
}
