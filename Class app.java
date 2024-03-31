public class app {
    public static void main(string[]args) throws Exception {
    Libmath<Integer, Integer> libmath = new Libmath<>(angka1:10, angka2:20);
    Libmath<Double, Double> libmath2 = new Libmath <>(angka1: 10.0, angka2:10.0);
    Libmath<Integer, Double> libmath3 = new Libmath <>(angka1:10,angka2:20,0);
    Libmath<Double, Integer> libmath4 = new Libmath<>(angka1:10.0, angka2:10);
    libmath.add();
    libmath2.add();
    libmath3.add();
    libmath4.add();

    GenLib.printAlamat(a:"jalan cibodas", b:"Nagrak");
    Genlib.printAlamat (a:"jalan Cibodas", b: 10);
    
    }
}
