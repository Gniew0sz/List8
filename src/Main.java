class Sphere{
    private int radius; // properties should be acces through getters for encapsulation purposes this applies to all of them
    public int getradius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getVolume(){
        return radius*radius*radius*4/3*Math.PI;
    }
    public int getArea(){
        return 4*radius*Math.PI;
    }


}
class Circle{
int radius;
    public int getradius(){
    return radius;
}
    public void setradius(int radius){}
    public int getArea(){
        return radius*radius*Math.PI;
    }
    public int getCircumference(){
        return radius*2*Math.PI;
    }
}

class Matrix{ //once a matrix is defined it should not change its size
    private final int width;
    private final int height;
    private final int data[][];
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int width){}
    public void setHeight(int height){}

}
class Main {
    void main() {

  }

}
