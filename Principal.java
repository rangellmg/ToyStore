package br.com.toystore;

import javax.swing.JOptionPane;

public class Principal {

    static AutomatoJson automatos = new AutomatoJson();
    static MontagemJson montagens = new MontagemJson();
    static EletronicoJson eletronicos = new EletronicoJson();
    static MinicomputadorJson miniComputadores = new MinicomputadorJson();

    public static void cadastrarBrinquendo() {
        int menu;

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Qual é o tipo de brinquedo a ser inserido?\n\n"
                                                                + "1)Brinquedo de Montagem"
                                                                + "\n2)Autômatos"
                                                                + "\n3)Eletrônico"
                                                                + "\n4)Minicomputador"
                                                                + "\nDigite 0 para voltar ao menu principal\n"));

            switch (menu) {

                case 1:
                    Montagem brinquedo = new Montagem();
                    brinquedo.setNome(JOptionPane.showInputDialog("Insira o nome do brinquedo: "));
                    brinquedo.setIdadeMinima(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade mínima do brinquedo: ")));
                    brinquedo.setDescMaterial(JOptionPane.showInputDialog("Descreva o tipo de material do brinquedo: "));
                    brinquedo.setQtdPeca(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de peças: ")));
                    montagens.add(brinquedo);
                    JOptionPane.showMessageDialog(null, "Brinquedo inserido com sucesso!");
                    break;

                case 2:
                    Automato toy = new Automato();
                    toy.setNome(JOptionPane.showInputDialog("Insira o nome do brinquedo: "));
                    toy.setIdadeMinima(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade mínima: ")));
                    toy.setDescMaterial(JOptionPane.showInputDialog("Descreva o tipo de material do brinquedo: "));
                    toy.setTipoEnergia(JOptionPane.showInputDialog("Insira o tipo de energia: "));
                    automatos.add(toy);
                    JOptionPane.showMessageDialog(null, "Brinquedo inserido com sucesso!");
                    break;

                case 3:
                    Eletronico juguete = new Eletronico();
                    juguete.setNome(JOptionPane.showInputDialog("Insira o nome do brinquedo: "));
                    juguete.setIdadeMinima(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade mínima: ")));
                    juguete.setDescMaterial(JOptionPane.showInputDialog("Descreva o tipo de material do brinquedo: "));
                    juguete.setCaracteristica(JOptionPane.showInputDialog("Insira a característica do brinquedo: "));
                    juguete.setQtdPilhas(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade pilhas do brinquedo:")));
                    eletronicos.add(juguete);
                    JOptionPane.showMessageDialog(null, "Brinquedo inserido com sucesso!");
                    break;

                case 4:
                    Minicomputador jouet = new Minicomputador();
                    jouet.setNome(JOptionPane.showInputDialog("Insira o nome do brinquedo: "));
                    jouet.setIdadeMinima(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade mínima: ")));
                    jouet.setDescMaterial(JOptionPane.showInputDialog("Descreva o tipo de material do brinquedo: "));
                    jouet.setCaracteristica(JOptionPane.showInputDialog("Insira a característica do brinquedo: "));
                    jouet.setQtdPilhas(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade pilhas do brinquedo:")));
                    jouet.setQtdFuncao(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de funções do brinquedo:")));
                    miniComputadores.add(jouet);
                    JOptionPane.showMessageDialog(null, "Brinquedo inserido com sucesso!");
                    break;
            }
        } while (0 != (menu));

    }

    public static void listarBrinquedo() {
        int menu;
        String lista = "";
        
        
        
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Qual é o tipo de brinquedo a ser listado?\n\n"
                                                                + "1)Brinquedos de Montagem"
                                                                + "\n2)Autômatos"
                                                                + "\n3)Eletrônicos"
                                                                + "\n4)Minicomputadores"
                                                                + "\n5)Listar todos"
                                                                + "\nDigite 0 para voltar ao menu principal\n"));
            
            lista = "";
            
            switch (menu) {

                case 1:
                    for (int i = 0; i < montagens.size(); i++) {
                            lista += montagens.get(i).toString() + "\n\n";
                    }
                    if (lista == "") {
                        JOptionPane.showMessageDialog(null, "Nenhum brinquedo do tipo montagem foi inserido");
                    } else {
                        JOptionPane.showMessageDialog(null, lista);
                    }
                    break;

                case 2:
                    for (int i = 0; i < automatos.size(); i++) {
                        lista += automatos.get(i).toString() + "\n\n";
                    }
                    if (lista == "") {
                        JOptionPane.showMessageDialog(null, "Nenhum brinquedo do tipo autômato foi inserido");
                    } else {
                        JOptionPane.showMessageDialog(null, lista);
                    }
                    break;

                case 3:
                    for (int i = 0; i < eletronicos.size(); i++) {
                            lista += eletronicos.get(i).toString() + "\n\n";
                    }
                    if (lista == "") {
                        JOptionPane.showMessageDialog(null, "Nenhum brinquedo do tipo eletrônico foi inserido");
                    } else {
                        JOptionPane.showMessageDialog(null, lista);
                    }
                    break;

                case 4:
                    for (int i = 0; i < miniComputadores.size(); i++) {
                            lista += miniComputadores.get(i).toString() + "\n\n";
                    }
                    if (lista == "") {
                        JOptionPane.showMessageDialog(null, "Nenhum brinquedo do tipo MiniComputador foi inserido");
                    } else {
                        JOptionPane.showMessageDialog(null, lista);
                    }
                    break;

                case 5:
                    for (int i = 0; i < automatos.size(); i++) {
                        lista += automatos.get(i).toString() + "\n\n";
                    }
                    
                    for (int i = 0; i < miniComputadores.size(); i++) {
                        lista += montagens.get(i).toString() + "\n\n";
                    }
                    
                    for (int i = 0; i < eletronicos.size(); i++) {
                        lista += montagens.get(i).toString() + "\n\n";
                    }
                    
                    for (int i = 0; i < montagens.size(); i++) {
                        lista += montagens.get(i).toString() + "\n\n";
                    }
                    
                    if (lista == "") {
                        JOptionPane.showMessageDialog(null, "Nenhum brinquedo foi inserido");
                    } else {
                        JOptionPane.showMessageDialog(null, lista);
                    }
                    break;
            }
        } while (0 != (menu));
    }

    public static void buscarBrinquedo() {
        String procurar = JOptionPane.showInputDialog("Insira o nome do brinquedo: ");
        boolean achou = false;
        
        for(int i = 0; i < automatos.size(); i++){
            if(((Brinquedo) automatos.get(i)).getNome().equalsIgnoreCase(procurar)){
                JOptionPane.showMessageDialog(null, automatos.get(i).toString());
                achou = true;
            }
        }
        
        for(int i = 0; i < montagens.size(); i++){
            if(((Brinquedo) montagens.get(i)).getNome().equalsIgnoreCase(procurar)){
                JOptionPane.showMessageDialog(null, montagens.get(i).toString());
                achou = true;
            }
        }
        
        for(int i = 0; i < eletronicos.size(); i++){
            if(((Brinquedo) eletronicos.get(i)).getNome().equalsIgnoreCase(procurar)){
                JOptionPane.showMessageDialog(null, eletronicos.get(i).toString());
                achou = true;
            }
        }
        
        for(int i = 0; i < miniComputadores.size(); i++){
            if(((Brinquedo) miniComputadores.get(i)).getNome().equalsIgnoreCase(procurar)){
                JOptionPane.showMessageDialog(null, miniComputadores.get(i).toString());
                achou = true;
            }
        }
        
        if(!achou){
            JOptionPane.showMessageDialog(null, "Nenhum brinquedo encontrado com esse nome");
        }
    }

    public static void main(String[] args) {

        int controle;

        do {
            controle = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n\n"
                                                                    + "1)Cadastrar brinquedos:"
                                                                    + "\n2)Listar todos o brinquedos:"
                                                                    + "\n3)Buscar brinquedo:"
                                                                    + "\nDigite 0 para sair"));

            switch (controle) {

                case 1:
                    cadastrarBrinquendo();
                break;

                case 2:
                    listarBrinquedo();
                break;
                    
                case 3:
                    buscarBrinquedo();
                break;
            }
        } while (0 != (controle));
    }
}
