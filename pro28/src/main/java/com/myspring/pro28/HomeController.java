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
//		*DateFormat.LONG: ��¥ �� �ð� ���� �߿� "��" ������ �����մϴ�. 
//		ù��° �Ű������� ��¥��, �ι�° �Ű������� �ð��� ǥ���մϴ�.
//		long�� �� �������� ��, �� �� ������ Ǯ�������� ǥ���ϸ�, �ð��� �ú��ʸ� ǥ���մϴ�. (short, medium, full�� ����)
//		*locale : ��¥�� �ð��� ����ȭ�� �������� ��ȯ�ϴ� �� ���
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
