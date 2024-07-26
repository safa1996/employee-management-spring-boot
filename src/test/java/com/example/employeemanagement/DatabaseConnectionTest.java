package com.example.employeemanagement;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

class DatabaseConnectionTest
{
   private static final String URL = "jdbc:postgresql://localhost:5433/testbd";

   private static final String USER = "****";

   private static final String PASSWORD = "****";

   @Test
   void testDatabaseConnection()
   {
      assertDoesNotThrow(() -> {
         try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD))
         {
            System.out.println("Connected to PostgreSQL database!");
         }
      }, "Failed to connect to the PostgreSQL database");
   }
}
