class heartshape {
  public static void main(String args[]) {
    for (int row = 0; row <= 5; row++) {
      for (int col = 0; col <= 6; col++) {
        if (row == 0 && col % 3 != 0 || row == 1 && col % 3 == 0 || row + col == 8 || row - col == 2){
          System.out.print("*");  
      }
        else {
          System.out.print(" ");
        }
        System.out.println();
  }
}
}
}