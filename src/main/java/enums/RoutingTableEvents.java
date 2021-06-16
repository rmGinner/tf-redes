package enums;

/**
 * Eventos que ocorrerão para ativar a troca / atualização das tabelas de roteamento.
 * A príncipio serão três eventos: Criação de portas, remoção de portas e redução de métrica.
 **/
public enum RoutingTableEvents {

    CREATE_PORT,
    REMOVE_PORT,
    REDUCE_METRIC;

}
