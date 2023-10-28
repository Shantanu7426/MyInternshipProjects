import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Expense {

    String description;

    double amount;

    String category;

public Expense(String description, double amount, String category) {
    
    this.description = description;

    this.amount=amount;

    this.category = category;
}

public String toString() {

return "Description: " + description +  ", Amount: " + amount +  ", Category: " + category ;
    }
}

public class Expense_Tracker {

private static ArrayList<Expense> expenses = new ArrayList<>();


    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    boolean isRunning = true;

    while (isRunning) {

    System.out.println("Expense Tracker Menu:");
    System.out.println("1. Add Expense");
    System.out.println("2. View Expenses");
    System.out.println("3. Exit");
    System.out.print("Enter your choice: ");

    int choice = scanner.nextInt();
    scanner.nextLine(); 

    switch (choice) {

        case 1: addExpense (scanner);
            break;

        case 2: viewExpenses();
            break;
        case 3:   
            isRunning = false;
            saveExpensesToFile();
            break; 
        default:  System.out.println("Invalid choice. Please try again.");
            }
        }
    }


private static void addExpense (Scanner scanner) { 
    System.out.print("Enter Expense Description: "); 
    String description= scanner.nextLine();

    System.out.print("Enter Expense Amount: ");
    double amount = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Enter Expense Category: ");
    String category = scanner.nextLine();

    expenses.add(new Expense(description, amount, category)); 
    System.out.println("Expense added successfully.");
}
private static void viewExpenses() {

    if (expenses.isEmpty()) { 
        System.out.println("No expenses recorded yet."); 
    } else { 
        System.out.println("List of Expenses:"); 
        for (Expense expense: expenses) {
        
        System.out.println(expense);
        }
    }   
}

private static void saveExpensesToFile() {

try (PrintWriter writer = new PrintWriter("expenses.txt")) {

for (Expense expense: expenses) {
    writer.println(expense.description + "," + expense.amount + "," + expense.category);
}
    System.out.println("Expenses saved to file.");

} catch (IOException e) {

System.out.println("Error saving expenses to file: " + e.getMessage());
        }
    }
}