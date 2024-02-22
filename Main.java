import java.util.Scanner;

class StarA {
    String a[][] = new String[6][6];

    StarA() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1 && (i >= 2 && i <= 5)) || (i == 1 && (j >= 2 && j <= 4)) || (i == 3 && (j >= 1 && j <= 5))
                        || (j == 5 && (i >= 2 && i <= 5))) {
                    a[i][j] = "* ";
                } else
                    a[i][j] = "  ";
            }

        }
    }
}

class StarB {
    String b[][] = new String[6][6];

    public StarB() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1)
                        || (i == 1 && (j >= 1 && j <= 4))
                        || (i == 3 && (j >= 1 && j <= 4))
                        || (i == 5 && (j >= 1 && j <= 4))
                        || (i == 4 && j == 5)
                        || (i == 2 && j == 5)) {
                    b[i][j] = "* ";
                } else
                    b[i][j] = "  ";
            }

        }
    }
}

class StarC {
    String c[][] = new String[6][6];

    StarC() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (((i > 1 && i < 5) && j == 1)
                        || (i == 1 && (j > 1 && j <= 5))
                        || (i == 5 && (j > 1 && j <= 5))) {
                    c[i][j] = "* ";
                } else
                    c[i][j] = "  ";
            }

        }
    }
}

class StarD {
    String d[][] = new String[6][6];

    StarD() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || (i == 1 && (j >= 1 && j <= 4)) || (i == 3 && j == 5) || (i == 5 && (j >= 1 && j <= 4))
                        || (i == 4 && j == 5)
                        || (i == 2 && j == 5)) {
                    d[i][j] = "* ";
                } else
                    d[i][j] = "  ";
            }

        }
    }
}

class StarE {
    String e[][] = new String[6][6];

    StarE() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || (i == 1 && (j >= 1 && j <= 5)) || (i == 3 && (j >= 1 && j <= 3))
                        || (i == 5 && (j >= 1 && j <= 5))) {
                    e[i][j] = "* ";
                } else
                    e[i][j] = "  ";
            }

        }
    }
}

class StarF {
    String f[][] = new String[6][6];

    StarF() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || (i == 1 && (j >= 1 && j <= 5)) || (i == 3 && (j >= 1 && j <= 5))) {
                    f[i][j] = "* ";
                } else
                    f[i][j] = "  ";
            }

        }
    }
}

class StarG {
    String g[][] = new String[6][6];

    StarG() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((i == 1 && (j >= 1 && j <= 5)) || (j == 1) || (i == 5 && (j >= 1 && j <= 3)) || (i == 3 && j >= 3)
                // || (i == 4 && j == 3)
                        || (i == 4 && j == 5) || (i == 5 && (j == 4 || j == 5))) {
                    g[i][j] = "* ";
                } else
                    g[i][j] = "  ";
            }

        }
    }
}

class StarH {
    String h[][] = new String[6][6];

    StarH() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((j == 1) || j == 5 || (i == 3 && (j >= 1 && j <= 5))) {
                    h[i][j] = "* ";
                } else
                    h[i][j] = "  ";
            }

        }
    }
}

class StarI {
    String i[][] = new String[6][6];

    StarI() {
        for (int k = 0; k <= 5; k++) {
            for (int j = 0; j <= 5; j++) {
                if ((k == 1 && (j >= 1 && j <= 5)) || (k == 5) && (j >= 1 && j <= 5) || (j == 3)) {
                    i[k][j] = "* ";
                } else
                    i[k][j] = "  ";
            }

        }
    }
}

class StarJ {
    String j[][] = new String[6][6];

    StarJ() {
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= 5; k++) {
                if ((i == 1 && (k >= 1 && k <= 5)) || (k == 3 && i <= 4) || (i == 4 && k == 1)
                        || (i == 5 && (k >= 1 && k <= 3))) {
                    j[i][k] = "* ";
                } else
                    j[i][k] = "  ";
            }

        }
    }
}

class StarK {
    String k[][] = new String[6][6];

    StarK() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || ((i == 2 || i == 4) && j == 3) || ((i == 1 || i == 5) && j == 4)
                        || (i == 3 && j == 2)) {
                    k[i][j] = "* ";
                } else
                    k[i][j] = "  ";
            }

        }
    }
}

class StarL {
    String l[][] = new String[6][6];

    StarL() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || i == 5 && (j >= 1 && j <= 5)) {
                    l[i][j] = "* ";
                } else
                    l[i][j] = "  ";
            }

        }
    }
}

class StarM {
    String m[][] = new String[6][6];

    StarM() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || j == 5 || (i == 2 && (j == 2 || j == 4)) || (i == 3 && j == 3)) {
                    m[i][j] = "* ";
                } else
                    m[i][j] = "  ";
            }

        }
    }
}

