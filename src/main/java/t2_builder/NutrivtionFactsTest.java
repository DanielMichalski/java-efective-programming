package t2_builder;

/**
 * Author: Daniel
 */
public class NutrivtionFactsTest {
    public static void main(String[] args) {

        NutritionFacts nutritionFacts =
                new NutritionFacts.NutritionBuilder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        System.out.println(nutritionFacts);
    }
}
