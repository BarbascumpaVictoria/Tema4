package AriaCercului.src;

public class Main {
    public static void main(String[] args) {

        Circle ariacercului = new Circle();
        Circle.pi = 3.14159F;
        Circle.radius = 4;
        Circle.cheamaMetoda();

        Circle varianta2  =new Circle(8);
        Circle.cheamaMetoda();

    }
}

//2.	În interiorul unui proiect, creați o clasă cu denumirea Circle. Definiți în interiorul clasei un atribut cu denumirea radius și  o metodă cu denumirea calculateArea(). În interiorul metodei, utilizați formula corespunzătoare pentru a calcula aria cercului utilizând valoarea razei din cadrul variabilei radius. Odată calculată, afișați aria la consolă.
//        Definiți un constructor pentru clasa Circle cu un parametru. Valoarea din cadrul parametrului va fi setată pe variabila radius în momentul inițializării obiectelor.
//        Reveniți într-o clasă care are metoda main. Dacă nu aveți o astfel de clasă, creați-o. Inițializați un obiect de tipul clasei Circle transmițând ca argument valoarea razei. Apelați metoda calculareArea() și asigurați-vă că aceasta afișează rezultatul corespunzător la consolă.
