package enums;

/**
 * Opções do usuário que ele poderá informar no console.
 **/
public enum UserOptions {

    SEND_FILE("SF"),
    SEND_MESSAGE("SM"),
    REGISTER_PORT("RP");

    private String code;

    UserOptions(String code) {
        this.code = code;
    }

    public String getCode(){
        return code;
    }
}
