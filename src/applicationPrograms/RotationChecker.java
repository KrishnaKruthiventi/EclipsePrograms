package applicationPrograms;

public class RotationChecker {
	
	public static boolean isRotation(String str1, String str2) {
		return (str1.length() == str2.length()) && ((str1 + str1).contains(str2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "ABCD";
		String str2 = "CDAB";
		
		System.out.println(isRotation(str1, str2)? "Rotation" : "Not Rotation");
	}

}
