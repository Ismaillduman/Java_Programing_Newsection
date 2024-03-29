package office_hours.week_7;

public class Recipe {
    /*Create a class called Recipe
    declare these instance variables:
        name, ingredients, serving size, cost

    create a setInfo() method to initialize these variables

    create a method called costPerPerson that will return a double.
    Calculate the amount each person would need to pay to make this recipe - use the serving size and cost values

    create a toString() that shows the information in the following format:
        Recipe for $name will require these ingredients:
                $all_ingredients
        This dish will serve $serving_size and cost a total of $ $cost to make

    create a class called ObjectTester and create some Recipe objects
*/
    public String name, ingredients;
    public int servingSize;
    public double cost;

    public void setInfo(String name, String ingredients, int servingSize, double cost) {
        this.name = name;
        this.ingredients = ingredients;
        this.servingSize = servingSize;
        this.cost = cost;
    }

    public double costPerPerson(){
        return cost/servingSize;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", servingSize=" + servingSize +
                ", cost=" + cost +
                ", costPerPerson=" + costPerPerson() +
                '}';
    }

    public static void main(String[] args) {
        Recipe recipe= new Recipe();

        recipe.setInfo("ismail","soup and meatballs",5,256);
        System.out.println(recipe);
    }

}
