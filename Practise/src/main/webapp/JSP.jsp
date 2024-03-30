<%-- Directive Tag --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="ErrorPage.jsp" %>
			
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="sql"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
	<html>
		<head>
		<meta charset="ISO-8859-1">
			<title>JSP AND JSTL</title>
		</head>
		<body bgcolor="grey">
		<%--Declaration tag --%>
		
		
			<%!
				//String name="KAvinDharani_Adithi_Adithya";
			%>
			
		
		<%--Scriplet Tag --%>	
			<%  
				/*new ArithmeticException("Something Went Wronng");
			
				try{
					int n=9/0;
				}
				catch(ArithmeticException e){
					out.println(" Error "+e.getMessage());
				}
				
				Scanner scan=new Scanner(System.in);
				int age=Integer.parseInt(request.getParameter("age"));
				
				if(age>=18)
					out.println("Your Are Eligibe For Voting!!!\n");
				else
					out.println("You Are Not Eligible For Voting!!!\n");
				
				pageContext.setAttribute("name","KavinDharani");
				String name=String.valueOf(pageContext.getAttribute("name"));
				out.println(name);*/
				
				/*DataBase Connection*/
				
				/*Class.forName("com.mysql.cj.jdbc.Driver");    //Loading the Driver is Not mandatory After java 8
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/music","root","KavinDharani@3");
				Statement st=con.createStatement();
				out.println("Roll_id     Name    Unknown<br>");
				ResultSet rs=st.executeQuery("SELECT * FROM branch");
				
				while(rs.next()){
					out.println(rs.getString(1)+"    "+rs.getString(2)+"   "+rs.getString(3)+"<br>");
				}*/
				
			%>
			
			<%-- Expression tag --%>
			
			<%-- <p>Hello World <%=age %></p> --%>
			
<%--Data Base Connecting Using JSTL tags Which enable easy to connect DBMS USING JDBC --%>
			
			
			<%-- <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/music" user="root" password="KavinDharani@3"/>
			
			<sql:query dataSource="${db}" var="rs">SELECT * FROM branch</sql:query>
			
			<c:forEach items="${rs.rows}" var="s">
			
			<c:out value="${s.branch_id}"></c:out>
			 
			<c:out value="${s.branch_name}"></c:out>
			 
			<c:out value="${s.mgr_id}"></c:out>
			 
			<c:out value="${s.mgr_start_date}"></c:out> <br>
			
			</c:forEach>--%>
			
			
<%--Core tags used to perform Fundamental Oeration in java --%>


			
			<%-- Hello Techiess!!!<br>
			
			${name_id}<br>
			
			${age}
			
			<c:out value="${name_id}"/><br>
			
			<c:forEach items="${Ages}" var="s">${s}<br></c:forEach>
			
			<c:import url="https://www.telusko.com"></c:import>--%>
			
<%--Using Inbuilt tags for String Operations --%>

				
			<%--<c:set var="name" value="  Kavin Loves Her(Dharani) Moree       "/>	
			Length of the Sentence is  ${fn:length(name)}	
			
			<c:forEach items="${fn:split(name,' ')}" var="s"> ${s}<br></c:forEach>	
			
			The Index is : ${fn:indexOf(name,"Dharani")}<br>
			
			<c:if test="${fn:contains(name,'Kavin')}"> YES Its True Always With Her</c:if><br>
			
			<c:if test="${fn:endsWith(name,'Moree')}"> Yes Its Ends With More</c:if><br>
			
			<c:if test="${fn:startsWith(name,'Kavin')}"> Yes Its Always Kavin_AdithYa</c:if><br>
			
			${fn:toUpperCase(name)}<br>
			
			${fn:toLowerCase(name)}<br>
			
			${fn:trim(name)}--%>
			
			
			<%
				
			%>
			
			<c:set var="stud" value="${request.getAttribute(\"students\")}"/>
			
			<c:forEach items="${students}" var="s">${s.name}
			<br/></c:forEach>	
			
			${students}
						
			
			
		</body>
	</html>