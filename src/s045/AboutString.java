package s045;

public class AboutString {
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or"; //variabili
        System.out.println("s, t, u: " + s + ", " + t + ", " + u); 
        
//carattere in posizione 1 (non 0!) della stringa S 
        System.out.println("char at position 1 in s: " + s.charAt(1));
//Differenza degli Unicodes; conviene ricavarne solo 3 valori: -1, 0 ; +1. 
        System.out.println("s < t: " + s.compareTo(t));
        System.out.println("t > s: " + t.compareTo(s));
        
        System.out.println("concat s and t: " + s.concat(t));

        System.out.println("t contains u? " + t.contains(u));
//intervallo è [1,3). 
        String u2 = t.substring(1, 3);
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3)); //prende dal carattere in pos 3 fino alla fine della parola

        System.out.println("u equals u2? " + u.equals(u2));
        System.out.println("u == u2? " + (u == u2));

        System.out.println("First index of 'l' is s: " + s.indexOf('l'));//carattere
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));//carattere
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));//carattere
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));//strings
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty());

        System.out.println("s length: " + s.length());

        String s2 = s.replace('l', 'q');
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        String[] splits = "one for me, one for you".split(" ");
        System.out.println("Splitting: ");
        for (String token : splits) {
            System.out.println(token);
        }
        String joined = String.join(" ", splits);//stringa unica da array di stringhe
        System.out.println("Joining back [" + joined + "]");

        System.out.println("upper: " + s.toUpperCase());
        System.out.println("lower: " + "SHUT UP!".toLowerCase());

        System.out.println("trim [" + " la la la ".trim() + "]");
        
        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x)); //con toString avrebbe crashato perché non il valore di x è null 
    }
}
