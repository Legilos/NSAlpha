/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSalpha;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Bruce
 */
public class NSalpha {

    /**
     * @param args the command line arguments
     */
    private final NewJFrame frame = new NewJFrame();

    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        String[] titles = new String[99];
        titles[0] = "Titties";
        titles[1] = "Lap of Luxury";
        titles[2] = "Not My Glasses";
        titles[3] = "Beer Goggles";
        titles[4] = "Nudes";
        titles[5] = "Foot Fetish";
        titles[6] = "Double Tap";
        titles[7] = "Overcompensation";
        titles[8] = "Porn Guru";
        titles[9] = "What A Nice Guy";
        titles[10] = "Science vs Religion";
        titles[11] = "Pee-Pee Touch";
        titles[12] = "Getting Sloppy";
        titles[13] = "FLASH....AHHH!";
        titles[14] = "Jumping Jacks";
        titles[15] = "Man Crush";
        titles[16] = "JB on FB";
        titles[17] = "Let's Get It On....";
        titles[18] = "Beauty & The Beast";
        titles[19] = "I'll Be Watching You";
        titles[20] = "Just A Taste";
        titles[21] = "Drag Queen";
        titles[22] = "Talk Dirty To Me";
        titles[23] = "Drunkard";
        titles[24] = "Jungle Juice";
        titles[25] = "Pay-Back";
        titles[26] = "MFK";
        titles[27] = "What Did You Say";
        titles[28] = "Guilty Pleasure";
        titles[29] = "Work of Art";
        titles[30] = "Puss Out";
        titles[31] = "More Cow Bell";
        titles[32] = "Jabberwakie";
        titles[33] = "$3 per minute";
        titles[34] = "Strip";
        titles[35] = "Hee-Hee";
        titles[36] = "Pagen Be Gone!";
        titles[37] = "Demon Be Gone!";
        titles[38] = "Lyricist";
        titles[39] = "Lack o' Laughs";
        titles[40] = "I'm Batman";
        titles[41] = "Salad";
        titles[42] = "Rave!";
        titles[43] = "Use the Force";
        titles[44] = "Actor's Gild";
        titles[45] = "Wannabe";
        titles[46] = "Duck, Duck, Goose";
        titles[47] = "Red Cheeks";
        titles[48] = "Rankings";
        titles[49] = "Pterodactyl";
        titles[50] = "Gossipers";
        titles[51] = "Bromance";
        titles[52] = "Acid Trip";
        titles[53] = "Snuggle Bear";
        titles[54] = "Comeback Kid";
        titles[55] = "Clearing the Cave";
        titles[56] = "Kiss the Belly";
        titles[57] = "Tony Montana";
        titles[58] = "It Feels So Purple";
        titles[59] = "Laser";
        titles[60] = "Please Don't Quit Your Day Job";
        titles[61] = "Seriously...Don't Do It";
        titles[62] = "High Observation";
        titles[63] = "Cold Nose";
        titles[64] = "Punapalooza";
        titles[65] = "Going Ape";
        titles[66] = "Narcissist";
        titles[67] = "Blast From The Past";
        titles[68] = "Overly Apologetic";
        titles[69] = "That's What She Said!";
        titles[70] = "Dom";
        titles[71] = "It Puts The Lotion In The Basket";
        titles[72] = "Would He Be Proud";
        titles[73] = "Wet Willy";
        titles[74] = "Faults";
        titles[75] = "A Comfy Seat";
        titles[76] = "Help I've Fallen and Can't Get Up";
        titles[77] = "Sub";
        titles[78] = "Oral Fixation";
        titles[79] = "What A Baby";
        titles[80] = "Grunts & Groans";
        titles[81] = "Two Left Feet";
        titles[82] = "Go Team!";
        titles[83] = "He-She";
        titles[84] = "Tumblr Whore";
        titles[85] = "Conjunction Junction";
        titles[86] = "Yo Momma";
        titles[87] = "Mind Reader";
        titles[88] = "Brown Noser";
        titles[89] = "Belly Rub!";
        titles[90] = "Racist";
        titles[91] = "I'm In Heaven";
        titles[92] = "Arabian Delight";
        titles[93] = "Sneaky Sneaky";
        titles[94] = "Spit Some Fire";
        titles[95] = "Amatuer Scientist";
        titles[96] = "Throwback";
        titles[97] = "That Guy...";
        titles[98] = "Frabjous Day";

