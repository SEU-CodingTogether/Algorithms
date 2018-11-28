import java.util.*;
public class Solution {

    //start
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ret=new ArrayList<Integer>(k);
        if(input==null || k>input.length ||k==0){
            return ret;
        }

        TreeSet<Integer> min_k_tree=new TreeSet<>();

        for(int i=0;i<input.length;i++){
            if (min_k_tree.size()<k ){
                min_k_tree.add(input[i]);
            }
            else{
                if (input[i]<min_k_tree.last()) {//新值比min_k_tree最大值小，则替换
                    min_k_tree.remove(min_k_tree.last());
                    min_k_tree.add(input[i]);
                }
            }
        }

        Iterator it_min_k_tree=min_k_tree.iterator();
        while(it_min_k_tree.hasNext()){
            ret.add((Integer) it_min_k_tree.next());
        }
        return ret;
    }    
    //end


    class Test{
        public int k;
        public int[] input;
        public ArrayList<Integer> result;
        public Test(int k,int[] input,ArrayList<Integer> result){
            this.k = k;
            this.input=input;
            this.result = result;
        }
        public Test(){
        }
        public void printSelf(){
            System.out.println("正确输出为："+result);
            System.out.println("当前测试用例为：");
            if(input==null){
                System.out.println("空数组引用");
                return;
            }
            if(input.length==0){
                System.out.println("空数组");
                return;
            }
            for(int i : input) {
                System.out.print(i);
            }
            System.out.println(" k="+k);
        }
    }
    public static void main(String args[]){
        Solution solution = new Solution();
        int total = 8;
        Test[] tests = new Test[total];
        tests[0] = solution.new Test(4,new int[]{4,5,1,6,2,7,3,8},new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4})));
        tests[1] = solution.new Test(0,new int[]{},new ArrayList<>());
        tests[2] = solution.new Test(0,null,new ArrayList<>());
        tests[3] = solution.new Test(1,new int[]{1},new ArrayList<>(Arrays.asList(new Integer[]{1})));
        tests[4] = solution.new Test(0,new int[]{4,5,1,6,2,7,3,8},new ArrayList<>());
        tests[5] = solution.new Test(8,new int[]{4,5,1,6,2,7,3,8},new ArrayList<>(Arrays.asList(new Integer[]{4,5,1,6,2,7,3,8})));
        tests[6] = solution.new Test(8,new int[]{11,33,4,5,1,6,99,384,27,2,7,3,8,10},new ArrayList<>(Arrays.asList(new Integer[]{4,5,1,6,2,7,3,8})));
        tests[7] = solution.new Test(2,new int[]{1,99},new ArrayList<>(Arrays.asList(new Integer[]{1,99})));
        int i = 0;
        long runtimeCount = System.currentTimeMillis();//获取当前系统时间(毫秒)
        try {
            for (i = 0; i < total; i++) {
                if(!solution.compare(tests[i].result,solution.GetLeastNumbers_Solution(tests[i].input,tests[i].k))){
                    solution.printFail(i*100/total,String.valueOf(solution.GetLeastNumbers_Solution(tests[i].input,tests[i].k)));
                    tests[i].printSelf();
                    return;
                }
            }
            solution.printSuccess();
            int runtime = (int)(System.currentTimeMillis()-runtimeCount);
            System.out.println("运行时间为："+runtime+"ms");
        }catch (Exception e){
            solution.printFail(i*100/total,"异常！");
            tests[i].printSelf();
            System.out.println("出现异常!");
            e.printStackTrace();
        }
    }
    private void printSuccess(){
        System.out.println("恭喜！你通过了所有的测试用例");
    }
    private void printFail(int percent,String str){
        System.out.println("你未能通过所有的测试用例！("+percent+"%)");
        System.out.println("你的输出为："+str);
    }
    private boolean compare(ArrayList<Integer> test,ArrayList<Integer> standard){
        if(test.size()!=standard.size()){
            return false;
        }
        for(int i = 0;i<standard.size();i++){
            if(!test.contains(standard.get(i))){
                return false;
            }
        }
        return true;
    }
}

