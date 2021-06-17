package controllers;

import communicators.RouterCommunicator;
import models.RoutingTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Processador dos controles enviados / recebidos aos outros roteadores de atualição / troca de tabelas.
 * Utiliza o {@link RouterCommunicator} para os controles dados ao roteador.
 **/
public class ControlsController {

    private final Map<String, RoutingTable> routingTableList;
    private final RouterCommunicator routerCommunicator;

    public ControlsController(RouterCommunicator routerCommunicator){
        this.routingTableList = new HashMap<>();
        this.routerCommunicator =  routerCommunicator;
    }

    public void updateRoutingTable(){

    }
}
