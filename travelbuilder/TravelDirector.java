package travelbuilder;

public class TravelDirector {

    private static final int LUXURY_TRIP_DAYS = 7;
    private static final int BUDGET_TRIP_DAYS = 5;

    public void makeLuxuryTrip(TravelPackageBuilder builder) {
        builder
                .setDestination("Switzeland")
                .setHotel("PARK HOTEL vitznau")
                .setTransport("Flight")
                .setMeals("Full Board")
                .setActivities("Town")
                .setDurationDays(LUXURY_TRIP_DAYS);
    }

    public void makeBudgetTrip(TravelPackageBuilder builder) {
        builder
                .setDestination("Prague")
                .setHotel("Central Hostel")
                .setTransport("Bus")
                .setMeals("Breakfast")
                .setActivities("Walking Tour")
                .setDurationDays(BUDGET_TRIP_DAYS);
    }
}