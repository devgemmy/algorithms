class BinaryString {
    public String findDifferentBinaryString(String[] nums) {
        
        StringBuilder product = new StringBuilder();

        for (int b = 0; b < nums.length; b++) {
            if (nums[b].charAt(b) == '0') product.append('1');
            else product.append('0');
        }

        return product.toString();
    }
}

