//https://leetcode.com/problems/max-increase-to-keep-city-skyline/
// #807
// Medium

class _807_Max_Increase_to_Keep_City_Skyline {
	
	public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxSizeColumn = new int[grid.length];
        int[] maxSizeRow = new int[grid[0].length];
        
        for(int row = 0; row < grid.length; row++) {
        	for(int column = 0; column < grid[row].length; column++) {
                int currentNumber = grid[row][column];
                
                    if(maxSizeColumn[column] < currentNumber)
                        maxSizeColumn[column] = currentNumber;
                   
                    if(maxSizeRow[row] < currentNumber)
                        maxSizeRow[row] = currentNumber;
                
            }
        }
        
        int totalIncrease = 0;
        
        for(int row = 0; row < grid.length; row++) {
        	for(int column = 0; column < grid[row].length; column++) {
                int currentNumber = grid[row][column];
                int skyLineMark = Math.min(maxSizeColumn[column], maxSizeRow[row]);

                if(skyLineMark > currentNumber)
                    totalIncrease += skyLineMark - currentNumber;

            }
        }
        
        return totalIncrease;
    }
}