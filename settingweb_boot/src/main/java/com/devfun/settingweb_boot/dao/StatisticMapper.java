package com.devfun.settingweb_boot.dao;
import java.util.HashMap;
 
//import com.devfun.settingweb_boot.dto.StatisticDto;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
    public HashMap<String, Object> selectMonthLogin(String month);
    public HashMap<String, Object> selectDayLogin();
    public HashMap<String, Object> selectMonthDayLogin(String monthDay);
    public HashMap<String, Object> selectAvgLogin();
    public HashMap<String, Object> selectMonthOrganLogin(String month, String organ);
 
}