package aula07;

public class UltraEmojiCombati {
    public static void main(String[] args) {
        Lutador l [] = new Lutador[6];
               l[0]=new Lutador ("Gudi","França",33,120,98 ,12,5,2);
               l[1]=new Lutador ("murilo","italia",33,120,118 ,12,5,2);
               l[2]=new Lutador ("Jonas","Brasil",33,120,78 ,12,5,2);
               l[3]=new Lutador ("Bem","Brasil",18,159,98 ,2,5,2);
               l[4]=new Lutador ("Joao","Brasil",28,199,80 ,2,5,2);
               l[5]=new Lutador ("tiago","Brasil",18,59,98 ,2,5,2);

    Luta UEC01 = new Luta();
    UEC01.marcarLuta(l[1],l[2] );
    UEC01.lutar();


    }
}