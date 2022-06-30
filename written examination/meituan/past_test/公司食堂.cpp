#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    int n;
    int tmp;
    int m;
    string str1;
    string str2;
    cin >> t;

    while(t--)
    {0
        queue<int> chair0;
        priority_queue<int, vector<int>, greater<int>> chair1;
        cin >> n;
        cin >> str1;
        cin >> m;
        cin >> str2;
        bool find = false;
        for (int j = 0; j < n; j++)
        {
            int t=str1[j]-'0';
            if (t==0)
            {
                chair0.push(j + 1);
            }
            else if (t==1)
            {
                chair1.push(j + 1);
            }
        }
        for (int j = 0; j < m; j++)
        {
            if (str2[j] == 'M')
            {
                if (!chair1.empty())
                {
                    cout << chair1.top() << '\n';
                    chair1.pop();
                }
                else
                {
                    cout << chair0.front() << '\n';
                    tmp = chair0.front();
                    chair1.push(tmp);
                    chair0.pop();
                }
            }
            else
            {
                if (!chair0.empty())
                {
                    cout << chair0.front() << '\n';
                    tmp = chair0.front();
                    chair1.push(tmp);
                    chair0.pop();
                }
                else
                {
                    cout << chair1.top() << '\n';
                    chair1.pop();
                }
            }
        }
    }
    return 0;
}
