import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import MI SERVEEEEE.esam.Rivestimento; SERVEEEEE.esam.Rivestimento; SERVEEEEE.esam.Rivestimento; SERVEEEEE.esam.Rivestimento;

public class Utilità{
    //Esempi di RI e AF

    // RI: * 0 <= dimensione <= valore.length
    //     * valore[dimensione - 1] == true && valore[p] == false se p >= dimensione
    //     * valore != null
    // AF: BoolVect di taglia valore.length il cui i-esimo valore di verità è l'i-esimo
    //     elemento dell'array valore

    //AF: il booleano nella posizione i è vero se esiste nel set l'intero i, altrimenti è falso
    /**
     * RI: bools e i suoi elementi non devono essere null, nessun Integer deve essere negativo,
     * la dimensione non deve essere più grande della taglia;
     */
    
    // RI: (vuoto)
    // AF: l'i-esimo valore di verità del BoolVect è vero se e solo se l'i-esimo bit di bits è 1.

    // RI: positions != null e non contiene null
    // AF: l'i-esimo valore di verità del BoolVect è vero se e solo se i appartiene a positions.

    // RI: mat è non nullo ed ogni riga ha la stessa dimensione del numero di righe che è
    //     positivo
    // AF: gli elementi dell'array corrispondono a quelli della matrice

    // RI: diagonale non è null
    // AF: l'i-esimo elemento della diagonale della matrice coincide con l'i-esimo
    // elemento dell'array

    //Codici utili
    /**
     * Voglio controllare che in un array primitivo ci sia un certo valore
     * Va bene anche cercare un null
     */
    Arrays.asList(nomeArray).contains(certo valore);

    //Per creare un tipo numerico booleano
    private long bits = 0;

    public class Test implements Iterable<Test.Sotto>{

        public static class Sotto implements Rivestimento{

            public Componente(final int quantità, final Rivestimento rivestimento) {
                /**
                 * metodo costruttore classe interna
                 */
            }
            //Altri metodi unici per la classe Sotto
        }
        private final Collection<Sotto> esempio;
        //Oppure puoi usare
        private final List<Sotto> esempio2; //poi lo istanzi come ti pare

        public Test(final Collection<Sotto> esempio) {
            // SOF: copyof
            this.esempio = List.copyOf(esempio);
            // EOF: copyof
            if (esempio.isEmpty())
                throw new IllegalArgumentException("Ci deve essere sempre almeno una componente.");
        }

        //UNA MAPPA
        private final Map<Giocattolo, Integer> inventario;
    
        public NomeClasse(){
            this.inventario = new HashMap<Giocattolo, Integer>();
        }
        //IL SUO ITERATOR (solo sulla chiave)
        @Override
        public Iterator<Giocattolo> iterator() {
            List<Giocattolo> lista = new ArrayList<>(inventario.keySet()); 
            Collections.sort(
            lista,
            new Comparator<Giocattolo>() {
            @Override
            public int compare(Giocattolo o1, Giocattolo o2) {
                return o1.toString().compareTo(o2.toString());
            }
            });//se si vuole ordinare
        return lista.iterator();
        }
        //IL SUO ITERATOR (solo sui valori)
        @Override
        public Iterator<Integer> iterator() {
            List<Integer> lista = new ArrayList<Integer>(inventario.values());
            Collections.sort(lista); //Se si vuole ordinare
            return lista.iterator();
        }

        //UN MAIN GIà PRONTO (magari non serve)
        public static void main(String[] args) {
            try (Scanner s = new Scanner(System.in)) {
              while (s.hasNextLine())
                try (Scanner t = new Scanner(s.nextLine())) {
                  final char cmd = t.next().charAt(0);
                  final int p;
                  final boolean b;
                  final BoolVect u, v;
                  switch (cmd) {
                    case 'S':
                        p = t.nextInt();
                        b = t.next().charAt(0) == 'V';
                        u = fromString(t.next());
                        u.scrivi(p, b);
                        System.out.println(u);
                        break;
                    case 'G':
                        p = t.nextInt();
                        u = fromString(t.next());
                        System.out.println(u.leggi(p) ? 'V' : 'F');
                        break;
                    case '&':
                        u = fromString(t.next());
                        v = fromString(t.next());
                        u.and(v);
                        System.out.println(u);
                        break;
                    case '|':
                        u = fromString(t.next());
                        v = fromString(t.next());
                        u.or(v);
                        System.out.println(u);
                        break;
                    case '^':
                        u = fromString(t.next());
                        v = fromString(t.next());
                        u.xor(v);
                        System.out.println(u);
                        break;
                    }
                }
            }
        }
    }
}