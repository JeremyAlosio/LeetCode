import java.util.HashMap;
import java.util.Random;

//https://leetcode.com/problems/encode-and-decode-tinyurl/
// #535
// Medium

class _535_Encode_and_Decode_TinyURL {

	HashMap<String, String> dataBase = new HashMap<String, String>();
	int MAX_SIZE_OF_URL = 6;

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		String currentRandomString = "";

		while (true)
			if (!dataBase.containsKey(currentRandomString = randomStringGenerator())) {
				dataBase.put("http://tinyurl.com/" + currentRandomString, longUrl);
				break;
			}

		return currentRandomString;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		if (dataBase.containsKey(shortUrl))
			return dataBase.get(shortUrl);
		else
			return "";
	}

	public String randomStringGenerator() {
		String randomCharacters = "abcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder randomString = new StringBuilder();
		Random ran = new Random();
		int randomCharacterLocation = ran.nextInt(randomCharacters.length());

		for (int x = 0; x < MAX_SIZE_OF_URL; x++)
			randomString.append(randomCharacters.charAt(randomCharacterLocation));

		return randomString.toString();
	}
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));