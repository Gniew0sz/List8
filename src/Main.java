class Sphere{
    private int diameter; // properties should be acces through getters for encapsulation purposes this applies to all of them
    int getDiameter(){
        return diameter;
    }
    void setDiameter(int diameter){
        this.diameter = diameter;
    }


}
class Circle{
int diameter;
int getDiameter(){
    return diameter;
}
void setDiameter(int diameter){}
    int getArea(){
        return diameter*diameter/2*Math.PI;
    }
    int getCircumference(){
        return diameter*Math.PI;
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
