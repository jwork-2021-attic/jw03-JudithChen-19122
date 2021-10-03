package s191220013;

public class SelectSorter implements Sorter{
    private int[] a;

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";
    
    @Override
    public void sort() {
        for (int i = 0; i < a.length; i++)
        {
            int temp = i;
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[temp] > a[j])
                {
                    temp=j;
                }
            }
            if(i != temp){
                swap(temp,i);
            }

        }






        int preIndex, curIndex, current;
        for(int i = 1; i < a.length; i++) {
            preIndex = i - 1;
            curIndex = i;
            current = a[i];
            while(preIndex >= 0 && a[preIndex] > current) {
                swap(preIndex,curIndex);
                curIndex--;
                preIndex--;
            }
        }
    }
  
    @Override
    public String getPlan() {
        return this.plan;
    }

}
