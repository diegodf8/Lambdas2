package com.cice.lambda;

public class StringFuncImpl {
    public String metodoReferenciado(String s){
        String resultado= null;

        for( int i = 0; i%2==0; i++ ){
            String str = String.valueOf(s.charAt(i));
            resultado += s.replace(str, str.toUpperCase());
        }

        return resultado;
    }

}
