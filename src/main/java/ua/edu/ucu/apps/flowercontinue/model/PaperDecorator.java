package ua.edu.ucu.apps.flowercontinue.model;

public class PaperDecorator extends ItemDecorator {
    
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 13 + super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with paper wrapping";
    }
}
