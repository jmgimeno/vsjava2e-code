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
import java.util.ArrayList;
import static fpij.Prices.prices;

public class DiscountImperative {
  public static void main(final String[] args) {
    double totalOfDiscountedPrices = 0.0;

    for(int price : prices) {
      if(price > 20) {
        totalOfDiscountedPrices += price * 0.9;
      }
    }
    System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
  }
}
