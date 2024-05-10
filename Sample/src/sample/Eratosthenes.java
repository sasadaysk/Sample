package sample;

import java.util.ArrayList;
import java.util.List;

public class Eratosthenes {

    public static void main(String[] args) {
        
        List<Object> primeNumbers = new ArrayList<>();
        
        for(int i=1;i<=100;i++) {
            if (i == 1) {
                continue;
            }            
            else if (i == 2  || i == 3 || i == 5 || i == 7) {
                primeNumbers.add(i);
                primeNumbers.add(",");
                continue;
            }
            else if (i%2==0 || i%3==0 || i%5==0 || i%7==0) {
                continue;
            }
            else {
                primeNumbers.add(i);
                primeNumbers.add(",");
            }
        }
        
        primeNumbers.forEach(System.out::print);
    }

}
