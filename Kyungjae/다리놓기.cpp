#include <iostream>
using namespace std;
int d[31][31];
int combination(int k, int n)
{
	if (d[k][n] != 0) return d[k][n];
	if (n == 0 || n == k)
	{
		return d[k][n] = 1;
	}
	return d[k][n] = combination(k - 1, n - 1) + combination(k - 1, n);
}

int main()
{
	int n, k;
	int m;
	cin >> m;
	while (m--)
	{
		cin >> n >> k;
		cout << combination(k, n);

	}
}
