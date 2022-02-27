/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidprinciple;

/**
 *
 * @author hossa
 */
public interface NotificatiionService {
    public void sendOTP();

    public void sendTransactionReport(String medium);
}
