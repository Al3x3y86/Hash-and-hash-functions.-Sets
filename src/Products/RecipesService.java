package Products;

import java.util.HashSet;
import java.util.Set;

public class RecipesService {

    private final Set<Recipes> recipes = new HashSet<>();

    public void addRecipe(Recipes recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть в списке!");
        } else {
            recipes.add(recipe);
        }
    }
}