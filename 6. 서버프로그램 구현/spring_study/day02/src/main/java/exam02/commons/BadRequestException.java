package exam02.commons;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message){
        super(message); // super()
    }
}
