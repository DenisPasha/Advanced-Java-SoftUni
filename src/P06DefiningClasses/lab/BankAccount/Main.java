package P06DefiningClasses.lab.BankAccount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> commandList = Arrays.stream(scanner.nextLine().split(" ")).toList();
        Map<Integer , BankAccount> map = new HashMap<>();

        while (!commandList.get(0).equals("End")){

            String command = commandList.get(0);
            if (command.equals("Create")){
                BankAccount bankAccount = new BankAccount();
                map.put(bankAccount.getId(), bankAccount);

                System.out.printf("Account ID%d created%n",bankAccount.getId());


            }else if (command.equals("GetInterest")){

                int id = Integer.parseInt(commandList.get(1));
                int years = Integer.parseInt(commandList.get(2));

                if (map.containsKey(id)){
                   BankAccount bankAccount = map.get(id);
                 double result =  bankAccount.getInterest(years);
                    System.out.printf("%.2f%n",result);
                }else {
                    System.out.printf("Account does not exist%n");
                }

            } else if (command.equals("SetInterest")) {

                double interest = Double.parseDouble(commandList.get(1));
                BankAccount.setInterestRate(interest);

            } else if (command.equals("Deposit")) {

                int id = Integer.parseInt(commandList.get(1));
                double money = Double.parseDouble(commandList.get(2));

                if (map.containsKey(id)){
                    BankAccount bankAccount = map.get(id);
                    bankAccount.deposit(money);
                    System.out.printf("Deposited %.0f to ID%d%n",money,id);
                }else {
                    System.out.println("Account does not exist");
                }

            }


            commandList = Arrays.stream(scanner.nextLine().split(" ")).toList();
        }
    }
}
