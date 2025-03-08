class pairsum {
    public static void main(String[] args){
        int arr[] = {0,-1,42,-3,1};
        int x = -2;
        int occurence = 0;
        for(int i=0; i<5 && occurence == 0; i++){
            for(int j=0; j<5 && occurence == 0; j++){
                if(i!=j && arr[i]+arr[j] == x){
                    occurence++;
                }
            }
        }

        System.out.println((occurence == 1) ? "found" : "does not found");

    }  
}
