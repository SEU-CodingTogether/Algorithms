#include <iostream>
#include <ctime>
#include <string>
#include <algorithm>
#include <vector>
class Solution {
public:
	std::vector<int> GetLeastNumbers_Solution(vector<int> input, int k) 
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
		int k;
		std::vector<int> input;
		std::vector<int> result;
		Test(int k,std::vector<int>input, std::vector<int> result) :k(k),input(input),result(result) { };
		Test() {};
		void printSelf()
		{
			std::cout << "正确输出为：";
			for (auto i : result)
				std::cout << i << '\t';
			putchar('\n');
			std::cout << "当前测试用例为：" << std::endl;
			if (input.size() == NULL)
			{
				std::cout << "空数组 " << std::endl;
				return;
			}
			for (auto i : input)
			{
				std::cout << i << "\t";
			}
			putchar('\n');
		}
	};
	bool compare(std::vector<int>test,std::vector<int> standard)
	{
		sort(standard.begin(), standard.end());
		sort(test.begin(), test.end());
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
	int total=8;
	Solution::Test *tests[8]; /*= new Solution::Test[total];*/

	tests[0] = new Solution::Test(4, std::vector<int> {4, 5, 1, 6, 2, 7, 3, 8}, std::vector<int>{ 1,2,3,4 });
	tests[0]->printSelf();
	tests[1] = new Solution::Test(0, std::vector<int> {}, std::vector<int>());
	tests[2] = new Solution::Test(0, std::vector<int> {}, std::vector<int>());
	tests[3] = new Solution::Test(1, std::vector<int> {1}, std::vector<int>{ 1 });
	tests[4] = new Solution::Test(0, std::vector<int> {4, 5, 1, 6, 2, 7, 3, 8}, std::vector<int>());

	tests[5] = new Solution::Test(8, std::vector<int>{4, 5, 1, 6, 2, 7, 3, 8}, std::vector<int>{ 4, 5, 1, 6, 2, 7, 3, 8 });
	tests[6] = new Solution::Test(8, std::vector<int> {11, 33, 4, 5, 1, 6, 99, 384, 27, 2, 7, 3, 8, 10}, std::vector<int>{ 4,5,1,6,2,7,3,8 });
	tests[7] = new Solution::Test(2, std::vector<int> {1, 99}, std::vector<int>{ 1,99 });
	
	int i = 0;

	begin = clock();

	/*Sleep(100);*/
	try{
		for (i = 0; i < total; i++)
		{
			if (!solution->compare(tests[i]->result, solution->GetLeastNumbers_Solution(tests[i]->input, tests[i]->k))) 
			{
				solution->printFail(i /** 100 / total*/, "false");
				tests[i]->printSelf();
				return 0;
			}
		}
		solution->printSuccess();
		end = clock();
		std::cout << "total time :" << (end - begin) << "ms" << std::endl;
	}
	catch (std::exception e ) {
		solution->printFail(i * 100 / total, "异常！");
		tests[i]->printSelf();
		std::cout<<("出现异常!\n");
	}
	
	delete solution;
	return 0;
}

