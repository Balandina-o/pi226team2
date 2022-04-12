package laba4new;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Calc", urlPatterns="/JavaCalc")
public class Calc extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestCalc Calc = RequestCalc.fromRequestParameters(request);
        Calc.setAsRequestAttributesAndCalculate(request);

        request.getRequestDispatcher("/Results.jsp").forward(request, response);

    }

    private static class RequestCalc {
        private final String first_calc;
        private double result;

        private RequestCalc (String first) {
            this.first_calc = first;
        }

        public static RequestCalc fromRequestParameters(HttpServletRequest request) {
            return new RequestCalc(request.getParameter("square_side"));
        }

        public void setAsRequestAttributesAndCalculate(HttpServletRequest request) {
            request.setAttribute("first_result", first_calc);
            double first_try;
            try {
                first_try=Double.parseDouble(first_calc);
            }
            catch (NumberFormatException e) {
                first_try=0;
            }

            result=first_try*4;
            request.setAttribute("result", result);
        }
    }
}

