package aula06;

public class Conjunto {
    private int[] vetor; 

    public Conjunto() {
        this.vetor = new int[0];
    }

    public Conjunto(int[] vetor) {
        this.vetor = vetor;
    }
    
    public int[] getVetor() {
        return vetor;
    }

    public boolean contains(int num){
        for (int i = 0; i < this.vetor.length; i++) {
            if (this.vetor[i] == num) {
                return true;
            }
        }
        return false;
    }

    public boolean insert(int num){
        if (this.contains(num)) {
            return false;
        }
        int[] conjuntoTemporario = new int[this.vetor.length + 1];
        for (int i = 0; i < this.vetor.length; i++) {
            conjuntoTemporario[i] = this.vetor[i];
        }
        conjuntoTemporario[conjuntoTemporario.length - 1] = num;
        this.vetor = conjuntoTemporario;
        return true;
    }

    public boolean remove(int num){
        if (!this.contains(num)) {
            return false;
        }
        int[] conjuntoTemporario = new int[this.vetor.length - 1];
        int j = 0;
        for (int i = 0; i < this.vetor.length; i++) {
            if (this.vetor[i] != num) {
                conjuntoTemporario[j] = this.vetor[i];
                j++;
            }
        }
        this.vetor = conjuntoTemporario;
        return true;
    } 
    
    public int size(){
        return this.vetor.length;
    }

    public void empty(){
        this.vetor = new int[0];
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < this.vetor.length; i++) {
            s += this.vetor[i] + " ";
        }
        return s;
    }

    public Conjunto unir(Conjunto c){
        Conjunto conjuntoTemporario = new Conjunto();
        for (int i = 0; i < this.vetor.length; i++) {
            conjuntoTemporario.insert(this.vetor[i]);
        }
        for (int i = 0; i < c.getVetor().length; i++) {
            conjuntoTemporario.insert(c.getVetor()[i]);
        }
        return conjuntoTemporario;
    }

    public Conjunto interset(Conjunto c){
        Conjunto conjuntoTemporario = new Conjunto();
        for (int i = 0; i < this.vetor.length; i++) {
            if (c.contains(this.vetor[i])) {
                conjuntoTemporario.insert(this.vetor[i]);
            }
        }
        return conjuntoTemporario;
    }

    public Conjunto subtrair(Conjunto c){
        Conjunto conjuntoTemporario = new Conjunto();
        for (int i = 0; i < this.vetor.length; i++) {
            if (!c.contains(this.vetor[i])) {
                conjuntoTemporario.insert(this.vetor[i]);
            }
        }
        return conjuntoTemporario;
    }
}
