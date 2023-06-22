class add {
  public static void main(String args[]) {
    int n = 1, sum = 0;
    while (n <= 10) {
      if (n % 2 == 0)
        sum = sum + n;
      n = n + 1;
    }
    System.out.println(sum);
  }
}