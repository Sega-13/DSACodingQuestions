//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    RunningSum rs = new RunningSum();
    int[] arr = {1,2,3,4,5};
    int[] runningSum = rs.getRunningSum(arr);
    System.out.println("Running sum array : ");
    for(int i=0; i<runningSum.length; i++){
        System.out.print(runningSum[i]+" ");
    }
    System.out.println();

    FindPivotIndex pivotIndex = new FindPivotIndex();
    int[]  pivotArr = {1,7,3,6,5,6};
    int index = pivotIndex.findingPivot(pivotArr);
    System.out.println("Pivot index is "+ index);

    RangeSumQuery subquery = new RangeSumQuery();
    int[] arr_subQuery = {2,3,5,2,-5,1,4};
    int val = subquery.returnRangeSumQuery(arr_subQuery,2,5);
    System.out.println("Subquery ans : "+ val);


}
