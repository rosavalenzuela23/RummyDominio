/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author 
 */
public class DominioException extends Exception {
    public DominioException() {
        super();
    }

    public DominioException(String message) {
        super(message);
    }

    public DominioException(String message, Throwable cause) {
        super(message, cause);
    }

    public DominioException(Throwable cause) {
        super(cause);
    }

    public DominioException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
