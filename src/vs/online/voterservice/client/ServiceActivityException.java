
package vs.online.voterservice.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-03-12T15:29:49.943+05:30
 * Generated source version: 3.1.10
 */

@WebFault(name = "ServiceFaultType", targetNamespace = "http://www.online.vs/VoterService/types")
public class ServiceActivityException extends Exception {
    
    private vs.online.voterservice.types.ServiceFaultType serviceFaultType;

    public ServiceActivityException() {
        super();
    }
    
    public ServiceActivityException(String message) {
        super(message);
    }
    
    public ServiceActivityException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceActivityException(String message, vs.online.voterservice.types.ServiceFaultType serviceFaultType) {
        super(message);
        this.serviceFaultType = serviceFaultType;
    }

    public ServiceActivityException(String message, vs.online.voterservice.types.ServiceFaultType serviceFaultType, Throwable cause) {
        super(message, cause);
        this.serviceFaultType = serviceFaultType;
    }

    public vs.online.voterservice.types.ServiceFaultType getFaultInfo() {
        return this.serviceFaultType;
    }
}