class StarN {
    String n[][] = new String[6][6];

    StarN() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || (j == 5) || (i == 2 && j == 2) || (i == 4 && j == 4) || (i == 3 && j == 3)) {
                    n[i][j] = "* ";
                } else
                    n[i][j] = "  ";
            }

        }
    }
}

class StarO {
    String o[][] = new String[6][6];

    StarO() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (((i == 1 || i == 5) && (j > 1 && j < 5)) ||
                        ((i > 1 && i < 5) && (j == 1 || j == 5))) {
                    o[i][j] = "* ";
                } else
                    o[i][j] = "  ";
            }

        }
    }
}

class StarP {
    String p[][] = new String[6][6];

    StarP() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) ||
                        ((i == 1 || i == 3) && (j >= 1 && j <= 4)) ||
                        (j == 5 && (i == 2))) {
                    p[i][j] = "* ";
                } else
                    p[i][j] = "  ";
            }

        }
    }
}

class StarQ {
    String q[][] = new String[6][6];

    StarQ() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (((i == 1 || i == 4) && (j > 1 && j < 4)) ||
                        ((i > 1 && i < 4) && (j == 1 || j == 4)) ||
                        (i == 3 && j == 3) ||
                        (i == 4 && j == 4) ||
                        (i == 5 && j == 5)) {
                    q[i][j] = "* ";
                } else
                    q[i][j] = "  ";
            }

        }
    }
}

class StarR {
    String r[][] = new String[6][6];

    StarR() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) ||
                        ((i == 1 || i == 3) && (j >= 1 && j <= 4)) ||
                        (j == 5 && (i == 2)) ||
                        (i == 4 && j == 3) ||
                        (i == 5 && j == 4)) {
                    r[i][j] = "* ";
                } else
                    r[i][j] = "  ";
            }

        }
    }
}

class StarS {
    String s[][] = new String[6][6];

    StarS() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((i == 2 && j == 1)
                        || (i == 4 && j == 5)
                        || (i == 3 && (j == 2
                                || j == 3 || j == 4))
                        || (i == 1 && j > 1)
                        || (i == 5 && (j >= 1 && j <= 4))) {
                    s[i][j] = "* ";
                } else
                    s[i][j] = "  ";
            }

        }
    }
}

class StarT {
    String t[][] = new String[6][6];

    StarT() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((i == 1 && (j >= 1 && j <= 5))
                        || (j == 3 && i <= 5)) {
                    t[i][j] = "* ";
                } else
                    t[i][j] = "  ";
            }

        }
    }
}

class StarU {
    String u[][] = new String[6][6];

    StarU() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1 && i <= 4) || (j == 5 && i <= 4) || (i == 5 && (j == 2 || j == 3 || j == 4))) {
                    u[i][j] = "* ";
                } else
                    u[i][j] = "  ";
            }

        }
    }
}

class StarV {
    String v[][] = new String[6][6];

    StarV() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1 && i < 4) || (j == 5 && i < 4) || (i == 5 && j == 3) || (i == 4 && (j == 2 || j == 4))) {
                    v[i][j] = "* ";
                } else
                    v[i][j] = "  ";
            }

        }
    }
}

class StarW {
    String w[][] = new String[6][6];

    StarW() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || j == 5 || (i == 4 && (j == 2 || j == 4)) || (i == 3 && j == 3)) {
                    w[i][j] = "* ";
                } else
                    w[i][j] = "  ";
            }

        }
    }
}

class StarX {
    String x[][] = new String[6][6];

    StarX() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (((i == 1 || i == 5) && (j == 1 || j == 5)) ||
                        (i == 2 || i == 4) && (j == 2 || j == 4) ||
                        (i == 3 && j == 3)) {
                    x[i][j] = "* ";
                } else
                    x[i][j] = "  ";
            }

        }
    }
}

class StarY {
    String y[][] = new String[6][6];

    StarY() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (((i == 1) && (j == 1 || j == 5)) ||
                        (i == 2) && (j == 2 || j == 4) ||
                        ((i == 3 || i == 4 || i == 5) && j == 3)) {
                    y[i][j] = "* ";
                } else
                    y[i][j] = "  ";
            }

        }
    }
}

class StarZ {
    String z[][] = new String[6][6];

    StarZ() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((i == 1 && (j >= 1 && j <= 5)) || (i == 5 && (j >= 1 && j <= 5)) || (i == 2 && j == 4)
                        || (i == 4 && j == 2) || (i == 3 && j == 3)) {
                    z[i][j] = "* ";
                } else
                    z[i][j] = "  ";
            }

        }
    }
}

