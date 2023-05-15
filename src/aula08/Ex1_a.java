package aula08;


public class Ex1_a {
    public static void main(String[] args) {
        EmpresadeAluguer empresa = new EmpresadeAluguer("empresa", "3450-056", "empresa@gmail.com");
        Motociclo m = new Motociclo("a", "asdkuhasd", "A30", 220, MotoTipo.DESPORTIVO);
        m.trajeto(50000);
        AutoLigeiro al = new AutoLigeiro("AB-12-CD", "Amogus", "SUS", 126, 15, "1009087675467");
        al.trajeto(2000);
        PesadoMercadorias pm = new PesadoMercadorias("00-11-01", "Bugati", "IO3", 1500, "1037980938", 202300, 7000);
        pm.trajeto(50);
        PesadoPassageiros pp = new PesadoPassageiros("11-AA-12", "Honda", "SEILA", 90, "13973648708", 123500, 60);
        pp.trajeto(4003300);
        AutoEletrico ae = new AutoEletrico("11-DD-33", "Sugoma", "SOS", 127, 15, "10090876779367");
        ae.trajeto(2000);

        empresa.addVeiculo(m);
        empresa.addVeiculo(al);
        empresa.addVeiculo(pm);
        empresa.addVeiculo(pp);
        empresa.addVeiculo(ae);

        for(Veiculo veiculo : empresa.getVeiculos()) {
            System.out.println(veiculo);
            System.out.println();
        }

        double max = 0;
        for(Veiculo veiculo : empresa.getVeiculos()) {
            if(veiculo.distanciaTotal() > max) {
                max = veiculo.distanciaTotal();
            }
        }
        for(Veiculo veiculo : empresa.getVeiculos()) {
            if(veiculo.distanciaTotal() == max) {
                System.out.println("Veículo com mais km: " + veiculo.distanciaTotal() + "km");
                System.out.println(veiculo);
            }
        }
    }
}

