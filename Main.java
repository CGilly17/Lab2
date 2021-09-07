class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int total;
    double blue, brown, green, orange, red, yellow;
    double sum;
     total = 55*11;

     blue = total * 0.24;
     brown = total * 0.13;
     green = total * 0.16;
     orange = total * 0.2;
     red = total * 0.13;
     yellow = total * 0.14;
     sum = blue+brown+green+orange+red+yellow;
     

     System.out.println("blue: "+blue);
     System.out.println("brown: "+brown);
     System.out.println("green: "+green);
     System.out.println("orange: "+orange);
     System.out.println("red: "+red);
     System.out.println("yellow: "+yellow);
     System.out.println("Sum: "+sum);

     if (blue<brown && red>orange)
     System.out.println("Blue under Brown and Red over Orange");

     if(brown>=green)
     System.out.println("Brown is greater than or equal to Green");

     if(sum==total)
     System.out.println("Numbers match");






  }
}