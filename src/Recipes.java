import Products.Product;

import java.util.HashSet;

public class Recipes {


    private String nameOfTheRecipe;
    private String LotsOfProducts;
    private double totalCostOfAlLProducts;

    public Recipes(String nameOfTheRecipe, String lotsOfProducts, double totalCostOfAlLProducts) {
        this.nameOfTheRecipe = nameOfTheRecipe;
        LotsOfProducts = lotsOfProducts;
        this.totalCostOfAlLProducts = totalCostOfAlLProducts;
    }

    @Override
    public String toString() {
        return "Название рецепта: " + nameOfTheRecipe + ", необходимые продукты: " + LotsOfProducts +
                ", общая стоимость всех продуктов: " + totalCostOfAlLProducts ;
    }

    public String getNameOfTheRecipe() {
        return nameOfTheRecipe;
    }

    public String getLotsOfProducts() {
        return LotsOfProducts;
    }

    public double getTotalCostOfAlLProducts() {
        return totalCostOfAlLProducts;
    }
}
