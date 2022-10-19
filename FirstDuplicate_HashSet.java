package Practise;

import java.util.HashSet;

import acm.program.ConsoleProgram;

public class FirstDuplicate_HashSet extends ConsoleProgram{
	
int[] a = {2,1,3,5,2,3};
	
	public void run()
	{
		println(solution(a));
	
	}
	int solution(int[] a) {
	HashSet<Integer> hashSet = new HashSet<>();
    for(int i=0; i<a.length;i++){
        if (! hashSet.contains(a[i])) {
            hashSet.add(a[i]);
        } else {
            return a[i];
        }
    }
    return -1;

}
}
