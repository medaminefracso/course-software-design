package lesson1.myimplementation;

public class DatabaseConnectionManager {

    public String getManagerInstance() {
        return "entityManagerInstance";
    }

    public String connect() {
        return "Connection to database established !";
    }

    public String getConnectionObject() {
        return "connection object";
    }

    public String disconnect() {
        return "disconnected from database";
    }
}
