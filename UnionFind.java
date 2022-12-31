import java.util.ArrayList;
import java.util.*;
public class UnionFind 
{
    private int[] id;
    private ArrayList<String> posLink;
    private int componentCount;

    //method to initialize a maze
    public void initializeMaze(int N, int M)
    {
        int side =M; 
        id =new int[N*M];
        posLink =new ArrayList<>();

        for (int i=0; i< N*M; i++)
            id[i]= i;

        for (int i =0; i<N; i++)
        {
            for (int j= 0; j< M; j++)
            {
                int temp= side*i+j;
                int tempR= side*i+j+1;
                int tempD= side*(i+1)+j;
                int rightEnd= side*i+M;
                int lowestD= side*N+j;

                if (tempR < rightEnd) {posLink.add(temp+ " " + tempR);}
                if (tempD < lowestD) {posLink.add(temp+ " " + tempD);}
            }    
        }    
        componentCount= N*M;
    }

    //Method to add the links into a list and solve the maze
    public void createMaze()
    {   
        Collections.shuffle(posLink);
        for (int i=0; i<posLink.size();i++) 
        {
            String[] link = posLink.get(i).split("\\s+");
            int temp1= Integer.parseInt(link[0]);
            int temp2= Integer.parseInt(link[1]);
            
            union(temp1, temp2);
            if (componentCount == 1) {break;}
        }
    }
    // Union find- Utilized Code
    public int find(int i)
    {
        while (i != id[i])
        {
            id[i] = id[id[i]];    
            i = id[i];       
        }
        return i;
    }

    public void union(int p, int q)
    {
        int i = find(p);
        int j = find(q);
        if (i!=j)
        {
            System.out.println("Break "+p +" and " +q);
            componentCount--;
        }
        id[i] = j;
    }
    
}