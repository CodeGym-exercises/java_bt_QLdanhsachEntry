package com.codegym.todo;

public class ToDoList {
    Entry[] list = new Entry[10];
    int length;

    public ToDoList(){
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public void addEntry(Entry entry){
        this.list[this.length] = entry;
        this.length+=1;
    }

    public void removeEntry(int id){
        for(int i = id; i < this.length; i++){
            if(i == this.length-1){
                this.list[i] = null;
            }
            else {this.list[i] = this.list[i+1];}
        }
        this.length--;
    }

    public void soft(){
        for(int i = 0; i < this.length; i++){
            for(int j = i+1; j < this.length; j++){
                if(this.list[i].getPriority() < this.list[j].getPriority()){
                    Entry temp = this.list[i];
                    this.list[i] = this.list[j];
                    this.list[j] = temp;
                }
            }
        }
    }

    public void showToDoList(){
        for (int i = 0; i < this.length; i++){
            System.out.printf("\nEntry %d\n",i);
            this.list[i].showEntry();
        }
    }
}
