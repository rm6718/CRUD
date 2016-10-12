package com.ironyard.servlet;

import com.ironyard.data.Takeout;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by sam on 9/23/16.
 */
public class DeleteTakeoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




        String deleteThisId = request.getParameter("remove");
        long deleteId = Long.parseLong(deleteThisId);

        List<Takeout> theTakeoutList = (List<Takeout>) request.getSession().getAttribute("thetakeoutlist");

        for(Takeout t:theTakeoutList){
            if(t.getId() == deleteId){
                theTakeoutList.remove(t);
                break;
            }
        }

        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/createTakeout.jsp");
        dispatcher.forward(request,response);

    }

}
