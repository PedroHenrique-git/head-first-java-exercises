package chapter4;

public class Dog {
    private String name;
    private double width;
    private double height;

    public Dog() {
    }

    public Dog(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            return;
        }

        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            return;
        }

        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Dog)) {
            return false;
        }

        final Dog dog = (Dog) obj;

        return this.name.equals(dog.getName()) && this.width == dog.getWidth() && this.height == dog.getHeight();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
