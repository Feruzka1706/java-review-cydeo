package stream.task;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {

        // 1-Find all transactions in the year 2011 and sort them by value (small to high)
        TransactionData.transactionList().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("**********************");
        // 2- What are all the unique cities where the traders work
        TransactionData.transactionList().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("**********************");

        // 3- Find all traders from Cambridge and sort them by name
        TransactionData.transactionList().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("**********************");
        // 4- Return a string of all traders' names sorted alphabetically
               TransactionData.transactionList().stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("**********************");
        // 5 - Any traders based in Milan
        TransactionData.transactionList().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase("Milan"))
                .distinct()
                .forEach(System.out::println);

        System.out.println("**********************");
        // 6 - Print the values of all transactions from the traders living in Cambridge
        TransactionData.transactionList().stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("**********************");
        // 7 - What is the highest value of all the transactions
       Optional<Integer> maxTransactionValue = TransactionData.transactionList().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println("Maximum value of all transactions: "+maxTransactionValue.get());

        System.out.println("**********************");
       // 8 - Find the transaction with the smallest value
        Optional<Integer> minTransactionValue = TransactionData.transactionList().stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        System.out.println("Minimum value of all transactions: "+minTransactionValue.get());
    }

}
