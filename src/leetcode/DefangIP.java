package leetcode;

/* 
1108. Defanging an IP Address

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

coded by Kalvin Kao
*/
public class DefangIP {

	public static String defangIPaddr(String address) {
		String defanged;

		defanged = address.replaceAll("([.])", "[.]");

		return defanged;
	}

	public static void main(String[] args) {
		String address = "1.1.1.1";
		System.out.println(defangIPaddr(address));
	}
}
