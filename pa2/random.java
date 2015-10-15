// random.java

class random {
  public static void main (String [] args){

    int count = 1;

    while (count <= 5) {
      int n = (int) (Math.random() * 10 + 1);
      System.out.println (n + "\n");
      count++;
    }
  }
}
