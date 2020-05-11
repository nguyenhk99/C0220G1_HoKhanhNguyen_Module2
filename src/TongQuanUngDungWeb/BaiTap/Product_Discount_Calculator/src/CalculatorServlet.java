import javax.jws.WebService;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name= "CalculatorServlet", urlPatterns = "/display-discount")
public class CalculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String productDescription = request.getParameter("productDescription");
        float price = Float.parseFloat(request.getParameter("listPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
        double discountAmount = price*discountPercent*0.01;
        double discountPrice = price-discountAmount;

        PrintWriter write =response.getWriter();

        write.println("<html>");
        write.println("<h1>Product Description: " + productDescription + "</h1>");
        write.println("<h1>Price: " + price + "</h1>");
        write.println("<h1>Discount Percent: " + discountPercent + "%</h1>");
        write.println("<h1>Discount Amount: " + discountAmount + "</h1>");
        write.println("<h1>Discount Price: " + discountPrice + "</h1>");
        write.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
