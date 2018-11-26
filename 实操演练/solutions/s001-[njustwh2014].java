import java.util.*;
public class Solution {

    //////////////////////////////////////////////////////////////
    //                                                          //
    //            请在此处添加你的代码（函数）                  //
    //                                                          //
    //////////////////////////////////////////////////////////////
    //请务必保证你的方法名（函数名）与题目中所给的一致，否则无法编译
    //start
    //输入参数:
    //    numbers:     输入的数组
    //    length:      输入数组的长度
    //    duplication: 输出数组，判题程序会取duplication[0] 作为重复的数字
    //    这里要特别注意~返回重复的第一个，赋值duplication[0]
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean flag=false;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(numbers[i]==numbers[j]){
                    flag=true;
                    duplication[0]=numbers[i];
                    return flag;
                }
            }
        }
        return flag;

    }
    //end


    class Test{
        public int[] numbers;
        public int length;
        public int[] duplication;
        public boolean result ;
        public Test(int[] numbers,int length,boolean result,int num){
            this.numbers = numbers;
            this.length = length;
            this.result = result;
            duplication = new int[1];
            duplication[0] = num;
        }
        public Test(){
        }
        public void printSelf(){
            System.out.print("正确输出为："+result);
            if(result) {
                System.out.println(" 重复数字是：" + duplication[0]);
            }else{
                System.out.println(" ");
            }
            System.out.println("当前测试用例为：");
            if(numbers==null){
                System.out.println("空数组引用");
                return;
            }
            if(numbers.length==0){
                System.out.println("空数组");
                return;
            }
            for(int i = 0;i<numbers.length;i++){
                System.out.print(numbers[i]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        Solution solution = new Solution();
        int total = 8;
        Test[] tests = new Test[total];
        tests[0] = solution.new Test(new int[]{2,3,1,0,2,5,3},7,true,2);
        tests[1] = solution.new Test(new int[]{2,3,4,0,9,8,7,1,1},9,true,1);
        tests[2] = solution.new Test(new int[]{2,3,4,0,9,8,7,10,13},9,false,0);
        tests[3] = solution.new Test(new int[]{},0,false,0);
        tests[4] = solution.new Test(null,0,false,0);
        tests[5] = solution.new Test(new int[]{2,1,1,2},4,true,2);
        tests[6] = solution.new Test(new int[]{1},1,false,0);
        tests[7] = solution.new Test(new int[]{1,1},2,true,1);
        int i = 0;
        long runtimeCount = System.currentTimeMillis();//获取当前系统时间(毫秒)
        try {
            for (i = 0; i < total; i++) {
                int temp = tests[i].duplication[0];
                tests[i].duplication[0] = 0;
                if(!solution.compare(tests[i].result,temp,solution.duplicate(tests[i].numbers,tests[i].length,tests[i].duplication),tests[i].duplication[0])){
                    solution.printFail(i*100/total,String.valueOf(solution.duplicate(tests[i].numbers,tests[i].length,tests[i].duplication)));
                    tests[i].duplication[0] = temp;
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
    private boolean compare(boolean test,int testDup,boolean standard,int standardDup){
        if(test==standard&&testDup==standardDup){
            return true;
        }
        return false;
    }
}

