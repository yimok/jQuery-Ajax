package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addservlet
 */
@WebServlet("/add")
public class addservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		//1. 입력받고
		String input1 = request.getParameter("first");
		String input2 = request.getParameter("second");
		
		//2. 로직처리하고
		int result1 = Integer.parseInt(input1) + Integer.parseInt(input2);
		
		//3. 출력하고 (text/html) -> html로 출력가능
		 response.setContentType("text/html; charset=utf8");
		PrintWriter out = response.getWriter();
		/* 매우 비효율적
		out.println("<form action=http://localhost:8080/myProject/add method=get>");
		out.println("<input type=text name=first>" + "<input type =text name=second><br>");
		out.println("<input type =submit value = 서버로 전송>");
		out.println("</form>");
		*/
		//out.println("<h1>" + result1 + "</h1>");
		
		//계산된 결과만 html문서쪽으로 보냄
		out.println(result1 );
		
		out.flush();
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
