import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListRunner {
    static ArrayList<StringBuilder> todoList = new ArrayList<StringBuilder>();

    public static void main(String[] args) {
        System.out.println("Welcome to To-Do List Application");
        while (true) {
            ToDoList listOne = new ToDoList();
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add Task");
            System.out.println("2.Mark Task As Complited .");
            System.out.println("3.Task List");
            System.out.println("4.Delete Conplited Task");
            System.out.println("5.Exit");
            System.out.println("Enter the index to move foreward :");
            int response = sc.nextInt();
            if (response == 1) { listOne.addTask(todoList);System.out.println();
            } else if (response == 2) { listOne.markDone(todoList); System.out.println();
            } else if (response == 3) {listOne.printList(todoList);System.out.println();
            } else if (response == 4) {listOne.removeDoneWorks(todoList);System.out.println();
            } else if (response == 5) { System.out.println("Thank You for Using The Application"); break;
            } else { System.out.println("Not a Valied Input and Try Again.....");
            }

        }

    }
}