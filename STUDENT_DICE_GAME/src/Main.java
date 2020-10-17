public class Main {

    public static void main(String[] args) {

        Student player1 = new Student();
        player1.setName("Omer Faruk");
        player1.setSurname("Kucuk");
        player1.setGender("male");

        Student player2 = new Student();
        player2.setName("Ayse");
        player2.setSurname("Fatma");
        player2.setGender("female");

        Dice dice = new Dice();

        System.out.println("GAME: " + dice.gameName);

        /* for student(player) 1 */
        player1.setNumber(dice.roll());
        /* for student(player) 2 */
        player2.setNumber(dice.roll());

        System.out.println(player1.name + "'s number: " + player1.number);
        System.out.println(player2.name + "'s number: " + player2.number);

        if (player1.number > player2.number) {
            System.out.println("The winner is " + player1.name + " " + player1.surname + "!");
        } else if (player2.number > player1.number) {
            System.out.println("The winner is " + player2.name + " " + player2.surname + "!");
        } else {
            System.out.println("The game is a draw...");
        }

    }

}