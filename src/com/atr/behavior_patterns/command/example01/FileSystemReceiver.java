package com.atr.behavior_patterns.command.example01;

interface FileSystemReceiver {
    void openFile();

    void writeFile();

    void closeFile();
}

class UnixFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in Linux OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Linux OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Linux OS");
    }
}

class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in Windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Windows OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Windows OS");
    }
}
