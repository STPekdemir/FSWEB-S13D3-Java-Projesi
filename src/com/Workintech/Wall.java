package com.Workintech;

public class Wall {
    private double width;
    private double height;

    public Wall(double width, double height) {
        if(width<=0){
            this.width=0;
        }else {

            this.width = width;
        }
        if(height<=0){
            this.height=0;
        }else {

            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            this.height=0;
        }else {
            this.width = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<=0){
            this.height=0;
        }else {
        this.height = height;
        }
    }

    public double getArea(){
        return height*width;
    }

    @Override
    public String toString() {
        return "Width:"+String.valueOf(width)+"Heigth:"+String.valueOf(height);
    }
}
