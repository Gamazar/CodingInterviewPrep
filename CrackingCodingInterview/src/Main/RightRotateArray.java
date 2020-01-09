package Main;

public class RightRotateArray {
	public void rightRotation(int[] arr, int k) {
		
		k=k%arr.length;
		
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
	}
	
	private void reverse(int[] arr, int start, int end) {
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public int[] leftRotation(int[] a, int d) {
		
		int[] arr = new int[a.length];
		int i = 0, arr_index = d;
		
		while(arr_index<a.length) {
			arr[i] = a[arr_index];
			i++;
			arr_index++;
		}
		
		arr_index = 0;
		while(arr_index<d) {
			arr[i] = a[arr_index];
			i++;
			arr_index++;
		}
		return arr;
	}
}
