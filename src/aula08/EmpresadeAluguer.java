package aula08;

import utils.*;
import java.util.ArrayList;
import java.util.List;

public class EmpresadeAluguer {
    private String nome;
    private String codPostal;
    private String email;
    private List<Veiculo> veiculos = new ArrayList<>();

    public EmpresadeAluguer(String nome, String codPostal, String email) {
        if (Valids.validCodPostal(codPostal)){
            this.codPostal = codPostal;
        }
        else{
            System.out.println("Código Postal Inválido!");
        }
        if (Valids.validEmail(email)){
            this.email = email;
        }
        else{
            System.out.println("Email Inválido!");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public String getEmail() {
        return email;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodPostal(String codPostal) {
       if (Valids.validCodPostal(codPostal)){
            this.codPostal = codPostal;
        }
    }

    public void setEmail(String email) {
        if (Valids.validEmail(email)){
            this.email = email;
        }
    }

    public void addVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public void removeVeiculo(Veiculo veiculo){
        if (veiculos.contains(veiculo)){
        veiculos.remove(veiculo);}
    }

    public Veiculo getVeiculo(String matricula){
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getMatricula().equals(matricula)){
                return veiculo;
            }
        }
        return null;
    }

    public void removeVeiculo(String matricula){
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getMatricula().equals(matricula)){
                veiculos.remove(veiculo);
            }
        }
    }









    
    
}
