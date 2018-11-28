#include <iostream>
#include <ctime>
#include <string>
#include <algorithm>
#include <vector>

class Solution {
public:
	int RectCover(int number)
	{	
    		//////////////////////////////////////////////////////////////
    		//                                                          //
    		//            请在此处添加你的代码（函数）                  //
    		//                                                          //
    		//////////////////////////////////////////////////////////////
    		//start
    	
    		//end
	}
	class Test
	{
	public:
		int target;
		int result;
		Test(int target,int result) :target(target),result(result) { };
		Test() {};
		void printSelf()
		{
			std::cout << "正确输出为：" << result;
			putchar('\n');
			std::cout << "当前测试用例为：" << target << std::endl;
		}
	};
	bool compare(int test,int standard)
	{
		if (test==standard)
			return true;
		else
			return false;
	}
	void printSuccess()
	{
		std::cout << "恭喜！你通过了所有的测试用例" << std::endl;
	}
	void printFail(int percent, std::string str) {
		std::cout << "你未能通过所有测试用例" << percent <<"%\t" << str << std::endl;

	}
};
int main()
{
	clock_t begin, end;

	Solution *solution = new Solution();
	int total=6;
	Solution::Test *tests[6]; /*= new Solution::Test[total];*/

	tests[0] = new Solution::Test(0,1);
	tests[1] = new Solution::Test(1,1);
	tests[2] = new Solution::Test(2,2);
	tests[3] = new Solution::Test(5,8);
	tests[4] = new Solution::Test(10,89);

	tests[5] = new Solution::Test(20, 10946);
	int i = 0;
	begin = clock();

	/*Sleep(100);*/
	try{
		for (i = 0; i < total; i++)
		{
			if (!solution->compare(tests[i]->result, solution->RectCover(tests[i]->target))) {
				solution->printFail(i * 100 / total, "FALSE");
				tests[i]->printSelf();
				return 0;
			}
		}
		solution->printSuccess();
		end = clock();
		std::cout << "total time :" << (end - begin) << "ms" << std::endl;
	}
	catch (...) {
		solution->printFail(i * 100 / total, "异常！");
		tests[i]->printSelf();
		std::cout<<("出现异常!\n");
	}
	
	delete solution;
	return 0;
}
