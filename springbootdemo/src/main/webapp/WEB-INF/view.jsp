
<%@page import="com.example.springbootdemo.entities.Employee" %>>
<%
Iterable<Employee> list =(Iterable<Employee>)request.getAttribute("LIST");
for(Employee e:list)
{
out.println(e.getEid()+"  "+e.getEname()+"  "+e.getSalary());	
}

%>