package s191220013.encoder;

public class DecodingException extends Exception {

    public DecodingException(String param, int value) {
        super("Error while decoding! " + param + " has invalid value of: " + value);
    }
}
