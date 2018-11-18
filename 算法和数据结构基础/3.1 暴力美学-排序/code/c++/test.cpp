  void bubblesort(int *a int n)
  {
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n-1-i;j++)
        if (a[j] > a[j + 1])
          std::swap(a[j], a[j + 1]);
    }
    for (auto i : a)
    {
      std::cout << i << '\t';
    }
  }
  
  void selectionsort(int *b,int n)
  {
    	int min = 0;
	int temp;
	int pointertom = 0;
	for (int i = 0; i < n-1; i++)
	{
		min = b[i];
		temp = b[i];

		pointertom = i;
		for (int j = i; j < n; j++)
		{
			if (min > b[j])
			{
				min = b[j]; 
				pointertom = j;
			}
		}

		if (pointertom == i)
			continue;
		b[i] = min;
		b[i + 1] = temp;
		for (int k =pointertom ; k>i+2 ; k--)
		{
			b[k] = b[k - 1];
		}

	}
	for (auto i : b)
	{
		std::cout << i << '\t';
	}
  }
