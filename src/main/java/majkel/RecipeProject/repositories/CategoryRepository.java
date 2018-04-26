package majkel.RecipeProject.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import majkel.RecipeProject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{

	Optional<Category> findByDescription(String description);
	
}
