package edu.cnm.deepdive;

public class StringMatch {


  public int stringMatch(String a, String b) {
    int counter;
    counter = 0;
    if (a.length() < 1 || b.length() < 1) {
      return 0;
    }
    for (int i = 0; i < a.length() - 1; i++) {
      if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)) {
        counter++;
      }
    }
    return counter;
  }

}
