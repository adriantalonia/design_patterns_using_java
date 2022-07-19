package com.atr.behavior_patterns.memento.example01;

public class Client {
    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First set od data: \nMyra\nLucy\n");

        System.out.println(fileWriter + "\n\n");

        // lets save the file
        caretaker.save(fileWriter);

        // now write something else
        fileWriter.write("Second set of data:\nJason\n");

        // checking file contents
        System.out.println(fileWriter + "\n\n");

        // let undo to last save
        caretaker.undo(fileWriter);

        // checking file content again
        System.out.println(fileWriter + "\n\n");
    }
}
