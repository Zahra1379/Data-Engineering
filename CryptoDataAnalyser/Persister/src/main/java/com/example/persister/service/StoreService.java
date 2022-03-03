package com.example.persister.service;

import com.example.persister.model.Crypto;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class StoreService {

    // Save object into a file.
    public static void writeObjectToFile(Crypto obj, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            oos.flush();
        }
    }

    // Deserialization
    // Get object from a file.
    public static Crypto readObjectFromFile(File file) throws IOException, ClassNotFoundException {
        Crypto result = null;
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            result = (Crypto) ois.readObject();
        }
        return result;
    }
}
