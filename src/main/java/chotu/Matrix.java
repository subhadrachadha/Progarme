package chotu;

public class Matrix {
	public static void main(String[] args) {
		int[][] mat= {{1,0,0,1},
				      {0,0,1,0},
				      {0,0,0,0}
		};
		System.out.println("Before Matrix Modification");
		printMatrix(mat);
		
		modifyMatrix(mat);
		
		System.out.println("After Matrix Modification");
		printMatrix(mat);
		
		
		
	}
	
	static void printMatrix(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.print(mat[i][j]);
			}
			System.out.println(" ");
		}
		
	}
	
	static void modifyMatrix(int mat[][])
	{
		boolean row_flag=false;
		boolean col_flag=false;
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				if(i==0 || mat[i][j]==1)
				{
					row_flag=true;
				}
				
				if(j==0|| mat[i][j]==1)
				{
					col_flag=true;
				}
				
				if(mat[i][j]==1)
				{
					mat[0][j]=1;
					mat[i][0]=1;
				}
			}
			System.out.println(" ");
		}
	
	
	
	for(int i=1;i<mat.length;i++)
	{
		for(int j=1;j<mat.length;j++)
		{
			if(mat[0][j]==1||mat[i][0]==1)
			{
				mat[i][j]=1;
			}
		}
	}
	
	
		
	if(row_flag==true)
	{
		for(int i=0;i<mat.length;i++)
		{
			mat[0][i]=1;
		}
	}
	
	if(col_flag==true)
	{
		for(int j=0;j<mat[0].length;j++)
		{
			mat[0][j]=1;
		}
	}

}
}
