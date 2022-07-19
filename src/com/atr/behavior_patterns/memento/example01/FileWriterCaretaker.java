package com.atr.behavior_patterns.memento.example01;

import java.io.FilterWriter;

public class FileWriterCaretaker {
    private Object obj;

    public void save(FileWriterUtil fileWriter) {
        this.obj = fileWriter.save();
    }

    public void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(obj);
    }
}
