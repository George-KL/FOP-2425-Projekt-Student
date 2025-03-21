package hProjekt.mocking;

import org.tudalgo.algoutils.tutor.general.assertions.Context;

public class StudentImplementationException extends RuntimeException {

    private Context context;

    public StudentImplementationException(Throwable cause, Context context, String message) {
        super(message, cause);
        this.context = context;
    }

    public Context getContext() {
        return context;
    }
}
