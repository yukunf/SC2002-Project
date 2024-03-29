package src.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengyukun
 * Created at 21/3/24 17:40
 * Email : @author fengyukufyk@sina.com
 * Package : src
 * @version 1.00.00
 **/
public class Menu {
    List<Food> foodList;

    public Menu() {
        this.foodList = new ArrayList<>();
    }

    public Menu(List<Food> foodList) {
        this.foodList = foodList;
    }

    public List<Food> getFoodList(){
        return foodList;
    }
    
    public List<Food> getFoodListByBranch(String branch){
    	List<Food> branchMenu = new ArrayList<Food>();
    	for(Food f : foodList) {
    		if(f.getBranch().equals(branch)) {
    			branchMenu.add(f);
    		}
    	}
    	return branchMenu;
    }
    
    public void setFoodListByBranch(List<Food> foodList){
    	this.foodList = foodList;
    }

    
    public List<Food> getFoodListByCategory(List<Food> branchMenu, FoodCategory category){
        List<Food> cate = new ArrayList<>();
        for(Food f: branchMenu){
            if(f.getCategory() == category) cate.add(f);
        }
        return cate;
    }
    //#TODO more methods



}
