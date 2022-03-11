public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        caixa.addElement(5);
        caixa.addElement(9);
        caixa.addElement("a");
        caixa.addElement("b");
        caixa.addElement("c");
        caixa.addElement("d");

        //caixa.remove(1);
        Object o = caixa.get(1);

        System.out.println(caixa);
    }
}
