package controllers;

import communicators.RouterCommunicator;
import models.NetworkPackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Processador das mensagens e envio de arquivos.
 * Utiliza o {@link RouterCommunicator} para enviar dados ao roteador.
 **/
public class DataController {

    private final RouterCommunicator routerCommunicator;

    public DataController(RouterCommunicator routerCommunicator){
        this.routerCommunicator = routerCommunicator;
    }

    public void sendMessage(String message){
        final var networkPackage = new NetworkPackage(null,message);
    }

    public void sendFile(File file) throws IOException {
        final var networkPackage = new NetworkPackage(null, new String(Files.readAllBytes(file.toPath())));
    }
}
