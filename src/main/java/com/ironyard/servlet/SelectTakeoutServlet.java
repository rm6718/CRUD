package com.ironyard.servlet;

import com.ironyard.data.Takeout;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by sam on 9/25/16.
 */
@WebServlet(name = "SelectTakeoutServlet")
public class SelectTakeoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String selectThisTakeoutID = request.getParameter("id");
        long selectedId = Long.parseLong(selectThisTakeoutID);

        List<Takeout> theTakeoutList = (List<Takeout>) request.getSession().getAttribute("thetakeoutlist");
        Takeout foundTakeout = null;

        for(Takeout t:theTakeoutList){
            if(t.getId() == selectedId){
                foundTakeout = t;
                break;
            }
        }

        request.setAttribute("selectedtakeout", foundTakeout);

        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/createTakeout.jsp");
        dispatcher.forward(request,response);
    }
}