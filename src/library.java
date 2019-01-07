
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/library")
public class library extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public library() {
        super();

    }


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String author = req.getParameter("author");
		
		LinkedList<String> list = new LinkedList<String>();
		list.add(id);
		list.add(name);
		list.add(author);
		
		for( int i=0; i<3; i++)
		{
			out.println(list);
		}
		}		
	}


