/**
 * исключение выбрасываемое в результате неправильного ввода
 */
public class WrongInputException extends RuntimeException {
    public WrongInputException(String errorMessage) {
        super(errorMessage);
    }
}

