#include <iostream>
using namespace std;
long long combination(int k, int n) //동적계획법
{
	long long c[30][30] = { 0, };

	for (int i = 0; i <= k; ++i)
	{
		for (int j = 0; j <= min(n, i); ++j)
		{
			if (i == j || j == 0)
				c[i][j] = 1;
			else
				c[i][j] = c[i - 1][j] + c[i - 1][j - 1];
		}
	}
	return c[k][n];
}

int main()
{
	int n, k;
	int m;
	cin >> m;
	while (m--)
	{
		cin >> n >> k;
		cout << combination(k, n) << '\n';

	}
}