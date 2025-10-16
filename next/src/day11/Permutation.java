package day11;

public class Permutation {
	//hoán vị
	
	public static int n = 4;
	
	public static int k = 3;
	
	// Cần mảng lưu từng phần tử
	public static int[] arr = new int[10];
	
	// Cần mảng đánh dấu những phần tử đã đi qua
	public static int[] used = new int[10];
	
	public static void show() {
		for(int i = 1; i <= k; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public static void Try(int i) {
		for(int j = 1; j <= n; j++) {
			if (used[j] == 0) { // duyệt qua các giá trị j = 1..n, chỉ chọn nếu j chưa được dùng
			    used[j] = 1;    // đánh dấu j đã được chọn
			    arr[i] = j;     // gán j vào vị trí i trong dãy

			    if (i == k) {   // nếu đã chọn đủ k phần tử -> in ra kết quả
			        show();
			    } else {
			        Try(i + 1); // thử chọn phần tử tiếp theo
			        // nếu đặt used[j] = 0 ở đây thì với trường hợp i == k sẽ không được reset lại
			    }

			    used[j] = 0;    // quay lui: bỏ đánh dấu để thử giá trị khác
			}
			// nếu đặt used[j] = 0 ở ngoài if thì sẽ sai
			// vì những j không được chọn (không vào if) cũng bị reset sai trạng thái

		}
	}
	public static void main(String[] args) {
		Try(1);
	}
}
