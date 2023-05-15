package utils;

import java.util.regex.*;

public class Valids {

    public static boolean validEmail(String email){
        String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validMatricula(String matricula){
        if(matricula.length() != 8){
            return false;
        }

        String regex1 = "[a-zA-Z]{2}-[0-9]{2}-[a-zA-Z]{2}";
        String regex2 = "[a-zA-Z]{2}-[0-9]{2}-[0-9]{2}";
        String regex3 = "[0-9]{2}-[0-9]{2}-[a-zA-Z]{2}";
        String regex4 = "[0-9]{2}-[a-zA-Z]{2}-[0-9]{2}";

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(matricula);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(matricula);
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(matricula);
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(matricula);

        return matcher1.matches() || matcher2.matches() || matcher3.matches() || matcher4.matches();     
    }

    public static boolean validNumQuadro(String numQuadro){
        if (numQuadro.length() != 17){
            if(numQuadro.length() > 17){
                return false;
            }
            else{
                String sos = "";
                for (int i = numQuadro.length(); i < 17; i++) {
                    sos += "0";
                }
                numQuadro = sos + numQuadro;
            }
    }
        String regex = "[a-zA-Z0-9]{17}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numQuadro);
        return matcher.matches();
    }

    public static boolean validCodPostal(String codPostal){
        if(codPostal.length() != 8){
            return false;
        }

        String regex = "[0-9]{4}-[0-9]{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(codPostal);
        return matcher.matches();
    }


    
}
