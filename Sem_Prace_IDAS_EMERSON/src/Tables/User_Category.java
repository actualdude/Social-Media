/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

/**
 *
 * @author Hidden Treasure
 */
public class User_Category {
    
    int category_id;
    String category;

    public User_Category(int category_id, String category) {
        this.category_id = category_id;
        this.category = category;
    }
    
    public User_Category(String category) {
        this.category = category;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    @Override
    public String toString() {
       return "[CATEGORY_ID :] " + category_id +
               " [CATEGORY :] " + category;
    }
    
}
