package de.micromata.opengis.kml.v_2_2_0;

/**
 * Exception thrown when an error occurs while reading KML data. 
 * 
 * @author gideon
 */
public class KmlUnmarshalException extends Exception {

    public KmlUnmarshalException(String message) {
        super(message);
    }

    public KmlUnmarshalException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
