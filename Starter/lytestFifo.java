public class DataStructureTester {

    private static FifoList testFifoList(FifoList fifoList) {
        System.out.println("Adding 7..");
        fifoList.add(7);
        System.out.println("Adding 9..");
        fifoList.add(9);
        System.out.println("Adding 2..");
        fifoList.add(2);
        System.out.println("Adding 6..");
        fifoList.add(6);
        System.out.println("Adding 3..");
        fifoList.add(3);
        System.out.println("Adding 5..");
        fifoList.add(5);
        System.out.println("Deleting an element..");
        int deleted = fifoList.delete();
        System.out.println("Deleted: " + deleted);
        System.out.println("Deleting an element..");
        deleted = fifoList.delete();
        System.out.println("Deleted: " + deleted);

        System.out.println("Top: " + fifoList.peek());
        System.out.println(fifoList.toString());
        System.out.println("Size: " + fifoList.size());
        return fifoList;
    }

    public static void main(String[] args) {
        FifoList fifoList = new fifoList(5);
        System.out.println("Testing fifoList");
        fifoList = testFifoList(fifoList);
        System.out.println("*********************************************************************");

    }
}
