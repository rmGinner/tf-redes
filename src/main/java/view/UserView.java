package view;

import controllers.DataController;

/**
 * Faz a comunição com o usuário, gerenciando as opções escolhidas por ele e delegando as atividades solicitadas aos roteador (servidor).
 * A príncipio temos 3 opções do usuário: Envio de arquivo, envio de mensagem e cadastro de portas.
 **/
public class UserView {

    private final DataController dataController;

    public UserView(DataController dataController){
        this.dataController = dataController;
    }
}
