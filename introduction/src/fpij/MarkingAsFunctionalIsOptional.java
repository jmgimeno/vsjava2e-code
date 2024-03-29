/***
 * Excerpted from "Functional Programming in Java, Second Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit https://pragprog.com/titles/vsjava2e for more book information.
***/
package fpij;

public class MarkingAsFunctionalIsOptional {
  public interface Sample1 {
    boolean test(int input);
  }

  @FunctionalInterface
  public interface Sample2 {
    boolean test(int input);
  }
  
  public static void main(final String[] args) {
    Sample1 sample1 = input -> true;
    Sample2 sample2 = input -> true;
    
    System.out.println(sample1.test(4));
    System.out.println(sample2.test(4));
  }
}
