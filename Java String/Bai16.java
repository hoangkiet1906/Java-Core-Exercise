public class Bai16 {

	public static void main(String[] args) {
		String str="Ahihiiii";
		byte[] arr_byte = str.getBytes();
		String newArr=new String(arr_byte);
		System.out.println(newArr);
	}

}
