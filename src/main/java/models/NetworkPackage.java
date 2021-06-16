package models;

/**
 * Pacote que será transmitido na rede entre roteadores.
 **/
public class NetworkPackage {

    private String header;

    private String data;

    public NetworkPackage(){

    }

    public NetworkPackage(String header, String data){
        this.header = header;
        this.data = data;
    }
}
