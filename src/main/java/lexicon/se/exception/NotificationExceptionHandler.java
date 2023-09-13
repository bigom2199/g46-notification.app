package lexicon.se.exception;

public class NotificationExceptionHandler {
    private static void handleException(Exception exception) {
        if (exception instanceof InvalidEmailException) {
            System.out.println(exception.getMessage());
        } else if (exception instanceof IllegalArgumentException) {
            System.out.println(exception.getMessage());
        }else if (exception instanceof IllegalArgumentException){
        } else if (exception instanceof EmailSendException) {

            System.out.println(exception.getMessage());

        }else {

            System.out.println("An unexpected error occurred.");
            exception.printStackTrace();

        }
    }
}