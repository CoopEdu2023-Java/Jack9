class ArrayList {
    private int[] data;
    private int size;
    private int capacity;

    public ArrayList(){
        this.capacity = 10;
        this.data = new int[capacity];
        this.size = 0;
    }

    public void add(int value) {
        if (size == capacity){
            resize();
        }
        data[size++] = value; 
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("索引超出范围");
        }
        return data[index];
    }

    // 删除指定索引处的元素
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("索引超出范围");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public int size() {
        return size;
    }

    private void resize() {
        capacity *= 2; 
        int[] newData = new int[capacity]; 
        for (int i = 0; i < size; i++) { 
            newData[i] = data[i];
        }
        data = newData;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}