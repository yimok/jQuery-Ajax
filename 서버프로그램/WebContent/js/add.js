
function callServer()
{
	//javascript로 서버쪽 프로그램을 호출
	//ajax를 이용해서 처리해 보아요!! --> 순수 자바스크립트가 가지고있는 서버와 통신할 수 있는 기술
	//but 순수 자바스크립트만 이용하여 어렵 -> jquery 로 ajax 사용
	
	$.ajax({
		
		//호출할 서버쪽 프로그램의 url
		url : "http://localhost:8080/myProject/add",
		
		//type : 전송방식
		type : "get",  //get방식으로 호출
		
		//data: 서버로 전송할 데이터 , 데이터가 많을땐 객체로 전달
		data : {
			//request.getParameter("first"); 서버(addservlet.java)쪽 first와 여기 키값이 일치해야함
			first : $("#first").val(),
			second : $("#second").val()
		},
		//ajax 호출이 성공하면 function의 인자로 서버의 데이터를줌 
		success : function(data) {
			$("span").text(data);
		},
		error : function(){
			alert("뭔가 이상해요");
		}
		
		
		
		
	});  // jquery를 이용해서 ajax 호출 -> 서버쪽과 통신을 하겠어!
	
	
	
	
	}