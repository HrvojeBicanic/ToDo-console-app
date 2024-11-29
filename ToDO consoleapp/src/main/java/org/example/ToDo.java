package org.example;

public class ToDo {
    private  String name;
    //private  String status;


    public  ToDo(String name) {
        this.name = name;
        //this.status = status;
    }



    public String getName() {
        return this.name;
    }

//    public String getStatus() {
//        return  this.status;
//    }

    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public String toString() {
        return name;
    }
}