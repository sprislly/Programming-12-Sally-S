public class Motorcycle extends Vehicle{
    public boolean hasSideCar;

    public Motorcycle(int registrationNumber, Person owner, boolean hasSideCar) {
        super(registrationNumber, owner);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vehicle){
            Vehicle temp = (Vehicle) obj;
            return this.registrationNumber == temp.registrationNumber;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString(){
        return super.toString() + "Hassidecar" + hasSideCar;
    }
}




//chem, math, comp, french