package com.ztm.hackerearth;
import java.util.*;

class PathExistsGraph {

    public static void main(String args[] ) throws Exception {
        int res= checkIfPathExists();
        System.out.println(res);
}
    public static int checkIfPathExists(){
        Scanner s = new Scanner(System.in);
        Map<Integer, LinkedList<Integer> > map =new HashMap<>();
        int N = s.nextInt();                 // Reading input from STDIN
        for (int i = 0; i < N; i++) {
            map.put(s.nextInt(), new LinkedList<>());
        }
        int e = s.nextInt();
        for (int j = 0; j < e; j++) {
            int sour = s.nextInt();
            int dest = s.nextInt();
            if (!map.containsKey(sour)) {
                map.put(sour, new LinkedList<>());
            }
            if (!map.containsKey(dest)) {
                map.put(dest, new LinkedList<>());
            }
            map.get(sour).add(dest);
        }
        int a= s.nextInt();
        int b = s.nextInt();
        Map<Integer, Boolean> visited = new HashMap<>();
        LinkedList<Integer> queue = new LinkedList<>();

        if(map.containsKey(a)) {
            if (map.get(a).contains(b)) {
                return 1;
            } else {
                visited.put(a, true);
                queue.add(a);
                while (queue.size() != 0) {
                    a = queue.poll();
                    Iterator<Integer> itr = map.get(a).listIterator();
                    while (itr.hasNext()) {
                        int n = itr.next();
                        if (n == b)
                            return 1;
                        if (!visited.containsKey(n)) {
                            visited.put(n, true);
                            queue.add(n);
                        }
                    }
                }
                return 0;
            }
        }return 0;
    }
}
