package com.ericagudelo.exceptions;

public class QuantityProductsNotEqualException extends AssertionError{
    public static final String CANTIDAD_NO_CORRRESPONDE_EXCEPTION_MESSAGE = "La cantidad de productos no es igual";

    public QuantityProductsNotEqualException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
