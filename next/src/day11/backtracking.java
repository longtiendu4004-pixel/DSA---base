package day11;

public class backtracking {
	// tạo ra chuỗi có độ dài k và tổng bằng S và các vị trí đều khác nhau
	
	public static int n = 10;
	public static int k = 3;
	public static int S = 9;
	
	//lưu tổng
	public static int count = 0;

	
	//đánh dấu đã đi qua
	public static int[] used = new int[100];
	public static int[] arr = new int[100];
	public static void show() {
		for(int i = 1; i <= k; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public static void Try(int i ) {
		for(int j = 1; j <= n; j++) {
			if(used[j] == 0) {// đi vào những chỗ chưa đi qua
				
				used[j] = 1;// đánh dấu đã đi qua
				
				arr[i] = j;
				
				count += arr[i];
				if(i == k) {// i == k thì vào
					if(count == S) {// count == S mới in
						show();
					}
					// nếu i == k mà count != S thì nó sẽ thoát if rồi xử lý tiếp
					
				}else if(count == S) {// i != k mà count == S thì : mục đích của ta sẽ trả lại vị trí này và thoát Try 
					
					used[j] = 0;// trả lại vị trí
					
					count -= arr[i];// giảm count để xuống vị trí trước đó
					
					return;// thoát khỏi Try(i) và thực hiện Try(i - 1) 
					
//					Thường sẽ đặt câu hỏi tại sao không quét thêm mà thoát
//					Vì j chạy từ 1 -> n nếu đã bằng rồi quét thêm sẽ > hơn S
//					Nên đã bằng mà ở i < k ta sẽ thoát luôn
					
				}else {
					Try(i + 1);
				}
				count -= arr[i];
				used[j] = 0;
			}
		}
	}
	public static void main(String[] args) {
		Try(1);
	}
}
