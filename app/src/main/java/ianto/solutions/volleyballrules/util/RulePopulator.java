package ianto.solutions.volleyballrules.util;

import java.util.ArrayList;

import ianto.solutions.volleyballrules.models.Rule;

public class RulePopulator {
    private static ArrayList<Rule> rules = new ArrayList<>();

    public static ArrayList<Rule> getRules() {
        if (rules.size() > 0) {
            return rules;
        }
        rules.add(new Rule(
                "11.3.1-2",
                "Net Rule",
                "Contact with the net by a player between the antennae, during the action of playing" +
                        " the ball, is a fault.\n" +
                        "The action of playing the ball includes (among others) take-off, hit (or " +
                        "attempt) and landing.\n" +
                        "Players may touch the post, ropes, or any other object" +
                        "outside the antennae, including the net itself, provided that it does not" +
                        "interfere with the play."
        ));
        rules.add(new Rule(
                "11.3.1-2",
                "More Net Rule",
                "A player interferes with play by (amongst others):\n" +
                        "– touching the net between the antennae or the antenna itself during " +
                        "his/her action of playing the ball,\n" +
                        "– using the net between the antennae as a support or stabilizing aid\n" +
                        "– creating an unfair advantage over the opponent by touching the net\n" +
                        "– making actions which hinder an opponent’s legitimate attempt to\n" +
                        "play the ball,\n" +
                        "– catching/holding on to the net\n" +
                        "Players close to the ball as it is played, or who are trying to play it, are " +
                        "considered in the action of playing the ball, even if no contact is made " +
                        "with the ball.\n" +
                        "However, touching the net outside the antenna is not to be considered " +
                        "as a fault (except for Rule 9.1.3.)"


        ));
        rules.add(new Rule(
                "11.2.1",
                "Under Net Rule",
                "A player may enter into the opponent’s space, court and/or free zone, " +
                        "provided that this does not interfere with the opponent’s play."


        ));
        rules.add(new Rule(
                "13.2.5",
                "Setting The Ball Over The Net",
                "It is a fault: A player completes an attack-hit using an overhand pass which has a " +
                        "trajectory not perpendicular to the line of the shoulders. The exception " +
                        "is when the player is attempting to set to his or her teammate."
        ));
        rules.add(new Rule(
                "14.1.1",
                "Definition Of A Block",
                "Blocking is the action of players close to the net to intercept the ball " +
                        "coming from the opponent by reaching higher than the top of the " +
                        "net, regardless of the height of the ball contact. At the moment of the " +
                        "contact with the ball, a part of the body must be higher than the top " +
                        "of the net."
        ));
        rules.add(new Rule(
                "12.4.3",
                "Definition Of A Serve",
                "The server may move freely within the service zone. At the moment of " +
                        "the service hit or take-off for a jump service, the server must not touch " +
                        "the court (the end line included) or the ground outside the service zone. " +
                        "His/her foot may not go under the end line.\n" +
                        "After the hit, he/she may step or land outside the service zone, or inside " +
                        "the court. If the line moves because of the sand pushed by the server, it " +
                        "is not considered a fault."
        ));
        rules.add(new Rule(
                "9.1.2.1",
                "Simultaneous Contact",
                "When two teammates touch the ball simultaneously, it is counted as " +
                        "two hits (with the exception of blocking).\n" +
                        "If they reach for the ball but only one of them touches it, one hit is " +
                        "counted.\n" +
                        "If players collide, no fault is committed"

        ));
        rules.add(new Rule(
                "9.1.2.2",
                "Joust",
                "When two opponents touch the ball simultaneously over the net and " +
                        "the ball remains in play, the team receiving the ball is entitled to another " +
                        "three hits. If such a ball goes ”out”, it is the fault of the team on the" +
                        "opposite side."
        ));
        rules.add(new Rule(
                "12.6.2.3",
                "Screen",
                "It is a fault if the serve passes over a screen"
        ));
        rules.add(new Rule(
                "13.2.3",
                "Beach Tipping",
                "A player completes an attack-hit using an open-handed finger action or " +
                        "if using finger tips that are not rigid and together"
        ));
        rules.add(new Rule(
                "INT 9.9",
                "Hand Setting",
                "During the action of players setting overhand with fingers, the ball must be played with one quick " +
                        "motion. There must not be any significant movement of the ball downwards whilst in the hands and the " +
                        "ball may not visibly come to rest in the player's hands."
        ));
        rules.add(new Rule(
                "INT 9.9 Note 1",
                "Hand Setting Down Motion",
                "Technically in ALL hand setting actions the ball rests and also moves downward whilst in contact " +
                        "with the hands of the player. It is the quickness of this action that will determine if the \"downwards " +
                        "motion\" or the \"length of the contact\" is of visible significance, and consequently a fault."
        ));
        rules.add(new Rule(
                "INT 9.9 Note 2",
                "Hand Setting Spin",
                "There are various unique methods of setting and passing the ball in Beach Volleyball. " +
                        "A REFEREE must understand the nature of these ball contacts concentrating on " +
                        "their length (the emphasis quite correctly with the catch or thrown ball is " +
                        "the duration of the contact) and how technically correct or clean the contact " +
                        "was (the emphasis with the double contact is that this is not indicated by the " +
                        "spin of the ball but by the fact that a clear fault – time difference between " +
                        "the two hands that contact the ball – has occurred and that this is visible " +
                        "for the REFEREE). "
        ));
        rules.add(new Rule(
                "INT 9.10",
                "Hard Driven",
                "In defensive action of a hard driven attack, the ball contact " +
                        "can be extended momentarily overhand with the fingers. A " +
                        "good indication of a hard driven attack is the time in which the " +
                        "defensive player had to react to play the ball. If the defensive " +
                        "player had time to make a decision or to react by changing, " +
                        "their technique as to how to play the ball it was probably not a " +
                        "hard driven ball. "
        ));
        rules.add(new Rule(
                "INT 11.6b",
                "Net In Wind",
                "Incidental contacts of the net with players caused by a significant alteration of " +
                        "its normal shape due to the wind must not be considered a fault and play " +
                        "should continue. "
        ));
        rules.add(new Rule(
                "INT 13.3",
                "Setting Over Deeper",
                "3. A player may complete an attack-hit using an overhand pass (which has a trajectory " +
                        "perpendicular to the line of the shoulders), either forwards or backwards. " +
                        "Note: The REFEREE should consider the line of the player’s shoulder at the " +
                        "initial stage of the contact with the ball. Players must establish their " +
                        "shoulder position before the contact is made. "
        ));


        return rules;
    }
}
