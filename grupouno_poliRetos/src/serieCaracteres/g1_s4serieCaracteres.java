package src.serieCaracteres;

// +-*/ +-*/ +-*/ //

public class g1_s4serieCaracteres extends controllersCaracteres {

public void g1_s4erieCaracteres_FOR(){
 
    int n = getScanner("S4: Serie Caracteres", "FOR");
    String[] caracter = {"+","-","*","/",};
    String cadena = "";
    for(int i = 0; i < n; i++){

  cadena += caracter[i %4];

 

    }

    System.out.print(cadena + " ");

}

public void g1_s4erieCaracteres_WHILE(){
    int n = getScanner("S4: Serie Caracteres", "WHILE");
    String[] caracter = {"+","-","*","/",};
    String cadena = "";
    int i = 0;
      

    while(i < n){
        cadena+= caracter[i %4 ] + "";
        i++;


    }
System.out.println(cadena);
 

    }

  public void g1_s4erieCaracteres_DO_WHILE(){
    int n = getScanner("S4: Serie Caracteres", "DO-WHILE");
    String[] caracter = {"+","-","*","/",};
    String cadena = "";
    int i = 0;
      

    do{
        cadena+= caracter[i %4 ] + "";
        i++;

    }while(i<n);

        System.out.println(cadena);
  }

}



