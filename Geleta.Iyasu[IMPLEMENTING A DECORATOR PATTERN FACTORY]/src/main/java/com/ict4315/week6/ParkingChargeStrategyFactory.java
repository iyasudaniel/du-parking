package com.ict4315.week6;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.ict4315.week5;
//
//import com.ict4315.week5.Interfaces.ParkingChargeStrategy;
//
///**
// *
// * @author iyasu
// */
//public class ParkingChargeStrategyFactory {
//    private ParkingDetails parkingDetails;
//    public ParkingChargeStrategy getInstance(String str){
//        if(str.equalsIgnoreCase("dayOfWeek"))
//            return new DiscountOnDayOfWeekDecorator(parkingDetails);
//        else if(str.equalsIgnoreCase("specialDays"))
//            return new DiscountOnSpecialDaysDecorator(parkingDetails);
//        else if(str.equalsIgnoreCase("timeOfDay"))
//            return new DiscountOnTimeOfDayDecorator(parkingDetails);
//        else
//            return new DiscountOnVehicleTypeDecorator(parkingDetails);
//    }
//}
