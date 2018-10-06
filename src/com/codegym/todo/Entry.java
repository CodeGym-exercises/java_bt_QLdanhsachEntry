package com.codegym.todo;

public class Entry {
    static int count;
    private int priority;
    private String notes;

    public Entry(){};

    public Entry(int priority, String notes) {
        this.priority = priority;
        this.notes = notes;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getPriority() {
        return priority;
    }

    public void showEntry(){
        System.out.printf("Notes: %s\nPriority: %d\n", this.notes, this.priority);
    }

}
