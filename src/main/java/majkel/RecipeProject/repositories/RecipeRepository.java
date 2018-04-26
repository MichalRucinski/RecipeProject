package majkel.RecipeProject.repositories;

import org.springframework.data.repository.CrudRepository;
import majkel.RecipeProject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
