// Author: Eduard Le Roux
class twoNumberSum {
	/*
	 * This method takes in an array of integers (positive and negative) and a targetsum, 
	 * the method then returns two values in the array that sum up to that target sum.
	 */
	public static int[] twoSum(int[] array, int targetSum) { 
			for (int i = 0 ; i < array.length; i++) { 
				int first = array[i]; 
				for (int j = array.length - 1; j > i; j--) { 
					int second = array[j];
					if (first + second == targetSum) { 
						if (first > second) { 
							return new int[] {second, first};
						} else { 
							return new int[] {first, second};
						}
					}
				}
			}
			
			return new int[] {};
		}
	
	public static void main(String[] args) { 
		int[] array = twoSum(new int[] {-1,-4,5,3,7,4,3,10,15}, 25);
		
		for (int i = 0 ; i < array.length; i++) { 
			System.out.print(array[i] + " ");
		}
	}
}