        String[] descriptions = new String[99];
        descriptions[0] = "Ask to see some titties";
        descriptions[1] = "Ask for a lap dance. Lose shame for attempt. Gain shame for erection.";
        descriptions[2] = "Wear someone else's glasses.";
        descriptions[3] = "Kiss the person you find the least attractive in the room.";
        descriptions[4] = "Send a nude to someone in the group.";
        descriptions[5] = "Ask someone to lick your feet.";
        descriptions[6] = "Have someone lightly ball tap you.";
        descriptions[7] = "Proudly describe your genitals.";
        descriptions[8] = "Watch porn with the person to the left for a round.";
        descriptions[9] = "Explicitly give someone a compliment.";
        descriptions[10] = "Try to convince the person to your right that evolution is a lie.";
        descriptions[11] = "For the next 3 turns, keep your hand down your pants.";
        descriptions[12] = "Describe to the group the worst sex you've ever had.";
        descriptions[13] = "Flash the group.";
        descriptions[14] = "Remove bra (Ladies) or pants (Lads) and do 10 jumping jax.";
        descriptions[15] = "Make someone in the group describe their perfect same-sex crush.";
        descriptions[16] = "Have someone change their social media profile pic to Justin Beiber.";
        descriptions[17] = "Make-out with someone of your choice.";
        descriptions[18] = "Ask someone in the group: If your lover was turned into an animal, would you have sex with them to change them back?";
        descriptions[19] = "Stare sensually at someone";
        descriptions[20] = "Lick someone.";
        descriptions[21] = "Switch clothes with someone.";
        descriptions[22] = "Talk dirty to someone.";
        descriptions[23] = "Pretend to be belligerently drunk for a round.";
        descriptions[24] = "Consume a nasty drink concotion.";
        descriptions[25] = "Make someone else a nasty drink concotion.";
        descriptions[26] = "Describe who you would marry, have sex with, and kill in the group.";
        descriptions[27] = "Have someone repeat everything you say for a round. Have someone repeat everything you say for a round.";
        descriptions[28] = "Play the most embarrassing song on your iPod.";
        descriptions[29] = "Draw a penis on someone's forehead. It must remain there for the rest of the game.";
        descriptions[30] = "Pre-emptively remove your shoes.";
        descriptions[31] = "Sing \"Blitzkrieg Bop\" as Christopher Walken.";
        descriptions[32] = "Speak gibberish for a round.";
        descriptions[33] = "Dial a sexline and give the phone to the person on your left.";
        descriptions[34] = "Remove articles of clothing. The more you remove, the more shame lost.";
        descriptions[35] = "Attempt to moonwalk with shoes on.";
        descriptions[36] = "Perform a baptisim on someone.";
        descriptions[37] = "Have someone perform an exorcism.";
        descriptions[38] = "Speak in song lyrics for a round.";
        descriptions[39] = "Have the person to your right tell a not funny joke.";
        descriptions[40] = "Call someone on your contact list and try to convince them you're Batman.";
        descriptions[41] = "Ask someone: Who in the room would you salad toss?";
        descriptions[42] = "Tell someone to dance like a white girl.";
        descriptions[43] = "Pretend you're R2-D2 and speak in beeps and boops for a round.";
        descriptions[44] = "Have someone act like their idol.";
        descriptions[45] = "Randomly speak with an accent.";
        descriptions[46] = "Play duck duck goose.";
        descriptions[47] = "Have someone describe an embarrassing moment. (Exluding this game)";
        descriptions[48] = "Ask someone to rank the group sexually. ";
        descriptions[49] = "Send someone a porn gif.";
        descriptions[50] = "Have someone graphically describe their first kiss.";
        descriptions[51] = "Kiss someone of the same sex.";
        descriptions[52] = "Move around the room pretending the floor is lava.";
        descriptions[53] = "Cuddle with someone for three rounds.";
        descriptions[54] = "Shuffle the discard pile, pull a random card out, and play it.";
        descriptions[55] = "Offer to pick someone's nose";
        descriptions[56] = "Raspberry someone.";
        descriptions[57] = "Ask someone: Hey do you want to do cocaine? (Don't do drugs, kids!)";
        descriptions[58] = "Randomly touch someone's face.";
        descriptions[59] = "Use \"air quotes\" while \"talking\" for a \"round\".";
        descriptions[60] = "Have someone sing \"I Will Always Love You\" by Whitney Houston.";
        descriptions[61] = "Have someone sing \"My Heart Will Go On\" by Celine Dion";
        descriptions[62] = "Stare and make comments about a facial feature.";
        descriptions[63] = "Do Eskimo kisses with someone";
        descriptions[64] = "Land 10 bad puns in a row.";
        descriptions[65] = "Dry hump an object in the room. (Bonus points if it's a person)";
        descriptions[66] = "Refer to yourself in the third person for a round.";
        descriptions[67] = "Have someone \"drunk dial\" their ex.";
        descriptions[68] = "Apologize after every sentence for two rounds.";
        descriptions[69] = "Have someone say \"That's what she said!\" after every statement.";
        descriptions[70] = "Have someone kiss your shoe and call you master.";
        descriptions[71] = "Tell someone to act like Wild Bill from Silence of the Lambs";
        descriptions[72] = "Ask someone if they are the person Mr. Rogers thought they could be.";
        descriptions[73] = "Give someone a wet willy.";
        descriptions[74] = "Describe the person to your right's biggest flaw.";
        descriptions[75] = "Sit on someone's lap for a round.";
        descriptions[76] = "Lie on your back and pretend to be a turtle.";
        descriptions[77] = "Have somebody spank you.";
        descriptions[78] = "Fellate an object. ";
        descriptions[79] = "Have a temper tantrum";
        descriptions[80] = "Make sex noises";
        descriptions[81] = "Ballroom dance with someone.";
        descriptions[82] = "Make up and perform a cheer";
        descriptions[83] = "Change pronouns for the rest of the game";
        descriptions[84] = "Identify yourself as (your name)-kin for a round.";
        descriptions[85] = "Sing a School House Rock song.";
        descriptions[86] = "Explicitly describe having sex with someone's mother / father.";
        descriptions[87] = "Try to finish people's sentences before they do.";
        descriptions[88] = "Sniff someone's butt.";
        descriptions[89] = "Rub someone's belly and ask when the baby is due.";
        descriptions[90] = "Perform a racial stereotype that is not your own.";
        descriptions[91] = "Ask someone to play 7 Minutes in Heaven with you";
        descriptions[92] = "Strip to underwear and perform a belly dance";
        descriptions[93] = "Attempt to Rick Roll someone";
        descriptions[94] = "Attempt to free-style rap";
        descriptions[95] = "Try to describe quantum mechanics to the person to your right";
        descriptions[96] = "Play musical chairs, but don't let anyone else know";
        descriptions[97] = "Disagree with everything everyone says for a round";
        descriptions[98] = "Talk only in rhymes for the rest of the game.";

