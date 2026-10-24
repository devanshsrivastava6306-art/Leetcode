class Solution {
public:
    vector<vector<int>> floodFill(vector<vector<int>>& img, int sr, int sc, int color) {
        int m = img.size();
        int n = img[0].size();

        int o_color = img[sr][sc];

        if (o_color == color) {
            return img;
        }

        queue<pair<int,int>> q;
        q.push({sr, sc});
        img[sr][sc] = color;

        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};

        while (!q.empty()) {
            int i = q.front().first;
            int j = q.front().second;
            q.pop();

            for (int k = 0; k < 4; k++) {
                int ni = i + dx[k];
                int nj = j + dy[k];

                if (ni >= 0 && nj >= 0 &&
                    ni < m && nj < n &&
                    img[ni][nj] == o_color) {

                    img[ni][nj] = color;
                    q.push({ni, nj});
                }
            }
        }
        return img;
    }
};