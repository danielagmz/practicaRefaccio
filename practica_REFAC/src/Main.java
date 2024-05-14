import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcio;
        do {
            System.out.println(
                    "___  ___                    \n" +
                            "|  \\/  |                    \n" +
                            "| .  . |  ___  _ __   _   _ \n" +
                            "| |\\/| | / _ \\| '_ \\ | | | |\n" +
                            "| |  | ||  __/| | | || |_| |\n" +
                            "\\_|  |_/ \\___||_| |_| \\__,_|\n");
            System.out.println("1. Calculo del numero mas grande ");
            System.out.println("2. resolver 2x²+3x+1=0");
            System.out.println("3. Crear una nueva orden");

            System.out.println("0. Acabar");
            System.out.print("> ");
            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:

                    System.out.print("introdueix el primer numero: ");
                    int num1 = scan.nextInt();
                    System.out.print("introdueix el segon numero: ");
                    int num2 = scan.nextInt();
                    scan.nextLine();
                    System.out.println(max(num1,num2));
                    break;
                case 2:
                    double a=2;
                    double b=3;
                    double c=1;
                    calcEquacioSegongrau(a, b, c);
                    break;
                case 3:
                    List<OrderLineItem> lineItems = new ArrayList<>();
                    lineItems.add(new OrderLineItem("producto1",1,1));
                    Order orden1 = new Order(lineItems, 5.5);
                    System.out.println("Orden creada");
                    System.out.println(orden1);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 3");
            }
            System.out.println();
        } while (opcio != 0);
    }
    public static String max(int a, int b) {
        if(a > b) {
            return a + " es mas grande que " + b;
        } else if (a == b) {
            return "Los dos numeros son iguales";
        } else {
            return b + " es mas grande que " + a;
        }
    }
    public static void calcEquacioSegongrau(double a, double b, double c) {
        double Discriminante = b * b - 4 * a * c;
        if (Discriminante > 0) {
            double x1, x2;
            x1 = CalcularIncognitas(a,b,Discriminante,"-");
            x2 = CalcularIncognitas(a,b,Discriminante,"+");
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (Discriminante == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }

    private static double CalcularIncognitas(double a,double b,double discriminante, String signo){
       if (signo.equals("-")){
           return (-b - Math.sqrt(discriminante)) / (2 * a);
       }
       return (-b + Math.sqrt(discriminante)) / (2 * a);
    }
}