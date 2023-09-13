package lexicon.se.exception;

public class InvalidEmailException extends Exception{
    // to customise this class we can add fields...
   public InvalidEmailException(String message){
       super(message);
   }
}
