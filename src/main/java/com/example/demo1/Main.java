package com.example.demo1;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        Database db = Database.getInstance();

        // Generowanie soli a następnie wykonanie funkcji skrótu na haśle i soli
        String salt = User.generateSalt();
        String hash = User.generateHash("1234", salt);

        // Tworzenie nowej instancji klasy User
        User user1 = new User("user1", "Kornel", "Ciepotka", hash, salt);

        // Utworzenie obiektu JSON, który następnie umieścimy w bazie danych
        JSONObject jo1 = db.jsonifyUser(user1);

        // Stworzenie obiektu JSON, który będzie przechowywał wszystkie obiekty reprezentujące urzytkowników
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("jo1", jo1);

        db.writeJsonObject("Users", jsonObject);



        // Na podstawie powyższego kodu stwórz i dodaj do bazy danych instancję klasy Contestant
        // Zwróć uwagę na metodę jsonifyUser() w klasie Database, będzie ona pomocna przy wykonywaniu zadania



        Database.close();
    }
}
