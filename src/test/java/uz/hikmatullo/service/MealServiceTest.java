package uz.hikmatullo.service;

import org.junit.Test;
import uz.hikmatullo.model.Meal;

import static org.junit.Assert.assertEquals;


public class MealServiceTest {
    private final MealService mealService = new MealService();

    @Test
    public void addMeal() {
        Meal meal = new Meal("test", 10, "test");
        String s = mealService.addMeal(meal);
        assertEquals("Added", s);

    }
}