        String[] type = new String[99];
        type[0] = "Challenge";
        type[1] = "Gamble";
        type[2] = "Challenge";
        type[3] = "Self";
        type[4] = "Self";
        type[5] = "Challenge";
        type[6] = "Self";
        type[7] = "Self";
        type[8] = "Gamble";
        type[9] = "Gamble";
        type[10] = "Self";
        type[11] = "Self";
        type[12] = "Self";
        type[13] = "Self";
        type[14] = "Challenge";
        type[15] = "Challenge";
        type[16] = "Challenge";
        type[17] = "Gamble";
        type[18] = "Challenge";
        type[19] = "Self";
        type[20] = "Self";
        type[21] = "Gamble";
        type[22] = "Gamble";
        type[23] = "Self";
        type[24] = "Self";
        type[25] = "Challenge";
        type[26] = "Self";
        type[27] = "Challenge";
        type[28] = "Self";
        type[29] = "Challenge";
        type[30] = "Self";
        type[31] = "Self";
        type[32] = "Gamble";
        type[33] = "Gamble";
        type[34] = "Self";
        type[35] = "Self";
        type[36] = "Gamble";
        type[37] = "Challenge";
        type[38] = "Self";
        type[39] = "Challenge";
        type[40] = "Self";
        type[41] = "Gamble";
        type[42] = "Challenge";
        type[43] = "Self";
        type[44] = "Challenge";
        type[45] = "Gamble";
        type[46] = "Self";
        type[47] = "Challenge";
        type[48] = "Challenge";
        type[49] = "Self";
        type[50] = "Challenge";
        type[51] = "Self";
        type[52] = "Self";
        type[53] = "Gamble";
        type[54] = "Gamble";
        type[55] = "Gamble";
        type[56] = "Self";
        type[57] = "Gamble";
        type[58] = "Self";
        type[59] = "Self";
        type[60] = "Challenge";
        type[61] = "Challenge";
        type[62] = "Self";
        type[63] = "Gamble";
        type[64] = "Self";
        type[65] = "Self";
        type[66] = "Self";
        type[67] = "Challenge";
        type[68] = "Self";
        type[69] = "Challenge";
        type[70] = "Challenge";
        type[71] = "Challenge";
        type[72] = "Gamble";
        type[73] = "Self";
        type[74] = "Self";
        type[75] = "Gamble";
        type[76] = "Self";
        type[77] = "Challenge";
        type[78] = "Gamble";
        type[79] = "Self";
        type[80] = "Gamble";
        type[81] = "Gamble";
        type[82] = "Self";
        type[83] = "Self";
        type[84] = "Self";
        type[85] = "Self";
        type[86] = "Gamble";
        type[87] = "Self";
        type[88] = "Gamble";
        type[89] = "Gamble";
        type[90] = "Self";
        type[91] = "Self";
        type[92] = "Challenge";
        type[93] = "Gamble";
        type[94] = "Gamble";
        type[95] = "Self";
        type[96] = "Self";
        type[97] = "Gamble";
        type[98] = "Gamble";

