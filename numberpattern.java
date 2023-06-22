class numberpattern {
  public static void main(String args[]) {
    int a = 10, b = 99;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 6; j++) {
        if (i % 2 != 0) {
          System.out.print(a++ + " ");
        } else {
          System.out.print(b-- + " ");
        }
      }
      System.out.println();
    }
  }
}