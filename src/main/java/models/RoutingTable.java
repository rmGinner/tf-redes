package models;

/**
 * Representa a tabela de roteamento.
 **/
public class RoutingTable {

    private int destinationPort;

    private int metric;

    private int exitPort;

    //Métrica será 0 para portas recém criadas.
    public RoutingTable(int destinationPort, int exitPort) {
        this.metric = 0;
        this.exitPort = exitPort;
        this.destinationPort = destinationPort;
    }
}
