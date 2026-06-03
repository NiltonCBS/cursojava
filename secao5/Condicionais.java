package secao5;

public class Condicionais {
  public static void main(String[] args) {
    
    // 1 - o que é boolean?
    boolean isTrue = true;
    boolean isFalse = false;

    System.out.println(isTrue);
    System.out.println(isFalse);


    //Operadores de comparação
    int x = 10;

    System.out.println(x == 10);

    System.out.println(x == 9);

    System.out.println(x != 5);

    System.out.println(x != 10);

    System.out.println(x > 10);

    System.out.println(x >= 10);

    System.out.println(x < 10);

    System.out.println(x <= 10);

    // 3 - Atribuição e comparação 
    int n = 5;
    int m = 10;

    System.out.println(n == 12);
    System.out.println(n);
    System.out.println(n == m);

    // 4 - comparação de strings
    String str1 = "Java";
    String str2 = new String("Java");

    System.out.println(str1);
    System.out.println(str2);

    System.out.println(str1 == str2);

    System.out.println(str1 == "Java");

    System.out.println(str1.equals(str2));

    System.out.println(str2.equals(str1));

    System.out.println(str1.equals("Java"));

    String str3 = "JAVA";

    System.out.println(str1.equals(str3));

    //Java == JAVA (false) -> java == java
    System.out.println(str1.equalsIgnoreCase(str3));




  }
}
