package com.myspring.pro28.ex01;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.pro28.HomeController;


@Controller
public class FileUploadController  {
	private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);
	private static final String CURR_IMAGE_REPO_PATH = "c:\\spring\\image_repo";
	
	//uploadForm.jsp로 이동 -> 파일 업로드 위한 작성 페이지.
	@RequestMapping(value="/form")
	public String form() {
	    return "uploadForm";
	  }
	
	//uploadForm.jsp에서 도착 -> 파일 업로드 페이지에서 작성한 내용이 도착하는 메소드
	@RequestMapping(value="/upload",method = RequestMethod.POST)
	public ModelAndView upload(MultipartHttpServletRequest multipartRequest,HttpServletResponse response) throws Exception{

		multipartRequest.setCharacterEncoding("utf-8");
		Map map = new HashMap();
		
//		모든 태그의 name속성을 가져온다.	(*다만 자바스크립트 함수에서 Jquery문으로 작성한 input 태그의 name속성은 가져오지 않았음)
		Enumeration enu=multipartRequest.getParameterNames();
		System.out.println("enu : " + enu);	//enu : java.util.Collections$3@3eb6c433
		while(enu.hasMoreElements()){
			
//			아이디와 이름을 map에 저장한다 (uploadForm.jsp의 id, name태그의 name속성과 값을 가져와서 map에 넣는다.)
			String name=(String)enu.nextElement();
			logger.info("name : " + name);	//name : name		name : id	(id name순으로 올줄 알았는데 name부터 받아왔네)
			String value=multipartRequest.getParameter(name);
			logger.info("enu의 value : " + value);	//enu의 value : (name에 대해 브라우저에서 작성된 값이 나타남)
			logger.info("name, value : "+name+", "+value);	//name, value : name, reTest		name, value : id, kim
			map.put(name,value);
		}
		
		//파일의 원본 이름으로 된 폴더와 파일을 생성 / 원본 파일명 list반환
		List fileList= fileProcess(multipartRequest);
		map.put("fileList", fileList);
		ModelAndView mav = new ModelAndView();
		mav.addObject("map", map);
		mav.setViewName("result");
		return mav;
	}
	
	private List<String> fileProcess(MultipartHttpServletRequest multipartRequest) throws Exception{
		
		List<String> fileList= new ArrayList<String>();
		
//		모든 파일 이름을 반복하는 반복자를 생성합니다. (첨부된 파일 이름을 가져옵니다)
		Iterator<String> fileNames = multipartRequest.getFileNames();
		logger.info("fileNames(getFileNames) : " + fileNames);	//fileNames(getFileNames) : java.util.LinkedHashMap$LinkedKeyIterator@9e2cd29
		
		while(fileNames.hasNext()){
			String fileName = fileNames.next();
			logger.info("fileName : " + fileName);	//fileName : file1		*uploadForm.jsp의 Jquery문의 name속성이 나타남.
//			MultipartFile 객체 : 클라이언트로부터 업로드된 파일에 접근하고 해당 파일을 처리할 수 있습니다.
//								업로드된 파일의 내용을 읽고, 파일 이름, 크기, MIME 타입 등의 정보를 제공함.
			MultipartFile mFile = multipartRequest.getFile(fileName);
			logger.info("mFile(getFile(파일이름)) : " + mFile);	//mFile(getFile(파일이름)) : org.springframework.web.multipart.commons.CommonsMultipartFile@1b0729e9
			
//			업로드된 파일의 원본 파일명을 가져와 하나씩 fileList에 추가
			String originalFileName=mFile.getOriginalFilename();
			logger.info("originalFileName : " +originalFileName);	//originalFileName : cat.jpg	(업로드된 파일 객체의 원본이름)
			fileList.add(originalFileName);
			
//			업로드된 각 파일의 저장 경로를 설정한 File 객체를 생성
			File file = new File(CURR_IMAGE_REPO_PATH +"\\"+ fileName);
			if(mFile.getSize()!=0){ //File Null Check, 업로드된 파일이 비어있지 않은지 확인합니다. (업로드된 파일 존재)
				if(! file.exists()){ //파일이 존재하지 않는 경우	(업로드된 파일은 존재하는데 파일 경로에 파일이 없는 경우)
					logger.info("file.getParentFile() 상위경로가 있는가? 없으면 null: " + file.getParentFile());	//상위 경로 : c:\spring\image_repo
					if(file.getParentFile().mkdirs()){ //파일이 존재하지 않는 디렉토리를 생성 (파일 경로마다 폴더를 생성)
						file.createNewFile(); //주어진 파일 경로에 새로운 파일을 생성하는 메서드입니다.	(이름은 fileName값과 동일. 유형은 file이라는 파일로 생김)
//	이 메서드는 파일이 이미 존재하지 않을 때만 새로운 파일을 생성하며, 파일이 이미 존재하거나 디렉토리가 아닌 경우에는 예외를 발생시킵니다
					}
				}
//				mFile.transferTo()를 사용하여 업로드된 파일을 실제 저장 경로로 옮깁니다.
				mFile.transferTo(new File(CURR_IMAGE_REPO_PATH +"\\"+ originalFileName));
			}
		}
		return fileList;
	}
}
