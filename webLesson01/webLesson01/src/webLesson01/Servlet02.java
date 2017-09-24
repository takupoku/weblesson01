package webLesson01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet02 extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
			req.setCharacterEncoding("UTF-8");



			//インスタンスつくる
			NoteDAO dao = new NoteDAO();
			List<Note> ar = new ArrayList<>();
			ar = dao.getWords();

			//単語一覧
			req.setAttribute("ar", ar);

			req.getRequestDispatcher("list.jsp").forward(req, res);

	}

}