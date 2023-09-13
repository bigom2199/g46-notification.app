package lexicon.se.exception;

public class DataNotFoundException extends RuntimeException {
    //...
    private String requestId;
    public DataNotFoundException(String message){
        super(message);
        this.requestId= requestId;

    }
    public String info(){
        return "Message:" + getMessage() +" RequestId:" + requestId;

    }
}
