package com.devfun.settingweb_boot.service;
 
 
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
 
@Service
public class StatisticServiceImpl implements StatisticService {
    
    
    @Autowired
    private StatisticMapper uMapper;
    
    @Override
    public HashMap<String, Object> yearloginNum (String year) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        System.out.println(year);
        System.out.println(uMapper.selectYearLogin(year));
        try {
            retVal = uMapper.selectYearLogin(year);
            retVal.put("year", year);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> monthLoginNum (String month) {
 
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        System.out.println(uMapper.selectMonthLogin(month));
        
        try {
            retVal = uMapper.selectMonthLogin(month);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> dayLoginNum () {

        HashMap<String, Object> retVal = new HashMap<String,Object>();

        try {
            retVal = uMapper.selectDayLogin();
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> monthDayLoginNum (String monthDay) {

        HashMap<String, Object> retVal = new HashMap<String,Object>();

        try {
            retVal = uMapper.selectMonthDayLogin(monthDay);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> avgLoginNum () {
        
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        try {
            retVal = uMapper.selectAvgLogin();
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("averageLogin", -999);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> monthOrganLoginNum (String month, String organ) {

        HashMap<String, Object> retVal = new HashMap<String,Object>();

        try {
            retVal = uMapper.selectMonthOrganLogin(month, organ);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
 
}