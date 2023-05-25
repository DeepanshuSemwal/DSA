package direct_address_table;

public class solution {


    int table[] = new int[1000];
    void insert(int i)
    {
        table[i]=1;
    }
    int search(int i)
    {
        return table[i];
    }
    void delete(int i)
    {
        table[i]=0;
    }


}
