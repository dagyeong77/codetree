import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static int N;
    static int K;
    
    static int[][] map;
    static boolean[][] visited;
    
    static class Point{
        int r;
        int c;
        
        Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    
    static Point start;
    
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    
    static int count;
    
    static Queue<Point> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        map = new int[N][N];
        visited = new boolean[N][N];
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        count = 0; 
        
        for(int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()) -1;
            int c = Integer.parseInt(st.nextToken()) -1;
            
            if(!visited[r][c]) {
                queue.add(new Point(r, c));
                visited[r][c] = true;
                count++;
            }
        }
        
        int result = bfs(start);
        System.out.println(result);
        
    }
    
    static int bfs(Point start) {
    
        while(!queue.isEmpty()) {
            Point current = queue.poll();
            
            for(int d=0; d<4; d++) {
                int nr = current.r + dr[d];
                int nc = current.c + dc[d];
                
                if(nr < 0 || nr >= N || nc < 0 || nc >= N) {
                    continue;
                }
                
                if(map[nr][nc] == 1) {
                    continue;
                }
                
                if(visited[nr][nc]) {
                    continue;
                }
                
                Point nextPoint = new Point(nr, nc);
                queue.add(nextPoint);
                visited[nr][nc] = true;
                
                count++;
            }
        }
        return count;
    }

}
