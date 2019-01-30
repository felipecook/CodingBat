package edu.cnm.deepdive;

public class MissingChar {

  public String missingChar(String str, int n) {
    char[] output = new char[str.length() - 1];
    char[] input = str.toCharArray();
    for (int i = 0; i < n; i++){
      output[i] = input[i];
    }
    for (int j = n; j < output.length; j++){
      output[j] = input[j + 1];

    }
    return new String(output);
  }



}
