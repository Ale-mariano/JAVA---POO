package program2;

import entities.Department;
import entities.HourContract;
import entities.enums.Worker;
import entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {

 public static void main(String[] args) throws ParseException {
     
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
     
     System.out.print("Enter department's name: ");
     String DepartamentName = sc.nextLine();
     System.out.println("Enter worker data: ");
     System.out.print("Name: ");
     String workerName = sc.nextLine();
     System.out.print("Level: ");
     String workerLevel = sc.nextLine();
     System.out.print("Base salary: ");
     double baseSalary = sc.nextDouble();
     
     Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(DepartamentName));
     
     System.out.print("How many contracts to this worker?: ");
     int n = sc.nextInt();
     
     //faz o contrato ser associado por trabalhador
      for(int i = 1; i <=n; i++) {
          System.out.println("Enter contract #" + i + "data:");
          System.out.print("Date(DD/MM/YYYY): ");
          Date contractDate = sdf.parse(sc.next());
          System.out.print("Value per hours: ");
          double valuePerHour = sc.nextDouble();
          System.out.print("Duraction(hours): ");
          int hours = sc.nextInt();
          HourContract contract = new HourContract(contractDate, valuePerHour, hours);
          worker.addContract(contract);
      }
      
      System.out.println();
      System.out.print("Enter month and year to calcule income (MM/YYYY): ");
      String monthAndYear = sc.next();
      int month = Integer.parseInt(monthAndYear.substring(0, 2));
      int year = Integer.parseInt(monthAndYear.substring(3));
      System.out.print("Name: " + worker.getName());
      System.out.print("Department: " + worker.getDepartament().getName());
      System.out.print("Income for: " + monthAndYear + ":" + String.format("%.2f", worker.income(year, month)));
     
     sc.close();
    }
    
}
