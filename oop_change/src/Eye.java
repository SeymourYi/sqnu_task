public class Eye extends Organ{
    private String color;
    private boolean isOpened;

    public Eye(String name, String medicalCondition, String color, boolean isOpened) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("color" + this.getColor());
    }
    public void open(){
        this.setOpened(true);
        System.out.println(this.getName() + "opened");
    }
    public void close(){
        this.setOpened(false);
        System.out.println(this.getName() + "close");
    }
    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}
