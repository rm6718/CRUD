package com.ironyard.servlet;

import com.ironyard.data.Takeout;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam on 9/23/16.
 */
public class CreateTakeoutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String cuisineType = req.getParameter("cuisinetype");
        String distance = req.getParameter("distance");
        String id = req.getParameter("id");


        HttpSession session = req.getSession();
        List<Takeout> takeoutList = (List<Takeout>) session.getAttribute("thetakeoutlist");


        if(takeoutList == null) {
            takeoutList = new ArrayList<>();
        }

        Takeout foundTakeout = null;


        for(Takeout t:takeoutList){
            if(t.getId() == Long.parseLong(id)){
                foundTakeout = t;
                break;
            }
        }


        if(foundTakeout == null) {
            Takeout myNewTakeout = new Takeout(name, cuisineType, distance, Long.parseLong(id));
            takeoutList.add(myNewTakeout);
        } else {
            foundTakeout.setName(name);
            foundTakeout.setCuisineType(cuisineType);
            foundTakeout.setDistance(distance);
        }

        session.setAttribute("thetakeoutlist", takeoutList);

        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/createTakeout.jsp");
        dispatcher.forward(req,resp);

    }

}
