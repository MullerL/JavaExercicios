 <% @ page = errorPage "myerror.jsp"  %> 
 <% @ page import = "com.foo.bar"  %>
 
 < html > 
 < cabeça > 
 <%!  int serverInstanceVariable = 1 ;%>
 
 <%  int localStackBasedVariable = 1 ;  %> 
 < tabela > 
 < tr > < td > <% = toStringOrBlank (  "dados expandidos em linha" + 1  )  %> < / td > < / tr >