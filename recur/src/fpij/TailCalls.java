/***
 * Excerpted from "Functional Programming in Java, Second Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit https://pragprog.com/titles/vsjava2e for more book information.
***/
package fpij;

public class TailCalls {
  public static <T> TailCall<T> call(final TailCall<T> nextCall) {
    return nextCall;
  }
  public static <T> TailCall<T> done(final T value) {
    return new TailCall<T>() {      
      @Override public boolean isComplete() { return true; }
      @Override public T result() { return value; }
      @Override public TailCall<T> apply() { 
        throw new Error("not implemented"); 
      }
    };
  }  
}
