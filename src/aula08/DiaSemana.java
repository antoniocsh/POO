package aula08;


public enum DiaSemana {
    SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO;

    static DiaSemana getEnum(int i) {
        DiaSemana[] a = DiaSemana.values();
        return a[i];

    }
}

