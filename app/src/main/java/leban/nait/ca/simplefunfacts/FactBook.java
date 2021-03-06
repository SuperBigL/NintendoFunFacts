package leban.nait.ca.simplefunfacts;

import java.util.Random;

/**
 * Created by Leban A. Mohamed on 2016-05-14.
 */
public class FactBook
{
    private final String[] facts = {"Mario did not debut in Super Mario Bros. He debuted in Donkey Kong.",
            "Star Fox was based on the Japanese mythology based on the gates in Kyoto",
            "The Legend of Zelda was based on Shigeru Miyamoto's childhood of discovering caves.",
            "When Donkey Kong Country was released, Rare initially wanted to redesign Donkey Kong Jr., but Nintendo rejected that idea.",
            "Pokemon was based on Satoshi Tajiri's childhood of catching bugs.",
            "During the development of 007:Goldeneye, Miyamoto allegedly suggested that game was too violent and proposed that players shake hands with enemies in the hospitial.",
            "Super Smash Bros for the N64 was initally meant to be a Japanese exclusive title, but it got so popular that it got ported cross the Pacific.",
            "The Cherry power up in Super Mario 3D World was initally a bug in the game. The developers must have thrown in it or something....",
            "The Koopalings were named after actual musicians: Larry Mullen Jr., Morton Downey Jr., Wendy O. Williams, Iggy Pop (not Azalea), Roy Orbison, Lemmy Kilmister, and Ludwig Van Beethoven",
            "Kirby's colour was debated between Masahiro Sakurai and Shigeru Miyamoto. They comprimised for the 1st game and made him white.",
            "Mario was initally called Jumpman in his debut appearance in the arcade classic Donkey Kong (1981). He did'nt get the Mario name untill Donkey Kong Jr.(1982) ",
            "Mario did indeed play the role of a villan in Donkey Kong Junior.",
            "Shigeru Miyamoto once hinted in an interview with Nintendo Power that Mario might wear 'metal clothes'. 5 years later, Metal Mario came into existance in Super Mario 64",
            "Pikmin was influenced by Miyamoto's hobby of gardening.",
            "The Mario Bros arcade game concieved as Nintendo's first forray into multiplayer gaming.",
            "Bowser's Japanese name is Koopa （クッパ）",
            "Star Fox (SNES) was released in North America in March 1993.",
            "ARMS was based on the question on how a 3d fighter would look like if the camera was behind the player"};
    public  String getFact()
    {

        Random random = new Random();
        int rNumber = random.nextInt(facts.length);
        String fact = facts[rNumber];
        return fact;
    }


}
