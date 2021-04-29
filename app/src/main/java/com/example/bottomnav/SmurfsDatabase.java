package com.example.bottomnav;

import java.util.ArrayList;

public class SmurfsDatabase {
    private static String[] smurfNames = {
            "The Purple Smurfs",
            "The Smurfs and the Magic Flute",
            "The Smurf King",
            "The Smurfette",
            "The Smurfs and the Egg",
            "The Smurfs and the Howlibird",
            "The Astro Smurf",
            "The Baby Smurf",
            "Gargamel and the Smurfs",
            "Smurf vs Smurf"
    };

    private static String[] smurfDesc = {
            "Upon waking up to a bright new day, Papa Smurf calls all his little Smurfs together to start work on the bridge. As work commences, Lazy decides that he will take a little nap until he comes face-to-face with Papa Smurf, who tells him to get back to work now like everyone else. Hefty from the gully of the river below the bridge asks Papa Smurf to hand him a shovel, which he does until he finds out it's been covered in goo. Greedy comes along to tell Papa Smurf that it's his shovel, and pulls it away from Papa Smurf's sticky hands. Smurfette calls Papa Smurf's attention of her picking out the color for painting the bridge, but Papa Smurf is too busy seeing Brainy not watching where he was swinging his ax to chop wood. ",
            "The magic flute came from the Smurfs, who in the comic book story \"The Flute Smurfers\" made it for a sorcerer named Alderic to cure somebody afflicted with a condition known as \"Monotone Melancholy\". The flute was believed to be lost as the sorcerer's house was burned down by an angry mob, but it eventually fell into the hands of a merchant selling various and strange musical instruments, who arrived in the kingdom that Sir Johan and Peewit had served The King in. Although The King couldn't permit the merchant to sell any of his wares (basically to keep Peewit from acquiring any instrument due to his rather off-key playing) and eventually sent him off. ",
            "He was Brainy Smurf, who in Papa Smurf's absence decided to make himself king so that his fellow Smurfs would follow his orders without questioning them. As King Smurf, Brainy appointed Harmony to be his official herald and Hefty as his captain of the guard. He had Hefty force the other Smurfs to build him a castle that he could live in, with only Harmony to give him praise for his magnificence. Brainy's story from that point on played out in similar fashion to the comic book version of King Smurf, only without the campaign to search the forest for the rebels' hideout, and also when Papa Smurf returned, he chastised all the Smurfs for ignoring the danger of the village dam about to burst. ",
            "Gargamel wants to take revenge against the Smurfs for his humiliating defeat at their hands. He decides that the most horrible plan to destroy them would be to send them a female Smurf, who shall seduce them and lead them to their doom. He thus fashions her out of clay and dips her in a potion, creating Smurfette. She is sent to the Smurf Village, and the others befriend her, despite that she later proves to be annoying albeit good-meaning. She is very talkative, a bit bossy, overly friendly, and hysterical. At first, Smurfette looks like a male Smurf with scraggly black hair, a large nose, and rather surly eyes, with the only thing separating her from the rest being her white dress -- not exactly the attractive temptress that Gargamel tried to create.",
            "The annual event known as Smurf Day is due and Papa Smurf suggests that they make a big cake to celebrate. With great excitement, the Smurfs gather the ingredients only to find that they lack an egg. Papa Smurf therefore sends Grouchy Smurf and another Smurf to get one. After going to a lot of trouble to obtain an egg from a nearby farm, the two Smurfs face an equal struggle getting it home, only for Papa Smurf to show that the egg is a fake made of wood. Setting off to get another egg, the two Smurfs then find one in the middle of the forest. They take it back to the village where the others try in vain to break it. ",
            "As Brainy oversees work being done on the Smurf river bridge, Papa Smurf is busy in his laboratory working on a plant growth formula, which he tries out on a small daisy. At first he succeeds, causing the flower to grow big, but soon it mutates the flower into a dangerous carnivorous plant that wraps Papa Smurf up in its tendrils, ready to eat him alive. Hearing Papa Smurf's cry for help, Hefty and Lazy enter the laboratory to deal with the mutated plant, with Lazy falling victim to it, and Hefty chopping down the plant by its root, causing it to immediately wither and die. ",
            "Gargamel is busy in his laboratory creating a crystal ball that will enable him to find the Smurfs wherever they are. Upon his successful completion, he asks the crystal ball to find the Smurfs, and it shows him a picture of a deserted Smurf Village. As Gargamel wonders where the Smurfs could be, the Smurfs are all gathered in Dreamy's house celebrating his birthday. Dreamy makes a birthday wish that he could fly to the stars before blowing out the candles, and soon finds himself dreaming that he was flying to the stars to another planet. After a night of pondering on that dream, Dreamy decides to try making that dream into a reality.At first, Dreamy designs a big enough kite that lifts him up in the sky.",
            "Gargamel is in his castle, stirring a pot. He cackles, \"It's nearly done, Azrael!\". Azrael shows no interest, simply yawning and resting. He is alarmed by the blast from Gargamel's potion, but then falls asleep. Gargamel heads out in the forest, where he finds a smurfberry patch. He pulls out a basket and shrinks it, and then he spills the potion on himself. It turns him into a baby Smurf, and, after checking himself, he imitates crying.Gargamel as a Smurf Smurfette is picking flowers when she hears his crying. Questioning what Baby is doing in the forest, she finds him and takes him home. Clumsy asks Brainy Smurf where baby Smurfs come from, and Brainy pretends he knows, scolding Clumsy. ",
            "Gargamel and Azrael are walking around the forest, hunting for Smurfs as usual. Suddenly, they hear a loud roar and animals in the forest come rushing out, knocking them over. Then they see to their terror what the animals were running from, namely a monstrous giant walking towards them. The creature grabs them up and tells them that they will become his meal. Gargamel in abject fear asks who he is, and is told his captor is an ogre actually. He ties Gargamel up onto a piece of wood which he places upon a stove. Later, he gathers some fire wood and prepares to grill the wizard. ",
            "As the story begins, while Papa Smurf is waiting for Gargamel to return to his castle, he recalls in flashback when the Smurfs started feuding out of control over the use of the word \"smurf\" in compounded words as to which form is correct (i.e., corksmurf vs. smurfscrew). Papa Smurf tries to mediate the peace among his little Smurfs by telling them both forms are correct, that it's simply \"smurf of one and smurf a dozen of the other\" (or \"Smurf green and green Smurf\"). However, the feuding becomes rather divisive with the villagers separating themselves into \"northern Smurfs\" and \"southern Smurfs\", and so heated that no Smurf is even listening to Papa Smurf anymore, so he goes to get the help of Gargamel."
    };

    private static int[] smurfImages = {
            R.drawable.purple_smurfs,
            R.drawable.smurfs_and_the_magic_flute,
            R.drawable.smurf_king,
            R.drawable.smurfette,
            R.drawable.smurfs_and_the_egg,
            R.drawable.smurfs_and_the_howlibird,
            R.drawable.astro_smurf,
            R.drawable.baby_smurf,
            R.drawable.gargamel_and_the_smurfs,
            R.drawable.smurf_vs_smurf
    };

    static ArrayList<SmurfsModel> getListData(){
        ArrayList<SmurfsModel> list = new ArrayList<>();
        for (int position = 0; position<smurfNames.length; position++){
            SmurfsModel smurfs = new SmurfsModel();
            smurfs.setName(smurfNames[position]);
            smurfs.setSummary(smurfDesc[position]);
            smurfs.setPhoto(smurfImages[position]);
            list.add(smurfs);

        }
        return list;
    }


}
