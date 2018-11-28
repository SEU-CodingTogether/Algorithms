import java.util.*;
public class Solution {

    //////////////////////////////////////////////////////////////
    //                                                          //
    //            请在此处添加你的代码（函数）                  //
    //                                                          //
    //////////////////////////////////////////////////////////////
    //start
    
    //end


    class Test{
        public int target;
        public int result;
        public Test(int target,int result){
            this.target = target;
            this.result = result;
        }
        public Test(){
        }
        public void printSelf(){
            System.out.println("正确输出为："+result);
            System.out.println("当前测试用例为："+target);
        }
    }
    public static void main(String args[]){
        Solution solution = new Solution();
        int total = 6;
        Test[] tests = new Test[total];
        tests[0] = solution.new Test(0,1);
        tests[1] = solution.new Test(1,1);
        tests[2] = solution.new Test(2,2);
        tests[3] = solution.new Test(5,8);
        tests[4] = solution.new Test(10,89);
        tests[5] = solution.new Test(20,10946);
        int i = 0;
        long runtimeCount = System.currentTimeMillis();//获取当前系统时间(毫秒)
        try {
            for (i = 0; i < total; i++) {
                if(!solution.compare(tests[i].result,solution.RectCover(tests[i].target))){
                    solution.printFail(i*100/total,String.valueOf(solution.RectCover(tests[i].target)));
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
    private boolean compare(int test,int standard){
        if(test==standard){
            return true;
        }
        return false;
    }
}



