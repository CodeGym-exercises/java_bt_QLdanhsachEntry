package com.codegym.test;

import com.codegym.todo.Entry;
import com.codegym.todo.ToDoList;

import java.util.Scanner;

public class TestToDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList tdl = new ToDoList();
        int choose = 0, priority, id;
        String notes;
        boolean continueLoop = true;
        while (continueLoop){
            System.out.println("\nMain menu");
            System.out.println("1-> Add Entry\n2->Remove Entry\n3->DisplayAll list\n4->Exit");
            System.out.print("Please enter your choose: ");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    scanner.nextLine();
                    System.out.printf("Enter notes: ");
                    notes = scanner.nextLine();
                    System.out.printf("Enter priority: ");
                    priority = scanner.nextInt();
                    tdl.addEntry(new Entry(priority,notes));
                    break;
                case 2:
                    System.out.printf("Enter id: ");
                    do{
                        id = scanner.nextInt();
                        if(id<0||id>tdl.getLength()){
                            System.out.printf("Please enter again!!");
                        }
                    }while(id<0||id>tdl.getLength());
                    tdl.removeEntry(id);
                    break;
                case 3:
                    tdl.soft();
                    tdl.showToDoList();
                    break;
                case 4:
                    continueLoop = false;
                    break;
            }
        }
    }

}
