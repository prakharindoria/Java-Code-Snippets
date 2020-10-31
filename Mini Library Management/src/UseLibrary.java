import java.util.Scanner;
import java.util.*;

public class UseLibrary {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        char ch;Library l;
        System.out.println("Enter Book Details:");
        do{
            System.out.println("Book Name: ");
            String bname = kb.nextLine();
            System.out.println("Book Author: ");
            String bauthor=kb.nextLine();
            System.out.println("Book Price: ");
            double bprice=kb.nextDouble();kb.nextLine();
            Book b=new Book(bname,bauthor,bprice);
            l=new Library();
            l.addBook(b);
            System.out.println("Do you want to Enter Another Book? (Yes/No)");
            ch=kb.next().charAt(0);kb.nextLine();
        }while(ch=='y');


        System.out.println("Total Number of Books in Library : "+l.getBookCount());
        HashSet<Book> hs=new HashSet<Book>();
        hs.addAll(l.getAllBooks());
        Iterator<Book> it =hs.iterator();
        int count=1;
        while(it.hasNext()){
            Book bp=it.next();
            System.out.println("Book "+count+" Details are as Follows :"+ bp.getBname()+" by "+bp.getBauthor()+" "+bp.getBprice());
            count++;
        }

    }

/*
Enter Book Details:
Book Name:
Lolita
Book Author:
Vladimir Nabokov
Book Price:
1200
Do you want to Enter Another Book? (Yes/No)
yes
Book Name:
The Great Gatsby
Book Author:
F. Scott Fitzgerald
Book Price:
1500
Do you want to Enter Another Book? (Yes/No)
yes
Book Name:
In Search of Lost Time
Book Author:
Marcel Proust
Book Price:
340
Do you want to Enter Another Book? (Yes/No)
yes
Book Name:
Ulysses
Book Author:
James Joyce
Book Price:
500
Do you want to Enter Another Book? (Yes/No)
yes
Book Name:
Dubliners
Book Author:
James Joyce
Book Price:
250
Do you want to Enter Another Book? (Yes/No)
yes
Book Name:
One Hundred Years of Solitute
Book Author:
Gabriel Garcia Marquez
Book Price:
460
Do you want to Enter Another Book? (Yes/No)
yes
Book Name:
The Sound and the Fury
Book Author:
Wiliam Faulkar
Book Price:
120
Do you want to Enter Another Book? (Yes/No)
yes
Book Name:
To The Lighthouse
Book Author:
Virginia Woolf
Book Price:
450
Do you want to Enter Another Book? (Yes/No)
yes
Book Name:
The Complete Stories
Book Author:
Flannery O'Connor
Book Price:
1500
Do you want to Enter Another Book? (Yes/No)
yes
Book Name:
Pale Fire
Book Author:
Vladimir Nabokov
Book Price:
1300
Do you want to Enter Another Book? (Yes/No)
yes
Book Name:
Crime and Punishment
Book Author:
Fyodor Dostoevsky
Book Price:
2100
Do you want to Enter Another Book? (Yes/No)
yes
Book Name:
The Brother's Karamazov
Book Author:
Fyodor Dostoevsky
Book Price:
2500
Do you want to Enter Another Book? (Yes/No)
no
Total Number of Books in Library : 12
Book 1 Details are as Follows :The Great Gatsby by F. Scott Fitzgerald 1500.0
Book 2 Details are as Follows :The Complete Stories by Flannery O'Connor 1500.0
Book 3 Details are as Follows :Dubliners byJames Joyce 250.0
Book 4 Details are as Follows :To The Lighthouse by Virginia Woolf 450.0
Book 5 Details are as Follows :Pale Fire by Vladimir Nabokov 1300.0
Book 6 Details are as Follows :In Search of Lost Time by Marcel Proust 340.0
Book 7 Details are as Follows :The Brother's Karamazov by Fyodor Dostoevsky 2500.0
Book 8 Details are as Follows :One Hundred Years of Solitute by Gabriel Garcia Marquez 460.0
Book 9 Details are as Follows :The Sound and the Fury by Wiliam Faulkar 120.0
Book 10 Details are as Follows :Crime and Punishment by Fyodor Dostoevsky 2100.0
Book 11 Details are as Follows :Ulysses by James Joyce 500.0
Book 12 Details are as Follows :Lolita by Vladimir Nabokov 1200.0
 */



}
