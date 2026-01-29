//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    MajorityElementInArray majority = new MajorityElementInArray();
    int[] m_arr = {3,2,3};
    int ele = majority.getMajorityElement(m_arr);
    System.out.println("Majority element is : "+ ele);

    BuyAndSellStock  stock = new BuyAndSellStock();
    int[] stockArr = {7,1,3,4,6,2};
    int maxProfit = stock.maximumProfit(stockArr);
    System.out.println("MaxProfit is :"+ maxProfit);

    MoveZeros m = new MoveZeros();
    int[] mov_arr = {1,3,4,0,0,1,0};
    m.movingZeros(mov_arr);

    FindDulicateInRange find = new FindDulicateInRange();
    int[] arr_in_range = {1,3,4,2,2};
    int duplicateEle = find.returnDuplicateElement(arr_in_range);
    System.out.println("Duplicate element is "+ duplicateEle);

    ContainsDuplicateII duplicateWithcon = new ContainsDuplicateII();
    int[] arr = {1,2,3,1};
    boolean val = duplicateWithcon.checkDuplicateWithCondition(arr,3);
    System.out.println("Contain Duplcate in range "+ val);

}
