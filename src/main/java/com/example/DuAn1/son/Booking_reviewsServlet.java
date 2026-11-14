package com.example.DuAn1.son;

import com.example.DuAn1.entity.reviews_claims.Booking_reviews;
import com.example.DuAn1.son.repository.Booking_reviewsRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ReviewGiftServlet", value = {
        "/hien-thi"

})
public class Booking_reviewsServlet extends HttpServlet {

    private Booking_reviewsRepository brRepo = new Booking_reviewsRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if(uri.contains("hien-thi")){
            this.hienThiBooking(request,response);
        }
    }

    private void hienThiBooking(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Booking_reviews> listBR = brRepo.getAll();
        request.setAttribute("listbr", listBR);
        request.getRequestDispatcher("/booking.jsp").forward(request, response);
    }
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
