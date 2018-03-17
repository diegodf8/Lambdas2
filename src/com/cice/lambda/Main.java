package com.cice.lambda;

public class Main {

    public static void main(String[] args) {


        String cadena = "Esto Es Una Prueba";
        StringUtil str = new StringUtil();
        String output = str.changeStr( s -> s.replace("", "_"),cadena);

        System.out.println(output);

        IFuncional reverse = (ex) -> {
        String resultado="";
        for(int i = ex.length()-1;i >=0 ; i--){
            resultado += ex.charAt(i);
        }
        return resultado;
        };

        StringUtil str2 = new StringUtil();
        String output2= str2.changeStr(reverse, cadena);
        System.out.println(output2);

        StringFuncImpl sf1 = new StringFuncImpl();
        IFuncional sf = sf1::metodoReferenciado;

        String out = sf.func("Esto es otra nueva prueba");
        System.out.println("Ultima prueba " + out);
    }
}
