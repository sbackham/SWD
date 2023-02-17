import java.util.Scanner;

public class ChangeComputationDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the cost of the item in Euros as a double ($$$.$$): ");
        double euroPrice = scanner.nextDouble();

        System.out.println("Enter how much you paid in USD in $20 bills('1' for 1 $20 bill): ");
        int twenty = scanner.nextInt();

        System.out.println("Enter how much you paid in USD in $10 bills('1' for 1 $10 bill): ");
        int ten = scanner.nextInt();

        System.out.println("Enter how much you paid in USD in $5 bills('1' for 1 $5 bill): ");
        int five = scanner.nextInt();

        System.out.println("Enter how much you paid in USD in $1 bills('1' for 1 $1 bill): ");
        int one = scanner.nextInt();

        System.out.println("Enter how much you paid in USD in quarters:('1' for 1 quarter): ");
        int quarter = scanner.nextInt();

        System.out.println("Enter how much you paid in USD in dimes:('1' for 1 dime): ");
        int dime = scanner.nextInt();

        System.out.println("Enter how much you paid in USD in nickles:('1' for 1 nickle): ");
        int nickle = scanner.nextInt();

        System.out.println("Enter how much you paid in USD in pennies:('1' for 1 penny): ");
        int penny = scanner.nextInt();

        double pricePaidUSD = (twenty*20 + ten*10 + five*5 + one*1 + quarter*0.25 + dime*0.10 + nickle*0.05 + penny*0.01);

        System.out.println("You gave the cashier: "+ pricePaidUSD + " in USD.");
        double usdToEuro = ChangeComputation.convertUSDtoEuro(pricePaidUSD); // compute the conversion
        System.out.println("This comes out to " + usdToEuro + " in Euros");
        double change = ChangeComputation.computeChange(euroPrice, usdToEuro);
        System.out.println("Your Change is: "+ change + " Euros.");
        System.out.println("Here are your bills: ");
        System.out.println(ChangeComputation.getBillsBack(change));
    }
}

