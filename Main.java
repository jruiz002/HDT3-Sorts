public class Main {
    public static void main(String[] args) {

        //Generar archivo
        DataManager.numerosRandom("datos.txt", 3000);


        GnomeSort sort = new GnomeSort();
        sort.sort(DataManager.saveNumbers(10, "datos.txt"));

    }


}
