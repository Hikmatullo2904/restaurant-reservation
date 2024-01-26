package uz.hikmatullo.db;

import uz.hikmatullo.model.Meal;
import uz.hikmatullo.model.Reservation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public final static List<Meal> meals = new ArrayList<>();
    static {
        Meal meal = new Meal("pizza", 10, "ham, cheese, tomato");
        meals.add(meal);
        meal = new Meal("burger", 5, "ham, cheese, tomato");
        meals.add(meal);
    }
    public static final List<Reservation> reservations = new ArrayList<>();
    static {
        Reservation reservation = new Reservation("hikmatullo", LocalDate.now(), LocalTime.now(), 2, new ArrayList<>());
        reservations.add(reservation);
    }
}
