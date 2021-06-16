package processors;

import communicators.RouterCommunicator;
import models.RoutingTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Processador dos controles enviados aos outros roteadores de atualição / troca de tabelas.
 * Utiliza o {@link RouterCommunicator} para os controles dados ao roteador.
 **/
public class ControlsProcessor {

    private final Map<String, RoutingTable> routingTableList;
    private final RouterCommunicator routerCommunicator;

    public ControlsProcessor(){
        this.routingTableList = new HashMap<>();
        this.routerCommunicator = new RouterCommunicator();
    }

    public void updateRoutingTable(){

    }
}
