// An array of N elemets is given. need to check after permutation can first half and left half is equal or not
// N is always even else not possible
// M = N/2 i.e a1 = a(m+1), a2 = a(m+2), ... a(m) = a(N);
// where any permutation of an array can show result like
// a1 = a3, a1 = a4
// here the size of elements are 4
// [5 7 5 7]
// i.e there is m = N/2
// a1 = a(m+1)
// a2 = a(m+2)
// a3 = a(m+3)

// Online C++ compiler to run C++ program online

#include <bits/stdc++.h>
using namespace std;

// checking permutation is satisy or not
void display(vector<int> arr, int N) {
    int M = N/2;
    bool flag = false;
    for(int i = 1; i <= M; i++){
        if(arr[i] == arr[M+i]){
            flag = true;
        }
    }
    if(flag == true){
        cout<<"Yes"<<endl;
    } else{
        cout<<"No"<<endl;
    }
}
void permutation(vector<int> arr, int n){
    sort(arr.begin(), arr.end());
// permutation of an array using next_permutation function of stl
        do{
            display(arr,n);
        }while(next_permutation(arr.begin(), arr.end()));

}
int main() {
    vector<int> arr = {5,5,7,7};
    permutation(arr,4);
    return 0;
}
