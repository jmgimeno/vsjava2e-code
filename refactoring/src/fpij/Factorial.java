/***
 * Excerpted from "Functional Programming in Java, Second Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit https://pragprog.com/titles/vsjava2e for more book information.
***/
package fpij;

import java.math.BigInteger;

public class Factorial {
  public BigInteger compute(long upTo) {
    BigInteger result = BigInteger.ONE;
    
    for(int i = 1; i <= upTo; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }
    
    return result;
  }
}
