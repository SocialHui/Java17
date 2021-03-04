import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class HeapDemo {

    private int[] elem;
    private int usedSize;

    public HeapDemo(int[] elem, int usedSize) {
        this.elem = elem;
        this.usedSize = usedSize;
    }

    public void adjustDown(int parent, int len) {
        int child = 2*parent+1;
        while (child < len) {
            if (child + 1 < len && this.elem[child] < this.elem[child+1]) {
                child = child+1;
            }
            if (this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            } else {
                break;
            }
        }
    }

    public void show() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }


    public void createdBigHeap() {
        for (int i = (this.usedSize-1-1)/2; i >= 0; i--) {
            adjustDown(i,this.usedSize);
        }
    }
}