class Print {
    public void print(String[][] arr) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

// To append to arrays
class ArrangeAlpha {

    String[][] arrange(String[][] arr, String[][] arr1) {
        String result[][] = new String[6][arr[1].length + arr1[1].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                result[i][j + (arr[i].length)] = arr1[i][j];
                // System.out.println(result[i].length);
            }
        }
        return result;

    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        // Taking input
        System.out.print("  Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println();
        // Converting name to uppercase
        String str = name.toUpperCase();
        // storing single letter of name into letter array
        char letter[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            letter[i] = str.charAt(i);
            // System.out.println(letter.length);
        }
        // object of print class to print 2d arrays with print() method
        Print print = new Print();
        // Alphabets ojects
        StarA a = new StarA();
        StarB b = new StarB();
        StarC c = new StarC();
        StarD d = new StarD();
        StarE e = new StarE();
        StarF f = new StarF();
        StarG g = new StarG();
        StarH h = new StarH();
        StarI i = new StarI();
        StarJ j = new StarJ();
        StarK k = new StarK();
        StarL l = new StarL();
        StarM m = new StarM();
        StarN n = new StarN();
        StarO o = new StarO();
        StarP p = new StarP();
        StarQ q = new StarQ();
        StarR r = new StarR();
        StarS s = new StarS();
        StarT t = new StarT();
        StarU u = new StarU();
        StarV v = new StarV();
        StarW w = new StarW();
        StarX x = new StarX();
        StarY y = new StarY();
        StarZ z = new StarZ();
        String finallString[][] = new String[6][0];
        ArrangeAlpha arng = new ArrangeAlpha();
        int count = 0;
        while (count < letter.length) {
            if (letter[count] == 'A') {
                // System.out.println("yes");
                finallString = arng.arrange(finallString, a.a);
                count++;
            } else if (letter[count] == 'B') {
                finallString = arng.arrange(finallString, b.b);
                count++;
            } else if (letter[count] == 'C') {
                finallString = arng.arrange(finallString, c.c);
                count++;
            } else if (letter[count] == 'D') {
                finallString = arng.arrange(finallString, d.d);
                count++;
            } else if (letter[count] == 'E') {
                finallString = arng.arrange(finallString, e.e);
                count++;
            } else if (letter[count] == 'F') {
                finallString = arng.arrange(finallString, f.f);
                count++;
            } else if (letter[count] == 'G') {
                finallString = arng.arrange(finallString, g.g);
                count++;
            } else if (letter[count] == 'H') {
                finallString = arng.arrange(finallString, h.h);
                count++;
            } else if (letter[count] == 'I') {
                finallString = arng.arrange(finallString, i.i);
                count++;
            } else if (letter[count] == 'J') {
                finallString = arng.arrange(finallString, j.j);
                count++;
            } else if (letter[count] == 'K') {
                finallString = arng.arrange(finallString, k.k);
                count++;
            } else if (letter[count] == 'L') {
                finallString = arng.arrange(finallString, l.l);
                count++;
            } else if (letter[count] == 'M') {
                finallString = arng.arrange(finallString, m.m);
                count++;
            } else if (letter[count] == 'N') {
                finallString = arng.arrange(finallString, n.n);
                count++;
            } else if (letter[count] == 'O') {
                finallString = arng.arrange(finallString, o.o);
                count++;
            } else if (letter[count] == 'P') {
                finallString = arng.arrange(finallString, p.p);
                count++;
            } else if (letter[count] == 'Q') {
                finallString = arng.arrange(finallString, q.q);
                count++;
            } else if (letter[count] == 'R') {
                finallString = arng.arrange(finallString, r.r);
                count++;
            } else if (letter[count] == 'S') {
                finallString = arng.arrange(finallString, s.s);
                count++;
            } else if (letter[count] == 'T') {
                finallString = arng.arrange(finallString, t.t);
                count++;
            } else if (letter[count] == 'U') {
                finallString = arng.arrange(finallString, u.u);
                count++;
            } else if (letter[count] == 'V') {
                finallString = arng.arrange(finallString, v.v);
                count++;
            } else if (letter[count] == 'W') {
                finallString = arng.arrange(finallString, w.w);
                count++;
            } else if (letter[count] == 'X') {
                finallString = arng.arrange(finallString, x.x);
                count++;
            } else if (letter[count] == 'Y') {
                finallString = arng.arrange(finallString, y.y);
                count++;
            } else if (letter[count] == 'Z') {
                finallString = arng.arrange(finallString, z.z);
                count++;
            } else {
                System.out.println("You Are Dumb Enter Charecter In B/W A-Z.");
                break;
            }
        }

        print.print(finallString);
        System.out.println();
        sc.close();
    }
}
