//package MergedSorted;
//
//public class Merged {
//	public static void main(String[] args) {
//		int[] left = new int[] { 1, 1, 2, 3, 4, 4, 5, 8 };
//		int[] right = new int[] { 2, 5, 7, 7, 9, 18 };
//		System.out.println(mergeSorted(merge));
//	}
//
//	public static int[] mergeSorted(int[] merge) {
//		int l=left.length;
//				int[] sorted = new int[left.length + right.length];
//		int[] merged = new int[left.length + right.length];
//		for (int i = 0; i < left.length; i++) {
//			merged[i] = left[i];
//		}
//		
//		for (int j = l; j < right.length + left.length; j++) {
//			int index = 0;
//			merged[j] = right[index];
//			index++;
//			l++;
//		}
//
//		for (int k = 1; k < merged.length; k++) {
//			int index = 0;
//			if (merged[index] < merged[k] && k + 1 < merged.length) {
//				continue;
//			} else if (merged[index] < merged[k] && k + 1 == merged.length) {
//				sorted[index] = merged[k];
//			} else {
//				sorted[index] = merged[k];
//			}
//
//		}
//		return sorted;
//
//	}
//}
