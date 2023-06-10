package com.driver;

public class Main {

    RWOnly obj = new RWOnly();

    //obj.name = "Kashish";

    public void setObj(RWOnly obj) {
        this.obj = obj;
    }
    public RWOnly getObj() {
        return obj;
    }


}