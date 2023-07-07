package com.devfun.settingweb_boot.service;
 
import java.util.HashMap;
 
public interface StatisticService {
    public HashMap<String,Object> yearloginNum (String year);
    public HashMap<String, Object> monthLoginNum (String month);
    public HashMap<String, Object> dayLoginNum ();
    public HashMap<String, Object> monthDayLoginNum (String monthDay);
    public HashMap<String, Object> avgLoginNum ();
    public HashMap<String, Object> monthOrganLoginNum (String month, String organ);
    
}