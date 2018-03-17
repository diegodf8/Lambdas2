package com.cice.lambda;

public class Main {

    public static void main(String[] args) {

        String cadena = "Esto Es Una Prueba";

        //definicion y uso de landa s
        StringUtil str = new StringUtil();
        String output = str.changeStr( s -> s.replace("", "_"),cadena);
        System.out.println(output);

        // Definicion de lambda reverse
        IFuncional reverse = (ex) -> {
        String resultado =  "";
        for(int i = ex.length()-1;i >=0 ; i--){
            resultado += ex.charAt(i);
        }
        return resultado;
        };

        //Uso de lambda reverse

        StringUtil str2 = new StringUtil();
        String output2= str2.changeStr(reverse, cadena);
        System.out.println(output2);

        //Definición de lambda mayusculas

        IFuncional mayus = (ex2) ->{
          String resultado ="";
          char c;

          for(int i = 0; i < ex2.length() ; i++){
              c = ex2.charAt(i);
              if (Character.isUpperCase(c))
                  resultado += Character.toLowerCase(c);
              else
                  resultado += Character.toUpperCase(c);
          }
          return  resultado;
        };

        //Uso de lambda mayusculas

        StringUtil str3 = new StringUtil();
        String output3= str3.changeStr(mayus, "La cadena Que QUIEro probar AHORA");
        System.out.println(output3);

        //Referencia a métodos

        StringFuncImpl sf1 = new StringFuncImpl();
        IFuncional sf = sf1::metodoReferenciado;

        String out = sf.func("Esto es otra nueva prueba");
        System.out.println("Ultima prueba " + out);
    }
}
