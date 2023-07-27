package exceptions.checked_unchecked;

public class MyExceptionChecked extends Exception{
    public MyExceptionChecked() {
        super();
    }

    public MyExceptionChecked(String message) {
        super(message);
    }
}
