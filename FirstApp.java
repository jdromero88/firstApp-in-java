class FirstApp{
  public static void main(String[] args) {
    Print holaMundo = new Print(); //instanciamos la clase Print
    holaMundo.printing("Hola Mundo"); //llamamos al metodo printing
    holaMundo.printing("Hello World"); //llamamos al metodo printing
    holaMundo.printing("Ha upei?"); //llamamos al metodo printing
  }
  static class Print{
    void printing(String word){
      System.out.println("This is the word: "+ word);
    }
  }
}
