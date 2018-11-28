#include "pch.h"
#include <iostream>
#include <ctime>
#include <windows.h>
#include <string>
#include <sstream>

class Solution {
public:
	bool duplicate(int numbers[], int length, int* duplication) 
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
		int *numbers;
		int length;
		int *duplication;
		bool result;
		Test(int *numb, int len, bool res, int *nu) :numbers(numb), length(len), duplication(nu), result(res) { };
		//Test() {};
		void printSelf()
		{
			std::cout << "正确输出为：" <<std:: boolalpha << result << std::endl;
			if (result)
				std::cout << "重复数字是： " << *duplication << std::endl;
			else
				std::cout << " ";
			std::cout << "当前测试用例为：" << std::endl;
			if (numbers == NULL)
			{
				std::cout << "空数组引用" << std::endl;
				return;
			}
			if (length == NULL)
			{
				std::cout << "空数组 " << std::endl;
				return;
			}
			for (int i=0; i < length; i++)
			{
				std::cout << numbers[i] << "\t";
			}
			
			/*delete [] numbers;
			delete [] duplication;*/
		}
		~Test()
		{
			std::cout << "*******************" << std::endl;
			delete [] numbers;
			delete [] duplication;
		}
	};
	bool compare(bool test, int testDup, bool standard, int standardDup)
	{
		if (test == standard && testDup == standardDup)
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

	tests[0] = new Solution::Test(new int[7] {2, 3, 1, 0, 2, 5, 3}, 7, true, new int(2));
	tests[1] = new Solution::Test(new int[9] {2, 3, 4, 0, 9, 8, 7, 1, 1}, 9, true, new int(1));
	tests[2] = new Solution::Test(new int[9] {2, 3, 4, 0, 9, 8, 7, 10, 13}, 9, false, new int(0));
	tests[3] = new Solution::Test(new int[1] {0}, 0, false, new int(0));
	tests[4] = new Solution::Test(NULL, 0, false, new int(0));

	tests[5] = new Solution::Test(new int[4] {2, 1, 1, 2}, 4, true, new int(2));
	tests[6] = new Solution::Test(new int[1] {1}, 1, false, new int(0));
	tests[7] = new Solution::Test(new int[2] {1, 1}, 2, true, new int(1));
	
	int i = 0;

	begin = clock();

	/*Sleep(100);*/
	try {
		for (i = 0; i < total; i++) {
			int temp = tests[i]->duplication[0];
			tests[i]->duplication[0] = 0;
			if (!solution->compare(tests[i]->result, temp, solution->duplicate(tests[i]->numbers, tests[i]->length, tests[i]->duplication), tests[i]->duplication[0])) {
				solution->printFail(i /** 100 / total*/, solution->duplicate(tests[i]->numbers, tests[i]->length, tests[i]->duplication)? "true":"false");
				tests[i]->duplication[0] = temp;
				tests[i]->printSelf();
				throw (int)1;
			}	
		}
		solution->printSuccess();
		end = clock();
		std::cout << "total time :" << (end - begin) << "ms" << std::endl;
	}
	catch (int a) {
		solution->printFail(i /** 100 / total*/, "异常！");
		tests[i]->printSelf();
		std::cout<<("出现异常!\n");
	}
	
	delete solution;
	return 0;
}

