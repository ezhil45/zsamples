package pl.japila.javaee.scala
 
import javax.servlet.http._
import javax.servlet.annotation.WebServlet
 
@WebServlet(Array("/HelloScalaServlet"))
class HelloScalaServlet extends HttpServlet {
  override def doGet(request: HttpServletRequest, response: HttpServletResponse) = {
    response setContentType ("text/html")
    val out = response.getWriter
    out.println("Hello from HelloScalaServlet")
  }
}