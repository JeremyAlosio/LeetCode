import java.util.HashSet;

//https://leetcode.com/problems/unique-email-addresses/
// #929
// Easy

public class _929_Unique_Email_Addresses {
	public int numUniqueEmails(String[] emails) {
		HashSet<String> uniqueEmails = new HashSet<String>();

        for (String email : emails) {
			String[] bothHalves = email.split("@");

			String localName = bothHalves[0].split("\\+")[0].replaceAll(".", "");

			uniqueEmails.add(localName + "@" + bothHalves[1]);

		}
		return uniqueEmails.size();
	}
}
