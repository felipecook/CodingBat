package edu.cnm.deepdive;

import static org.junit.Assert.*;

public class MissingCharTest {

  @org.junit.Test
  public void missingChar() {
    MissingChar missingCharInstance = new MissingChar();
    assertEquals("ktten",missingCharInstance.missingChar("kitten", 1));
    assertEquals("itten",missingCharInstance.missingChar("kitten", 0));
    assertEquals("kittn",missingCharInstance.missingChar("kitten", 4));

  }
}