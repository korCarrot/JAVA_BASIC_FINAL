package com.myspring.pro28;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
//		*DateFormat.LONG: 날짜 및 시간 형식 중에 "긴" 형식을 지정합니다. 
//		첫번째 매개변수는 날짜를, 두번째 매개변수를 시간을 표시합니다.
//		long은 긴 형식으로 월, 일 및 연도를 풀네임으로 표시하며, 시간은 시분초를 표시합니다. (short, medium, full도 있음)
//		*locale : 날짜와 시간을 지역화된 형식으로 반환하는 데 사용
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
