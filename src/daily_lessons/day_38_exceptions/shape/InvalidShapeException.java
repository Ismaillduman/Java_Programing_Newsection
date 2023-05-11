package daily_lessons.day_38_exceptions.shape;

public class InvalidShapeException extends RuntimeException{
    public InvalidShapeException(String message) {
        super(message);
    }

}
