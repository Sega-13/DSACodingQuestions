//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    BinarySearch bs = new BinarySearch();
    int[] bs_arr = {10,20,25,30};
    int ele =bs.search(bs_arr, 20);
    System.out.println("Element present at index "+ele);

    PerfectSquare ps = new PerfectSquare();
    int num = 5;
    boolean result = ps.checkForPerfectSquare(num);
    System.out.println(result);

}
