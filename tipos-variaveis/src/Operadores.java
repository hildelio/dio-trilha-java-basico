public class Operadores {
  public static void main(String[] args) {
    String concatenacao = "?";
    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);
    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);
    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);
    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);
    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);
    

    int numero = 5;
    numero = - numero;
    System.out.println(numero);
    numero = - numero;
    System.out.println(numero);
    numero++;
    System.out.println(numero);
    numero--;
    System.out.println(numero);


    boolean variavel = true;
    variavel = !variavel;
    System.out.println(variavel);

    boolean resultado = false;
    if (!variavel)
      resultado = true;
    else
      resultado = false;
      System.out.println(resultado);
      
      boolean result = !variavel ? true : false;
      System.out.println(result);


    int numero1 = 1;
    int numero2 = 2;
    boolean simNao = numero1 == numero2;
    System.out.println("numeroUm é igual a numeroDois? " + simNao);
    
    simNao = numero1 != numero2;
    System.out.println("numeroUm é diferente de numeroDois? " + simNao);
    
    simNao = numero1 > numero2;
    System.out.println("numeroUm é maior que numeroDois? " + simNao);
    
    simNao = numero1 < numero2;
    System.out.println("numeroUm é menor que numeroDois? " + simNao);


    if(variavel || !variavel){
      System.out.println("Alguma condição é verdadeira");
    }

    if(!variavel && simNao) {
      System.out.println("As duas condições são verdadeiras");
    }
  }
}
