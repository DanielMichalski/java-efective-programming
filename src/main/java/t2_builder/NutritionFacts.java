package t2_builder;

import com.sun.istack.internal.Builder;

/**
 * Author: Daniel
 */
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    private NutritionFacts(NutritionBuilder builder)  {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.sodium;
    }

    public static class NutritionBuilder implements Builder<NutritionFacts> {
        // Wymagane pola
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium;

        public NutritionBuilder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public NutritionBuilder calories(int val) {
            calories = val;
            return this;
        }

        public NutritionBuilder fat(int val) {
            fat = val;
            return this;
        }

        public NutritionBuilder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionBuilder sodium(int val) {
            sodium = val;
            return this;
        }

        @Override
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NutritionFacts{");
        sb.append("servingSize=").append(servingSize);
        sb.append(", servings=").append(servings);
        sb.append(", calories=").append(calories);
        sb.append(", fat=").append(fat);
        sb.append(", sodium=").append(sodium);
        sb.append(", carbohydrate=").append(carbohydrate);
        sb.append('}');
        return sb.toString();
    }
}
