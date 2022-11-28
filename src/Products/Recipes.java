package Products;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipes {
    private final String name;
    private Map<Product, Integer> products = new HashMap<>();


    public Recipes(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Поля не все заполнены");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product, int quantity) {
        if (quantity <= 0) {
            quantity = 1;
        }
        if (this.products.containsKey(product)) {
            this.products.put(product, this.products.get(product) + quantity);
        } else {
            this.products.put(product, quantity);
        }
    }

    public float makeRecipePrice() {
        float sum = 0;
        for (Map.Entry<Product, Integer> product : this.products.entrySet()) {
            sum += product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipe = (Recipes) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}