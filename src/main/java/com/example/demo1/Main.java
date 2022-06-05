package com.example.demo1;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        Database db = Database.getInstance();

        String salt = User.generateSalt();
        String hash = User.generateHash("1234", salt);
        User user1 = new User("user1", "Kornel", "Ciepotka", hash, salt);
        JSONObject jo1 = db.jsonifyUser(user1);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("jo1", jo1);

        db.writeJsonObject("Users", jsonObject);

        // Na podstawie powyższego kodu stwórz i dodaj do bazy danych instancję klasy Contestant
        // Zwróć uwagę na metodę jsonifyUser(), będzie ona pomocna przy wykonywaniu zadania



        Database.close();
    }
}
