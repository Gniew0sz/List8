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
    public Matrix(int height, int width) {
        this.height = height;
        this.width = width;
        this.data = new int[height][width];
        Random rand = new Random();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                data[i][j] = rand.nextInt(10);
            }
        }
    }
    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matrix transpose() {
        Matrix transposed = new Matrix(width, height);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                transposed.data[j][i] = this.data[i][j];
            }
        }
        return transposed;
    }
    public void printSpiral() {
        int top = 0, bottom = height - 1;
        int left = 0, right = width - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) System.out.print(data[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++) System.out.print(data[i][right] + " ");
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) System.out.print(data[bottom][i] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(data[i][left] + " ");
                left++;
            }
        }
        System.out.println();
    }
    public Matrix multiply(Matrix other) {
        if (this.width != other.height) {
            System.out.println("The matrices' sizes don't match");;
        }else {
            Matrix result = new Matrix(this.height, other.width);
            for (int i = 0; i < result.height; i++) {
                for (int j = 0; j < result.width; j++) {
                    result.data[i][j] = 0;
                    for (int k = 0; k < this.width; k++) {
                        result.data[i][j] += this.data[i][k] * other.data[k][j];
                    }
                }
            }
            return result;
        }
    }

}
class Main {
    void main() {

  }

}
