class Sphere{
    private int radius; // properties should be acces through getters for encapsulation purposes this applies to all of them
    int getradius(){
        return radius;
    }
    void setradius(int radius){
        this.radius = radius;
    }
    int getVolume(){
        return radius*radius*radius*4/3*Math.PI;
    }
    int getArea(){
        return 4*radius*Math.PI;
    }


}
class Circle{
int radius;
int getradius(){
    return radius;
}
void setradius(int radius){}
    int getArea(){
        return radius*radius*Math.PI;
    }
    int getCircumference(){
        return radius*2*Math.PI;
    }
}

class Matrix{ //once a matrix is defined it should not change its size
    int width;
    int height;
    int getWidth(){
        return width;
    }
    int getHeight(){
        return height;
    }

}
class Main {
    void main() {

  }

}
