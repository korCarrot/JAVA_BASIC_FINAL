package com.myspring.pro28.ex02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.coobird.thumbnailator.Thumbnails;

//upload를 통해 원본이미지가 이미 존재하는 상황. 원본이미지에서 썸네일을 만드는 것.
@Controller
public class FileDownloadController {
	private static String CURR_IMAGE_REPO_PATH = "c:\\spring\\image_repo";
	
	@RequestMapping("/download")
	protected void download(@RequestParam("imageFileName") String imageFileName,
			                 HttpServletResponse response) throws Exception {
		OutputStream out = response.getOutputStream();
		String filePath = CURR_IMAGE_REPO_PATH + "\\" + imageFileName;
		File image = new File(filePath);
		
		//확장자를 제외한 원본 이미지 파일의 이름을 가져옵니다.
		int lastIndex = imageFileName.lastIndexOf(".");
		String fileName = imageFileName.substring(0,lastIndex);
		
		//원본 이미지 파일 이름과 같은 이름의 썸네일 파일에 대한 File객체를 생성합니다.
		File thumbnail = new File(CURR_IMAGE_REPO_PATH+"\\"+"thumbnail"+"\\"+fileName+".png");
		if (image.exists()) { //원본이미지가 존재한다면
			thumbnail.getParentFile().mkdirs();	//썸네일 객체로 가는 경로를 만들고
			//원본 이미지 파일을 가로세로가 50px인 png형식의 썸네일 이미지 파일로 생성.
			//Thumbnails.of(image): 썸네일을 생성할 원본 이미지를 지정	//.size: 썸네일의 크기를 설정
			//.outputFormat("png"): outputFormat 메서드는 썸네일의 출력 형식을 설정.	PNG 형식은 손실 없는 이미지 압축을 지원하여 이미지의 품질을 유지하면서도 파일 크기를 줄일 수 있습니다.
			//.toFile(저장될 파일의 경로가 File 객체로 전달): toFile 메서드는 생성된 썸네일을 파일로 저장.
		    Thumbnails.of(image).size(50,50).outputFormat("png").toFile(thumbnail);

//		    썸네일 저장안하고 원본이미지에서 바로 출력하는 방법 (맨 밑에 코드있음)		    
//		    Thumbnails.of(image).size(50,50).outputFormat("png").toOutputStream(out);
		}
		/* byte[] buffer = new byte[1024 * 8];
		out.write(buffer); */
		
		FileInputStream in = new FileInputStream(thumbnail);
		byte[] buffer = new byte[1024 * 8];
		while (true) {
			int count = in.read(buffer); // 버퍼에서 데이터를 읽어옴
			if (count == -1) // 데이터를 모두 읽었는지 확인
				break;
			out.write(buffer, 0, count);
		}
		in.close();
		out.close();
	}
	
	
	//				<썸네일 이미지를 저장하지 않고, 원본 이미지에서 바로 추출하는 법>
	
	/*@RequestMapping("/download")
	protected void download(@RequestParam("imageFileName") String imageFileName,
			                 HttpServletResponse response) throws Exception {
		OutputStream out = response.getOutputStream();
		String filePath = CURR_IMAGE_REPO_PATH + "\\" + imageFileName;
		File image = new File(filePath);
		
		int lastIndex = imageFileName.lastIndexOf(".");
		String fileName = imageFileName.substring(0,lastIndex);
		
		File thumbnail = new File(CURR_IMAGE_REPO_PATH+"\\"+"thumbnail"+"\\"+fileName+".png");
		if (image.exists()) { 
			Thumbnails.of(image).size(50,50).outputFormat("png").toOutputStream(out);
		}else {
			return;
		}
		byte[] buffer = new byte[1024 * 8];
		out.write(buffer);
		out.close();
	}
	
	*/
}
