package practiseTasks;

public class Books {
    public static void main(String[] args) {
        String genre="Detective";
        String result="Sorry we don't have information for the "+ genre + "genre";
        int pageLength = 0,
                profitAmount = 0,
                sequels = 0,
                countriesNum = 0;

if(genre.equals("Fantasy")||genre.equals("Detective")||genre.equals("Science Fiction")||genre.equals("Short Story")) {
    switch (genre) {
        case "Fantasy":
            pageLength = 500;
            profitAmount = 1000000;
            sequels = 5;
            countriesNum = 50;
            break;
        case "Detective":
            pageLength = 350;
            profitAmount = 700_000;
            sequels = 3;
            countriesNum = 45;
            break;
        case "Science Fiction":
            pageLength = 720;
            profitAmount = 900_500;
            sequels = 4;
            countriesNum = 30;
            break;
        case "Short Story":
            pageLength = 150;
            profitAmount = 300_000;
            sequels = 1;
            countriesNum = 40;
            break;


    }
    result = "The " + genre + " genre usually has profits of " + profitAmount + " being sold in "
            + countriesNum + " different countries.\n" +
            "\tThe " + genre + " books often have " + sequels + " squeals with each book roughly being around " + pageLength + " pages.";
    System.out.println("result = " + result);
}else {
    System.out.println("result = " + result);
}
        /*

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40*/

    }
}
