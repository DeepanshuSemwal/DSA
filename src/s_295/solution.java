package s_295;

public class solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(image[sr][sc]==color)
        {
            return image;
        }
        int row=image.length;
        int column=image[0].length;
        int soruce=image[sr][sc];
        dfs(image,sr,sc,row,column,color,soruce);
        return image;
    }
    public void dfs(int [][]image,int sr,int sc,int row,int column,int color,int soruce)
    {
        if(sr<0 || sc<0 || sr>=row || sc>=column)
        {
            return;
        }
        if(image[sr][sc]!=soruce)
        {
            return;
        }
        image[sr][sc]=color;
        dfs(image,sr+1,sc,row,column,color,soruce); //top
        dfs(image,sr-1,sc,row,column,color,soruce); //down
        dfs(image,sr,sc-1,row,column,color,soruce); //left
        dfs(image,sr,sc+1,row,column,color,soruce); //right

    }
}
