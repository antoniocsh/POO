package aula06;

import java.util.regex.*;

public class Contactos {
    private String email;
    private int telefone;
    private int id;
    private static int idCounter = 1;
    private Pessoa pessoa;

    public Contactos(Pessoa pessoa, String email, int telefone) {
        this.email = email;
        this.telefone = telefone;
        this.pessoa = pessoa;
        this.id = idCounter++;
    }

    public Contactos(Pessoa pessoa, String email) {
        this.email = email;
        this.pessoa = pessoa;
        this.id = idCounter++;
        this.telefone = 0;
    }

    public Contactos(Pessoa pessoa, int telefone) {
        this.telefone = telefone;
        this.pessoa = pessoa;
        this.id = idCounter++;
        this.email = "";
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public String getNome() {
        return pessoa.getNome();
    }

    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public static boolean validTele(int numero){
        return 900000000 <= numero && numero <= 999999999;
    }

    public static boolean validEmail(String email){
        String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }



    @Override
    public String toString() {
        String s = "";
        if (telefone == 0) {
            s = String.format("ID: %d; Nome: %s; Email: %s", this.getId(), this.getPessoa().getNome(), this.getEmail());
            
        }
        else if (email == "") {
            s = String.format("ID: %d; Nome: %s; Telefone: %d", this.getId(), this.getPessoa().getNome(), this.getTelefone());
            
        }
        else {s = String.format("ID: %d; Nome: %s; Email: %s; Telefone: %d", this.getId(), this.getPessoa().getNome(), this.getEmail(), this.getTelefone());
        }
        return s;
    }


    
}
