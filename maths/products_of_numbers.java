class ProductOfNumbers {
    // ArrayList<Integer> arrs = new ArrayList<Integer>();
    List<Integer> arrPs;

    public ProductOfNumbers() {
        arrPs = new ArrayList();
        arrPs.add(1);
    }
    
    public void add(int num) {
        // arrPs.add(num);

        if (num == 0) {
            arrPs = new ArrayList();
            arrPs.add(1);
        } else {
            arrPs.add(arrPs.get(arrPs.size() - 1) * num);
        }
    }
    
    public int getProduct(int k) {
        // ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // for(int i = 0; i < k; i++) {
        //     int n = arrs.size() - (k-i);
        //     if (arrs[n] == 0) return 0;
        //     arrayList.add(arrs[n]);
        // }

        // Check if k > list length
        if (k > arrPs.size() - 1) {
            return 0;
        } else {
            return arrPs.get(arrPs.size() - 1) / arrPs.get(arrPs.size()-1-k);
        }
    }
}

/**
Time complexity: 
  add(num): O(1) - Adding a number involves a single operation of updating the list.
  getProduct(k): O(1) - Getting the product involves a single division operation.
  
Space complexity: 
  O(n), Space used by the list to store cumulative products, where n is the number of elements added.

********
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
