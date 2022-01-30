class TwelveDays {
    String[] days = {"first",
            "second",
            "third",
            "fourth",
            "fifth",
            "sixth",
            "seventh",
            "eighth",
            "ninth",
            "tenth",
            "eleventh",
            "twelfth"
    };

    String[] shorts = {"a Partridge in a Pear Tree",
            "two Turtle Doves",
            "three French Hens",
            "four Calling Birds",
            "five Gold Rings",
            "six Geese-a-Laying",
            "seven Swans-a-Swimming",
            "eight Maids-a-Milking",
            "nine Ladies Dancing",
            "ten Lords-a-Leaping",
            "eleven Pipers Piping",
            "twelve Drummers Drumming" };

    String verse(int verseNumber) {
        StringBuilder giftsString = new StringBuilder();
        if (verseNumber > 1)
        {
            for (int i = verseNumber - 1; i >= 0; i--)
            {
                giftsString.append(i!=0? shorts[i]+", ": "and "+shorts[i]);
            }
        }
        else
        {
            giftsString.append(shorts[verseNumber - 1]);
        }
        String verseStr = String.format("On the %s day of Christmas my true love gave to me: %s.\n", days[verseNumber - 1], giftsString.toString());
        return verseStr;
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder fullLine = new StringBuilder();
        for(int i = startVerse; i <= endVerse; i++) {
            fullLine.append(i != endVerse ? verse(i) + "\n" : verse(i));
        }
        return fullLine.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}