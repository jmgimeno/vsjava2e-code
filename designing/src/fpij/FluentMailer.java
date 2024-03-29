/***
 * Excerpted from "Functional Programming in Java, Second Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit https://pragprog.com/titles/vsjava2e for more book information.
***/
package fpij;

import java.util.function.Consumer;

public class FluentMailer {
  private FluentMailer() {}
  
  public FluentMailer from(final String address) { /*... */; return this; }
  public FluentMailer to(final String address)   { /*... */; return this; }
  public FluentMailer subject(final String line) { /*... */; return this; }
  public FluentMailer body(final String message) { /*... */; return this; }
  
  public static void send(final Consumer<FluentMailer> block) { 
    final FluentMailer mailer = new FluentMailer();
    block.accept(mailer); 
    System.out.println("sending..."); 
  }

  //...
  public static void main(final String[] args) {
    FluentMailer.send(mailer ->
      mailer.from("build@agiledeveloper.com")
            .to("venkats@agiledeveloper.com")
            .subject("build notification")
            .body("...much better..."));
  }
}
