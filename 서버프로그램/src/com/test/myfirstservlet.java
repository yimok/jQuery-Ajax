package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myfirstservlet
 */
@WebServlet("/first")
public class myfirstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myfirstservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//1. 입력받고
		//2. 로직 처리하고
		//3. 출력하자.
		//3-1 출력화면은 데이터의 종류를 먼저 알려주어야함
		response.setContentType("text/plain; charset=utf8");
		//3-2 출력하기위한 데이터 연결통호인 stream을 만들어야함!
		PrintWriter out = response.getWriter();
		//3-3 연결통로로 올려서 데이터를 클라이언트로 전달
		out.println("서버로부터 전달된  메세지");
		//3-4 데이터 출력을 정확히 처리하기 위해 flush
		out.flush();
		//3-5 사용된 리소스 해제
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
