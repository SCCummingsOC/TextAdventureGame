import lombok.Getter;

@Getter
public class GameData {

    public GameData() {
        buildLocationData();
    }

    private Node startingLocation;

    private void buildLocationData() {
        startingLocation = new Node("The Enchanted Forest",
                "You stand at the edge of the kingdom's enchanted forest, where the dark shadow of the robot overlord's castle looms in the distance." +
                        "\nClutched in your hand is the Crystal of Ancients, a powerful artifact that your ancestors entrusted to you." +
                        "\nThe time has come to take back your kingdom.",
                new String[]{"Begin your journey towards the castle.", "Seek guidance from the kingdom's wise elders before starting your quest."});

        Node seekingWisdom = new Node("Seeking Wisdom",
                "You decide to seek the guidance of the kingdom's wise elders, who reside in a sacred grove within the enchanted forest." +
                        "\nAfter a long walk through the lush foliage, you arrive at the serene grove.\n" +
                        "\n" +
                        "The elders welcome you and reveal the first clue to unlocking the Crystal of Ancients' true power, essential for defeating the robot overlord.",
                new String[]{"Listen carefully to the elders' advice and meditate on the clue.",
                        "Take a moment to explore the enchanting beauty of the sacred grove."});

        Node theClue = new Node("Unveiling the Clue",
                "You meditate on the clue given by the wise elders and have a profound realization." +
                        "\nTo unleash the Crystal's power, you must embark on a journey to three elemental shrines scattered across the realm.\n" +
                        "\n" +
                        "The first shrine, dedicated to the element of fire, lies deep within the Dragon's Gorge, on the other side of the kingdom.",
                new String[]{"Set out towards Dragon's Gorge to find the Fire Shrine.",
                        "Return to the castle and begin your quest to overthrow the robot overlord."});

        Node dragonsGorge = new Node("The Trek to Dragon's Gorge",
                "You embark on a long journey to Dragon's Gorge, traveling through rolling hills and dense forests." +
                        "\nThe path is perilous, but your determination keeps you going.\n" +
                        "\n" +
                        "As you walk, you encounter a group of villagers who have suffered under the robot overlord's rule." +
                        "\nThey express their hope that you can free them from oppression.",
                new String[]{"Offer the villagers encouragement and promise to liberate them.",
                        "Continue your journey without interacting with the villagers."});

        Node theFireDragon = new Node("Encountering the Fire Dragon",
                "After days of walking, you reach Dragon's Gorge." +
                        "\nThe fiery aura of the Fire Shrine is unmistakable." +
                        "\nHowever, the shrine is guarded by a fierce Fire Dragon, determined to protect its domain.\n" +
                        "\n" +
                        "You must confront the dragon to reach the shrine.",
                new String[]{"Attempt to negotiate with the Fire Dragon peacefully.",
                        "Draw upon the Crystal of Ancients to defend yourself in a battle against the dragon."});


        Node dragonsTest = new Node("The Dragon's Test",
                "You wield the Crystal of Ancients, channeling its power to defend yourself against the Fire Dragon." +
                        "\nThe dragon recognizes your strength and tests your worthiness to enter the shrine.\n" +
                        "\n" +
                        "After a grueling trial, the dragon permits you to pass and access the Fire Shrine.\n" +
                        "\n",
                new String[]{"Enter the Fire Shrine to discover its secrets.",
                        "Take a moment to rest and replenish your strength before proceeding."});

        Node fireShrine = new Node("The Fire Shrine's Secret",
                "You take a moment to rest and regain your strength before entering the Fire Shrine." +
                        "\nInside, you discover ancient scriptures that reveal the secrets of harnessing fire's power.\n" +
                        "\n" +
                        "Armed with this knowledge, you feel more prepared to face the robot overlord.",
                new String[]{"Journey to the second elemental shrine.",
                        "Return to the kingdom and gather support for the upcoming rebellion."});

        Node swampOfSorrows = new Node("The Swamp of Sorrows",
                "Your journey to the second elemental shrine, dedicated to water, takes you through the treacherous Swamp of Sorrows." +
                        "\nThe murky waters hide deadly traps and lurking creatures.\n" +
                        "\n" +
                        "You must tread carefully to avoid danger.",
                new String[]{"Take cautious steps, carefully navigating the Swamp of Sorrows.",
                        "Use the Crystal's power to clear a path through the swamp."});

        Node waterShrine = new Node("Finding the Water Shrine",
                "Your cautious steps lead you to the Water Shrine hidden deep within the Swamp of Sorrows." +
                        "\nThe shrine stands atop a crystal-clear pool of water, guarded by the guardian spirit of water.\n" +
                        "\n" +
                        "The spirit tests your resolve before allowing you to enter.",
                new String[]{"Prove your worth to the guardian spirit through a heartfelt speech.",
                        "Engage in a trial of agility and dexterity to gain the spirit's approval."});

        Node watersPower = new Node("Unleashing Water's Power",
                "You succeed in the trial set by the guardian spirit and are granted access to the Water Shrine's secrets." +
                        "\nHere, you learn the ancient art of controlling water's flow and currents.\n" +
                        "\n" +
                        "The Crystal of Ancients glows brightly, indicating it is one step closer to unlocking its true potential.",
                new String[]{"Journey to the last elemental shrine.",
                        "Return to the kingdom and prepare for the final confrontation."});

        Node stormySummit = new Node("The Stormy Summit",
                "Your journey to the third and final elemental shrine, dedicated to air, takes you to the Stormy Summit — a towering mountain veiled in storm clouds and strong gusts of wind.\n" +
                        "\n" +
                        "The mountain poses the most challenging trial yet, testing your bravery and resolve.",
                new String[]{"Brave the fierce winds and scaling the Stormy Summit on foot.",
                        "Employ the Crystal's power to create a magical platform and ascend more easily."});

        startingLocation.setPaths(null, seekingWisdom);
        seekingWisdom.setPaths(theClue, null);
        theClue.setPaths(dragonsGorge, null);
        dragonsGorge.setPaths(theFireDragon, null);
        theFireDragon.setPaths(null, dragonsTest);
        dragonsTest.setPaths(null, fireShrine);
        fireShrine.setPaths(swampOfSorrows, null);
        swampOfSorrows.setPaths(waterShrine, null);
        waterShrine.setPaths(null, watersPower);
        watersPower.setPaths(stormySummit, null);

        stormySummit.makeFinalNode();
    }

}
