public class App extends Access1 {
    public static void main(String[] args) throws Exception {

        App a = new App();
        a.display2(); //Can access protected method if we extend the class
        a.display("Hello"); //Can access final method if we extend the class

        

    }
}
