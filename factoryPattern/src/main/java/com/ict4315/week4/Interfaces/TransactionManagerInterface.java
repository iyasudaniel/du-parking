/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4315.week4.Interfaces;

import com.ict4315.week4.Date;
import com.ict4315.week4.Money;
import com.ict4315.week4.ParkingTransaction;
import java.util.List;

/**
 *
 * @author iyasu
 */
public interface TransactionManagerInterface {
   public ParkingTransactionInterface park(Date parkingDate, PermitInterface permit, ParkingLotInterface parkingLot) throws Exception;
   public List<ParkingTransaction> getTransactions();
   public PermitInterface registerCar(CarInterface car) throws Exception;
   
   public MoneyInterface getParkingCharges(PermitInterface permit);
   
   public MoneyInterface getParkingCharges(PersonInterface customer);
}
