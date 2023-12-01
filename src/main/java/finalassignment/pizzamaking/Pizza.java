package finalassignment.pizzamaking;

public class Pizza {

    private PizzaSize size;

    private boolean cheese;

    private boolean olives;

    private boolean ham;

    private boolean mushrooms;

    private boolean pineapple;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.olives = builder.olives;
        this.ham = builder.ham;
        this.mushrooms = builder.mushrooms;
        this.pineapple = builder.pineapple;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", olives=" + olives +
                ", ham=" + ham +
                ", mushrooms=" + mushrooms +
                ", pineapple=" + pineapple +
                '}';
    }

    public static class Builder {

        private PizzaSize size;

        private boolean cheese;

        private boolean olives;

        private boolean ham;

        private boolean mushrooms;

        private boolean pineapple;

        public Builder() {}

        public Builder size(PizzaSize size) {
            this.size = size;
            return this;
        }

        public Builder cheese(boolean value) {
            this.cheese = value;
            return this;
        }

        public Builder olives(boolean value) {
            this.olives = value;
            return this;
        }

        public Builder ham(boolean value) {
            this.ham = value;
            return this;
        }

        public Builder mushrooms(boolean value) {
            this.mushrooms = value;
            return this;
        }

        public Builder pineapple(boolean value) {
            this.pineapple = value;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
