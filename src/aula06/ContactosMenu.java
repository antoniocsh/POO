package aula06;

import java.util.Scanner;
import java.util.ArrayList;
import utils.*;

public class ContactosMenu {
    private static ArrayList<Contactos> contactos = new ArrayList<>();
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static int telefone = 0;
    private static String email = "";
    private static Contactos c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int kekw;
        Pessoa p = null;
        Contactos c, cAlt, cDel;

        // menu
        while (continuar) {
            System.out.println("-=-=-=-MENU-=-=-=-");
            System.out.println("1 - Inserir contacto");
            System.out.println("2 - Alterar contacto");
            System.out.println("3 - Apagar contacto");
            System.out.println("4 - Procurar contacto");
            System.out.println("5 - Listar contactos");
            System.out.println("0 - Sair");
            System.out.println("-=-=-=-=-=-=-=-");

            int resposta = UserInput.intInput("Qual a sua opção? ");
            switch (resposta) {
                case 1: // INSERIR CONTACTO

                    String nome = UserInput.stringNVInput("Qual o nome do contacto? ");
                    if (!existePessoa(nome)) {
                        p = criarPessoa(nome);
                        pessoas.add(p);
                    } else {
                        System.out.println("Esta pessoa já tem um contacto!");
                    }
                    c = criarContacto(p);
                    System.out.println(c);
                    break;

                case 2: // ALTERAR CONTACTO
                    if (contactos.isEmpty()) {
                        System.out.println("Não existem contactos!");
                        break;
                    }

                    System.out.println("Insira o nome ou número do contacto que pretende alterar: ");
                    String alt = sc.nextLine();

                    if (!existePessoa(alt)) {
                        kekw = tentarContacto(alt);
                        if (!existeContacto(kekw)) {
                            System.out.println("Não existe nenhum contacto com esse nome ou número!");
                        }
                        break;
                    }
                    if (existePessoa(alt)) {
                        for (Contactos contacto : contactos) {
                            if (contacto.getNome().equals(alt)) {
                                cAlt = contacto;
                                System.out.println("Contacto a alterar: " + cAlt);
                                c = editarContacto(p);
                                System.out.println(c);
                                break;
                            }
                        }
                    } else if (existeContacto(tentarContacto(alt))) {
                        for (Contactos contacto : contactos) {
                            if (contacto.getTelefone() == tentarContacto(alt)) {
                                cAlt = contacto;
                                System.out.println("Contacto a alterar: " + cAlt);
                                c = editarContacto(p);
                                System.out.println(c);
                                break;
                            }
                        }
                    }

                case 3: // APAGAR CONTACTO
                    if (contactos.isEmpty()) {
                        System.out.println("Não existem contactos!");
                        break;
                    }

                    // menu
                    System.out.println("-=-=-=-MENU-=-=-=-");
                    System.out.println("1 - Apagar contacto por nome");
                    System.out.println("2 - Apagar contacto por número");
                    System.out.println("0 - Sair");
                    System.out.println("-=-=-=-=-=-=-=-");

                    int resposta1 = UserInput.intInput("Qual a opção? ");
                    switch (resposta1) {
                        case 1:
                            int contagem = 0;
                            String nomeDel = UserInput.stringInput("Qual o nome do contacto? ");
                            for (Contactos contacto : contactos) {
                                if (contacto.getNome().equals(nomeDel)) {
                                    cDel = contacto;
                                    contactos.remove(cDel);
                                    System.out.println(cDel);
                                    contagem++;
                                    break;
                                }
                            }
                            if (contagem == 0) {
                                System.out.println("Não existe nenhum contacto com esse nome!");
                            }
                            break;

                        case 2:
                            contagem = 0;
                            int numDel = UserInput.intInput("Qual o número do contacto? ");
                            for (Contactos contacto : contactos) {
                                if (contacto.getTelefone() == numDel) {
                                    cDel = contacto;
                                    contactos.remove(cDel);
                                    System.out.println(cDel);
                                    contagem++;
                                    break;
                                }
                            }
                            if (contagem == 0) {
                                System.out.println("Não existe nenhum contacto com esse número!");
                            }
                            break;

                        case 0:
                            break;

                        default:
                            System.out.println("Opção inválida!");

                    }
                    break;

                case 4: // PROCURAR CONTACTO
                    if (contactos.isEmpty()) {
                        System.out.println("Não existem contactos!");
                        break;
                    }

                    System.out.println("-=-=-=-MENU-=-=-=-");
                    System.out.println("1 - Procurar contacto por nome");
                    System.out.println("2 - Procurar contacto por número");
                    System.out.println("0 - Sair");
                    System.out.println("-=-=-=-=-=-=-=-");

                    int resposta2 = UserInput.intInput("Qual a opção? ");

                    switch (resposta2) {
                        case 1:
                            String nomePro = UserInput.stringInput("Qual o nome do contacto? ");
                            for (Contactos contacto : contactos) {
                                if (contacto.getNome().contains(nomePro)) {
                                    System.out.println(contacto + "\n");
                                }
                            }
                            break;

                        case 2:
                            int numPro = UserInput.intInput("Qual o número do contacto? ");
                            for (Contactos contacto : contactos) {
                                if (contacto.getTelefone() == numPro) {
                                    System.out.println(contacto + "\n");
                                }
                            }
                            break;

                        case 0:
                            break;

                        default:
                            System.out.println("Opção inválida!");

                    }
                    break;

                case 5: // LISTAR CONTACTOS

                    if (contactos.isEmpty()) {
                        System.out.println("Não existem contactos!");
                        break;
                    }
                    System.out.println();
                    System.out.println("Lista de contactos: ");
                    System.out.println();
                    for (Contactos contacto : contactos) {
                        System.out.println(contacto + "\n");
                    }
                    break;

                case 0: // BREKAR
                    continuar = false;
                    System.out.println("Até à próxima!");
                    break;

                default: // DEFAULT
                    System.out.println("Opção inválida!");
                    break;
            }

        }
        sc.close();

    }

    public static Pessoa criarPessoa(String nome) {
        int dia, mes, ano;
        DateYMD data;
        int cc = UserInput.intInput("CC: ");
        do {
            ano = UserInput.intInput("Ano? ");
            mes = UserInput.intInput("Mês? ");
            dia = UserInput.intInput("Dia? ");
            data = new DateYMD(dia, mes, ano);
        } while (!data.valid(dia, mes, ano));
        DateYMD dataNasc = new DateYMD(dia, mes, ano);
        Pessoa p = new Pessoa(nome, cc, dataNasc);

        for (Contactos contacto : contactos) {
            if (contacto.getPessoa().getNome().equals(nome)) {
                System.out.println("Esta pessoa já possui um contacto!");
                System.out.println(contacto);
                return null;
            }
        }

        return p;
    }

    public static boolean existePessoa(String nome) {
        for (Pessoa p : pessoas) {
            if (p.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public static boolean existeContacto(int num) {
        for (Contactos c : contactos) {
            if (c.getTelefone() == num) {
                return true;
            }
        }
        return false;
    }

    public static Contactos getContactoByPessoa(Pessoa p) {
        for (Contactos c : contactos) {
            if (c.getPessoa().getNome().equals(p.getNome())) {
                return c;
            }
        }
        return null;
    }

    public static Contactos criarContacto(Pessoa p) {
        telefone = 0;
        email = "";
        while (true) {
            email = UserInput.stringVInput("Qual o email do contacto? ");
            String tele = UserInput.stringVInput("Qual o telefone do contacto? ");

            try {
                telefone = Integer.parseInt(tele);
            } catch (NumberFormatException e) {
                telefone = 0;
            }

            if (email.equals("") && telefone == 0) {
                System.out.println("Não pode inserir um contacto sem email nem telefone válidos!");
                continue;
            } else if (email.equals("")) {
                if (Contactos.validTele(telefone)) {
                    c = new Contactos(p, telefone);
                    contactos.add(c);
                    return c;
                } else {
                    System.out.println("O número de telefone não é válido!");
                    continue;
                }
            } else if (telefone == 0) {
                if (Contactos.validEmail(email)) {
                    c = new Contactos(p, email);
                    contactos.add(c);
                    return c;
                } else {
                    System.out.println("O email não é válido!");
                    continue;
                }
            } else {
                if (Contactos.validEmail(email) && Contactos.validTele(telefone)) {
                    c = new Contactos(p, email, telefone);
                    contactos.add(c);
                    return c;
                } else {
                    System.out.println("O email e o número de telefone não são válidos!");
                    continue;
                }
            }
        }
    }

    public static Contactos editarContacto(Pessoa p) {
        Contactos cEdit = getContactoByPessoa(p);
        telefone = 0;
        email = "";
        while (true) {
            email = UserInput.stringVInput("Qual o email do contacto? (deixe vazio para nao alterar)");
            String tele = UserInput.stringVInput("Qual o telefone do contacto? (deixe vazio para nao alterar)");
            try {
                telefone = Integer.parseInt(tele);
            } catch (NumberFormatException e) {
                telefone = 0;
            }

            if (email.equals("") && telefone == 0) {
                break;
            } else if (email.equals("")) {
                if (Contactos.validTele(telefone)) {
                    cEdit.setTelefone(telefone);
                    ;
                    return cEdit;
                } else {
                    continue;
                }
            } else if (telefone == 0) {
                if (Contactos.validEmail(email)) {
                    cEdit.setEmail(email);
                    return cEdit;
                } else {
                    break;
                }
            } else {
                if (Contactos.validEmail(email) && Contactos.validTele(telefone)) {
                    cEdit.setEmail(email);
                    cEdit.setTelefone(telefone);
                    return cEdit;
                } else {
                    break;
                }
            }
        }
        return null;
    }

    public static int tentarContacto(String tentar) {
        int kekw;
        try {
            kekw = Integer.parseInt(tentar);
        } catch (NumberFormatException e) {
            kekw = 0;
        }
        return kekw;
    }

}