package edu.cnm.deepdive;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringMatchTest {

  @Test
  public void stringMatch() {
    StringMatch stringMatchInstance = new StringMatch();
    assertEquals(2, stringMatchInstance.stringMatch("abc", "abc"));
    assertEquals(0, stringMatchInstance.stringMatch("abc", "axc"));
    assertEquals(3, stringMatchInstance.stringMatch("xxcaazz", "xxbaaz"));
    assertEquals(1, stringMatchInstance.stringMatch("hello", "he"));
    assertEquals(1, stringMatchInstance.stringMatch("he", "hello"));
  }
}