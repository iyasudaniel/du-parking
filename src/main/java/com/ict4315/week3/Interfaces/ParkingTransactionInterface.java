/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week3.Interfaces;

import com.ict4315.week3.Date;

/**
 *
 * @author iyasus
 */
public interface ParkingTransactionInterface {
    
    public Date getDate();
    public PermitInterface getPermit();
    public ParkingLotInterface getParkingLot();
    public MoneyInterface getChargedAmount();
}
