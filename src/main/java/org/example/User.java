package org.example;

public class User {
    public int getScore(){
        if(this instanceof Student){
            return getScore();
        }else{
            return 0;
        }
    }
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
