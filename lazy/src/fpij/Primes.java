/***
 * Excerpted from "Functional Programming in Java, Second Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit https://pragprog.com/titles/vsjava2e for more book information.
***/
package fpij;

import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import static fpij.PrimeFinder.isPrime;

public class Primes {
  private static int primeAfter(final int number) {
    if(isPrime(number + 1)) {
      return number + 1;
    } 

    return primeAfter(number + 1);
  }
  
  public static List<Integer> primes(final int fromNumber, final int count) {
    return Stream.iterate(primeAfter(fromNumber - 1), Primes::primeAfter)
                 .limit(count)
                 .collect(toList());
  }  
  //...
  
  public static void main(final String[] args) {
    System.out.println("10 primes from 1: " + primes(1, 10));
      
    System.out.println("5 primes from 100: " + primes(100, 5));
  }

}
