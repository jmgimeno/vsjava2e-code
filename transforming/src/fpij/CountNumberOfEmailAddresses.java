/***
 * Excerpted from "Functional Programming in Java, Second Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit https://pragprog.com/titles/vsjava2e for more book information.
***/
package fpij;

import java.util.Map;
import java.util.List;
import static java.util.stream.Collectors.*;
import static fpij.Person.SAMPLE_DATA;

public class CountNumberOfEmailAddresses {
  public static void main(String[] args) {
    var namesAndEmailAddressesCount =
      SAMPLE_DATA.stream()
        .collect(groupingBy(
          Person::lastName,
          summingInt(person -> person.emailAddresses().size())));

    System.out.println(namesAndEmailAddressesCount);
  }
}
