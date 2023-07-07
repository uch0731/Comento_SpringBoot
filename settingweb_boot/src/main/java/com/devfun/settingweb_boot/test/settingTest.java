package com.devfun.settingweb_boot.test;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.devfun.settingweb_boot.service.StatisticService;
 
@Controller
public class settingTest {
	
	@Autowired
    private StatisticService service;
    
    @ResponseBody 
    @RequestMapping("/sqlyearStatistic")
    public Map<String, Object> sqltest(String year) throws Exception{ 
        
        return service.yearloginNum(year);
    }
    
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
    
    @ResponseBody 
    @RequestMapping("/loginMonth")
    public Map<String, Object> loginMonth(String month) throws Exception{ 
        
        return service.monthLoginNum(month);
    }
    
    @ResponseBody 
    @RequestMapping("/loginDay")
    public Map<String, Object> loginDay(Model model) throws Exception{ 
        
        return service.dayLoginNum();
    }
    
    @ResponseBody 
    @RequestMapping("/loginMonthDay")
    public Map<String, Object> loginMonthDay(String monthDay) throws Exception{ 
        
        return service.monthDayLoginNum(monthDay);
    }
    
    @ResponseBody 
    @RequestMapping("/loginAVG")
    public Map<String, Object> loginAvg(Model model) throws Exception{ 
        
        return service.avgLoginNum();
    }
    
    @ResponseBody 
    @RequestMapping("/monthOrgan")
    public Map<String, Object> loginMonthOrgan(String month, String organ) throws Exception{ 
        
        return service.monthOrganLoginNum(month, organ);
    }
 
}