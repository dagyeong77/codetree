import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static int N;
    static int M;
    
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    
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
    static Point end;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        map = new int[N][M];
        visited = new boolean[N][M];
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        start = new Point(0, 0);
        end = new Point(N-1, M-1);
        
        int result = bfs(start, end);
        System.out.println(result);
    }
    
    static int bfs(Point start, Point end) {
        
        Queue<Point> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start.r][start.c] = true;
        
        while(!queue.isEmpty()) {
            Point current = queue.poll();
            
            if(current.r == end.r && current.c == end.c) {
                return 1;
            }
            
            for(int d=0; d<4; d++) {
                int nr = current.r + dr[d];
                int nc = current.c + dc[d];
                
                if(nr < 0 || nr >= N || nc < 0 || nc >= M) {
                    continue;
                }

                if(map[nr][nc] == 0) {
                    continue;
                }
                
                if(visited[nr][nc]) {
                    continue;
                }
                
                Point nextPoint = new Point(nr, nc);
                queue.add(nextPoint);
                visited[nr][nc] = true;
            }
        }
        return 0; 
    }

}