        String[] points = new String[99];
        points[0] = "10";
        points[1] = "20";
        points[2] = "5";
        points[3] = "10";
        points[4] = "20";
        points[5] = "15";
        points[6] = "30";
        points[7] = "10";
        points[8] = "10";
        points[9] = "10";
        points[10] = "5";
        points[11] = "5";
        points[12] = "10";
        points[13] = "20";
        points[14] = "15";
        points[15] = "15";
        points[16] = "5";
        points[17] = "20";
        points[18] = "5";
        points[19] = "10";
        points[20] = "15";
        points[21] = "10";
        points[22] = "5";
        points[23] = "5";
        points[24] = "15";
        points[25] = "15";
        points[26] = "10";
        points[27] = "5";
        points[28] = "5";
        points[29] = "15";
        points[30] = "5";
        points[31] = "10";
        points[32] = "5";
        points[33] = "15";
        points[34] = "10-100";
        points[35] = "5";
        points[36] = "15";
        points[37] = "15";
        points[38] = "5";
        points[39] = "5";
        points[40] = "10";
        points[41] = "15";
        points[42] = "5";
        points[43] = "5";
        points[44] = "5";
        points[45] = "5";
        points[46] = "5";
        points[47] = "5";
        points[48] = "15";
        points[49] = "10";
        points[50] = "10";
        points[51] = "20";
        points[52] = "5";
        points[53] = "5";
        points[54] = "Severity";
        points[55] = "10";
        points[56] = "5";
        points[57] = "10";
        points[58] = "10";
        points[59] = "5";
        points[60] = "5";
        points[61] = "5";
        points[62] = "5";
        points[63] = "5";
        points[64] = "10";
        points[65] = "20";
        points[66] = "5";
        points[67] = "20";
        points[68] = "10";
        points[69] = "5";
        points[70] = "15";
        points[71] = "10";
        points[72] = "10";
        points[73] = "5";
        points[74] = "10";
        points[75] = "10";
        points[76] = "5";
        points[77] = "15";
        points[78] = "15";
        points[79] = "10";
        points[80] = "5";
        points[81] = "5";
        points[82] = "10";
        points[83] = "10";
        points[84] = "5";
        points[85] = "5";
        points[86] = "10";
        points[87] = "5";
        points[88] = "15";
        points[89] = "10";
        points[90] = "10";
        points[91] = "20";
        points[92] = "30";
        points[93] = "5";
        points[94] = "5";
        points[95] = "5";
        points[96] = "5";
        points[97] = "10";
        points[98] = "5";

        Image[] cardFaces = new Image[99];
        for (int i = 0; i < cardFaces.length; i++) {

            String pattern = titles[i];
            Pattern r = Pattern.compile(pattern);
            Image resourse = ImageIO.read(new FileInputStream(".\\src\\NSalpha\\Cards\\" + pattern + "-1.png"));
            //Image resourse = new Image("C:\\Users\\Bruce\\Desktop\\Java\\NSalpha\\src\\NSalpha\\Cards\\3 Per Minute-1.png");

            cardFaces[i] = resourse;
            //cardFace[i] = getImage(getDocumentBase(), "c" + (i + 1) + ".gif");
        }

        /* for(int i=0;i<98; i++){
         System.out.println(titles[i] + ": "+ descriptions[i] + ": "+ type[i] + ": "+ points[i]);
         }
        
         NewJFrame frame = new NewJFrame();
         frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         frame.setPreferredSize(new Dimension(400, 200));
         frame.pack();
         frame.setVisible(true);
         */
        NSalpha app = new NSalpha();
        app.frame.setTitle("No Shame Game Pre-Alpha");
        app.frame.setTitles(titles);
        app.frame.setDescriptions(descriptions);
        app.frame.setType(type);
        app.frame.setFaces(cardFaces);
        app.frame.setPoints(points);
        app.frame.SetPointDefault();
        app.frame.setHand();
        //app.frame.firstCard();
        app.frame.setVisible(true);

    }

    /*Image[] loadImages(String[] titles) throws IOException {
        Image[] cardFace = new Image[99];
        for (int i = 0; i < cardFace.length; i++) {

            String pattern = titles[i];
            Pattern r = Pattern.compile(pattern);
            Image resourse = ImageIO.read(new FileInputStream(".\\src\\NSalpha\\Cards\\" + pattern + "-1.png"));
            //Image resourse = new Image("C:\\Users\\Bruce\\Desktop\\Java\\NSalpha\\src\\NSalpha\\Cards\\3 Per Minute-1.png");

            cardFace[i] = resourse;
            //cardFace[i] = getImage(getDocumentBase(), "c" + (i + 1) + ".gif");
        }
        return cardFace[];
    }*/
}
