public class Caixa {
    Object[] objectArray;
    int nobj = 0;
    int capacity = 0;

    public Caixa() {
        objectArray = new Object[10];
        capacity = 5;
    }

    public Caixa(int capacity){
        objectArray = new Object[capacity];
        this.capacity = capacity;
    }

    void addElement(Object o){
        if (this.nobj == this.capacity){
            int newCapacity = this.capacity*2;
            Object[] newArray = new Object[newCapacity];
            for (int i = 0; i < this.capacity; i++) {
                newArray[i] = this.objectArray[i];
            }
            this.objectArray = newArray;
            this.capacity = newCapacity;
            System.out.println("Hem ampliat la capacitat: " + newCapacity);
        }
        this.objectArray[this.nobj] = o;
        this.nobj++;
    }

    @Override
    public String toString(){
        String result = "";
        for (int i = 0; i < this.nobj; i++) {
            result += this.objectArray[i].toString() + ", ";
        }
        return result;
    }

    public void remove(int pos) {
        if (pos < this.nobj){
            for (int i = pos; i < nobj-1; i++) {
                objectArray[i] = objectArray[i+1];

            }

            objectArray[this.nobj-1] = null;
            this.nobj--;
        } else System.out.println("la posicio a eliminar no exiteix");
    }

    public Object get(int pos) {
        if (pos < this.nobj){
            return objectArray[pos];
        }
        throw new RuntimeException("Posició inexistent")
    }
}
