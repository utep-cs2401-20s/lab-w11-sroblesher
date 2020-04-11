class newSorting {
    public void newSorting(int[]A, int size) {
        if (A.length <= size) {
            quicksort(A, 0, A.length-1);
        }
        else {
            int mid = A.length / 2;
            int[] leftHalf = new int[mid];
            int[] rightHalf = new int[A.length-mid];

            //POPULATE LH and RH with loops
            for (int i = 0; i < mid; i++) {
                leftHalf[i] = A[i];
            }
            for (int j = 0; j < A.length-mid; j++) {
                rightHalf[j] = A[j+mid];
            }

            if (leftHalf.length >= 1) {
                newSorting(leftHalf, size); //sort LH
                newSorting(rightHalf, size); //sort RH
            }
            mergeSortedHalves(A, leftHalf, rightHalf);
        }

    }

    private void quicksort(int[] A, int l, int r) {
        if (l < r) {
            int pivot  = partitioning(A,l,r);
            quicksort(A, l,pivot-1);
            quicksort(A,pivot+1, r);
        }
    }

    private int partitioning(int[] A, int l, int r) {
        int pivot = A[l];
        int less = l + 1;
        int more = r;

        while (less <= more) {
            while (less <= r && A[less] <= pivot)
                less++;
            while (more >= l && A[more] > pivot)
                more--;

            if (less < more) {      //SWAP VALUES
                int temp = A[less];
                A[less] = A[more];
                A[more] = temp;
            }
        }

        int temp = A[l];
        A[l] = A[more];
        A[more] = temp;

        return more;
    }

    private void mergeSortedHalves(int[]A, int[] left, int[] right) {
        int start = 0, l = 0, r = 0;

        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                A[start] = left[l];
                l++;
            }
            else {
                A[start] = right[r];
                r++;
            }
            start++;
        }

        while (l < left.length) {
            A[start] = left[l];
            l++;
            start++;
        }

        while (r < right.length) {
            A[start] = right[r];
            r++;
            start++;
        }
    }

    private void print(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
