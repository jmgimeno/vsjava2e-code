/***
 * Excerpted from "Functional Programming in Java, Second Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit https://pragprog.com/titles/vsjava2e for more book information.
***/
package fpij;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class ListDirs {
  public static void main(String[] args) throws IOException {
      Files.list(Paths.get("."))
           .filter(Files::isDirectory)
           .forEach(System.out::println);
  }
}
