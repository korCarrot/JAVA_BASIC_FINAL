package com.myspring.pro28.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

//파일 다운로드 컨트롤러는 이미지 파일을 받아와서 읽고 브라우저에 나타내주는 역할. 사용시 컨트롤러 주석 풀기.
//@Controller
public class FileDownloadController {
//	private static final Logger logger = LoggerFactory.getLogger(FileDownloadController.class);
	
//	파일 저장 위치를 지정합니다.	
	private static String CURR_IMAGE_REPO_PATH = "c:\\spring\\image_repo";

	@RequestMapping("/download")	//다운로드할 이미지 파일 이름을 전달 (이미지 업로드시 result.jsp에서 map에 저장된 image원본 이름들을 FileDownloadController로 보냄) 
	public void download(@RequestParam("imageFileName") String imageFileName,	//의문이 드는 점은 배열이 아니라 String으로 받음. -> result.jsp에 해답 적어놨음. (결론은 이미지를 하나씩 출력하기 위함)
			                 HttpServletResponse response)throws Exception {
		
		OutputStream out = response.getOutputStream();
//		다운로드할 파일의 경로를 지정
		String downFile = CURR_IMAGE_REPO_PATH + "\\" + imageFileName;
//		다운로드할 파일 객체를 생성합니다. 해당 경로에 있는 실제 파일이나 폴더를 나타내는 File 객체를 만듭니다.
//		이렇게 생성된 File 객체를 통해 파일이나 폴더의 속성을 읽거나 조작할 수 있습니다.
//		그 경로에 있는 파일이나 폴더를 가리키는 File 객체를 생성하는 것입니다.
		File file = new File(downFile);

//		HTTP 응답 헤더에 다운로드할 파일의 정보를 설정
//		*첫 번째 줄에서는 Cache-Control 헤더를 설정하여 캐시를 사용하지 않도록 지정합니다.
//		"no-cache" 값은 캐시된 응답을 사용하지 않고 항상 서버로부터 새로운 응답을 요청해야 함을 나타냅니다. 
//		이렇게 설정하면 브라우저는 캐시된 버전을 사용하지 않고 항상 서버로부터 새로운 데이터를 가져오게 됩니다.
//		*두 번째 줄에서는 Content-disposition 헤더를 추가합니다.
//		Content-disposition 헤더는 웹 서버가 클라이언트에게 전송하는 콘텐츠의 표현 방식을 지정하는 헤더입니다.
//		이 헤더는 웹 브라우저에게 해당 콘텐츠를 어떻게 처리해야 하는지를 알려줍니다.
//		여기서 "attachment"는 브라우저가 해당 응답을 다운로드로 처리하도록 지시하는 헤더입니다.
//		그리고 "fileName=" 뒤에는 다운로드되는 파일의 이름을 지정합니다.
		response.setHeader("Cache-Control", "no-cache");
		response.addHeader("Content-disposition", "attachment; fileName=" + imageFileName);
		
		FileInputStream in = new FileInputStream(file);
		byte[] buffer = new byte[1024 * 8];
		while (true) {
			int count = in.read(buffer); // 버퍼에서 데이터를 읽어옴
			if (count == -1) // 데이터를 모두 읽었는지 확인
				break;
//			(오프셋은 일련의 데이터에서 특정 위치나 시작점)
//			데이터 읽기, 데이터를 읽을 시점(offset), 읽어야 할 데이터 수
			out.write(buffer, 0, count); // 버퍼의 내용을 출력 스트림으로 전송
		}
		in.close();
		out.close();
	}

}
