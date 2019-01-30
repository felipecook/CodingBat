import static org.junit.Assert.*;

import org.junit.Test;

public class EveryNthTest {

  @Test
  public void everyNth() {
    EveryNth everyNthInstance = new EveryNth();
    assertEquals("Mrce",everyNthInstance.everyNth("Miracle", 2));
    assertEquals("aceg",everyNthInstance.everyNth("abcdefg", 2));
    assertEquals("adg",everyNthInstance.everyNth("abcdefg", 3));


  }
}