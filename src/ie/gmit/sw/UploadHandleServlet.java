package ie.gmit.sw;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * @ClassName:UploadHandleServlet
 * This is a upload part to upload files to the server.
 * 
 * <p>void Get uses HttpServletRequest to get files<p>
 * @author QiFu
 */
public class UploadHandleServlet extends HttpServlet{
	public void Get(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String savePath = this.getServletContext().getRealPath("/WEB-INF/upload");
		//Specify a address to save files
		File file = new File(savePath);
		if (!file.exists() && !file.isDirectory()) {
			//If file folder not exist
			System.out.println(savePath+"create file folder");
			file.mkdir();
	}
		String message = "";
		try{
			//Using Apache fileupload handle this process
			//Create a DiskFileItemFactory
			DiskFileItemFactory factory = new DiskFileItemFactory();
			//Create a FileUpload 
			ServletFileUpload upload = new ServletFileUpload(factory);
			//Modify context encoding style
			upload.setHeaderEncoding("UTF-8"); 
			//Do a if statement to get data
			if(!ServletFileUpload.isMultipartContent(request)){
				return;
			}
			//ServletFileUpload analyzes upload data and return a List--List<FileItem>   
			List<FileItem> list = upload.parseRequest(request);
			for(FileItem item : list) {
				String filename = item.getName();
				System.out.println(filename);
				if(filename==null || filename.trim().equals("")){
					continue;
				}
				//Modify files name
				filename = filename.substring(filename.lastIndexOf("\\")+1);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		request.setAttribute("message",message);
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doGet(request, response);
   }
}
