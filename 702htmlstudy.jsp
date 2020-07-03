<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>My information</title>
	<meta charset="UTF-8">
</head>


<body>
	<h1><a href="702htmlstudy.jsp">Sung woo</a></h1>
	<ol>
		<li><a href="702htmlstudy.jsp">나의정보</a></li>
		<li><a href="702htmlstudy.jsp">나의성향</a></li>
		<li><a href="702htmlstudy2.jsp">Mbti</a></li>
	</ol>
	<%--li는 list로 목록을 나타내며 해당 목록을 구분하기 위해서는 ul을 사용한다.
	ol을 사용하면, 자동으로 리스트의 순서를 써준다. ordered --%>
	
	<h2>나의 정보</h2>
	안녕하세요 저는 <strong><u>멋진남자</u> 장성우</strong>입니다. 
	<br><br>//(u)nderline은 밑줄을 처준다
	<strong>strong / u 는 ★★태크★★라고 하는 html에서 중요한 부분이다. 
	<br>이는 웹페이지를 설명하는 용도로 사용된다.</strong>
	<p>------------------------------------------------------------------------------</p>
	<p><a href="https://namu.wiki/w/INTP" taget="_blank" title="istp사람의 특성 나무위키">만능재주꾼형</a> 사람은 창조와 문제 해결을 위한 이해, 그리고 실행 착오와 실질적인 경험을 통해 아이디어를 탐색합니다. 
	<%-- a 는 링크를 나타내는 태그로써 원하는 사이트로의 링크연결을 시켜준다. 또한 해당 링크는 href를 통해서만 연결될 수 있다. 블랭크를 사용하면 새창에서 열린다. --%>
	
	<br>다른 이들이 그들의 과제에 흥미를 보이는 것을 좋아하며, 
	<br>간혹 다른 이들로 하여금 작업 중인 과제에 참여하도록 유도하기도 합니다. 
	<br>단, 그들만의 원리원칙이나 자유를 침범하지 않는 범위에 한해서 말이죠. 
	<br>사람들은 만능재주꾼형 사람이 베푸는 호의에 열린 마음으로 대할 필요가 있습니다.</p>
	
	<img src = "C:\Users\system888\Desktop\java1\image/WhiteWoman.jpg" width="40%">
	<%-- img는 속성중에 하나이다. 이미지를 불러오기 위해서는 해당 소스의 주소와 이미지의 이름과 파일 타입을 적어야한다. --%>
	
	<p>타인을 잘 도우며 그들의 경험을 다른 이들과 공유하는 것을 좋아하기도 하는 이들은
	<br>특히나 그들이 아끼는 사람일수록 더욱 그러합니다. </p> 
	
	<p style="margin-top:70px;">이들이 인구의 고작 5%만이 차지하지 않는다는 사실이 그저 안타까울 따름입니다. 
	<br>더욱이 여성의 경우는 더욱 흔치 않은데, 
	<br>대개 이 성향의 여성은 사회가 일반적으로 요구하는 이상적인 여성상에 들어맞지 않는 경우가 많으며, 
	<br>이들은 자라면서 말괄량이 소리를 듣기도 합니다.</p> 
	
	<%-- <p><strong>피태그는 정해져 있어 원하는 만큼 여백을 띄울수 없다.
	<br>그러나 css를 활용한 style margin을 사용하면 원하는 만큼 떨어뜨릴 수 있다.
	<br>top 위로 140 픽셀만큼 떨어뜨려라</strong></p> --%>
	
	<h1>This is heading 1</h1>
	~~~~~~~
	<h6>This is heading 6</h6>
	<%--글씨가 굵어지고 줄바꿈이 된다용~~ heading은 제목을 나타낸다. 6까지가 끝이다!--%>

</body>
</html>