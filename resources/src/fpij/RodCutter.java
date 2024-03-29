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

public class RodCutter {
  private boolean mustFail;
  
  public RodCutter(final boolean fail) { mustFail = fail; }

  public void setPrices(final List<Integer> prices) {
    //...
    if(mustFail) {
      throw new RodCutterException("Invalid prices");
    }
  }

  public int maxProfit(final int length) {
    if (length == 0) {
      throw new RodCutterException("length should be greater than zero");
    }
    
    return 0;
  }
}
