import java.util.Random;

class Main {
    public static void main(String[] args) {
	Random random = new Random();

	String[] pre = { "a", "an", "ante", "anti", "auto", "circum", "co", "com", "con", "contra", "contro", "de",
		"dis", "en", "ex", "extra", "hetero", "homeo", "hyper", "il", "in", "inter", "intra", "macro", "micro",
		"mono", "non", "omni", "post", "pre", "pro", "sub", "sym", "syn", "tele", "trans", "tri", "un", "uni",
		"up" };
	String[] root = { "agri", "anthropo", "astro", "bio", "cardio", "cede", "chromo", "demos", "derma", "dyna",
		"geo", "helio", "hydro", "hypno", "ject", "magni", "manu", "mono", "ortho", "pod", "psycho", "pyro",
		"script", "terra", "thermo", "zoo" };
	String[] suf = { "acy", "al", "ance", "ence", "dom", "er", "or", "ism", "ist", "ity", "ty", "ment", "ness",
		"ship", "sion", "tion", "ate", "en", "ify", "ize", "able", "ible", "al", "esque", "ful", "ical", "ious",
		"ish", "ive", "less", "y" };

	int rp, rr, rs, i = 0;

	while (i < 100) {
	    rp = random.nextInt(pre.length);
	    String randomPre = pre[rp];

	    rr = random.nextInt(root.length);
	    String randomRoot = root[rr];

	    rs = random.nextInt(suf.length);
	    String randomSuf = suf[rs];

	    System.out.println(randomPre + randomRoot + randomSuf);
	    i++;
	}

	//// Prints all possible combinations.
	// for (String p: pre) {
	// for (String r: root) {
	// for (String s: suf) {
	// System.out.println(p + r + s);
	// }
	// }
	// }

    }
}