public class EveryNth {

  public String everyNth(String str, int n) {
    char[] output = new char [str.length()];
    char[] input = str.toCharArray();
    for (int i = 0, j = 0; i < str.length(); i = i + n, j++) {
      output[j] = input[i];

    }

    return new String(output).trim();

  }

}
