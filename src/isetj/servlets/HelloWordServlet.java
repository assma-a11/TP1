import java.io.IOException;

/**
 * Servlet implementation class HelloWorldServelet
 */
@WebServlet("/helloworldservelet")
public class HelloWorldServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public helloworldservelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("<html><head><title>servelet de bienvenue <:title></head>");
		response.getWriter().println("<body><h3><font color='bleu'>");
		response.getWriter().println("message de bienvenue affich� par le servelet1");
		response.getWriter().println("</font></h3></body></html>");}
		
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}